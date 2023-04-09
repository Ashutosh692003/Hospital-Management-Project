package Hospital_Management;

import java.util.Calendar;
import java.util.Scanner;
import java.util.*;

public class main {
       public static void main(String[] args) {
         
               
        System.out.println("\n*****************************************************************************************");
        java.util.Date da = new java.util.Date();
         System.out.println(da);
         long time = da.getTime();
         int docNum =2 ,patNum =2,labNum=2 ,medNum=2,fecNum=2,staffNum=2;
         System.out.println("\n ################################################################################################## \n");
         System.out.println("\n      ******************************  Welcome to HospitalWallah  *******************************    \n");
         System.out.println("\n\n Software Developed and Managed by ->>>>> Ashutosh <<<<<<<<-\n\n");
         System.out.println("\n####################################################################################################\n");
        
         int i;
        ward_management w = new ward_management();
        
         doctor[] d = new doctor[30];
            for(i=0;i<30;i++)
               d[i] = new doctor();
           patient p[] = new patient[100];
            for(i=0;i<100;i++)
               p[i] = new patient();
           lab l[] = new lab[20];
             for(i=0;i<20;i++)
               l[i] = new lab();
            facility []f =new facility[20];
            for(i=0;i<20;i++)
            f[i] = new facility();
             medical[] m = new medical[100];
           for(i=0;i<100;i++)
            m[i] = new medical();
         staff[] s = new staff[100];
         for(i=0;i<100;i++)
           s[i] = new staff();
      Scanner input = new Scanner(System.in);
          int service,status=1,s1;char A;

d[0].docId="1";
d[0].Dname = "Vivek";
d[0].speciality="child specialist";
d[0].appoint = "3-9pm";
d[0].dqual = "MBBS,MD";
d[0].mroom =11;

d[0].docId="2";
d[0].Dname = "vinay";
d[0].speciality="Heart specialist";
d[0].appoint = "1-6pm";
d[0].dqual = "MBBS,MD";
d[0].mroom =13;

p[0].id = "1";
p[0].pname="Prashant";
p[0].disease="Malaria";
p[0].age =22;
p[0].admit_status ="yes";
p[0].sex = "Male";

p[1].id = "2";
p[1].pname="Suresh Raina";
p[1].disease="Dengue";
p[1].age =34;
p[1].admit_status ="yes";
p[1].sex = "Male";

m[0].medicine = "Flintof";
m[0].cost = 500;
m[0].count = 200;
m[0].days = 12;

m[0].medicine = "Cinof";
m[0].cost = 300;
m[0].count = 200;
m[0].days = 12;

l[0].facility = "X-ray     ";
l[0].lab_cost = 800;
l[0].name = "Inder Singh Chouhan";

l[1].facility = "CT Scan   ";
        l[1].lab_cost = 1200;
      l[1].name = "Kabir Singh";

      f[0].facility = "Ambulance";
      f[0].cost = 00;
      f[1].facility="Emergency";
      f[1].cost = 250;
   
      s[0].sid = "1";
        s[0].sname = "Prakash";
        s[0].desg = "Worker";
        s[0].sex = "Male";
        s[0].salary = 5000;

        s[1].sid = "2";
        s[1].sname = "Raju";
        s[1].desg = "Worker";
        s[1].sex = "Male";
        s[1].salary = 5000;




          while(status==1){
      System.out.println("\n");
      System.out.println("--------------------->>>>>>>>>> MENU <<<<<<<<<<----------------------");
      System.out.println("\n");
      System.out.println(" ---------->>>>>>>>>>     Press 1 for Doctors Section               ");
      System.out.println(" ---------->>>>>>>>>>     Press 2 for Patient Section                ");
      System.out.println(" ---------->>>>>>>>>>     Press 3 for Medical Section               ");
      System.out.println(" ---------->>>>>>>>>>     Press 4 for Lab Section                    ");
      System.out.println(" ---------->>>>>>>>>>     Press 5 for Pharmachy Stock Management     ");
      System.out.println(" ---------->>>>>>>>>>     Press 6 for Ward Management Section         ");
      System.out.println("----------->>>>>>>>>>     Press 7 for Facility Section                  ");
      System.out.println("----------->>>>>>>>>>     Press 8 for Canteen Section                  ");
      System.out.println("----------->>>>>>>>>>     Press 9 for Appointment Section                 ");
      System.out.println("----------->>>>>>>>>>     Press 10 for Staff Section                 ");
      
            service = input.nextInt();
            switch(service){
               case 1:
{
                      System.out.println("  ->>>>>>>>>>>>>>>>>>> DOCTOR SECTION <<<<<<<<<<<<<<<<<<-");
                      
                      System.out.println("-------------------------------------------------------------");
                      System.out.println("\n");
                      s1=1;
             while(s1==1){
                      System.out.println("Enter A for new doctor profiling");
                      System.out.println("Enter B to get information of doctor");
                      A = input.next().charAt(0);
                  switch(A){
                     case 'A':{
                      d[docNum].new_doctor();
                      docNum++;
                     break; 
                     }
                  case 'B':
                  {
                     System.out.println("Enter 1: Search by H code    2:All list");
                        int v = input.nextInt();
                        if(v==1){
                              System.out.println("Enter H code of doctor");
                              int c = input.nextInt();
                              d[c].get_info();
                              break;
                        }
                        else{
                           for(int j=0;j<docNum;j++){
                              d[j].get_info();
                              System.out.println("\n\n");
                           }
                           break;
                        }
                  }

                  }    System.out.println("\n press 1 for back or press 0 for MENU");
                      s1 = input.nextInt();

               }
              break; 
            }
               case 2 :
               {
                  System.out.println("->>>>>>>>>>>>>>>>>>>>>>>>>>> PATIENT-SECTION  <<<<<<<<<<<<<<<<<<<<<<<<<<<<-");
                  System.out.println("   ------------------------------------------------------------ --------");
                  System.out.println("\n \n");
                  s1=1;
             while(s1==1){
                      System.out.println("Enter A for new new profiling");
                      System.out.println("Enter B to get information of patient");
                      A = input.next().charAt(0);
                  switch(A){
                     case 'A':{
                     p[patNum].new_patient();
                     patNum++;
                     break; 
                     }
                  case 'B':
                  {
                     System.out.println("Enter 1: Search by H code(index)    2:All list");
                     // H code means index number
                        int v = input.nextInt();
                        if(v==1){
                              System.out.println("Enter H code of patient");
                              int c = input.nextInt();
                              p[c].get_info();
                              break;
                        }
                        else{
                           for(int j=0;j<patNum;j++){
                              d[j].get_info();
                              System.out.println("\n\n");
                           }
                           break;
                        }
                  }

                  }    System.out.println("\n press 1 for back or press 0 for MENU");
                      s1 = input.nextInt();

               }   break;

               }
            case 3:
            {
               System.out.println("->>>>>>>>>>>>>>>>>>>>>>>>>>> MEDICAL-SECTION  <<<<<<<<<<<<<<<<<<<<<<<<<<<<-");
                  System.out.println("   ------------------------------------------------------------ --------");
                  System.out.println("\n \n");
                  s1=1;
             while(s1==1){
                      System.out.println("Enter A for new Medicine Registration");
                      System.out.println("Enter B to get information of existing Medicines");
            
                      A = input.next().charAt(0);
                  switch(A){
                     case 'A':{
                    m[medNum].new_med();
                    medNum++;
                     break; 
                     }
                  case 'B':
                  {
                     System.out.println("Enter 1: Search by MedCode    2:All list");
                        int v = input.nextInt();
                        if(v==1){
                              System.out.println("Enter Medcode for Medicine");
                              int c = input.nextInt();
                              m[c].get_info();
                              break;
                        }
                        else{
                           for(int j=0;j<medNum;j++){
                              m[j].get_info();
                              System.out.println("\n\n");
                           }
                           break;
                        }
                  }
                  

                  }   
                   System.out.println("\n press 1 for back or press 0 for MENU");
                      s1 = input.nextInt();

               }  
                break;
            
            }
      case 4:{
         System.out.println("->>>>>>>>>>>>>>>>>>>>>>>>>>> LABORATORY-SECTION  <<<<<<<<<<<<<<<<<<<<<<<<<<<<-");
         System.out.println("   ------------------------------------------------------------ --------");
         System.out.println("\n \n");
         s1=1;
    while(s1==1){
             System.out.println("Enter A for listing new Laboratory");
             System.out.println("Enter B to get information of Existing Laboratory");
             A = input.next().charAt(0);
         switch(A){
            case 'A':{
            l[labNum].new_laboratory();
            labNum++;
            break; 
            }
         case 'B':
         {
            System.out.println("Enter 1: Search by lab Code    2:All list");
               int v = input.nextInt();
               if(v==1){
                     System.out.println("Enter H code of lab");
                     int c = input.nextInt();
                     l[c].get_info();
                     break;
               }
               else{
                  for(int j=0;j<labNum;j++){
                     d[j].get_info();
                     System.out.println("\n\n");
                  }
                  break;
               }
         }

         }    System.out.println("\n press 1 for back or press 0 for MENU");
             s1 = input.nextInt();

      }   break;

      } 
   case 5:
   {System.out.println("->>>>>>>>>>>>>>>>>>>>>>>>>>> Pharmacy and Stock Management  <<<<<<<<<<<<<<<<<<<<<<<<<<<<-");
   System.out.println("   ------------------------------------------------------------ --------");
   System.out.println("\n \n");
   s1=1;
while(s1==1){
       System.out.println("Enter A for Medical Orders");
       System.out.println("Enter B for Staff Details");
       System.out.println("Enter C for Medicinal Complain");
       A = input.next().charAt(0);
       stock_management pass = new stock_management();
   switch(A){
      case 'A':{
      pass.order();
      break; 
      }
   case 'B':
   {
      pass.details();
      break;
   }
   case 'C':
   {
       stock_management.compalain();
       break;
   }

   }    System.out.println("\n press 1 for back or press 0 for MENU");
       s1 = input.nextInt();

}   break;

      
   } 
case 6:
{        
   System.out.println("->>>>>>>>>>>>>>>>>>>>>>>>>>> WARD-MANAGEMENT  <<<<<<<<<<<<<<<<<<<<<<<<<<<<-");

   System.out.println("   ------------------------------------------------------------ --------");

   System.out.println("\n \n");
   s1=1;
while(s1==1){
       System.out.println("Enter A for BED Enquiry");

       System.out.println("Enter B Deails of incharge");

       System.out.println("Enter C for complain(WARD)");
       A = input.next().charAt(0);
   switch(A){
      case 'A':{
     w.bed();
      break; 
      }
   case 'B':
   {

     w.details();
     break;

   }
   case 'C': {


w.complain();
break;


   }

   }  
   
   System.out.println("\n press 1 for back or press 0 for MENU");
       s1 = input.nextInt();

}   
break;

}
case 7:{
   System.out.println("->>>>>>>>>>>>>>>>>>>>>>>>>>> FACILITY-SECTION  <<<<<<<<<<<<<<<<<<<<<<<<<<<<-");
   System.out.println("   ------------------------------------------------------------ --------");
   System.out.println("\n \n");
   s1=1;
while(s1==1){
       System.out.println("Enter A for listing new Facility");
       System.out.println("Enter B to get information of Existing Facility");
       A = input.next().charAt(0);
   switch(A){
      case 'A':{
      f[fecNum].new_facility();
      fecNum++;
      break; 
      }
   case 'B':
   {
      System.out.println("Enter 1: Search by fac Code    2:All list");
         int v = input.nextInt();
         if(v==1){
               System.out.println("Enter H code of facility");
               int c = input.nextInt();
               f[c].get_info();
               break;
         }
         else{
            for(int j=0;j<fecNum;j++){
               f[j].get_info();
               System.out.println("\n\n");
            }
            break;
         }
   }

   }    System.out.println("\n press 1 for back or press 0 for MENU");
       s1 = input.nextInt();

}   break;

} 
case 8 :
               {
                  System.out.println("->>>>>>>>>>>>>>>>>>>>>>>>>>> CANTEEN-SECTION  <<<<<<<<<<<<<<<<<<<<<<<<<<<<-");
                  System.out.println("   ------------------------------------------------------------ --------");
                  System.out.println("\n \n");
                  s1=1;
             while(s1==1){
                      System.out.println("Enter A for Food Order");
                      System.out.println("Enter B to get information of MENU");
                      A = input.next().charAt(0);
                      Canteen c = new Canteen();
                  switch(A){
                     case 'A':{
                               
                        c.order();
                        break;

                     }
                  case 'B':
                  {
                     c.getMenu();
                     break;
                  }

                  }    System.out.println("\n press 1 for back or press 0 for MENU");
                      s1 = input.nextInt();

               }   break;

               }

               case 9 :
               {
                  System.out.println("->>>>>>>>>>>>>>>>>>>>>>>>>>> APPOINTMENT-SECTION  <<<<<<<<<<<<<<<<<<<<<<<<<<<<-");
                  System.out.println("   ------------------------------------------------------------ --------");
                  System.out.println("\n \n");
                  s1=1;
             while(s1==1){
                      System.out.println("Enter A for Doctor Appointment");
                      System.out.println("Enter B to Cancel Appointment");
                      A = input.next().charAt(0);
                     appointment a = new appointment();
                  switch(A){
                     case 'A':{
                            a.appoint();   
                        
                        break;

                     }
                  case 'B':
                  {
                    a.cancel();
                     break;
                  }

                  }    System.out.println("\n press 1 for back or press 0 for MENU");
                      s1 = input.nextInt();

               }   break;

               }
            
               case 10 :
               {
                  System.out.println("->>>>>>>>>>>>>>>>>>>>>>>>>>> Staff-SECTION  <<<<<<<<<<<<<<<<<<<<<<<<<<<<-");
                  System.out.println("   ------------------------------------------------------------ --------");
                  System.out.println("\n \n");
                  s1=1;
             while(s1==1){
                      System.out.println("Enter A for new new Staff profiling");
                      System.out.println("Enter B to get information of Staff");
                      A = input.next().charAt(0);
                  switch(A){
                     case 'A':{
                    s[staffNum].new_staff();
                    staffNum++;
                     break; 
                     }
                  case 'B':
                  {
                     System.out.println("Enter 1: Search by id    2:All list");
                        int v = input.nextInt();
                        if(v==1){
                              System.out.println("Enter H code of doctor");
                              int c = input.nextInt();
                              s[c].get_info();
                              break;
                        }
                        else{
                           for(int j=0;j<staffNum;j++){
                              s[j].get_info();
                              System.out.println("\n\n");
                           }
                           break;
                        }
                  }

                  }    System.out.println("\n press 1 for back or press 0 for MENU");
                      s1 = input.nextInt();

               }   break;

               }
            default :
            {
               System.out.println(" You Have Enter Wrong Choice!!!");
           }
            
                  
         }
         System.out.println("\nReturn to MAIN MENU Press 1 or Enter 11 to shutDown Software");
         status = input.nextInt();

          }

       }
      }
