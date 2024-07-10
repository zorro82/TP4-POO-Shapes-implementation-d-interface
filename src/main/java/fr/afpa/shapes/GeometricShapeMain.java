package fr.afpa.shapes;

import java.util.ArrayList;
import java.util.List;

/*
	Objectif : développer des classes représentant des formes géométriques (Rectangle, Cercle et Triangle)
	Pour chacune de ces classes il faudra implémenter deux méthodes :
	 - une qui renverra le périmètre -> double calculatePerimeter()
	 - une qui renverra l'aire -> double calculateArea()

	Pour apprendre à implémenter une interface vous pouvez vous référer au diaporama présenté en formation
	Vous pouvez également regarder la vidéo suivante : https://www.youtube.com/watch?v=OkEwPtRaqY4

	TODO implémentez une classe "Rectangle" comprenant les attributs présentés sur le diagramme UML contenu dans le sous-dossier "doc"
	Le diagramme UML est sous format "uxf". Pour pouvoir le lire il vous faudra le logiciel UMLET
	UMLET est disponible à l'adresse suivante : https://www.umlet.com/

	TODO implémentez une classe "Circle" comme présentée par le diagramme UML

	TODO créez une interface nommée "Shape" comprenant deux méthodes abstraites de calcul :
	 - double calculatePerimeter()
	 - double calculateArea()

	TODO faites en sorte que la classe "Rectangle" implémente l'interface "Shape" et implémentez les deux méthodes 
	Rappel de calcul :
	 - perimetre_rectangle = 2 * longueur + 2 * largeur
	 - aire_rectangle = longueur * largeur

	TODO faites en sorte que la classe "Circle" implémente l'interface "Shape" et implémentez les deux méthodes
	Rappel de calcul :
	 - périmètre du cercle = 2 * π * rayon
	 - aire_cercle = π * rayon^2

	 La valeur π peut être retrouvée en Java en utilisant "Math.PI" 
	 La puissance de 2 peut être effectuée en utilisant la méthode static "pow" de la classe "Math" 
	 -> plus d'informations par ici https://codegym.cc/fr/groups/posts/fr.575.math-pi-en-java

*/
public class GeometricShapeMain
{
	public static void main(String[] args) 
	{
		// Instancier des objets de classe Rectangle
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(3, 7);

        // Instancier des objets de classe Circle
        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(6);

		
		System.out.println("\n----- Afficher les périmètres et les aires des rectangles\" -----");
        // Afficher les périmètres et les aires des rectangles
		System.out.println("Rectangle 1 - Lenght: " + rectangle1.getLength() + ", Area: " + rectangle1.getWidth());
        System.out.println("Rectangle 1 - Perimeter: " + rectangle1.calculatePerimeter() + ", Area: " + rectangle1.calculateArea());
		System.out.println("Rectangle 2 - Lenght: " + rectangle2.getLength() + ", Area: " + rectangle2.getWidth());
        System.out.println("Rectangle 2 - Perimeter: " + rectangle2.calculatePerimeter() + ", Area: " + rectangle2.calculateArea());

		System.out.println("\n----- Afficher les périmètres et les aires des cercles\" -----");
        // Afficher les périmètres et les aires des cercles
        System.out.println("Circle 1 - Radius: " + circle1.getRadius());
		System.out.println("Circle 1 - Perimeter: " + circle1.calculatePerimeter() + ", Area: " + circle1.calculateArea());
		System.out.println("Circle 2 - Radius: " + circle2.getRadius());
        System.out.println("Circle 2 - Perimeter: " + circle2.calculatePerimeter() + ", Area: " + circle2.calculateArea());

		System.out.println("\n----- Ajouter ces objets à une instance de la classe \"ArrayList\" -----");
		// Ajouter ces objets à une instance de la classe "ArrayList"
		// plus d'information sur la classe "ArrayList" -> https://info.clg.qc.ca/java/structures/array-list
		// Créer une liste pour stocker les formes géométriques
        List<Shape> shapes = new ArrayList<>();

		// Ajouter les objets à la liste
    //    shapes.add(rectangle1.getLength(), rectangle1.getWidth());
		shapes.add(rectangle1);
		//shapes.add(rectangle2.getLength(), rectangle2.getWidth());
        shapes.add(rectangle2);
       // shapes.add(circle1.getRadius());
		shapes.add(circle1);
       // shapes.add(circle2.getRadius());
		shapes.add(circle2);

		System.out.println("\n----- Boucler sur les éléments de la liste afin d'afficher le périmètre et l'aire de chaque objet\" -----");
		// Boucler sur les éléments de la liste afin d'afficher le périmètre et l'aire de chaque objet
		// Afficher les périmètres et les aires des formes dans la liste
		for (Shape shape : shapes) {
		System.out.println("Shape : "+ shape.toString() + " - Perimeter: " + shape.calculatePerimeter() + ", Area: " + shape.calculateArea());
		}
	}
}	