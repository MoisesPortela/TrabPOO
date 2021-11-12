package Vestuario.enums;

public enum Situacao {
	
	GUARDA_ROUPA ("a"),
	USO ("b"),
	LAVANDERIA ("c");

	private String numero;

	Situacao(String c) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}
}
