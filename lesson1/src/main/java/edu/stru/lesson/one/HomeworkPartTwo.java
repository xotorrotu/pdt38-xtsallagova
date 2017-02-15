package edu.stru.lesson.one;

public class HomeworkPartTwo {

	public static void main (String[] args){

        Point p1 = new Point(9.5,3);
        Point p2 = new Point(8,1);

        System.out.println("Расстояние между точкой A("+p1.x+";"+p1.y+") и точкой B("+p2.x+";"+p2.y+")="+distance(p1,p2));
	}


    //функнция distance вычисляет расстояние между двумя точками
    public static double distance(Point p1, Point p2){

        return Math.sqrt(Math.pow(p1.x-p2.x, 2) + Math.pow(p1.y-p2.y, 2) );

    }


}

