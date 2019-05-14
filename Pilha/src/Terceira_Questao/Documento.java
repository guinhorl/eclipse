package Terceira_Questao;

public class Documento {

	private String tipoDocumento;
	private String remetente;
	private String responsavel;
	
	public Documento (String tipo, String remetente, String responsavel) {
		this.tipoDocumento = tipo;
		this.remetente = remetente;
		this.responsavel = responsavel;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public String getRemetente() {
		return remetente;
	}

	public String getResponsavel() {
		return responsavel;
	}

	@Override
	public String toString() {
		return "Documento [tipoDocumento=" + tipoDocumento + ", remetente=" + remetente + ", responsavel=" + responsavel
				+ "]";
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	
}
