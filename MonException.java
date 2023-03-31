class MonException extends Exception{ 
  public MonException(){
    System.out.println("Vous essayez d'instancier un Produit avec un Prix négatif ou nul !");
  }  
}

