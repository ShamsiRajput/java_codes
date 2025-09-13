class smart{
    String light_name;
    int bright;
    boolean ison;
    smart(){

       this.light_name ="lining light room:";
       this.ison=false;
       this.bright=0;


    }
    void turnon(int value){
        if(value<=100) {
            ison = true;
        }
    }
    void turnoff(int values){
        if (values=='0'){
        ison=false;
    }
}
    void setBright(int bri){
        if (bri==0 && bri==100){
            bright=bri;
        }


    }






}