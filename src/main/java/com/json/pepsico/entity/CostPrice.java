package com.json.pepsico.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CostPrice  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String currencyCode;
	private String amount;

}
