package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria<E> {

	private Map<E, Object> criteria = new HashMap<E, Object>();
    private String concatType(String fullType){
        return fullType.substring(fullType.indexOf("$")+1,fullType.length());
    }
	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
	public Set<Map.Entry<E,Object>> getSet(){
		return criteria.entrySet();
	}

	public String getType(){
		String s = criteria.keySet().iterator().next().getClass().toString();
		return concatType(s);
	}
}
