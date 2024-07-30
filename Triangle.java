package Abstraction;

import OOP_overriding.GeometricFigure;

public class Triangle extends GeometricFigure {
    private  int a;
    private int b;
    private int c;
    private  double perimetr;
    private double area;

    public Triangle (){
        this.a = 7;
        this.b = 6;
        this.c = 9;

    }

    @Override
    public void perimetr() {
        super.perimetr();
        this.perimetr = (this.a + this.b + this.c ) / 2;
        System.out.println("Perimetr of the Triangle " + this.perimetr);

    }

    @Override
    public void area() {
        super.area();
        this.area = Math.sqrt(this.perimetr * (this.perimetr - this.a)* (this.perimetr - this.b)* (this.perimetr - this.c));
        System.out.println("Area of the Triangle is equal to " + this.area);
    }
}
