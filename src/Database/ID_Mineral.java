package Database;

public class ID_Mineral extends Database 
{
	private String name;
	private float Density;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getDensity() {
		return Density;
	}


	public void setDensity(float density) {
		Density = density;
	}


	public int getHardness() {
		return hardness;
	}


	public void setHardness(int hardness) {
		this.hardness = hardness;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	private int hardness;
	private int price;
	
	
	public ID_Mineral(int ID,String name,float Density,int hardness,int price)
	{
		super(ID,price);
		this.name = name;
		this.Density = Density;
		this.hardness = hardness;
		this.price = price;
	
	}
}
