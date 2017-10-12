package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.CriteriaArray;

import java.util.Map;

public class Validator {
	private static String partCriteria(String part){
		return part.substring(0,part.indexOf('=')-1);
	}
	private static String partValue(String part){
		return part.substring(part.indexOf('='),part.length());
	}
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		for (Map.Entry<E,Object> b : criteria.getSet())  {
			String part = b.toString();
			for(int i = 0; i < CriteriaArray.getLength() ; i++ ){
				if(partCriteria(part).equals(CriteriaArray.getValue(i))){
					try {
						double a = Double.parseDouble(partValue(part));
						return false;
					}catch (NumberFormatException e){
						e.printStackTrace();
					}
				}
			}
		}
		return true;
	}
}