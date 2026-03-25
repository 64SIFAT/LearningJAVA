import java.util.*;


class FirstClass {
  public static void main(String arg[]) {
    //Lecture 2 {Output, variables, data type, input}
    //Output
    /*System.out.println("\nHellow world with java\n");
    System.out.println("Hello World");
    System.out.println("*");
    System.out.println("**");
    System.out.println("***");
    System.out.println("****");
    System.out.println("*****");
    System.out.println();//sout and tab easy way to write full line

    //Variables

    String name = "Sifat Ullah";
    int A = 34;
    int B = 56;
    float sum = A + B;
    //System.out.println(sum);
    double price = 34.56;

    B = 25;
    name = "Nadia";
    System.out.println(name);

    //Input

    Scanner sc = new Scanner(System.in);
    String nam = sc.nextLine();
    System.out.println(nam);
    //nextInt()
    //nextFloat()

    int a, b, plus;

    System.out.println("Enter Two numbers: ");
    a = sc.nextInt();
    b = sc.nextInt();
    plus = a + b;
    System.out.println(plus);*/

    //Lecture 3 {If,else, else if, switch, break}
    Scanner sc = new Scanner(System.in);
  
    /*int age = sc.nextInt();
    
    if (age > 18) {
      System.out.println("Adult");
    } else {
      System.out.println("Not adult");
    }
    
    if (age % 2==0) {
    System.out.println("Even Number");
    } else {
    System.out.println("Odd Number");
    }
    int b = sc.nextInt();
    if (age == b) {
      System.out.println("Equal");
    } else if (age > b) {
      System.out.println("Age is gretter than b");
    } else {
      System.out.println("B is greater than Age");
    }*/
  
    //int button = sc.nextInt();

    /*if (button == 1) {
      System.out.println("Hello");
    }else if(button==2){System.out.println("Namaste");

    }else if(button==3){
      System.out.println("Bonjur");
    }else{System.out.println("Invalid");}*/

    /*switch (button) {
      case 1:
        System.out.println("Hello");
        break;
      case 2:
        System.out.println("Assalamualikum");
        break;
      case 3:
        System.out.println("Bouanju");
        break;
      default:
        System.out.println("Invalid");*/
      

        // Practice 2

        /*int number = sc.nextInt();

        switch (number) {
          case 1:
            System.out.println("January");
            break;
          case 2:
            System.out.println("February");
            break;
          case 3:
            System.out.println("March");
            break;
          case 4:
            System.out.println("April");
            break;
          case 5:
            System.out.println("May");
            break;
          case 6:
            System.out.println("June");
            break;
          case 7:
            System.out.println("July");
            break;
          case 8:
            System.out.println("Augast");
            break;
          case 9:
            System.out.println("September");
            break;
          case 10:
            System.out.println("October");
            break;
          case 11:
            System.out.println("November");
            break;
          case 12:
            System.out.println("December");
            break;
          default:
              System.out.println("Invalid Input");
        }*/

        //Practice 1

        System.out.println("Enter two numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println(
            "Input what you want to do \n1. Addition\n2. Subtruction\n3. Multiplication\n4. Devision\n5. Mudulo or reminder");
        int num = sc.nextInt();

        if (num == 1) {
          float sum = a + b;
          System.out.print("Addition is ");System.out.println(sum);
        } else if (num == 2) {
          float sum = a - b;
          System.out.print("Subtruction is ");
          System.out.println(sum);

        }else if(num==3) {float sum = a * b;
          System.out.print("Multiplication is ");
          System.out.println(sum);}else if (num==4){float sum = a / b;
          System.out.print("Division is ");
          System.out.println(sum);
        } else if (num == 5) {
            float sum = a % b;
          System.out.print("Mudulo or Reminder is ");
          System.out.println(sum);
          }







}

  }