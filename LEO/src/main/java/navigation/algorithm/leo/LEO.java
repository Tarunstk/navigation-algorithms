/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navigation.algorithm.leo;

import java.util.Scanner;

/**
 *
 * @author tarunstk
 */
public class LEO {
    protected double Y,M,D;
    public LEO(double y, double m, double d){
        Y = y;
        M = m;
        D = d;
    }
   
    public double julianDate(double Y, double M, double D)
    {
        double A,B,JD;
        A = Y/100; 
        B = 2 - A + (A/4);
        JD = (365.25 * (Y + 4716)) + (30.6001 * (M + 1)) + (D + B) - 1524.5;
        return JD;
    }
    public String toString(){
        return Y+""+M+""+D;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        double y = sc.nextDouble();
        System.out.println("Enter the month");
        double m = sc.nextDouble();
        System.out.println("Enter the day");
        double d = sc.nextDouble();
       LEO jd = new LEO(y, m, d);
       System.out.println(jd);
       System.out.println(jd.julianDate(y,m,d));
    }
}


