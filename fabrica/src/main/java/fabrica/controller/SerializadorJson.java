package fabrica.controller;

import com.google.gson.Gson;

import spark.ResponseTransformer;

public class SerializadorJson implements ResponseTransformer {
	
	protected Gson gson = new Gson();

	@Override
	public String render(Object model) throws Exception {
		return gson.toJson(model);
	}
}
