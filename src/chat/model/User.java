package chat.model;

public class User
{
	// four data members
	//at least two different types (String, int, boolean, double....)
	private String name;
	private String favoriteMovie;
	private int age;
	private boolean isTall;
	private boolean isBlonde;
	private double weight;
	


	public User(String name)
	{
		this.name = "";
		this.age = 0;
		this.favoriteMovie = "";
		this.isBlonde = false;
		this.isTall = false;
		this.weight = -90000;
		
		
	}

	public String getFavoriteMovie()
	{
		return favoriteMovie;
	}

	public void setFavoriteMovie(String favoriteMovie)
	{
		this.favoriteMovie = favoriteMovie;
	}

	public boolean isTall()
	{
		return isTall;
	}

	public void setTall(boolean isTall)
	{
		this.isTall = isTall;
	}

	public boolean isIsBlonde()
	{
		return isBlonde;
	}

	public void setIsblonde(boolean isblonde)
	{
		this.isBlonde = isBlonde;
	}
	
	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
