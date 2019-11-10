package lrf.designpattern.creationalpattern.AbstractFactoryPattern.impl;

import lrf.designpattern.creationalpattern.AbstractFactoryPattern.Inter.Color;

/**
 * TODO
 *
 * @author lirufeng
 * @date 2019/1/25 14:45
 */
public class Red implements Color {

    @Override
    public void fill () {
        System.out.println("I am Red method");
    }
}
