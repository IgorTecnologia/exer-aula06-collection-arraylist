package com.igor.cursojava.aula06collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionListExer01 {

	public static void main(String[] args) {
		
		String cores;
		
		List<String> list = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Digite 5 cores: ");
			cores = scan.nextLine();
			list.add(cores);
			
			}
			System.out.println("\nListar todas as cores: " + list );
			Collections.sort(list);
			System.out.println("\nOrdenar as cores: " + list );
		}
	}


