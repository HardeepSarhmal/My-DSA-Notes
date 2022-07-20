import java.util.Scanner;

public class morePrecionSquareRoot {
  static double morePrecionSquareRoots(int n , int precision, int tempSol){
    double factor = 1;
    double ans = tempSol;
    for(int i = 0 ; i< precision ; i++){
        factor = factor/ 10;
        for (double j= ans; j*j < n ; j = j + factor){
            ans = j;
        }
    }
    return ans;
  }

    public static void main(String [ ] args){
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number you want to get square root  ");
          int n = sc.nextInt();
          int tempSol = 6 ;
          System.out.println("Answer is " + morePrecionSquareRoots( n, 2, tempSol));

    }
    
}
