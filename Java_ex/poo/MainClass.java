package poo;

import java.util.Scanner;
import java.util.ArrayList;

public class MainClass{

    static Scanner leitor = new Scanner(System.in);
    static ArrayList<Cidades> itens = new ArrayList<Cidades>();

    public static void main(String[] args){

        Cidades item;
        int cont = 0;
        
        while(cont == 0){

            item = new Cidades();

            System.out.println("Digite o nome da cidade, sem a precensa de espaço:");
            item.nome = leitor.next();
            System.out.println("Digite o estado em que esta cidade se encontra:");
            item.uf = leitor.next();
            System.out.println("Digite a população desta cidade:");
            item.pop = leitor.nextInt();

            itens.add(item);

            System.out.println("Continuar adicionando itens? (0 = Sim; Qualquer outro número = Não)");
		    cont = leitor.nextInt();
        }

        System.out.println("CIDADE | ESTADO | POPULAÇÃO");

        for(int i = 0; i < itens.size(); i++) {
            System.out.print(itens.get(i).nome + " | " + itens.get(i).uf + " | " + itens.get(i).pop + " | ");
            System.out.println("");
        }
    }
} 