public class Main {
    public static void main(String[] args) {
        // Création d'un adhérent
        Adherent adherent = new Adherent("Dupont", "Jean", "jean.dupont@email.com", "123456789", 30, 12345);
        System.out.println("Informations de l'adhérent :");
        System.out.println(adherent.toString());

        // Création d'un auteur
        Auteur auteur = new Auteur("Martin", "Paul", "paul.martin@email.com", "987654321", 45, 54321);

        // Création d'un livre
        Livre livre = new Livre(123456789, "Titre du livre", auteur);
        System.out.println("\nInformations du livre :");
        System.out.println(livre.toString());
    }
}
