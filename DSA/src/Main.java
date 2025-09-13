import java.util.LinkedList;
import java.util.Objects;

class Song {
    String name;
    String artist;
    float duration;

    Song(String name, String artist, float duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return Float.compare(song.duration, duration) == 0 &&
                name.equals(song.name) &&
                artist.equals(song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, artist, duration);
    }

    public static void main(String[] args) {
        // Create a LinkedList of Song objects
        LinkedList<Song> playlist = new LinkedList<>();

        // --- ADD ---
        playlist.add(new Song("Shape of You", "Ed Sheeran", 4.2f));
        playlist.add(new Song("Blinding Lights", "The Weeknd", 3.5f));
        playlist.add(new Song("Perfect", "Ed Sheeran", 4.4f));
        System.out.println("Playlist after adding songs:");
        System.out.println(playlist);

        // --- REMOVE ---
        Song toRemove = new Song("Blinding Lights", "The Weeknd", 3.5f);
        playlist.remove(toRemove); // Remove specific song
        System.out.println("\nPlaylist after removing 'Blinding Lights':");
        System.out.println(playlist);

        // --- SEARCH ---
        Song toSearch = new Song("Perfect", "Ed Sheeran", 4.4f);
        if (playlist.contains(toSearch)) {
            System.out.println("\n'Song Found': " + toSearch.name);
        } else {
            System.out.println("\n'Song Not Found': " + toSearch.name);
        }

        // Alternative search by song name
        String searchName = "Shape of You";
        boolean found = false;
        for (Song s : playlist) {
            if (s.name.equalsIgnoreCase(searchName)) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "\nFound by name: " + searchName : "\nSong not found by name.");
    }
}
