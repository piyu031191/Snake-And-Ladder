package SnakeAndLadder;

public class SnakeLadder { 
	public static int Action(int position, int dice, String type ) {
	if(type == "ladder") {
			position += dice ;
	} else {
		position -= dice ;
		if(position < 0) {
			position = 0;
		}
	}
	return position;
}

public static void main(String[] args) {
	int position1 = 0;
	int position2 = 0; 
	int chance = 0;		
	
	System.out.println("Welcome to snake and ladder game:-");
	System.out.println("Dice roll by first player");
	
	System.out.println("Dice roll by second player");
    
    while(position1 < 100 && position2 < 100) {
	    int option = (int)Math.floor(Math.random() * 3); 
	    int diceCopy = (int) Math.floor( (Math.random() * 10) % 6 + 1 );
	    switch(option) {
	    case 0: 
	    	if(chance==0) {
    	    	System.out.println("First player action : nothing");    	    		
	    	}else {
    	    	System.out.println("Second player action : nothing");
	    	}
	    	break;
	    case 1: 
	    //SnakeLadder.Action(position2, diceCopy2, null)
	    	if(chance==0) {
	    		position1 = SnakeLadder.Action(position1, diceCopy, "ladder");
	    		System.out.println("First player action: ladder with Position " + position1); 		
	    	}else {
	    		position2 = SnakeLadder.Action(position2, diceCopy, "ladder");
	    		System.out.println("Second player action: ladder with Position " + position2);		
	    	}
	    	break;
	    case 2: 
	    	System.out.println(" Player action: snake");
	    	if(chance==0) {
	    		position1 = SnakeLadder.Action(position1, diceCopy, "snake");
	    		System.out.println("First player action: snake with Position " + position1); 		
	    	}else {
	    		position2 = SnakeLadder.Action(position2, diceCopy, "snake");
	    		System.out.println("Second player action: snake with Position " + position2);		
	    	}
	    	break;	    	
    	    }
	    if(chance == 0 ) {
	    	chance = 1;	
	    } else {
	    	chance = 0;
	    }
    	    
	    }
	    
	}
	
}
