import java.util.Arrays;

public class TicTacToe1 {

    private  Character[][] board = {
            {'\0','\0','\0'},
            {'\0','\0','\0'},
            {'\0','\0','\0'}
    };


/*
    public void play(int x, int y){
        if(x < 1 || x > 3){
            throw new RuntimeException("X is outside board");
        }else if(y < 1 || y > 3){
            throw  new RuntimeException("X is outside board");
        }
        if(board[x-1][y-1] != '\0'){
            throw new RuntimeException("Box is occupied");
        }else {
            board[x-1][y-1] = 'X';
        }
    }*/
    public void play(int x,int y){
        checkAxisX(x);
        checkAxisY(y);
        setBox(x, y);
        lastPlayer = nextPlayer();
    }

    private void checkAxisX(int x) {
        if(x<1 || x >3){
            throw new RuntimeException("超出Outside board X!");
        }
    }

    private void setBox(int x, int y) {
        if(board[x-1][y-1] != '\0'){
            throw new RuntimeException("box is occupied!");
        }else{
            board[x-1][y-1] = 'X';
        }
    }
    private void checkAxisY(int y) {
        if(y<1 || y>3){
            throw new RuntimeException("超出Outside board Y!");
        }
    }


  public char nextPlayer(){
//        return 'X';
      if(lastPlayer == 'X'){
          return 'O';
      }else{
          return 'X';
      }
  }

  private char lastPlayer = '\0';


}
