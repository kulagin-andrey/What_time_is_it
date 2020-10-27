package com.company;
import java.util.Scanner;
import java.time.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in= new Scanner(System.in);
        LocalTime now =LocalTime.now();


        short hour;
        hour = (short) now.getHour();
        if(hour>24) {
            System.out.println("Error");
            System.exit(1);
        }

        short minutes = (short)now.getMinute();
        if(minutes>60) {
            System.out.println("Error");
            System.exit(1);
        }
        short result;
        result = (short) (hour*60 + minutes);

        if(result<=360)
            System.out.println("Good night!");

        if(result>360&&result<=660)
            System.out.println("Good morning!");

        if(result>660&&result<=1080)
            System.out.println("Good afternoon!");

        if(result>1080&&result<=1440)
            System.out.println("Good evening!");



    }
}
