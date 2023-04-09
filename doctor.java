package Hospital_Management;
import java.util.Scanner;
 class doctor {
      String docId,Dname,speciality,dqual,appoint;
      int mroom;
   public   void new_doctor(){  
        System.out.println("\n--------------------------------------------------------------------------\n");
        java.util.Date da = new java.util.Date();
        System.out.println(da);
        long time = da.getTime();
        System.out.println("\n----------------------------------------------------------------------------\n");
   Scanner sc = new Scanner(System.in);
           System.out.println("Enter ID of Doctor");
            docId = sc.nextLine();
           System.out.println("Enter Name of Doctor");
           Dname = sc.nextLine();
           System.out.println("Enter Specialties of Doctor");
           speciality = sc.nextLine();
           System.out.println("Enter Qualifications of Doctor");
           dqual = sc.nextLine();
           System.out.println("Enter Hospital (work) time");
           appoint = sc.nextLine();
           System.out.println("Enter alloted Room Number");
           mroom = sc.nextInt();
           System.out.println("*********************************************************************");
           System.out.println("\n >>>>>>>>>>>>>>Profiling Completed <<<<<<<<<<<<<<<<<<\n");
           System.out.println("*********************************************************************");

           
      }
     public void  get_info(){
             System.out.println("ID                       "+docId);
             System.out.println("Name                    "+Dname);
             System.out.println("Specialities             "+speciality);
             System.out.println("Qualifications           "+dqual);
             System.out.println("Avaliabiliy              "+appoint);
             System.out.println("Room NO                  "+mroom);


     }
}
