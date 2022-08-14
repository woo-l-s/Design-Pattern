package DesignPattern;

import DesignPattern.adapter.*;
import DesignPattern.single.Aclazz;
import DesignPattern.single.Bclazz;
import DesignPattern.single.SocketClient;

import java.lang.ref.Cleaner;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args){
//        Aclazz aclazz = new Aclazz();
//        Bclazz bclazz = new Bclazz();
//
//        SocketClient aClient = aclazz.getSocketClient();
//        SocketClient bClient = bclazz.getSocketClient();
//
//        System.out.println(aClient.equals(bClient));

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Claener cleaner = new Claener();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
    }

    public static void connect(Electronic110V electronic110V){
        electronic110V.PowerOn();
    }
}
