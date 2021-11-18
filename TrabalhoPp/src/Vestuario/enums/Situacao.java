package Vestuario.enums;

public enum Situacao {
	
	GUARDA_ROUPA (1),
	USO (2),
	LAVANDERIA (3);

	private Integer numero;

	Situacao(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getNumero() {
		return numero;
	}
}
