
public class informaçoes {

	private String tipo;
	private int numero;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private float valor;
	
	public informaçoes(String tipo, int numero, String rua,String bairro,String cidade,String estado,float valor) {
		setTipo(tipo);
		setNumero(numero);
		setRua(rua);
		setBairro(bairro);
		setCidade(cidade);
		setEstado(estado);
		
		
	}
	public informaçoes() {
		
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if(tipo.length()>2)
			this.tipo = tipo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if(numero>0)
			this.numero = numero;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		if(rua.length()>2)
			this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		if(bairro.length()>=4)
			this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		if(cidade.length()>=5)
			this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		if(estado.length()>=4)
			this.estado = estado;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("informaçoes [tipo=");
		builder.append(tipo);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", rua=");
		builder.append(rua);
		builder.append(", bairro=");
		builder.append(bairro);
		builder.append(", cidade=");
		builder.append(cidade);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", getTipo()=");
		builder.append(getTipo());
		builder.append(", getNumero()=");
		builder.append(getNumero());
		builder.append(", getRua()=");
		builder.append(getRua());
		builder.append(", getBairro()=");
		builder.append(getBairro());
		builder.append(", getCidade()=");
		builder.append(getCidade());
		builder.append(", getEstado()=");
		builder.append(getEstado());
		builder.append(", getValor()=");
		builder.append(getValor());
		builder.append("]");
		return builder.toString();
	}
	
	
}
