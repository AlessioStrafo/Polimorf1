//Scrivere un programma che contenga una classe chiamata Forma ed un metodo
//chiamato calcolaArea() che stampi l'area della forma.
//Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea()
//per calcolare l'area del rettangolo.
//aggiungere una ulteriore classe chiamata Triangolo,
//supportando poi il calcolo dell'area per quest'ultima figura

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(10,5);
        System.out.println("Il rettangolo ha: " + rettangolo + ", ed un area equivalente a: " + rettangolo.calcolaArea());

        Triangolo triangolo = new Triangolo(10,5);
        System.out.println("Il triangolo ha: " + triangolo + ", ed un area equivalente a: " + triangolo.calcolaArea());
    }
}