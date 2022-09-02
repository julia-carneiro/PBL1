package Model;
import java.util.*;


public class DAOJogadores{
	private Map<String, Jogadores> mapJogador = new HashMap<>();
	Jogadores Jogador = new Jogadores();

	public void getData(){
		try (Scanner scan1 = new Scanner(System.in)){
			System.out.println("Digite o nome do jogador: ");
			String name = scan1.nextLine();
			Jogador.setName(name);
		}
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o codigo do jogador: ");
			String codJog = scan.nextLine();
			Jogador.setCodJog(codJog);
		}
	}
	
	public void insert(Jogadores Jogador) {
		getData();
		mapJogador.put(Jogador.getCodJog(), Jogador);
		
	}
}
 