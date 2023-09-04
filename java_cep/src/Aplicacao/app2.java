package Aplicacao;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class app2 {

	public static void main(String[] args) {

		String webservice = "http://viacep.com.br/ws/";
	    int codigoSucesso = 200;
	    String cep1 = "69033130";
	    String cep2 = "69033-030";
	
	    HttpClient client = HttpClient.newHttpClient();
	    
	    HttpRequest request = HttpRequest.newBuilder()
	          .uri(URI.create(webservice+cep1+"/json"))
	          .build();
	    
	    client.sendAsync(request, BodyHandlers.ofString())
	          .thenApply(HttpResponse::body)
	          .thenAccept(System.out::println)
	          .join();
	          
		
		
		

	}

}
