
public class Charater 
{
	private String name;
	private int experience;
	private int money;
	private int prestige;
	private int rank;
	
	protected Charater(String name,int rank,int experience,int prestige,int money)
	{
		this.name = name;
		this.rank = rank;
		this.experience = experience;
		this.prestige = prestige;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPrestige() {
		return prestige;
	}

	public void setPrestige(int prestige) {
		this.prestige = prestige;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}
