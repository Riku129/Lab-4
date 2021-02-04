module NonPlayerCharacter.java {
}
import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab04 
 * SP20
 */

public class NonPlayerCharacter extends GameCharacter
{ 
	boolean active
	String intelligenceType
	public active boolean active(){
		return name
	}
	public void String 
	}
	public String reportStructure(){
		
		StringBuilder sb = new StringBuilder(super.reportStructure());
		//sb.append("Active: "+getActive()+"\n");
		//sb.append("Intelligence: "+getIntelligenceType()+"\n");
		sb.append("==================================\n");
		
		return sb.toString();
		
	}

}//end class