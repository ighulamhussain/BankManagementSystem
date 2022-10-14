import java.util.Scanner;

 class Enter extends Thread {
    String name,accNum;

    Scanner sc=new Scanner(System.in);
    Banking bank;

    Enter(){
        bank= new Banking();
    }

    public void run(){

        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t#####################################################################");
        System.out.println("\t\t\t\t\t\t\t\t\t############# \" Welcome to Bank Management System \" ###############");
        System.out.println("\t\t\t\t\t\t\t\t\t#####################################################################");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t############## Object Oriented Programming Java Project ##############");
        System.out.println("\t\t\t\t\t\t\t\t\t################ Presented By : Ghulam Hussain Qureshi ###############");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println();

    }

    public void enter_data() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Enter your details below:");
        System.out.println();
        System.out.println("Enter Your Name: ");
        name =sc.nextLine();
        System.out.println("Enter your Account Number: ");
        accNum=sc.nextLine();
        System.out.println();

        bank.showMenu();
    }
}
