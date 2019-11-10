package lrf.designpattern.creationalpattern.AbstractFactoryPattern.impl;

import lrf.designpattern.creationalpattern.AbstractFactoryPattern.Inter.Shape;

/**
 * TODO
 *
 * @author lirufeng
 * @date 2019/1/25 12:47
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
