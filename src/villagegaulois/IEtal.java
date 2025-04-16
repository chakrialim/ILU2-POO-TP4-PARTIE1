package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public interface IEtal {

	boolean isEtalOccupe();

	Gaulois getVendeur();

	int getQuantite();

	int getQuantiteDebutMarche();

	Produit getProduit();

	void occuperEtal(Gaulois vendeur, Produit produit, int quantite);

}