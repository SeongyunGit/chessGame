package chess;

import java.util.HashMap;
import java.util.Map;

public class ChessGame {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        

        String[][] board = new String[8][8];
        board[0]= new String[] {"r","n","b","q","k","b","n","r"};
        board[1]= new String[] {"p","p","p","p","p","p","p","p"};

        for (int i=2;i<6;i++) {
            for (int j=0;j<8;j++) {
                board[i][j]=".";
            }
        }
        board[6]= new String[] {"P","P","P","P","P","P","P","P"};
        board[7]= new String[] {"R","N","B","Q","K","B","N","R"};

        for (int i=0;i<8;i++) {
            for (int j =0;j<8;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }
}