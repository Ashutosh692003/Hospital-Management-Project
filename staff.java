package Hospital_Management;
import java.beans.DesignMode;
import java.util.Scanner;
 class staff {
          String sid,sname,desg,sex;
          int salary;
    public void new_staff(){
        System.out.println("\n***************************************************************\n");
        java.util.Date da = new java.util.Date();
        System.out.println(da);
        long time = da.getTime();
        System.out.println("\n***************************************************************\n");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name of Staff");
         sname = sc.nextLine();
         System.out.println("Enter id of Staff(Given by Hospital)");
         sid = sc.nextLine();
         System.out.println("Enter desigination->>>>");
         desg = sc.nextLine();
         System.out.println("Enter Sex");
         sex = sc.nextLine();
         System.out.println("Enter Salary");
         salary = sc.nextInt();

    }

    public void get_info(){
        System.out.println("\n--------------------------------------------------------------------------\n");
        java.util.Date da = new java.util.Date();
        System.out.println(da);
        long time = da.getTime();
        System.out.println("\n----------------------------------------------------------------------------\n");
                 System.out.println("--------- Staff Details ----------");
                 System.out.println("\n\n");
            System.out.println("Staff id      "+sid);
            System.out.println("Staff Name    "+sname);
            System.out.println("Salary         "+salary);
            System.out.println("Sex             "+sex);
            System.out.println("Designation    "+desg);
            
      }

}
