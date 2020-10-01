//Name: Ryan Duncan
//Course: CSE 1322 Lab W01
//Date: 9/28/2020
//Assignment 7

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
    System.out.println();
    int choice = 5;
    do{
      Scanner sc = new Scanner(System.in);
     System.out.println("Would you like to do calculations with decimal or hexadecimal numbers? (1 for Decimal, 2 for hexadecimal):");
     choice = sc.nextInt();
    }while((choice > 2) || (choice < 1));
    
    if(choice == 1){
      Scanner sc2 = new Scanner(System.in);
      int choice2 = 7;
      do {
            choice2 = 7;
            System.out.println();
            System.out.println("---MENU---");
            System.out.println();
            System.out.println("0 - EXIT");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println();
            while((choice2 > 4) || (choice2 < 0)){
                System.out.print("Please Choose an Option: ");
                choice2 = sc2.nextInt();
            }

            if(choice2 == 0){
              System.out.println("You chose to exit. Thank you.");
              break;
            }

            else if(choice2 == 1){
              Scanner scan = new Scanner(System.in);

              Calculator newCalc = new Calculator();

              System.out.print("Please enter the first number: ");
              int num1 = scan.nextInt();

              System.out.print("Please enter the second number: ");
              int num2 = scan.nextInt();

              int answer = newCalc.add(num1, num2);
              System.out.println();

              System.out.println(answer);
            }

            else if(choice2 == 2){
              Scanner scan = new Scanner(System.in);

              Calculator newCalc = new Calculator();

              System.out.print("Please enter the first number: ");
              int num1 = scan.nextInt();

              System.out.print("Please enter the second number: ");
              int num2 = scan.nextInt();

              int answer = newCalc.sub(num1, num2);
              System.out.println();

              System.out.println(answer);
            }

            else if(choice2 == 3){
              Scanner scan = new Scanner(System.in);

              Calculator newCalc = new Calculator();

              System.out.print("Please enter the first number: ");
              int num1 = scan.nextInt();

              System.out.print("Please enter the second number: ");
              int num2 = scan.nextInt();

              int answer = newCalc.mul(num1, num2);
              System.out.println();

              System.out.println(answer);
            }

            else if(choice2 == 4){
              Scanner scan = new Scanner(System.in);

              Calculator newCalc = new Calculator();

              System.out.print("Please enter the first number: ");
              int num1 = scan.nextInt();

              System.out.print("Please enter the second number: ");
              int num2 = scan.nextInt();

              int answer = newCalc.div(num1, num2);
              System.out.println();

              System.out.println(answer);
            }
    }while(choice2!=0);
  }
  if(choice == 2){

    Scanner sc2 = new Scanner(System.in);
      int choice2 = 7;
      do {
            choice2 = 7;
            System.out.println();
            System.out.println("---MENU---");
            System.out.println();
            System.out.println("0 - EXIT");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println();
            while((choice2 > 4) || (choice2 < 0)){
                System.out.print("Please Choose an Option: ");
                choice2 = sc2.nextInt();
            }

            if(choice2 == 0){
              System.out.println("You chose to exit. Thank you.");
              break;
            }

            else if(choice2 == 1){
              Scanner scan = new Scanner(System.in);
              HexCalc hex = new HexCalc();
              System.out.println();
              System.out.println("Enter the first hexadecimal number: ");
              String num1 = scan.next();
              System.out.println("Enter the second hexadecimal number: ");
              String num2 = scan.next();
              int num1dec = hex.hexToDec(num1);
              int num2dec = hex.hexToDec(num2);
              System.out.println();
              System.out.println(Integer.toHexString(hex.add(num1dec, num2dec)));
              
            }

            else if(choice2 == 2){
              Scanner scan = new Scanner(System.in);
              HexCalc hex = new HexCalc();
              System.out.println();
              System.out.println("Enter the first hexadecimal number: ");
              String num1 = scan.next();
              System.out.println("Enter the second hexadecimal number: ");
              String num2 = scan.next();
              int num1dec = hex.hexToDec(num1);
              int num2dec = hex.hexToDec(num2);
              System.out.println();
              System.out.println(Integer.toHexString(hex.sub(num1dec, num2dec)));
              
            }

            else if(choice2 == 3){
              Scanner scan = new Scanner(System.in);
              HexCalc hex = new HexCalc();
              System.out.println();
              System.out.println("Enter the first hexadecimal number: ");
              String num1 = scan.next();
              System.out.println("Enter the second hexadecimal number: ");
              String num2 = scan.next();
              int num1dec = hex.hexToDec(num1);
              int num2dec = hex.hexToDec(num2);
              System.out.println();
              System.out.println(Integer.toHexString(hex.mul(num1dec, num2dec)));
              
            }

            else if(choice2 == 4){
               Scanner scan = new Scanner(System.in);
              HexCalc hex = new HexCalc();
              System.out.println();
              System.out.println("Enter the first hexadecimal number: ");
              String num1 = scan.next();
              System.out.println("Enter the second hexadecimal number: ");
              String num2 = scan.next();
              int num1dec = hex.hexToDec(num1);
              int num2dec = hex.hexToDec(num2);
              System.out.println();
              System.out.println(Integer.toHexString(hex.div(num1dec, num2dec)));

              
            }
    }while(choice2!=0);
  }
}
}