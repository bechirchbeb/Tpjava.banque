
class test {

	public static void main(String[] args) 
	{
		Personne p1= new Personne("bechir",0012545,22);
		Personne p2=new Personne("mohamed",114284,50);
		Personne p3=new  Personne ("karim",114011,45);
		
		//System.out.println(p2.tostring());
		Compte c1=new Compte(1,p1,1000);
		Compte c2=new Compte(2,p2,500);
		Compte c3=new Compte(3,p3,0);
		//System.out.println(c1.tostring());
		Banque b=new Banque("Zaitouna");
		b.ouvrirCompte(c1);
		b.ouvrirCompte(c2);
		b.ouvrirCompte(c3);
		b.fermerCompte(1);
		b.retirerArgent(2, 400);
		b.deposerArgant(3, 777);
		b.historiqueBanque();
		
		

	}

}
