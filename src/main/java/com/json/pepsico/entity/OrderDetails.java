package com.json.pepsico.entity;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String purchaseOrderDate;
	private String purchaseOrderChangedDate;
	private String purchaseOrderStateChangedDate;
	private String purchaseOrderType;
	private String paymentMethod;
	private Party buyingParty;
	private Party sellingParty;
	private Party shipToParty;
	private Party billToParty;
	private String deliveryWindow;
	private List<Item> items;

}
