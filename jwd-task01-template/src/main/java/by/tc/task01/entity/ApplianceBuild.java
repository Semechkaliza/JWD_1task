package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class ApplianceBuild {
    private ApplianceBuild(){

    }
    public static Appliance buildAppliance(String initString){
        Appliance appliance = null;
        if(initString.contains("Oven")){
            int powerCunsumption = Integer.parseInt(ApplianceBuild.findValLength(SearchCriteria.Oven.POWER_CONSUMPTION.toString(), initString));
            double weight = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.Oven.WEIGHT.toString(),initString));
            double capacity = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.Oven.CAPACITY.toString(),initString));
            double depth = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.Oven.DEPTH.toString(),initString));
            double height = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.Oven.HEIGHT.toString(),initString));
            double width = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.Oven.WIDTH.toString(),initString));
            appliance = new Oven(powerCunsumption,weight,capacity,depth,height,width);
        }
        if(initString.contains("Laptop")){
            double batteryCapacity = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(),initString));
            String OS = ApplianceBuild.findValLength(SearchCriteria.Laptop.OS.toString(),initString);
            int memoryRom = Integer.parseInt(ApplianceBuild.findValLength(SearchCriteria.Laptop.MEMORY_ROM.toString(), initString));
            int systemMemory = Integer.parseInt(ApplianceBuild.findValLength(SearchCriteria.Laptop.SYSTEM_MEMORY.toString(), initString));
            double cpu = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.Laptop.CPU.toString(),initString));
            double displayInchs = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.Laptop.DISPLAY_INCHS.toString(),initString));
            appliance = new Laptop(batteryCapacity,OS,memoryRom,systemMemory,cpu,displayInchs);
        }
        if(initString.contains("Refrigerator")){
            double powerConsumption = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString(),initString));
            double weight = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.Refrigerator.WEIGHT.toString(),initString));
            double freezerCapacity = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString(),initString));
            double overallCapacity = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString(),initString));
            double height = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.Refrigerator.HEIGHT.toString(),initString));
            double width = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.Refrigerator.WIDTH.toString(),initString));
            appliance = new Refrigerator(powerConsumption,weight,freezerCapacity,overallCapacity,height,width);
        }
        if(initString.contains("VacuumCleaner")){
            int powerConsumption = Integer.parseInt(ApplianceBuild.findValLength(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString(), initString));
            String filterType = ApplianceBuild.findValLength(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(),initString);
            String bagType = ApplianceBuild.findValLength(SearchCriteria.VacuumCleaner.BAG_TYPE.toString(),initString);
            String wandType = ApplianceBuild.findValLength(SearchCriteria.VacuumCleaner.WAND_TYPE.toString(),initString);
            int motorSpeedRegulation = Integer.parseInt(ApplianceBuild.findValLength(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), initString));
            double cleaningWidth = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString(),initString));
            appliance = new VacuumCleaner(powerConsumption,filterType,bagType,wandType,motorSpeedRegulation,cleaningWidth);
        }
        if(initString.contains("TabletPC")){
            double batteryCapacity = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString(),initString));
            double displayInches = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(),initString));
            int memoryROM = Integer.parseInt(ApplianceBuild.findValLength(SearchCriteria.TabletPC.MEMORY_ROM.toString(), initString));
            double flashMemoryCapacity = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString(),initString));
            String color = ApplianceBuild.findValLength(SearchCriteria.TabletPC.COLOR.toString(),initString);
            appliance = new TabletPC(batteryCapacity,displayInches,memoryROM,flashMemoryCapacity,color);
        }
        if(initString.contains("Speakers")){
            int powerConsumption = Integer.parseInt(ApplianceBuild.findValLength(SearchCriteria.Speakers.POWER_CONSUMPTION.toString(), initString));
            int numberOfSpeakers = Integer.parseInt(ApplianceBuild.findValLength(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(), initString));
            String frequencyRange = ApplianceBuild.findValLength(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(),initString);
            double cordLength = Double.parseDouble(ApplianceBuild.findValLength(SearchCriteria.Speakers.CORD_LENGTH.toString(),initString));
            appliance = new Speakers(powerConsumption,numberOfSpeakers,frequencyRange,cordLength);
        }
        return appliance;
    }

    public static String findValLength(String searchCriteria, String str){
        int i = str.indexOf(searchCriteria);
        i += searchCriteria.length() + 1;
        char signTemp = ' ';
        int strIndex = i;
        while (strIndex < str.length()){
            signTemp = str.charAt(strIndex);
            if((signTemp == ',') || (signTemp == ';')){
                break;
            }
            strIndex++;
        }
        return str.substring(i,strIndex);
    }

}