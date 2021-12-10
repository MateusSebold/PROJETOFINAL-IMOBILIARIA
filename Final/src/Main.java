import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que tipo de imovel voçê deseja? Locação ou Venda ");
		String verificaçao = entrada.nextLine();
		
		if(verificaçao.length()==5) {
		
		
			listImobiliaria a = new listImobiliaria();
				
			a = new listImobiliaria();
			a.setLista(a.ler());
			System.out.println("IMÓVEIS A VENDA");
			for (venda v : a.getLista()) {
				
				System.out.println(v);
			}
		
		
		}else if(verificaçao.length()==7) {
			listLocação b = new listLocação();
		
			b = new listLocação();
			b.setLista2(b.ler2());
			System.out.println("IMÓVEIS PARA LOCAÇÃO");
			for (locação l : b.getLista2()) {
				
				System.out.println(l);
		 

		}
		}
		else 
			System.out.println("Entrada Invalida");
		
		entrada.close();
	}
	
}
