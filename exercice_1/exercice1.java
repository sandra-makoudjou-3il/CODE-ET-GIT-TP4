public class FactureManager {

    // Calcul le total d'une facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // reduction selon la catégorie
        aliment(typeProduit,quantite,prixUnitaire);
        electro(typeProduit,quantite,prixUnitaire);
        luxe(typeProduit,quantite,prixUnitaire);

        // Reduction sur le total
        reduction(total);
    }
    public double aliment(String typeProduit, int quantite, double prixUnitaire)
    {
        if (typeProduit.equals("Alimentaire")) {
        total -= total * 0.05; // Réduction de 5%
        }
        return total;
    }
    public double electro(String typeProduit, int quantite, double prixUnitaire)
    {
        if (typeProduit.equals("Electronique")) {
            total -= total * 0.1; // Réduction de 10%
        }
        return total;
    }
    public double luxe(String typeProduit, int quantite, double prixUnitaire)
    {
        if (typeProduit.equals("Luxe")) {
            total -= total * 0.15; // Réduction de 15%
        }
        return total;
    }
    public doubble reduction(double total)
    {
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }
        return total;
    }
}
