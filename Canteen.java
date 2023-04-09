package Hospital_Management;
import java.util.Scanner;
 class Canteen {
    Scanner sc = new Scanner(System.in);
    String id;
    char Option;
    public void order(){
        System.out.println  ("\n\n------------------------------------------------------------------------------------");
        java.util.Date da = new java.util.Date();
         System.out.println(da);
         long t = da.getTime();
         System.out.println  ("\n\n------------------------------------------------------------------------------------");
        System.out.println("\n *******************   Welcome to INOX Canteen ********************");
        System.out.println  ("\n------------------------------------------------------------------------------------\n");
           System.out.println("Enter patient id or Staff id");
           id = sc.nextLine();
           System.out.println("\n Enter G for  General plate (200rs) ");
           System.out.println("\n Enter S for Super plate (500rs) ");
           System.out.println("\n Enter D for Deluxe plate (800rs) \n");
           Option = sc.next().charAt(0);
           if(Option == 'G'){
            System.out.println  ("\n\n------------------------------------------------------------------------------------");
            System.out.println("*******Your order is recieved***********");
            System.out.println("Cost->>>>>>>>>>>>>>>>>200 rs");
            System.out.println("your amount will be added in your expenditures");
            
           }
           if(Option == 'S'){
            System.out.println  ("\n\n------------------------------------------------------------------------------------");
            System.out.println("*******Your order is recieved***********");
            System.out.println("Cost->>>>>>>>>>>>>>>>>500 rs");
            System.out.println("your amount will be added in your expenditures");
            
           }
           if(Option == 'D'){
            System.out.println  ("\n\n------------------------------------------------------------------------------------");
            System.out.println("*******Your order is recieved***********");
            System.out.println("Cost->>>>>>>>>>>>>>>>>800 rs");
            System.out.println("your amount will be added in your expenditures");
            
           }


    }
    public void getMenu(){
    System.out.println  ("\n\n-------------------------------------------------------------------------------");
    System.out.println("\n *******************   Welcome to INOX Canteen ********************");
    System.out.println("\n--------------------------------------------------------------------------\n");
        java.util.Date da = new java.util.Date();
        System.out.println(da);
        long time = da.getTime();
     
    System.out.println  ("\n------------------------------------------------------------------------------------\n");
    System.out.println("\n Enter G for  General plate (200rs) ");
    System.out.println("\n Enter S for Super plate (500rs) ");
    System.out.println("\n Enter D for Deluxe plate (800rs) \n");

}
}
