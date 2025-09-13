public class SmartLight{

    String light_name;
    int bright;
    boolean isOn;
    int bri;
    public SmartLight() {

        this.light_name = "living  room light:";
        this.isOn = false;
        this.bright = 0;

    }


    public void turnOn(){
        isOn=true;

    }

    public void turnOff(){
        isOn=false;

    }
void setbright( int bri) {
    if (bri >= 0 && bri <= 100) {
        bright = bri;
    }
}
        public void display(){


            System.out.println(light_name+" brightnees level is "+bri+" ");



    }

    public static void main(String [] args){

       SmartLight obj=new SmartLight();
       obj.setbright(40);
       obj.turnOn();
       obj.display();



}



}