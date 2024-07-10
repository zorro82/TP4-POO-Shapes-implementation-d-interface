package fr.afpa.shapes;

//import fr.afpa.shapes.Shape;

public class Circle implements Shape {
    // Attributs :
    private double radius;

    //Constructeurs :
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        // Modifier le code pour calculer le périmètre d'un cercle
        // Rappel de calcul : périmètre du cercle = 2 * π * rayon
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        // Modifier le code pour calculer la surface d'un cercle
        // Rappel de calcul : aire_cercle = π * rayon^2
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
    
}
