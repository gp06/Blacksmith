
public class Katana 
{
	private String name;
	private int price;
	private int weight;
	private int hardness;
	private int sharp;
	private int ID;
	private int Mineral1ID = 0;
	private int Mineral2ID = 0;
	private int Mineral3ID = 0;
	private int Mineral4ID = 0;
	private float Minepercent1;
	private float Minepercent2;
	private float Minepercent3;
	private float Minepercent4;
	
	
	public int getMineral1ID() {
		return Mineral1ID;
	}

	public void setMineral1ID(int mineral1id) {
		Mineral1ID = mineral1id;
	}

	public int getMineral2ID() {
		return Mineral2ID;
	}

	public void setMineral2ID(int mineral2id) {
		Mineral2ID = mineral2id;
	}

	public int getMineral3ID() {
		return Mineral3ID;
	}

	public void setMineral3ID(int mineral3id) {
		Mineral3ID = mineral3id;
	}

	public int getMineral4ID() {
		return Mineral4ID;
	}

	public void setMineral4ID(int mineral4id) {
		Mineral4ID = mineral4id;
	}

	public float getMinepercent1() {
		return Minepercent1;
	}

	public void setMinepercent1(float minepercent1) {
		Minepercent1 = minepercent1;
	}

	public float getMinepercent2() {
		return Minepercent2;
	}

	public void setMinepercent2(float minepercent2) {
		Minepercent2 = minepercent2;
	}

	public float getMinepercent3() {
		return Minepercent3;
	}

	public void setMinepercent3(float minepercent3) {
		Minepercent3 = minepercent3;
	}

	public float getMinepercent4() {
		return Minepercent4;
	}

	public void setMinepercent4(float minepercent4) {
		Minepercent4 = minepercent4;
	}

	protected Katana(String name,int ID,int weight,int hardness,int sharp,int price,int Mineral1ID,int Mineral2ID,int Mineral3ID,int Mineral4ID,float Minepercent1,float Minepercent2,float Minepercent3,float Minepercent4)
	{
		this.name = name;
		this.ID = ID;
		this.weight = weight;
		this.hardness = hardness;
		this.sharp = sharp;
		this.price = price;
		this.Mineral1ID = Mineral1ID;
		this.Mineral2ID = Mineral2ID;
		this.Mineral3ID = Mineral3ID;
		this.Mineral4ID = Mineral4ID;
		this.Minepercent1 = Minepercent1;
		this.Minepercent2 = Minepercent2;
		this.Minepercent3 = Minepercent3;
		this.Minepercent4 = Minepercent4;
	}

	public int getSharp() {
		return sharp;
	}

	public void setSharp(int sharp) {
		this.sharp = sharp;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHardness() {
		return hardness;
	}

	public void setHardness(int hardness) {
		this.hardness = hardness;
	}
}
