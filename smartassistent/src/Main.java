import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import com.google.gson.*;

class HuziAssistant extends JFrame {

    // --- UI Components ---
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton, speakButton;

    // --- OpenAI Backend Setup ---
    private final String API_KEY = "sk-your-openai-api-key"; // Replace with your actual key
    private final String API_URL = "https://api.openai.com/v1/chat/completions";

    public HuziAssistant() {
        setTitle("Huzi - Smart Assistant");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(chatArea);

        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 14));

        sendButton = new JButton("Send");
        speakButton = new JButton("🎤 Speak");

        sendButton.addActionListener(e -> sendCommand());
        inputField.addActionListener(e -> sendCommand());
        speakButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Voice not implemented."));

        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        add(scrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);
        add(speakButton, BorderLayout.NORTH);

        printAssistant("Hi! I'm Huzi. How can I assist you?");
    }

    private void sendCommand() {
        String userInput = inputField.getText().trim();
        if (userInput.isEmpty()) return;

        printUser(userInput);
        inputField.setText("");

        new Thread(() -> {
            String reply = askGPT(userInput);
            printAssistant(reply);
            speak(reply);
        }).start();
    }

    private void printUser(String text) {
        chatArea.append("You: " + text + "\n");
    }

    private void printAssistant(String text) {
        chatArea.append("Huzi: " + text + "\n");
    }

    // --- OpenAI ChatGPT Request ---
    private String askGPT(String prompt) {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Authorization", "Bearer " + API_KEY);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            // Build JSON message
            JsonObject userMessage = new JsonObject();
            userMessage.addProperty("role", "user");
            userMessage.addProperty("content", prompt);

            JsonArray messages = new JsonArray();
            messages.add(userMessage);

            JsonObject payload = new JsonObject();
            payload.addProperty("model", "gpt-3.5-turbo");
            payload.add("messages", messages);
            payload.addProperty("max_tokens", 150);

            OutputStream os = conn.getOutputStream();
            os.write(payload.toString().getBytes("UTF-8"));
            os.flush();
            os.close();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null)
                response.append(line);
            in.close();

            JsonObject jsonResponse = JsonParser.parseString(response.toString()).getAsJsonObject();
            String reply = jsonResponse.getAsJsonArray("choices")
                    .get(0).getAsJsonObject()
                    .getAsJsonObject("message")
                    .get("content").getAsString();
            return reply;

        } catch (Exception e) {
            e.printStackTrace();
            return "Sorry, I couldn't reach GPT right now.";
        }
    }

    // --- Text-to-Speech (Mac: 'say', Windows: use FreeTTS or skip) ---
    private void speak(String text) {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("mac")) {
                Runtime.getRuntime().exec("say \"" + text + "\"");
            } else {
                System.out.println("(🔈 TTS Placeholder) Speaking: " + text);
                // Windows users can use FreeTTS library here or leave it as console output
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // --- Run GUI ---
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new HuziAssistant().setVisible(true);
        });
    }
}