package com.cake.manager.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class CakeDTO {

	 	private long id;
	 	
	 	@NotNull
	    private String cakeName;
	 	
	 	@NotNull
	    private String cakeDescription;
	 	 
	 	@NotNull
	    private BigDecimal cakePrice;
}
