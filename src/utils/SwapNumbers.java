package utils;

public class SwapNumbers {
    public static void main(String[] args) {
        Swap();
    }
    public static void Swap(){
        int x=5;
        int y=7;

        System.out.println("Before swapping: x= " + x);
        System.out.println("Before swapping: y= " +y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping: x= "+x);
        System.out.println("After swapping: y= "+y);
    }




}
