import java.util.Scanner

public class BloodDonation{

       public static void main(String[]args){

          Scanner sc=new Scanner(System.in)

          System.out.println("Enter your age");
          int age=sc.nextInt();

          System.out.println("Enter your waight");
          int weight=sc.nextInt();


          if(age<=18 && weight<=55){
                 System.out.println("you ar eligibal");
          }else{
             System.out.println("you  are not eligibal");
          }
         }
        }
       }