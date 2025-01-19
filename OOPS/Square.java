import java.lang.*;
class Square{
    private int x;
    //NOTE : Constructor not has return type
    // Non-paramterized constructor
    public Square(){
        x=2;
    }
    // Parameterized constructor
    public Square(int side){
        if(side>=0){
            x=side;
        }else{
            x=0;
        }
    }
    public long area(){
        return x*x;
    }
}
class My{
    public static void main(String args[]){
        Square s=new Square(); // this line call for non-paramterized constructor
        Square p=new Square(5);// this line call for paramterized constructor
        System.out.println(s.area());
        System.out.println(p.area());
    }
}