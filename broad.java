public class broad{
//Made by Dallin Lyman
//Board object that has a type, length, and rotten. 
    public String type;
    public int length; //inches
    public boolean rotten;
    public broad(String itype, int il, boolean irot){//constructor
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
    public void print (){//prints the wood type and length and wether it is rotten or not
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
    public static class plywood extends broad{//plywood with a new variable, width
        public int width;
        public plywood(String type, int length, int ipw, boolean rotten){
        super(type,length,rotten);
        width=ipw;
        }
        public void rip(int newidth){//reduces width
            if(width>newidth){
            width=newidth;
            }
        }
        public void print (){//print for plywood objectsssssss
            System.out.println("Wood Type: " + type);
            System.out.println("Length: " + length);
            System.out.println("width: " + width);
            if(rotten==true){
                System.out.println("Burn in bonfire");
                System.out.println();
            } else{
                System.out.println("Don't burn in bonfire");
                System.out.println();
            }
        }
    }
    public static class firewood extends broad{//firewood with width
        public int width;
        public firewood(String type, int length, int ifw, boolean rotten){
        super(type,length,rotten);
        width=ifw;
        }
        public void split(int times){//splits the in half the amount of times you specify
            for(int i = times;i>0;i--){
                width /= 2;
            }
        }
        public void print(){//print for firewood object
            System.out.println("Wood Type: " + type);
            System.out.println("Length: " + length);
            System.out.println("width: " + width);
            if(rotten==true){
                System.out.println("Burn in bonfire");
                System.out.println();
            } else{
                System.out.println("Don't burn in bonfire");
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        broad board0 = new broad("Oak",24,false);
        broad board1 = new broad("Ash",37,false);
        broad board2 = new broad("Pine",43,true);
        plywood ply0 = new plywood("Birch Plywood", 42, 16, false);
        plywood ply1 = new plywood("Cherry Plywood", 48, 18, false);
        firewood fire0 = new firewood("Pine Firewood", 18, 26, true);
        firewood fire1 = new firewood("Pine Firewood", 20, 22, false);
        fire0.split(3);
        fire1.split(2);
        ply0.rip(13);
        ply1.cut(46);
        ply0.rot();
        board0.cut(12);
        board2.cut(21);//we cut it in half for a bonfire :)
        board1.rot();//we left it in the rain :,(  
        board0.print();
        board1.print();
        board2.print();
        ply0.print();
        ply1.print();
        fire0.print();
        fire1.print();
    }
}
