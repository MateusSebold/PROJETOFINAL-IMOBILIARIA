import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class listImobiliaria {

private List<venda> lista = new ArrayList<venda>();
	
	public List<venda> getLista() {
		return lista;
	}

	public void setLista(List<venda> lista) {
		this.lista = lista;
	}

	public void add(venda venda) {
		lista.add(venda);
	}
	
	
	public void gravar() {
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer;
		try {
			writer = new FileWriter("json/venda.json");
			writer.write(gson.toJson(lista));
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<venda> ler() {
	    BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader("json/venda.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    Type listType = new TypeToken<ArrayList<venda>>(){}.getType();
	    lista = new ArrayList<venda>();
	    lista = new Gson().fromJson(bufferedReader, listType);
	    return lista;
	}

	
	

	
	
	
}