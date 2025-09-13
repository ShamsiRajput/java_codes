public class palndrom {


    public static void main(String[] args) {


        String name="1111" ;
        boolean isdrom=true;
        for(int i=0;i<name.length()/2;i++) {
            if (name.charAt(i) != name.charAt(name.length() - 1 - i)) {

                isdrom = false;
                break;

            }
        }


            if(isdrom){

                System.out.println("is palondrom:");


            }else{

                System.out.println("not palondrom");
            }



        }





    }

