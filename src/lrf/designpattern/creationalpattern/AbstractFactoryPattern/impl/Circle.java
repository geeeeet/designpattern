package lrf.designpattern.creationalpattern.AbstractFactoryPattern.impl;

import lrf.designpattern.creationalpattern.AbstractFactoryPattern.Inter.Shape;

/**
 * TODO
 *
 * @author lirufeng
 * @date 2019/1/25 12:48
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
