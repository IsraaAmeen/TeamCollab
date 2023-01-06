package utils;

public class DivisibleBy3515 {

    public static void main(String[] args) {
DivisibleBy();
    }

    public static void DivisibleBy(){
        String divBy3 ="Divisible By 15: ";
        String divBy5="Divisible By 5: ";
        String divBy15="Divisible By 15: ";

        for(int i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                divBy15+=(" "+i);
            }else if(i%3==0){
                divBy3+=(" "+i);
            }else if(i%5==0){
                divBy5+=(" "+i);
            }
        }
        System.out.println(divBy15);
        System.out.println(divBy5);
        System.out.println(divBy3);
    }
}
