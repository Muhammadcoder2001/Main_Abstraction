package Abstraction;

import OOP_overriding.GeometricFigure;

public class Rectangular extends GeometricFigure {

    private int side1;
    private  int side2;
    private int per;
    private double area;

    public Rectangular(){
        this.side1 = 12;
        this.side2 = 15;

    }

    @Override
    public void perimetr() {
        super.perimetr();
        this.per =2 * (this.side1 + this.side2);
        System.out.println("Perimetr of the Rectangular is equal to " + this.per);
    }

    @Override
    public void area() {
        super.area();
        this.area = this.side1 * this.side2;
        System.out.println("Area of the Rectangular is equal to " + this.area);
    }
}
