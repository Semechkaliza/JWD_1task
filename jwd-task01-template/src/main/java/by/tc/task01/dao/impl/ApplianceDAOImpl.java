package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.ApplianceBuild;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO{
	private static String fileName = "src/main/resources/appliances_db.txt";

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		Appliance appliance = null;
		try {
			BufferedReader in = new BufferedReader(new FileReader(fileName));
			try {
				String s;
				while ((s = in.readLine()) != null) {
					if(includedParams(criteria,s))
						appliance = ApplianceBuild.buildAppliance(s);

				}


			} finally {
				in.close();
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return appliance;
	}

	private <E> boolean includedParams(Criteria<E> criteria,String str){
		str=str.toUpperCase();

		for (Map.Entry<E,Object> b : criteria.getSet()) {
			String a = b.toString().toUpperCase();
			if (!str.contains(a.toString())) return false;
		}
		if(!str.contains(criteria.getType().toUpperCase()))	return false;
		return true;
	}
}
