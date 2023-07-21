import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.*;
public class Ex1_20220808003 {
    public static void main(String[] args) {
        Stock stc = new Stock("ORCL", "Oracle Corporation");
        stc.previousClosingPrice = 34.5;
        stc.currentPrice = 34.35;
        System.out.println(stc.getChangePercent());

        Fan fan = new Fan();
        System.out.println(fan.toString());
    }
}
class Stock {
/////// Data Fields ///////
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
/////// Constructors ///////
    Stock(String symbol, String name){
        this.symbol=symbol;
        this.name=name;
    }
/////// Methods ///////
    double getChangePercent(){
        return ((previousClosingPrice - currentPrice)/ currentPrice)*100;

    }

}
class Fan {
    /////// Data Fields ///////
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";
    /////// Constructors ///////
    Fan() {}
    Fan(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    /////// Methods ///////
    public String toString(){
        if(on)
            return (speed + " " + color + " " + radius);
        else
            return (color + " " + radius + " fan is off");
    }
}

