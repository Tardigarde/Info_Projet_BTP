/*Traitement Des Exceptions Java V2 (Exception personnalisée)
 * @author Amadou Coulibaly
 */
public class TraitementDesExceptionsJava {

public static void main(String[] args) {         
Produit p;
System.out.println("Entrer la référence");
String r=Lire.S();
System.out.println("Entrer le stock");
int s=Lire.i();
System.out.println("Entrer le prix");
float pu=Lire.f();

try 
{
  p=new Produit(r,s,pu);  
}
catch(MonException err){
    System.out.println(err);
}
} // Fin de la méthode main( )

} // de la classe principale
  
