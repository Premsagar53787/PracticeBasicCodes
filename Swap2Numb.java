public class Swap2Numb{
  public static void main(String[] args){
    int a = 5, b = 6;
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.printlln("a: " + a +", b: " + b);
  }
}