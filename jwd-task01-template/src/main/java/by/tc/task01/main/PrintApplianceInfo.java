package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {

    public static void print(Appliance appliance) {
        try {
            System.out.println(appliance.toString());
        } catch (NullPointerException npException) {
            System.out.println("fignya");
            {
            }

            // you may add your own code here

        }
    }
}