package Hospital_Management;
import java.util.Scanner;
 class medical {
              String medicine;
                int cost,count,Staffid,days;
      public void new_med(){
        System.out.println("\n--------------------------------------------------------------------------\n");
        java.util.Date da = new java.util.Date();
        System.out.println(da);
        long time = da.getTime();
        System.out.println("\n----------------------------------------------------------------------------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name of Medicine");
        medicine = input.nextLine();
    System.out.println("Enter Cost");
    cost = input.nextInt();
      System.out.println("Enter number of units");
      count = input.nextInt();
      System.out.println("Enter id of Reciever Senior Staff");
      Staffid = input.nextInt();
      }
       
      public void get_info(){
        System.out.println("\n--------------------------------------------------------------------------\n");
        java.util.Date da = new java.util.Date();
        System.out.println(da);
        long time = da.getTime();
        System.out.println("\n----------------------------------------------------------------------------\n");
        System.out.println("\n");
        System.out.println("Name of Medicine        "+medicine);
        System.out.println("Cost(per unit)          "+cost );
        System.out.println("Number of units(left)   "+count);
        System.out.println("\n");
}




      
    
}
