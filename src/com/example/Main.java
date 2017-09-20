package com.example;

import com.common.Month;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanMonths = new Scanner(System.in);

        String[] arrayOfMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


        ArrayList<Month> monthArrayList = new ArrayList<>();

        System.out.println("Choose a month.");
        String readLine = scanMonths.nextLine();
        for (Month mo : Month.values()) {
            System.out.println(mo.getEnglishName());
        }
        switch (readLine) {

            case "January":
                monthArrayList.add(Month.JANUARY);
                break;

            case "February":
                monthArrayList.add(Month.FEBRUARY);
                break;

            case "March":
                monthArrayList.add(Month.MARCH);
                break;

            case "April":
                monthArrayList.add(Month.APRIL);
                break;

            case "May":
                monthArrayList.add(Month.MAY);
                break;

            case "June":
                monthArrayList.add(Month.JUNE);
                break;

            case "July":
                monthArrayList.add(Month.JULY);
                break;

            case "August":
                monthArrayList.add(Month.AUGUST);
                break;

            case "September":
                monthArrayList.add(Month.SEPTEMBER);
                break;

            case "October":
                monthArrayList.add(Month.OCTOBER);
                break;

            case "November":
                monthArrayList.add(Month.NOVEMBER);
                break;

            case "December":
                monthArrayList.add(Month.DECEMBER);
                System.out.println(monthArrayList);

           }

        }
    }

