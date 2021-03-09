package com.json.pepsico.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer itemSequenceNumber;
	private String amazonProductIdentifier;
	private String vendorProductIdentifier;
	private OrderedQuantity orderedQuantity;
	private Boolean isBackOrderAllowed;
	private CostPrice netCost;
	private CostPrice listPrice;

}
