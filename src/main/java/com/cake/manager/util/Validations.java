package com.cake.manager.util;

import com.cake.manager.dto.CakeDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Validations {

	
	public static String validateNulls(final CakeDTO newCake) throws Exception {
		
		String sResult = "";
		
		// Null Validation
		if (newCake.getCakeName() == null) {
			log.error("Empty mandatory field, Cake Name");
			sResult = "Empty mandatory field, Cake Name";
		}
		// Null Validation
		if (newCake.getCakeDescription() == null) {
			log.error("Empty mandatory field, Cake Description");
			sResult = "Empty mandatory field, Cake Description";
		}
		// Null Validation
		if (newCake.getCakePrice() == null) {
			log.error("Empty mandatory field, Cake Price");
			sResult = "Empty mandatory field, Cake Price";
		}
		return sResult;
	}

	public static String validateCakeAlreadyExists(CakeDTO oCakeFiltered) throws Exception {
		
		String sResult = "";

		if (oCakeFiltered.getCakeName() != null && !oCakeFiltered.getCakeName().isEmpty()) {

			if (oCakeFiltered != null) {
				log.error("The cake " + oCakeFiltered.getCakeName() + " already exist");
				sResult="The cake " + oCakeFiltered.getCakeName() + " already exist";
			}

		} else {
			log.error("Empty mandatory field, Cake Name");
			sResult="Empty mandatory field, Cake Name";
		}
		return sResult;
	
	}
}
