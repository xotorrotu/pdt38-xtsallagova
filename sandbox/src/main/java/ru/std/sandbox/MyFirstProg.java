package ru.std.sandbox;

public class MyFirstProg {

	public static void main (String[] args){


		System.out.println("Hello, kitty!");

		//вычисление площади квадрата
		Squere s = new Squere(5);

		System.out.println("Площадь квадрата со стороной "+s.l+" равна "+s.area());


		//вычисление площади прямоугольника
		Rectangle r = new Rectangle(3,7);


		System.out.println("Площадь прямоугольника со стороной "+r.a+" и "+r.b+" равна "+r.area());


	    }


}

