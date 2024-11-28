// //product of 3 int input
// import java.util.Scanner;
// public class javaBasic {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         long Pro = (long)a*b*c;    //Type Casting
//         System.out.println(Pro);
// }
// }



//  area of squre-
// import java.util.Scanner;
// public class javaBasic {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int area = a*a;
//         System.out.println("Area of square is:"+area);         //for call any operend we use + operator
    
//     }

//         }


// Invoice-
// import java.util.Scanner;
// public class javaBasic {
//     public static void main(String[] args) {
//         int $=24;
//         System.out.println($);                            // $ is also a name of variable it allow to use in java
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter pen price: ");
//         float pen = sc.nextFloat();                         //dono side float hi hona chahiye
//         System.out.print("Enter pencil price: ");           // only use ""
//         float pencil = sc.nextFloat();
//         System.out.print("Enter eraser price: ");
//         float eraser = sc.nextFloat();
//         float subTotal= pen+pencil+eraser;
//         float total=subTotal+(subTotal*18/100);
//         System.out.printf("Total price of items is: "+ subTotal + "With included GST :"+total);
//         sc.close();                                          // Scanner ko close karne ke liye 
//     }
// }


// // print larger then 3-
// import java.util.Scanner;
// public class javaBasic {
//     public static void main(String args[]){
//         Scanner sc= new Scanner (System.in);
//         System.out.print("Enter a number: ");
//         int a =sc.nextInt();
//         int b =sc.nextInt();
//          int c =sc.nextInt();
//          if(a>b) {
//             if(a>c){
//             System.out.print("gretest number is:"+a);
//             }
//             else {
//                  System.out.print("gretest number is:"+c);
//             }
//          }
//          else if(b>c) {
//             System.out.print("gretest number is:"+b);
//          }
//     }
// }


//Calculator-
// import java.util.Scanner;
// public class javaBasic {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();
//         System.out.print("Enter operator (+,-,*,/): ");
//         char op = sc.next().charAt(0);         
//     switch(op) {
//         case '+':  
//         System.out.print("Addition of two numbers is: "+(a+b));
//         break;
//         case '-':
//             System.out.print("Subtraction of two numbers is: "+(a-b));
//             break;
//             case '*':
//                 System.out.print("Multiplication of two numbers is: "+(a*b));
//                 break;
//                 case '/':
//                     System.out.print("Division of two numbers is: "+(a/b));
//                     break;
//                 case '%': 
//                 System.out.print("Modulus of two numbers is: "+(a%b));
//                 \
//                 break;
//                 defalt :
//                 System.out.print("Invalid operator");
//                 }
//                 }
//     }



    //weak number-
    // import java.util.Scanner;
    // public class javaBasic {
    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner(System.in);
    //         System.out.print("Enter a weak number: ");
    //         int n = sc.nextInt();
    //         switch(n) {
    //             case 1:
    //                 System.out.print("Sunday");
    //                 break;
    //             case 2:
    //                  System.out.print("Monday");
    //                 break;
    //             case 3: 
    //                 System.out.print("Teusday");
    //             case 4: 
    //                 System.out.print("Wednesday");
    //             case 5:
    //                 System.out.print("Thursday");
    //                             break;
    //             case 6:
    //                 System.out.print("Friday");
    //                 break;
    //             case 7:
    //                 System.out.print("Saturday");
    //                  break;
                
                            
    //         }
    //     }
    // }

//reverse the  given number-
// import java.util.Scanner;

// public class javaBasic1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int gvn=sc.nextInt();
//         int rev=0;
//         while(gvn>0) {
//             int lDigit=gvn%10;
//             gvn=gvn/10;
//             rev=rev*10+lDigit;              //
//         }
//             System.out.println(rev);  
//     }
// }



// break statement problem-
// import java.util.Scanner;
// public class javaBasic {
//     public static void main(String args[]) {
//        Scanner sc=new Scanner(System.in);
//        do {
//         System.out.print("Enter the number: ");
//         int n=sc.nextInt();
//         if(n%10==0) {          // 
//             break;               // break statement
//         }
//        System.out.println(n);

//        }
//        while(true);   //infinite loop
//     }
// }

// continue statement-
// import java.util.Scanner;
//  public class javaBasic1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         while(true){
//             System.out.print("Enter the number: ");
//             int n = sc.nextInt();
//             if(n%10==0) {
//                 continue; //continue statement
//             }
//             System.out.println(n);
//         }
//     }
//  }


// get prime number -
// import java.util.Scanner;
// public class javaBasic2 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         for(int i=2;i<n;i++) {
//             if(n%i==0) {
//                 System.out.println(n+" is not a prime number");
//                 break;
//             }
//             else {
//                 System.out.println(n+" is a prime number");
//             }
//         }
//     }
// }



//      sum of  even no. and odd no.
// public class javaBasic3 {
//     public static void main(String args[]) {
//         int arr [] = {1, 2, 3, 4, 5, 6,43,43,32,58,5,53,56,78,53,31,75,65};
//         int sum=0;
//         int sum1=0;
//         for(int i=0;i<arr.length;i++) {
//             if(arr[i]%2==0) {
//                 System.out.println("even number: "+arr[i]);
//                 sum +=arr[i];
//             }
//             else   {
//                  System.out.println("odd number:"+arr[i]);
//                 sum1 +=arr[i];
//             }
            
//         }
//         System.out.println(sum);
//         System.out.println(sum1);
//         }
// }


//c java practiceQ.javafactoreal-
// import java.util.Scanner;
// public class javaBasic4 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int fac = sc.nextInt();
//         for(int i=fac-1; i>0; i--) {
//         fac=fac*i;
//         }
//         System.out.println("factorial of a number is :"+fac);
//     }
// }


// multiplecation table of given number-
// import java.util.Scanner;
// public class javaBasic5 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         for(int i=1;i<=10;i++) {
//             int mul = num*i;
//             System.out.println(mul);
//     }
//     }
// }


