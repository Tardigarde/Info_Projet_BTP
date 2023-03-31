/*
 * @author Amadou Coulibaly
 */
public class Produit {
  String reference;
  int stock;
  float prix_unitaire;
  
  public Produit(String ref, int st, float prix) 
  throws  MonException
  {  
    if (prix <= 0)
      throw new MonException();
    else
    {
      this.reference = ref;
      this.stock = st;
      this.prix_unitaire = prix;
      
    }
  }

}
