package edu.stru.lesson.one;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ksu on 26.02.2017.
 */
public class PointTests {


    @Test
    void testDistance(){

        double inf = 0.0/0.0;


        Point p1 = new Point(9.5,3);
        Point p2 = new Point(8,1);

        Point p3 = new Point(7,3);
        Point p4 = new Point(7,3);

        Point p5 = new Point(3.14e00,-1.048576e06);
        Point p6 = new Point(3.1416,1048576);


        //проверяем, что не пришло NAN

        Assert.assertTrue(Double.isNaN(p1.distance(p2)) == false, "Возвращаемое значение не число.");

        Assert.assertTrue(Double.isNaN(p3.distance(p4)) == false,  "Возвращаемое значение не число.");

        Assert.assertTrue(Double.isNaN(p5.distance(p6)) == false,  "Возвращаемое значение не число.");


        //проверка на правильные суммы

        Assert.assertEquals(p1.distance(p2), 2.5, "Получен неверный результат вычисления. ");
        Assert.assertEquals(p3.distance(p4), 0.0, "Получен неверный результат вычисления. ");
        Assert.assertEquals(p5.distance(p6), 2097152.0, "Получен неверный результат вычисления. ");

        //проверить, что модуль p5.y равено p6.y
        Assert.assertEquals(Math.abs(p5.y), Math.abs(p6.y), "Число "+p5.y+" равно числу "+p6.y+" по модулю ");


        // проверить, что точки p3 и p4 имеют одинаковые координаты

        Assert.assertTrue(p3.distance(p4) == 0.0,  "Точки p3 и p4 должны иметь одинаковые координаты.");



    }

}



