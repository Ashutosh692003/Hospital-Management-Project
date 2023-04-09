package Hospital_Management;
import java.util.Scanner;
 class facility {

          String facility;
          int cost;
          void new_facility(){
            
            Scanner sc= new Scanner(System.in);
        System.out.println("Enter facility");
        facility  = sc.nextLine();
        System.out.println("Enter Cost");
        cost = sc.nextInt();
}
    public void get_info(){
      System.out.println("\n--------------------------------------------------------------------------\n");
        java.util.Date da = new java.util.Date();
        System.out.println(da);
        long time = da.getTime();
       
      System.out.println("\n----------------------------------------------------------------------------");
      System.out.println("Name of Facility            "+facility);
      System.out.print("Cost            "+cost);
      System.out.println("\n----------------------------------------------------------------------------");
      
    }

}
