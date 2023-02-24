package com.knoldus;
import java.util.Scanner;

//main class that will handle all the operations of user
public class StringImplement {

    public static void main(String args[]){

        // creation of object of StringAPI
        StringAPI object = new StringAPI();

        Scanner sc = new Scanner(System.in);

        //takes input from the user
        System.out.println("Enter a string");
        String inputFromUser = sc.nextLine();


        //prints the reverse of the string
        System.out.println(object.reverseString(inputFromUser));

        //prints the length of the strng
        System.out.println(object.stringLength(inputFromUser));

        }
    }