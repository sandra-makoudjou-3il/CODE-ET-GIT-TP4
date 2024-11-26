public class StockManager {

    // gere le stock
    /**
     * fonction permettant d'ajouter des produit au stock existant
     * @param typeOperation determine si c'est un ajout de stock,un retrait ou aucune des operations
     * @param produit c'est le nom du produit sur lequel on travaille
     * @param quantite c'est la quantité du produit qu'on veut ajouter ou retirer
     * @param stock c'est la quantité du produit qui reste apres l'exécution d'une operation
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        // Ajout au stock
        if (typeOperation.equals("ajout")) {
            ajout(produit,quantite,stock);
        // Retrait du stock
        } else if (typeOperation.equals("retrait")) {
            verification(produit, quantite, stock);
        // Si l'action est inconnu
        } else {
            System.out.println("Opération inconnue.");
        }
    }

    /**
     * fonction permettant d'ajouter des produit au stock existant
     * @param produit c'est le nom du produit sur lequel on travaille
     * @param quantite c'est la quantité du produit qu'on veut ajouter ou retirer
     * @param stock c'est la quantité du produit qui reste apres l'exécution d'une operation
     */
    public void ajout(String produit, int quantite, int stock)
    {
            stock += quantite;
            System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }

    /**
     * fonction qui verifie si l'operation de retrait est possible ,
     * @param produit
     * @param quantite
     * @param stock
     */
    public void verification(String produit, int quantite, int stock)
    {
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
    }
}
