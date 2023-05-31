import java.util.*;
public class nqueen {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter No of Queens :");
        int N=sc.nextInt();
        int board[][]= new int [N][N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                board[i][j]=0;
            }
        }
         helper(board, 0, N);
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(board[i][j]==1){
                    System.out.print(" "+"Q"+" ");
                }else{
                    System.out.print(" "+"_"+" ");
                }
                //System.out.print(" "+board[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
     }
public static boolean helper(int board[][],int col,int N){
    if(col>=N){
        return true;
    }
  for(int i=0;i<N;i++){
    if(safe(board,col,i,N)){
       board[i][col]=1;
    
    if(helper(board, col+1, N)){
        return true;
    }
    board[i][col]=0;
    }
   }

    return false;
}

public static boolean safe(int board[][],int col,int row,int N){
     for(int i=0;i<col;i++){
        if(board[row][i]==1){
            return false;
        }
     }

     for(int i=row , j=col; i>=0 && j>=0 ;i--,j--){
        if(board[i][j]==1){
            return false;
        }
     }

     for(int i=row , j=col; i<N && j>=0 ;i++,j--){
        if(board[i][j]==1){
            return false;
        }
     }
     return true;

}   
}

// Output:

// Enter No of Queens :6
//  _  _  _  Q  _  _ 
//  Q  _  _  _  _  _ 
//  _  _  _  _  Q  _ 
//  _  Q  _  _  _  _ 
//  _  _  _  _  _  Q 
//  _  _  Q  _  _  _ 
