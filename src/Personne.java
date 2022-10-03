
class Personne 
{
	protected String nom;
	protected  int cin;
	protected int age;
	
	public Personne(String nom,int cin,int age)
	{
		this.nom=nom;
		this.cin=cin;
		this.age=age;
	}
	public String getNom()
	{
		return(this.nom);
	}
	public int getCin()
	{
		return(this.cin);
	}
	public int getAge()
	{
		return(this.age);
		
	}
	public String tostring()
	{
		return("Nom:"+this.nom+'\n'+"Cin:"+this.cin+"\n"+"Age:"+this.age);
	}
	
}
