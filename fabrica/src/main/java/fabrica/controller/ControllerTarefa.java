package fabrica.controller;

import static spark.Spark.*;

import fabrica.dto.TarefaDTO;
import fabrica.model.servico.ServicoTarefa;

public class ControllerTarefa implements Controller {
	
	private static final SerializadorJson json = new SerializadorJson();
	
	private static final ServicoTarefa servico = new ServicoTarefa();
	
	public static void api(String[] args) {
		post("/tarefa", "application/json", (request, response) -> {
			return servico.criarTarefa(json.gson.fromJson(request.body(), TarefaDTO.class));
			
			
		}, json);
		
		get("/tarefa","application/json", (request, response) -> {
			return servico.buscarTodas();
		}, json);
		
		delete("/tarefa",(request, response) -> {
			return servico.deletarTarefa(json.gson.fromJson(request.body(), TarefaDTO.class));
		});
		
		put("/tarefa","application/json", (request, response) -> {
			return servico.atualizarTarefa(json.gson.fromJson(request.body(), TarefaDTO.class));
		}, json);
	}
}
