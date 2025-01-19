import java.lang.*;
class Rectangle{
    // Its private variable we cant access through object
    private int x,y;
    public void setX(int length){
        if(length>=0) {
            x = length;
        }
        else{
            x=0;
        }
    }
    public void setY(int breadth){
        if(breadth>=0) {
            y = breadth;
        }
        else{
            y=0;
        }
    }

    public long getPerimeter() {
        return 2*(x+y);
    }
}
class My{
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        r.setX(9);
        r.setY(9);
        System.out.println(r.getPerimeter());
        r.setX(9);
        r.setY(-9);
        System.out.println(r.getPerimeter());
    }
}
