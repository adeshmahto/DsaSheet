public class Matrix2 {
    public static void main(String[] args) {
        int mat[][]={{1,2,3,},
                      {4,5,6},
                     {7,8,9}};
        int key=8;
        boolean flag=false;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==key){
                    flag=true;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}
