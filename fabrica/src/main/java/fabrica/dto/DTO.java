package fabrica.dto;

public abstract class DTO<T> {
	
	public static <T> DTO<T> converterDominio(T dominio) {
		return null;
	}
}
