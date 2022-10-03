
class Compte {
	protected final int numero;
	protected Personne titulaire ;
	protected double solde;
	
	public Compte(int numero ,Personne titulaire,double solde ) //constructeur
	{
		this.numero=numero;
		this.titulaire=titulaire;
		this.solde=solde;
	}
   public void retirerArgent(double montant)
   {
	   if(montant >0 && montant <= this.solde)
	   {
	   this.solde-=montant;
      }
   
}
   public void ajoutrArgent(double montant )
   {
	   if(montant>0)
	   {
		   this.solde+=montant;
	   }
	   
	}
   public int getNumero()
   {
	   return(this.numero);
   }
   
   public double getSolde()
   {
	   return(this.solde);
	   
   }
   public String tostring()
   {
	   return("Numero:"+this.numero+"\n"+"Nom:"+this.titulaire.nom+"\n"+"Cin:"+this.titulaire.cin+"\n"+"Age:"+this.titulaire.age+"\n"+"Solde:"+this.solde);
	   
   }
   
   
   
 }
   
