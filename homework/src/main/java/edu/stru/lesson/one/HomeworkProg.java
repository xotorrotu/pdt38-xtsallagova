package edu.stru.lesson.one;

public class HomeworkProg {

	public static void main (String[] args){

        Point p1 = new Point(9.5,3);
        Point p2 = new Point(8,1);

        System.out.println("Расстояние между точками A("+p1.x+";"+p1.y+") и B("+p2.x+";"+p2.y+") = "+p1.distance(p2));

	}

}

