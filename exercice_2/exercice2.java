public class GestionnaireNotes {

    // Affiche note et moyennes
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        affichageNotes(nomEtudiant,notes);

        // Affichage de la moyenne
        affichageMoyenne(notes);
    }
    public void affichageNotes(String nomEtudiant, int[] notes)
    {
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }
    
    public void affichageMoyenne(int[] notes)
    {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        System.out.println("Moyenne : " + (double) somme / notes.length);
    }
}
