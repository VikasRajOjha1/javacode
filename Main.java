public class Main {
  public static void main(String[] args) {
    int a = 0;  
    int b = 1, n=6;
    #codenewbuild
    
    System.out.print(a+ " " + b);
    int c=0;
    for(int i=2; i <n ; i++) {
      c = a + b;
      System.out.print(" " + c);
      a = b;
      b = c;
    }
  }
}
