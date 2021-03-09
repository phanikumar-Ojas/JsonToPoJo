package com.json.pepsico.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderedQuantity {
	private Integer amount;
	private String unitOfMeasure;
	private Integer unitSize;

}
