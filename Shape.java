import java.awt.*;
public class Shape {
    void draw(){
        System.out.println("Draw Shapes");
    };
    void erase(){
        System.out.println("Erase Shape");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Draw Circle");
    }
    @Override
    void erase(){
        System.out.println("Erase Circle");
    }
}
class triangle extends Shape{
    @Override
    void draw(){
        System.out.println("Draw Triangle");
    }
    @Override
    void erase(){
        System.out.println("Erase Triangle");
    }
}
class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Draw Square");
    }
    @Override
    void erase(){
        System.out.println("Erase Square");
    }
}
class Result{
    public static void main(String[] args) {
        Shape C = new Circle();
        C.draw();
        C.erase();
        Shape T = new triangle();
        T.draw();
        T.erase();
        Shape S =new Square();
        S.draw();
        S.erase();
    }
}
