import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que tipo de imovel vo�� deseja? Loca��o ou Venda ");
		String verifica�ao = entrada.nextLine();
		
		if(verifica�ao.length()==5) {
		
		
			listImobiliaria a = new listImobiliaria();
				
			a = new listImobiliaria();
			a.setLista(a.ler());
			System.out.println("IM�VEIS A VENDA");
			for (venda v : a.getLista()) {
				
				System.out.println(v);
			}
		
		
		}else if(verifica�ao.length()==7) {
			listLoca��o b = new listLoca��o();
		
			b = new listLoca��o();
			b.setLista2(b.ler2());
			System.out.println("IM�VEIS PARA LOCA��O");
			for (loca��o l : b.getLista2()) {
				
				System.out.println(l);
		 

		}
		}
		else 
			System.out.println("Entrada Invalida");
		
		entrada.close();
	}
	
}
