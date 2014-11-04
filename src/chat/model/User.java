package chat.model;

public class User
{
	private String name;
	private String favoriteMovie;
	private int age;
	private boolean isTall;
	private boolean isblonde;
	


	public User(String name)
	{
		this.name = "";
		this.age = 0;
		
		
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

	public boolean isIsblonde()
	{
		return isblonde;
	}

	public void setIsblonde(boolean isblonde)
	{
		this.isblonde = isblonde;
	}
	
	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
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
