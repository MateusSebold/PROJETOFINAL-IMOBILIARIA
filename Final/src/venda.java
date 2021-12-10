
public class venda extends informaçoes{

public venda (String tipo, int numero, String rua,String bairro,String cidade,String estado,float preço) {
	super(tipo,numero,rua,bairro,cidade,estado,preço);
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
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
