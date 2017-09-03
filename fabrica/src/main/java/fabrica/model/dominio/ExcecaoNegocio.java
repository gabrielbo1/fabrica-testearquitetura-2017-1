package fabrica.model.dominio;

public class ExcecaoNegocio extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer codErro;
	
	private String tituloErro;
	
	private String descricaoErro;

	public ExcecaoNegocio(Integer codErro, String tituloErro,
			String descricaoErro) {
		super();
		this.codErro = codErro;
		this.tituloErro = tituloErro;
		this.descricaoErro = descricaoErro;
	}

	public Integer getCodErro() {
		return codErro;
	}

	public String getTituloErro() {
		return tituloErro;
	}

	public String getDescricaoErro() {
		return descricaoErro;
	}
}
