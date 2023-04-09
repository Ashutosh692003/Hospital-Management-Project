package Hospital_Management;
import java.util.Scanner;
public class lab {
Scanner sc= new Scanner(System.in);
       String facility,name;
       int lab_cost;

    public   void new_laboratory(){
        System.out.println("\n--------------------------------------------------------------------------\n");
        java.util.Date da = new java.util.Date();
        System.out.println(da);
        long time = da.getTime();
        System.out.println("\n----------------------------------------------------------------------------\n");
        System.out.println("Enter Name of Laboratory");
            facility = sc.nextLine();
        System.out.println("Enter Cost");
        lab_cost = sc.nextInt();
        System.out.println("Enter Name of Lab Incharge");
        name = sc.nextLine();

               
       }
    public void get_info(){
        System.out.println("\n--------------------------------------------------------------------------\n");
        java.util.Date da = new java.util.Date();
        System.out.println(da);
        long time = da.getTime();
        System.out.println("\n----------------------------------------------------------------------------\n");
        System.out.println("\n \n");
        System.out.println("Laboratory Name      "+facility);
        System.out.println("Laboratory fees      "+lab_cost);
        System.out.println("Incharge Name        "+name);
        
    }
} 
