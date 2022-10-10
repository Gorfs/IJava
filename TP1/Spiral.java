public class Spiral {
    //importiing turtle
    public static Turtle turtle;
    //setting up the format of the canvas
    static int picture_width = 1024;
    static int picture_height = 1024;

    public static void main (String[] args) {
	// Configuration of the turtle
	turtle = new Turtle (picture_width,picture_height);
	turtle.setspeed (1000);

	// time to Draw !
	turtle.up();
	turtle.moveto(0,0);
    turtle.down();

    // cette Command utilise du code que j'ai rajouter dans le Turtle.java
    turtle.setColor(155, 44, 254);

    int largeur = 1;
    // la boucle qui cree le spiral du centre vers l'exterieur
    for (int i = 0; i < 10; i ++){
        turtle.setheading(0);
        turtle.forward(largeur);
        turtle.setheading(90);
        turtle.forward(largeur + 10);
        turtle.setheading(180);
        turtle.forward(largeur + 20);
        turtle.setheading(270);
        turtle.forward(largeur + 30);
        largeur = largeur + 40;
    }
    turtle.up();
    turtle.exitonclick ();
    
    
}
}
