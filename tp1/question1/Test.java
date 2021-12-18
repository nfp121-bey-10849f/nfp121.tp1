package question1;

public class Test{
    public static void main(String args[]){
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        
        circle.makeInvisible();
        circle.moveRight();
        circle.moveLeft();
        circle.moveUp();
        circle.moveDown();
        circle.moveHorizontal(10);
        circle.moveVertical(15);
        circle.slowMoveHorizontal(5);
        circle.slowMoveVertical(10);
        circle.changeSize(40);
        circle.changeColor("yellow");
        circle.makeVisible();
        
        square.makeInvisible();
        square.moveRight();
        square.moveLeft();
        square.moveUp();
        square.moveDown();
        square.moveHorizontal(5);
        square.moveVertical(10);
        square.slowMoveHorizontal(5);
        square.slowMoveVertical(10);
        square.changeSize(20);
        square.changeColor("red");
        square.makeVisible();
        
        triangle.makeInvisible();
        triangle.moveRight();
        triangle.moveLeft();
        triangle.moveUp();
        triangle.moveDown();
        triangle.moveHorizontal(1);
        triangle.moveVertical(1);
        triangle.slowMoveHorizontal(2);
        triangle.slowMoveVertical(2);
        triangle.changeSize(20, 30);
        triangle.changeColor("blue");
        triangle.makeVisible();
    }
}
