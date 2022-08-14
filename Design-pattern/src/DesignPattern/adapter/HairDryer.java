package DesignPattern.adapter;

public class HairDryer implements Electronic110V{

    @Override
    public void PowerOn() {
        System.out.println("헤어드라이기 100v on");
    }



}
