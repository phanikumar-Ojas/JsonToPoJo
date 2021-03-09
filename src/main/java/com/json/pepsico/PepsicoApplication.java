package com.json.pepsico;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.json.pepsico.entity.AmazonPayLoad;
import com.json.pepsico.entity.Payload;

/**
 * Hello world!
 *
 */
public class PepsicoApplication {

	private static final String INPUTPATH = "./withoutPaginationPayLoad.json";

	private static final String OUTPUTPATH = "./withoutPaginationPayLoadResponse.json";

	public static void main(String[] args) throws IOException {
		Reader reader = Files.newBufferedReader(Paths.get(INPUTPATH));
		AmazonPayLoad fromJson = new Gson().fromJson(reader, AmazonPayLoad.class);

		Payload payload = fromJson.getPayload();
		payload.setPurchaseOrderNumber("000012200");
		payload.getOrderDetails().setPurchaseOrderDate("12344-");

		fromJson.setPayload(payload);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String json = gson.toJson(fromJson);
		System.out.println(json);

		Files.write(Paths.get(OUTPUTPATH), json.getBytes(), StandardOpenOption.CREATE);

	}
}
