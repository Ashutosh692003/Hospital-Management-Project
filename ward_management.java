package Hospital_Management;
import java.util.Scanner;

 class ward_management {
    Scanner sc= new Scanner(System.in);
    int bed=100;   int bedocc =0;
       public   void bed(){
        System.out.println("\n------------------------------------------------------------------------\n");
        java.util.Date da = new java.util.Date();
        System.out.println(da);
        long time = da.getTime();
        System.out.println("\n------------------------------------------------------------------------\n");
        System.out.println("Enetr F for First class bed booking");
        System.out.println("Enter S for Second class bed booking");
        System.out.println("Enter G for General class bed booking");
      char choice = sc.next().charAt(0);
      patient p = new patient();
         if(choice =='F'){
               if(p.fbeq==true){
                System.out.println("\n------------------------------------------------------------------------\n");
                System.out.println("---------------beds are available--------------");
                System.out.println("-------------- you can book it from patient section-----------------");
                System.out.println("\n------------------------------------------------------------------------\n");

               }
               if(p.fbeq==false){

                System.out.println("\n------------------------------------------------------------------------\n");
                System.out.println("---------------beds are not available--------------");
                System.out.println("-------------- you can   enquire for other section beds-----------------");
                System.out.println("\n------------------------------------------------------------------------\n");
               }
    
         }

       else  if(choice =='S'){
            if(p.sbeq==true){
             System.out.println("\n------------------------------------------------------------------------\n");
             System.out.println("---------------beds are available--------------");
             System.out.println("-------------- you can book it from patient section-----------------");
             System.out.println("\n------------------------------------------------------------------------\n");

            }
            if(p.sbeq==false){

             System.out.println("\n------------------------------------------------------------------------\n");
             System.out.println("---------------beds are not available--------------");
             System.out.println("-------------- you can   enquire for other section beds-----------------");
             System.out.println("\n------------------------------------------------------------------------\n");
            }
 
      }
    else  if(choice =='G'){
        if(p.fbeq==true){
         System.out.println("\n------------------------------------------------------------------------\n");
         System.out.println("---------------beds are available--------------");
         System.out.println("-------------- you can book it from patient section-----------------");
         System.out.println("\n------------------------------------------------------------------------\n");

        }
        if(p.gbeq==false){

         System.out.println("\n------------------------------------------------------------------------\n");
         System.out.println("---------------beds are not available--------------");
         System.out.println("-------------- you can   enquire for other section beds-----------------");
         System.out.println("\n------------------------------------------------------------------------\n");
        }

  }
  else {
    System.out.println("----------------------------------------------------------------");
    System.out.println("Enter correct options");
    System.out.println("----------------------------------------------------------------");
  }

              

          }
    

// method for details
public void details(){
              System.out.println("Enter 1 for Ward officer Details   ............. Enter 2 for ward incharges details");
              int d = sc.nextInt();

              if(d==1){
                System.out.println("\n----------------------------------------------------------------\n"); 
                java.util.Date da = new java.util.Date();
         System.out.println(da);
         long time = da.getTime();
                System.out.println("\n------------------------------------------------------------------------\n");  
         System.out.println("Name of Ward officer           Rahul Gandhi      ");
         System.out.println("Staff id Ward officer          2343cong   ");
         System.out.println("Email of Ward offficer         rahul2323@gmial.com  ");
         System.out.println("\n----------------------------------------------------------------\n");
              }
            else  if(d==2){

                System.out.println("\n------------------First Class--------------------------\n");   
                System.out.println("Name of  Ward incharge           Viaks Yadav      ");
                System.out.println("Staff id Ward incharge           baggu344    ");
                System.out.println("Email of Ward incharge           baggu234@gmial.com   ");
                System.out.println("\n----------------------------------------------------------------\n");

                System.out.println("\n------------------Second Class--------------------------\n");   
                System.out.println("Name of  Ward incharge           Yashraj Dhakra    ");
                System.out.println("Staff id Ward incharge           yash333     ");
                System.out.println("Email of Ward incharge           dhakra543@gmail.com   ");
                System.out.println("\n----------------------------------------------------------------\n");


                System.out.println("\n------------------General Class--------------------------\n");   
                System.out.println("Name of  Ward incharge           Golu Yadav  ");
                System.out.println("Staff id Ward incharge           poly233   ");
                System.out.println("Email of Ward incharge            poly232@gmail.com  ");
                System.out.println("\n----------------------------------------------------------------\n");
  

              }
              else {
                System.out.println("----------------------------------------------------------------");
                System.out.println("Enter correct option");
                System.out.println("----------------------------------------------------------------");
              }
              
}

public void complain(){
          
  System.out.println("\n--------------------------------------------------------------------------\n");
        java.util.Date da = new java.util.Date();
        System.out.println(da);
        long time = da.getTime();
    
    System.out.println("----------------------------------------------------------------");
    System.out.println("Enter your complain");
    String comp = sc.nextLine();
    System.out.println("----------------------------------------------------------------");
    System.out.println("Your complain is registerd");

}


}