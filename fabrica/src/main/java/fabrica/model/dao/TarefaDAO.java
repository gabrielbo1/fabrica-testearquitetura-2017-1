package fabrica.model.dao;

import fabrica.model.dominio.Tarefa;

public class TarefaDAO extends GenericDAO<Tarefa, Long>{

	public TarefaDAO(ProvedorTransacao transacao, Class<Tarefa> clazzP) {
		super(transacao, clazzP);
	}

}
