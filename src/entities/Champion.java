package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public void takeDamage(Champion otherChampion) {
		if (this.armor >= otherChampion.attack) {
			this.life -= 1;
		}
		else if (this.armor < otherChampion.attack) {
			this.life = this.life - (otherChampion.attack - this.armor);
		}
	}
	
	String msg;
	public String status() {
		if (this.life <= 0) {
			msg = "(Morreu)";
			this.life = 0;
		}
		else {
			msg = "";
		}
		return this.name
		+ ": "
		+ this.life
		+ " de vida "
		+ msg;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setLife(int life) {
		this.life = life;
	}
	
	public int getLife() {
		return this.life;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getAttack () {
		return this.attack;
	}
	
	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public int getArmor() {
		return this.armor;
	}

}
