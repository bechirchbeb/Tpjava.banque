
class Banque 
{
	private int n=0;
	private String nom;
	private Compte comptes[]=new Compte[100];
	
	public Banque(String nom)
	{
		this.nom=nom;
	}
	String getNom()
	{
		return(this.nom);
	}
	public void ouvrirCompte(Compte c)
	{
		comptes[n]=c;
		n++;
	}
	public int rechercherCompte (int num) 
	{
		int p=-1;
		for(int i=0;i<n;i++)
		{
			int x=comptes[i].getNumero();
			
			if(x==num) {p=i;}

		}
		return(p);
	}
	public void fermerCompte(int numero)
	{
		int pos=rechercherCompte(numero);
		if(pos!=-1)
		{
			comptes[pos]=comptes[n-1];
			n--;
		}
	}
	
	public void deposerArgant(int num,double montant)
	{
		int pos=rechercherCompte(num);
		if(pos!=-1)
		{
			comptes[pos].ajoutrArgent(montant);
		}
		
	}
	public void  retirerArgent(int num,double montant)
	{
		int pos=rechercherCompte(num);
		if(pos!=-1)
		{
			comptes[pos].retirerArgent(montant);
		}
		
	}
	public void historiqueBanque()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(comptes[i].tostring());
		}
		
		
	}
	
	
	
}
	
	
	
