package com.coderhouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("Juan", "Perez");
		Persona persona2 = new Persona("Olivia", "Sanchez");
		Persona persona3 = new Persona("Roberto", "Romero");
		Persona persona4 = new Persona("Natalia", "Martinez");
		Persona persona5 = new Persona("Alexis", "Zapata");
		List<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		listaPersonas.add(persona4);
		listaPersonas.add(persona5);
		// Usamos sort de Collections para ordenar listaPersonas según el apellido.
		// Comparator.comparing(Persona::getApellido) crea un comparador basado en los
		// nombres/apellidos, facilitando la ordenación ascendente. // Ordenar la lista
		// por apellido

		// Ordenar la lista por Nombre
		Collections.sort(listaPersonas, Comparator.comparing(Persona::getNombre));
		System.out.println("----------Lista ordenada por nombre----------");
		// Imprimir la lista ordenada - Nombre
		for (Persona persona : listaPersonas) {
			System.out.println(persona.getNombre() + " " + persona.getApellido());
		}

		// Ordenar la lista por apellido
		Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido));
		System.out.println("----------Lista ordenada por apellido----------");
		// Imprimir la lista ordenada - apellido
		for (Persona persona : listaPersonas) {
			System.out.println(persona.getNombre() + " " + persona.getApellido());
		}
		// Ordenar la lista por apellido revertida
		Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido).reversed());
		System.out.println("----------Lista ordenada por apellido revertida----------");
		// Imprimir la lista ordenada - apellido
		for (Persona persona : listaPersonas) {
			System.out.println(persona.getNombre() + " " + persona.getApellido());
		}
		

	}

}
