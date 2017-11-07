package character;
public class Weapons  {

	Character_Class weapon = new Character_Class();
	
	public int getRusty_Axe_Damage(){
		weapon.setDamage(20);
		return weapon.getDamage();
	}
	
	
	public String getRustyAxe_Name(){
		return "Rusty Axe";
	}
	
	public int getPunch_Damage(){
		weapon.setDamage(10);
		return weapon.getDamage();
	}
	
	public String getPunch_Name(){
		return "Punch";
	}
	
	public int getBattle_Axe(){
		weapon.setDamage(20);
		return weapon.getDamage();
		
		}
	
	// the staff is a magic-based weapon that is a slower weapon than the wand, but it gives higher damage
	
	public String getStaff_Name(){
		return "Staff";
	}
	
	public int getStaffDanage(){
		weapon.setDamage(30);
		return weapon.getDamage();
		
		}
	
	// the wand is a magic-based weapon that is a faster weapon than the staff, but it's weaker
	
	public String getWand_Name(){
		return "Wand";
	}
	
	public int getWandDamage(){
		weapon.setDamage(15);
		return weapon.getDamage();
		
		}
	
}
