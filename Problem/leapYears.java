public class leapYears {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in)
       // int year =sc.nextInt();

        int years = 17000;
        boolean leap=false;

        if (years%4==0){

            if (years%100==0){

                if (years%400==0){
                    leap=true;
                }else{
                    leap=false;
                }
                if (leap){
                    System.out.println("leap years");
                }else{
                    System.out.println("not a leap years");
                }

            }
        }
    }
}
