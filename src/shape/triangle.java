package shape;

public class triangle implements Shape {

    int area = 0;
    int lenght;
    int heigth;

    public void calculateArea() {
        area = (lenght * heigth) / 2;
        System.out.println("area = " + area);
    }

    public static void main(String args[]) {
        triangle obj = new triangle(20,30);
        obj.calculateArea();
    }
    triangle(int l,int h){
this.lenght=l;
this.heigth=h;
}
    
}
