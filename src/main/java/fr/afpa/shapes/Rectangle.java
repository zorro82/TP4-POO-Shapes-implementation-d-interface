package fr.afpa.shapes;

// Implémenter la classe Rectangle
// se référer au diagramme UML contenu dans le sous-dossier "doc" pour retrouver les informations concernant ses attributs
public class Rectangle implements Shape {
    // Attributs :
    private double length;
    private double width;

    //Constructeurs :
    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Setter
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    @Override
    public double calculatePerimeter() {
    // Modifier le code pour calculer le périmètre d'un rectangle
    // Rappel de calcul : perimetre_rectangle = 2 * longueur + 2 * largeur
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
    // Modifier le code pour calculer la surface d'un rectangle
    // Rappel de calcul : aire_rectangle = longueur * largeur
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

    
}
