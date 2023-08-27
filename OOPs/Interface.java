public class Interface {
    public static void main(String[] args) {
        System.out.println();
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{

    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonals(in all four directions)");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonals(by one step only in all directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}