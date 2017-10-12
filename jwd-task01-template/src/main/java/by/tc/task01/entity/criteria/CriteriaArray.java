package by.tc.task01.entity.criteria;

public class CriteriaArray {
    private static String [] criteriaStr = {SearchCriteria.TabletPC.COLOR.toString(),
            SearchCriteria.Laptop.OS.toString(),
            SearchCriteria.VacuumCleaner.WAND_TYPE.toString(),
            SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(),
            SearchCriteria.Speakers.FREQUENCY_RANGE.toString(),
            SearchCriteria.VacuumCleaner.BAG_TYPE.toString()};

    public static String getValue(int i){
        if(i < criteriaStr.length)
            return criteriaStr[i];
        else return null;
    }
    public static int getLength(){
        return criteriaStr.length;
    }
}
