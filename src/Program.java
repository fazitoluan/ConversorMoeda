import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Moeda;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o número de moedas que deseja registrar: ");
		int quantidadeMoedas = scan.nextInt();
		List<Moeda> vetorMoeda = new ArrayList<>();
		
		String nome;
		double valor;
		for(int i = 0; i<quantidadeMoedas; i++) {
			System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
			scan.nextLine();
			System.out.print("Digite o nome da Moeda " + (i+1) + ": ");
			nome = scan.nextLine();
			System.out.print("Digite o valor únitário da Moeda "+ nome +" em real: ");
			valor = scan.nextDouble();
			vetorMoeda.add(i, new Moeda(nome, valor));
		}
		System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
		
		
		int acumula = 0;
		while(quantidadeMoedas+acumula <= 10) {
			System.out.print("Digite 1 para registrar nova Moeda ou 2 para converter valores de moeda já add: ");
			int op = scan.nextInt();
			System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
			switch(op) {
				case 1:
					scan.nextLine();
					System.out.print("Digite o nome da Moeda " + (quantidadeMoedas+1+acumula) + ": ");
					nome = scan.nextLine();
					System.out.print("Digite o valor únitário da Moeda "+ nome +" em real: ");
					valor = scan.nextDouble();
					vetorMoeda.add(quantidadeMoedas+acumula, new Moeda(nome, valor));
					acumula++;
					break;
					
				case 2:
					System.out.print("Digite a quantidade que quer usar de parametro: ");
					double quantidade = scan.nextDouble();
					for(int i = 0; i<vetorMoeda.size(); i++) {
						System.out.print("Moeda: " + vetorMoeda.get(i).getName()+
								"\n       Total para ter " + quantidade);
						System.out.printf(" unidades em reais (R$): %.2f \n\n", vetorMoeda.get(i).totalValor(quantidade));
					}
					break;
			}
		}
		
		scan.close();
	}

}
