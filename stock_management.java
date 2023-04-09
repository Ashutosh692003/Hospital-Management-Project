package Hospital_Management;
import java.util.Scanner;
 class stock_management {
   String medicine,name,id;
   int days;
    public void order(){
      System.out.println("***************************************************************");
      java.util.Date da = new java.util.Date();
      System.out.println(da);
      long time = da.getTime();
      System.out.println("***************************************************************");
        Scanner sc = new Scanner(System.in);
             System.out.println("Enter Medicine Name");
             medicine =  sc.nextLine();
             System.out.println("Enter number of days stock left");
             days = sc.nextInt();
             System.out.println("Enter Name of Orderer");
             name = sc.nextLine();
             System.out.println("Enter Staff id");
             id = sc.nextLine();
             System.out.println("Your order will be placed");
     }


     public void details(){
      System.out.println("\n--------------------------------------------------------------------------\n");
        java.util.Date da = new java.util.Date();
        System.out.println(da);
        long time = da.getTime();
        System.out.println("\n----------------------------------------------------------------------------\n");
        System.out.println("Name of Incharge     :   Rajnikant");
        System.out.println("Staff id              :   rh234");
        System.out.println("Email                 : robot455@gmail.com");

     }
    
    public static void compalain(){
      Scanner sc = new Scanner(System.in);
      System.out.println("\n--------------------------------------------------------------------------\n");
        java.util.Date da = new java.util.Date();
        System.out.println(da);
        long time = da.getTime();
        System.out.println("\n----------------------------------------------------------------------------\n");
         System.out.println("Enter Staff id");
       String  ids = sc.nextLine();
         System.out.println("Enter 1 for medicinal(Expire) complain     or Enter 2 for written complain");
         int q = sc.nextInt();
      if(q==1){
        System.out.println("Enter id of medicine");
        String medid = sc.nextLine();
        System.out.println("Enter number of units");
        int unit = sc.nextInt();
        System.out.println("\n\n**************************************************************************\n");
        System.out.println("-------- Your Complain is Registerd  ---------");
        System.out.println("\n\n**************************************************************************\n");

      }
      else{
        System.out.println("\n--------------------------------------------------------------------------\n");
        java.util.Date dat = new java.util.Date();
        System.out.println(da);
        long tim = dat.getTime();
        System.out.println("\n----------------------------------------------------------------------------\n");
        System.out.println("Enter your complain");
        String note = sc.nextLine();
        System.out.println("\n\n**************************************************************************\n");
        System.out.println("-------- Your Complain is Registerd  ---------");
        System.out.println("\n\n**************************************************************************\n");

      }

        
    }
}
