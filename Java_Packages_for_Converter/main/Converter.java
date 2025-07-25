package main;
import java.util.*;

import CurrencyConverter.CurrencyConverter;
import DistanceConverter.DistanceConverter;
import TimeConverter.TimeConverter;

import java.util.Scanner;
public class Converter{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        CurrencyConverter cc=new CurrencyConverter();
        DistanceConverter dc=new DistanceConverter();
        TimeConverter tc=new TimeConverter();

        System.out.println("Choose Converter:");
        System.out.println("Enter 1 for CurrencyConverter");
        System.out.println("Enter 2 for DistanceConverter");
        System.out.println("Enter 3 for TimeConverter");

        System.out.println("Enter your choice:");
        int choice=input.nextInt();

        switch(choice){
            case 1:
            System.out.println("Enter 1 to convert INR to DOLLAR");
            System.out.println("Enter 2 to convert DOLLAR to INR");
            System.out.println("Enter 3 to convert INR to EURO");
            System.out.println("Enter 4 to convert EURO to INR");
            System.out.println("Enter 5 to convert INR to YEN");
            System.out.println("Enter 6 to convert YEN to INR");

            System.out.println("Enter your choice:");
            int cchoice=input.nextInt();

            System.out.println("Enter the amount:");
            double amount=input.nextDouble();

            switch(cchoice){
                case 1:
                System.out.println("The Amount from INR to  Dollar is "+cc.inrtodollar(amount));
                break;

                case 2:
                System.out.println("The Amount from Dollar to INR is "+cc.dollartoinr(amount));
                break;

                case 3:
                System.out.println("The Amount from INR to Euro is "+cc.inrtoeuro(amount));
                break;

                case 4:
                System.out.println("The Amount from Euro to INR is "+cc.eurotoinr(amount));
                break;

                case 5:
                System.out.println("The Amount from INR to Yen is "+cc.inrtoyen(amount));
                break;

                case 6:
                System.out.println("The Amount from Yen to INR is "+cc.yentoinr(amount));
                break;

                default:
                System.out.println("Invalid choice Entered !!!");

            }
            break;

            case 2:
            System.out.println("Enter 1 to convert meter to kilometer");
            System.out.println("Enter 2 to convert kilometer to meter");
            System.out.println("Enter 3 to convert miles to kilometer");
            System.out.println("Enter 4 to convert kilometer to miles");

            System.out.println("Enter your choice:");
            int dchoice=input.nextInt();

            System.out.println("Enter the distance:");
            double distance=input.nextDouble();

            switch(dchoice){
                case 1:
                System.out.println("The distance from meters to kilometers is "+dc.metertokm(distance));
                break;

                case 2:
                System.out.println("The distance from kilometers to meters is "+dc.kmtometer(distance));
                break;

                case 3:
                System.out.println("The distance from miles to kilometers is "+dc.milestokm(distance));
                break;

                case 4:
                System.out.println("The distance from kilometers to miles is "+dc.kmtomiles(distance));
                break;

                default:
                System.out.println("Invalid choice entered !!!");
            }
            break;

            case 3:
            System.out.println("Enter 1 to convert hours to minutes");
            System.out.println("Enter 2 to convert minutes to hours");
            System.out.println("Enter 3 to convert hours to seconds");
            System.out.println("Enter 4 to convert seconds to hours");

            System.out.println("Enter your choice:");
            int tchoice=input.nextInt();

            System.out.println("Enter the time:");
            Double time=input.nextDouble();

            switch(tchoice){
                case 1:
                System.out.println("The time from hours to minutes is "+tc.hourstominutes(time));
                break;
                
                case 2:
                System.out.println("The time from minutes to hours is "+tc.minutestohours(time));
                break;

                case 3:
                System.out.println("The time from hours to seconds is "+tc.hourstoseconds(time));
                break;

                case 4:
                System.out.println("The time from seconds to hours is "+tc.secondstohours(time));
                break;

                default:
                System.out.println("Invalid choice entered !!!");
            }
            break;

            default:
            System.out.println("Invalid main choice entered !!!");



        }
        input.close();


    }
}