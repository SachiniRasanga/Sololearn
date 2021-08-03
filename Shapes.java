import java.util.Scanner;


abstract class Shape {
    int width;
    abstract void area();
}

class Square extends Shape{
   public Square(int width){
       this.width=width;
   } 
   public void area(){

    int area=this.width *this.width;
    System.out.println(area);
} 
}


class Circle extends Shape{
     public Circle(int width){
       this.width=width;
   } 

   public void area(){

     System.out.println(Math.PI*this.width*this.width);
}

}
