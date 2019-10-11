import java.util.Arrays;

public class summing{

  public static void main(String[] args){
    int[] test = {4, 3, 17, 21, 11, 2, 9, 121};
    int[] rando = new int[22150];
    for (int i = 0; i < rando.length; i++) {
            rando[i] = (int) (Math.random() * 100);
        }
    System.out.println(Arrays.deepToString(badSumm(test)));
    //badSumm(rando);
    System.out.println(Arrays.deepToString(summ(test)));
    //summ(rando);
  }

  public static int[][] badSumm(int[] a){
    int[][] b = new int[a.length][a.length];
    for (int i=0; i<a.length; i++){
      for (int j=i+1; j<a.length; j++){
        b[i][j] = a[i] + a[j] + b[i][j-1];
      }
    }
    return b;
  }

  public static int[][] summ(int[] a){
    int[][] b = new int[a.length][a.length];
    int sum;
    for (int i=0; i<a.length; i++){
      sum = a[i];
      for (int j=i+1; j<a.length; j++){
        sum+=a[j];
        b[i][j] = sum;
      }
    }
    return b;
  }

}
