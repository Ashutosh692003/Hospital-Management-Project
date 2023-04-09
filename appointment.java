package Hospital_Management;
import java.util.Scanner;
 class appointment {
   Scanner sc = new Scanner(System.in);
   String pname,dname,disease;
   int id; static int token=1;


    public void appoint(){
           System.out.println("\n-----------------------------------------------------------------------------\n");
           java.util.Date da = new java.util.Date();
         System.out.println(da);
         long t = da.getTime();
           System.out.println("\n\n************** Welcome to Appointment Section *****************\n\n");
           System.out.println("\n-----------------------------------------------------------------------------\n");
           System.out.print("Enter Patient Name ----->>>>>>       ");
           pname  =sc.nextLine();
           System.out.print("Enter disese");
           disease = sc.nextLine();
           System.out.println("\n\n If needed fillend by staff");
           System.out.print("Enter Doctor Name ----->>>>>          ");
           dname = sc.nextLine();
           System.out.print("Enter doctor id ------>>>>          ");
           id = sc.nextInt();
           System.out.println("***********Proceed for Billing******************");
           System.out.println("------------- Enter Y for YES or N for NO ---------------------");
         char  choice = sc.next().charAt(0);
           if(choice =='Y'){
                     payment()  ; 
           }
           else{
              System.out.println("************ Payment aborded***************");
           }

           
    }
     static void payment(){
        System.out.println("\n PAYMENT SECTION \n");
        System.out.println("Press A for Card Payment");
        System.out.println("Press B for Barcode");
        System.out.println("Press C for Cash Payment");
   Scanner s = new Scanner(System.in);
        char op = s.next().charAt(0);
        
        if(op == 'A'){
              System.out.println  ("\n\n------------------------------------------------------------------------------------");
             System.out.println("\n insert your Card \n");
             System.out.println("Enter Pin");
             int pin = s.nextInt();
             System.out.println("Your Payment is Sucessfull");
             System.out.println("Your appointment is fixed with id no   "+token);
             token++;
             System.out.println("<<<<<<<<<<<<<<<<<<<Dont't forget to take your recipet  >>>>>>>>>>>>>>>>>>>>>>>");
             System.out.println(">>>>>>>>>>>>>>>>> Thankyou <<<<<<<<<<<<<<<<<<<<<<<");
  
}
            if(op == 'B'){
              System.out.println  ("\n\n------------------------------------------------------------------------------------");
              System.out.println("Scan barcode from Screen");
              System.out.println("Staff ensures for payment");
              System.out.println("<<<<<<<<<<<<<<<<<<<Dont't forget to take your recipet  >>>>>>>>>>>>>>>>>>>>>>>");
              System.out.println(">>>>>>>>>>>>>>>>> Thankyou <<<<<<<<<<<<<<<<<<<<<<<");
            }
       if(op == 'C'){
              System.out.println  ("\n\n------------------------------------------------------------------------------------");
              System.out.println("Please make paymnet to Cashier");
              System.out.println("Staff ensures for payment");
              System.out.println("Enter id (reciever Staff)");
              String ids = s.nextLine();
              System.out.println("\n <<<<<<<<<<<<<<<<<<< Dont't forget to take your recipet  >>>>>>>>>>>>>>>>>>>>>>> \n");
              System.out.println("\n >>>>>>>>>>>>>>>>> Thankyou <<<<<<<<<<<<<<<<<<<<<<< \n");
       }
}
    public void cancel(){
           String date;
           int token;
          Scanner sd= new  Scanner(System.in);
          java.util.Date da = new java.util.Date();
         System.out.println(da);
         long time = da.getTime();
         System.out.println("******************************************************");
       System.out.println("Enter date of Appointment");
       date = sd.nextLine();
       System.out.println("Enter token number ");
       token = sd.nextInt();
       System.out.println("Enter doctor id");
       String num = sd.nextLine();
       System.out.println("*******************************************************************************");
       System.out.println("Your Appointment is Cancelled for Date      "+date+"  for token number  "+token);
       System.out.println(">>>>>>>>>>>>>>>>>>> Thank-You  <<<<<<<<<<<<<<<<<<<<<<");
    }
 }