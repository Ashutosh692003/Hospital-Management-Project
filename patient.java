package Hospital_Management;
import java.util.Scanner;
import java.util.*;
 class patient {
 
    Scanner sc = new Scanner(System.in);
      String id,pname,disease,sex,admit_status;
      int age,op;
      boolean fbeq = true;
      boolean sbeq =  true;
      boolean gbeq = true;
      int fbed=30,sbed=30,gbed=40,focc=4,socc=5,gocc=10;
        void new_patient(){
          System.out.println("\n--------------------------------------------------------------------------\n");
          java.util.Date dt = new java.util.Date();
          System.out.println(dt);
          long time = dt.getTime();
          System.out.println("\n----------------------------------------------------------------------------\n");
            System.out.println("Enter Patient id");
            id = sc.nextLine();
            System.out.println("Enter Patient Name");
            pname = sc.nextLine();
            System.out.println("Enter Disease");
            disease = sc.nextLine();
            System.out.println("Enter Sex   ");
            sex = sc.nextLine();
            System.out.println("Enter Admit Status");
            admit_status = sc.nextLine();
            System.out.println("Enter Patient age");
            age = sc.nextInt();  
        System.out.println("Enter 1 for bed booking or Enter 2 for submit form")  ;
   op = sc.nextInt();
          if(op==1){

            System.out.println("Enetr F for First class bed booking\n\n");
            System.out.println("Enter S for Second class bed booking\n\n");
            System.out.println("Enter G for General class bed booking\n\n");
          char choice = sc.next().charAt(0);
          if(choice=='F'){
               if(fbed>=focc){
                System.out.println("Ward num           : 1");
                System.out.println("Cost               : 2500 rs/day");
                System.out.println("Bed no             : "+focc);
                focc++;
                fbeq=true;
               }
          else   {
            System.out.println("-------------------------------------------------------");
            System.out.println("First class beds are full .... Please choose another bed");
            System.out.println("---------------------------------------------------------");
            fbeq=false;
          }
        
        }
         if(choice=='S'){
          if(sbed>=socc){

            System.out.println("Ward num           : 2");
            System.out.println("Cost               : 1900 rs/day");
            System.out.println("Bed no             : "+socc);
            socc++;
            sbeq = true;


          }
          else{

            System.out.println("-------------------------------------------------------");
            System.out.println("Second class beds are full .... Please choose another bed");
            System.out.println("---------------------------------------------------------");
            sbeq = false;
          }

          
        }
        if(choice=='G'){
              if(gbed>=gocc){
          System.out.println("Ward num           : 2");
          System.out.println("Cost               : 1300 rs/day");
          System.out.println("Bed no             : "+gocc);
          gocc++;
          gbeq=true;
              }
              else{
                     
                System.out.println("-------------------------------------------------------");
                System.out.println("First class beds are full .... Please choose another bed");
                System.out.println("---------------------------------------------------------");
gbeq =false;

              }
        }
        System.out.println("Your details is Submitted");
        System.out.println("*****************   Thankyou *********************");
        System.out.println("\n\n\n");
        

      }
   else   if(op==2){
        System.out.println("Your details is Submitted");
        System.out.println("*****************   Thankyou *********************");
        System.out.println("\n\n\n");
      }
      else{
        System.out.println(">>>>>>>>>>>>>>>>> Enter correct option <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
      }
      
   }

        
      public void get_info(){
        System.out.println("\n--------------------------------------------------------------------------\n");
        java.util.Date da = new java.util.Date();
        System.out.println(da);
        long time = da.getTime();
        System.out.println("\n----------------------------------------------------------------------------\n");
                 System.out.println("--------- Patient Details ----------");
                 System.out.println("\n\n");
            System.out.println("Patient id      "+id);
            System.out.println("Patient Name    "+pname);
            System.out.println("Disease         "+disease);
            System.out.println("Sex             "+sex);
            System.out.println("Admit Status    "+admit_status);
            System.out.println("Age             "+age);
      }
}
