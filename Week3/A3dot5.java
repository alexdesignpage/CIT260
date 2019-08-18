/*
“Write a program that prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, . . . ,
and Saturday is 6). Also prompt the user to enter the number of days after today for a future day and display the
future day of the week

 “Enter today’s day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday”
 */

import java.util.Scanner;

public class A3dot5 {

public static void main(String args []){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter today's day: ");
    int today = input.nextInt();
    System.out.print("Enter the number of days elapsed since today: ");
    int daysElapse = input.nextInt();
    int future = (today + daysElapse) % 7;
    System.out.print("Today is ");
    switch(today){
        case 0 : System.out.print("Sunday");
        break;
        case 1: System.out.print("Monday");
        break;
        case 2: System.out.print("Tuesday");
        break;
        case 3: System.out.print("Wednesday");
        break;
        case 4: System.out.print("Thursday");
        break;
        case 5: System.out.print("Friday");
        break;
        case 6: System.out.print("Saturday");
        break;
        default: System.out.print("Try again");
        System.exit(1);
    }

    System.out.print(" and the future day is ");
    switch(future){
        case 0 : System.out.print("Sunday");
            break;
        case 1: System.out.print("Monday");
            break;
        case 2: System.out.print("Tuesday");
            break;
        case 3: System.out.print("Wednesday");
            break;
        case 4: System.out.print("Thursday");
            break;
        case 5: System.out.print("Friday");
            break;
        case 6: System.out.print("Saturday");
            break;
    }
  }
}
