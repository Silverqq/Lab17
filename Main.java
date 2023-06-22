package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваше выражение: ");
        String input = sc.nextLine();
        String[] splitInput = input.split("[+\\-*/]");
        if (input.contains("/")){
            Double num1 = Double.parseDouble(splitInput[0]);
            Double num2 = Double.parseDouble(splitInput[1]);
            calc <Double> math1 = new calc<Double>(num1,num2);
            System.out.println(math1.getDel());
        }
        else{
            Integer num1 = Integer.parseInt(splitInput[0]);
            Integer num2 = Integer.parseInt(splitInput[1]);
            calc <Integer> math2 = new calc<Integer>(num1,num2);
            if (input.contains("+")){
                System.out.println(math2.getPlus());
            } else if (input.contains("-")) {
                System.out.println(math2.getMinus());
            } else if (input.contains("*")) {
                System.out.println(math2.getUmn());
            }
        }
    }
}
class calc <T extends Number>{
    private T Numb;
    private T Numb2;

    calc(T Numb,T Numb2){
        this.Numb = Numb;
        this.Numb2 = Numb2;}

    public int getPlus(){return (int)Numb + (int) Numb2;}
    public int getMinus(){return (int)Numb - (int) Numb2;}
    public int getUmn(){return (int)Numb * (int) Numb2;}
    public double getDel(){return (double)Numb / (double) Numb2;}
}