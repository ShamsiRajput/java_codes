import java.util.Scanner;

public class BIN {

    public static void main(String[] args) {

        int[] arr = {56, 7, 3, 8, 2, 0, 78, 55, 36};
        System.out.println("orignal arr:");
        for (int i = 0; i < arr.length; i++) {


            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }


            }
        }
        System.out.println();
        System.out.println("after sorting array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int count = 0;
        int search = 7;


        if(search==arr.length/2){
            System.out.println(search+ "avail in array");


        } else if(search>arr.length/2){

            for(int i=arr.length/2;i< arr.length;i++){

                if(search==arr[i]){

                    System.out.println(search+ " avail:");

                } else if ( search<arr.length/2) {

                    for(int j=0;j< arr.length/2;j++){
                        if(search==arr[j]){


                            System.out.println(search+ "avasil ");
                        }


                    }


                }


            }




        }


    }}
