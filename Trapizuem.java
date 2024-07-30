package Abstraction;

import OOP_overriding.GeometricFigure;

public class Trapizuem extends GeometricFigure {

    private int sideA;
    private int sideB;
    private int high ;
    private double per;
    private double area;

    public Trapizuem(){
        this.sideA = 7;
        this.sideB = 9;
        this.high = 4;

    }

    @Override
    public void perimetr() {
        super.perimetr();
        this.per = this.sideA + this.sideB + this.sideA + this.sideB;
        System.out.println("Perimetr of Trapizuem is equal to " + this.per);

    }

    @Override
    public void area() {
        super.area();
        this.area = 1/2 * (this.sideA + this.sideB) * this.high;
        System.out.println("Area of the Trapezium is equal to " + this.area);

    }

}
