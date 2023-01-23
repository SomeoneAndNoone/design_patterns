package design_patterns_theory.Creational.abstract_factory.shapes;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
