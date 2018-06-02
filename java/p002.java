public class Problem2
{
  public static void main(String[] args)
  {
    fib();
  }
 
  public static void fib()
  {
    int f1 = 1;
    int f2 = 1;
    int fib = 0;
    int sum = 0;
 
    while(fib < 4000000)
    {
      fib = f1 + f2;
      if(fib % 2 == 0)
        sum += fib;
 
      f1 = f2;
      f2 = fib;
    }
    System.out.println(sum);
  }
}

// int firstNumber = 1;
// int secondNumber = 2;
// int fibonacciNumber = 0;
 
// System.out.print(firstNumber + " " + secondNumber);
// while(fibonacciNumber < 10)
// {
//   fibonacciNumber = firstNumber + secondNumber;
//   System.out.print(" " + fibonacciNumber);
//   firstNumber = secondNumber;
//   secondNumber = fibonacciNumber;
// }
