package com.json.pepsico.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payload implements Serializable {
	 
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String purchaseOrderNumber;
	private String purchaseOrderState;
	private OrderDetails orderDetails;

}
