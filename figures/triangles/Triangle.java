package triangles;

import figures.PerArea;

abstract class Triangle implements PerArea{
    private double a;
    private double b;
    private double c;

    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    public void setA(double a){
        this.a = a;
    }
    public double getA(){
        return this.a;
    }

    public void setB(double b){
        this.b = b;
    }
    public double getB(){
        return this.b;
    }

    public void setC(double c){
        this.c = c;
    }
    public double getC(){
        return this.c;
    }
    
    public double getPerimeter(){
        return this.a+this.b+this.c;
    }

    public double getArea(){
        double halfPerimeter = this.getPerimeter()/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter-a)*(halfPerimeter-b)*(halfPerimeter-c));
    }
 
    public void getDescription(){
        System.out.println("The triangle");

    }
}