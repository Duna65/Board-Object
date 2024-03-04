public class board{
//Made by Dallin Lyman
//Board object that has a type, length, and rotten. 
    String type;
    int length; //inches
    boolean rotten;
    public board(String itype, int il, boolean irot){//constructor
        type=itype;
        length=il;
        rotten=irot;
    }
    public void cut (int nl){//new length if your input is less than the current length.
        if(length>nl){
        length = nl;
        }
    }
    public void rot (){//makes the wood rotten
        rotten=true;
    }
    public void print (){
    System.out.println("Wood Type: " + type);
    System.out.println("Length: " + length);
        if(rotten==true){
            System.out.println("Burn in bonfire");
            System.out.println();
        } else{
            System.out.println("Don't burn in bonfire");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        board board0 = new board("Oak",24,false);
        board board1 = new board("Ash",37,false);
        board board2 = new board("Pine",43,true);
        board0.cut(12);
        board2.cut(21);//we cut it in half for a bonfire :)
        board1.rot();//we left it in the rain :,(  
        board0.print();
        board1.print();
        board2.print();
    }
}