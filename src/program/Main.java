package program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.Locale;

import entities.Product;
import services.ProductService;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "//home//adilson//eclipse-workspace//ArquivoComparable//teste.txt";

		
		List <Product> Lista = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String linhas = br.readLine();
			
			while(linhas != null) {
				String [] split = linhas.split(",");
				Lista.add(new Product(split[0], Double.parseDouble(split[1])));
				
				linhas = br.readLine();
			}
			
			Product x = ProductService.max(Lista);
			System.out.println("MAX:");
			System.out.println(x);
			
		}catch(IOException e) {
			System.out.println("ERROR "+e);
		}
		 
	}

}