package shape;

public class square implements Shape {

    int area = 0;
    int lenght;
    int heigth;

    public void calculateArea() {
        int area = lenght * heigth;
        System.out.println("area = " + area);
    }

    
    
    
    public static void main(String args[]) {
        square obj = new square(10,15);
        obj.calculateArea();
    }
square(int l,int h){
this.lenght=l;
this.heigth=h;
}
}


