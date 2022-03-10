import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import java.util.*;

class Matrix1 {

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
            // top wall
            for(int i=minr,j=minc;j<=maxc && cnt<tne;j++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
            // right wall
            for(int i=minr,j=maxc;i<=maxr && cnt<tne;i++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;
            // bottom wall
            for(int i=maxr,j=maxc;j>=minc && cnt<tne;j--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;
            // left wall
            for(int i=maxr,j=minc;i>=minr && cnt<tne ;i--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;
        }
    }



}

