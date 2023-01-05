 public static void main(String[] args) {
        String divBy15="Divisible By 15:";
        String divBy5="Divisible By 5:";
        String divBy3="Divisible By 3:";
        for (int i = 1; i <=100 ; i++) {
            if (i%3==0 && i%5==0){
               divBy15+=" "+i;
            }else if (i%5==0){
                divBy5+=" "+i;
            } else if (i%3==0){
                divBy3+=" "+i;
            }


        }
        System.out.println(divBy15);
        System.out.println(divBy5);
        System.out.println(divBy3);
    }
