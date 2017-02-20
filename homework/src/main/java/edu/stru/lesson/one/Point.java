package edu.stru.lesson.one;

/**
 * Created by ksu on 15.02.2017.
 */
public class Point {

    //координаты точки
    public double x;
    public double y;


    //конструктор
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }

    //функнция distance вычисляет расстояние между двумя точками
    public double distance(Point p){

        return Math.sqrt(Math.pow(this.x-p.x, 2) + Math.pow(this.y-p.y, 2) );

    }

}
