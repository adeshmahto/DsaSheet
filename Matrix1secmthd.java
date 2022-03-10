import java.util.Scanner;

public class Matrix1secmthd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int [][]arr=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int minr=0; //   min row
        int minc=0;   // min column
        int maxr= arr.length-1;
        int maxc=arr[0].length-1;
        int tne=n*m;     // total no. of element
        int cnt=0; // count

        while(cnt<tne){
            // left wall
            for(int i=minr,j=minc;i<=maxr && cnt<tne;i++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;
            // bottom wall
            for(int i=maxr,j=minc;j<=maxc && cnt<tne;j++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;
            // right wall
            for(int i=maxr,j=maxc; i>=minr && cnt<tne;i--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;
            // top wall
            for(int i=minr,j=maxc;j>=minc && cnt<tne;j--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
        }
    }
}
