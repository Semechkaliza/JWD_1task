package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class Validator {

	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
	/*	for (Map.Entry<E,Object> b : criteria.getSet())  {
			String temp = b.toString();
			for( int i = 0 ;i < StringCriteriaIterator.getLength() ; i++ ) {
				if(concatName(temp).equals(StringCriteriaIterator.getValue(i))){
					try {
						double a = Double.parseDouble(concatValue(temp));
						return false;
					}catch (NumberFormatException e){}
				}
			}
		}*/
		return true;
	}

	private static String concatName(String temp){
		return temp.substring(0,temp.indexOf('=')-1);
	}

	private static String concatValue(String temp){
		return temp.substring(temp.indexOf('='),temp.length());
	}

}