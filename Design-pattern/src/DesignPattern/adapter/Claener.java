package DesignPattern.adapter;

public class Claener implements Electronic220V{
    @Override
    public void Connect() {
        System.out.println("청소기 220v on");
    }
}
