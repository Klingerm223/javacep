package Aplicacao;

import java.util.Scanner;

import controle.ServicoDeCep;
import dominio.Endereco;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.print("Informe seu CEP: ");
        String cep = new Scanner(System.in).nextLine();
        System.out.println(cep);
        Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());

	}

}
