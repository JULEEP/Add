import java.util.Scanner;
class Add{
 public static void main(String[] args){
    int a,b,sum;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter 1st numer");
  a = sc.nextInt();
  System.out.println("Enter 2nd number");
  b = sc.nextInt();
  sum = a+b;
  System.out.println("Addition of 1st number and 2nd number is" +sum);
}
}