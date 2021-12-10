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

public class listLocação {
private List<locação> lista2 = new ArrayList<locação>();
	
	public List<locação> getLista2() {
		return lista2;
	}

	public void setLista2(List<locação> lista2) {
		this.lista2 = lista2;
	}

	public void add(locação locação) {
		lista2.add(locação);
	}
	
	
	public void gravar2() {
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer;
		try {
			writer = new FileWriter("json/locação.json");
			writer.write(gson.toJson(lista2));
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<locação> ler2() {
	    BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader("json/locação.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    Type listType = new TypeToken<ArrayList<locação>>(){}.getType();
	    lista2 = new ArrayList<locação>();
	    lista2 = new Gson().fromJson(bufferedReader, listType);
	    return lista2;
	}
}
