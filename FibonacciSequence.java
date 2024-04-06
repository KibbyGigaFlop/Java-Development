public class FibonacciSequence {
    public static void main(String[] args) {
      
      int firstVar = 0,secondVar = 1,sum = 0;

      System.out.println(firstVar);

      for (int i = 0;i < 20; i++){

          sum = firstVar + secondVar;
          System.out.println(sum);

          secondVar = firstVar;
          firstVar = sum;

      }
    }
  }
  