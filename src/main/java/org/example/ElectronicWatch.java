package org.example;

import java.util.Scanner;

/**
 * Description
 * Please, proceed to ElectronicWatch class. The program must print an electronic watch screen output for a given value of seconds since midnight.
 * Input value is given via System.in. Output value must be printed to System.out.
 * It is guaranteed, that input number is non-negative.
 * Output format is h:mm:ss (possible values: [0:00:00; 23:59:59]).
 * Extra challenge: try to solve the task without using if statements or cycles.
 */
public class ElectronicWatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input);
        one_solution(input);
        second_solution(input);

    }

    private static void one_solution(int i) {
        int sec = i % 60;
        int min = (i / 60) % 60;
        int hours = (i / 60) / 60;

        String hoursCheck =(hours > 23) ? "0" : String.valueOf(hours);
        String minCheck =(min <10 ) ? "0"+min : String.valueOf(min);
        String secCheck =(sec < 10) ? "0"+sec : String.valueOf(sec);
        System.out.println("totola= " + hoursCheck + ":" + minCheck + ":" + secCheck);
    }


    public static void second_solution (int input){
        int sec = input % 60;
        int min= (input/60)%60;
        int hours = (input/60)/60;
        int hourss= (hours >23) ? 0 :hours;
        int minn=(min<10) ? 0 : min;
        int secc=(sec<10) ? 0 : sec;
        System.out.printf("total=" + hourss +":" + minn + ":" +secc );

    }

    }


