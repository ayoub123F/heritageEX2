public class Auteur extends Personne {
    private int numAuteur;

    // Constructeur avec paramètres
    public Auteur(String nom, String prenom, String email, String tel, int age, int numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return super.toString() + "\nNuméro d'auteur: " + numAuteur;
    }
}
