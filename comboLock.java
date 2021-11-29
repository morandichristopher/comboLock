
public class comboLock {
	
	private int _secret1;
	private int _secret2;
	private int _secret3;
	private int counter = 0;
	private int turn1;
	private int turn2;
	private int turn3;
	
	
	private int index = 0;

	public comboLock(int secret1, int secret2, int secret3) {
		_secret1 = secret1;
		_secret2 = secret2;
		_secret3 = secret3;
		
		
	}
	public void reset() {
		index = 0;
	}
	public void turnLeft(int ticks) {
		counter++;
		if(index + ticks > 39) {
			index = index + ticks - 40;
		}
		else {
			index = index + ticks;
		}
		if(counter==1) {
			turn1 = index;
		}else if(counter==3){
			turn3 = index;
		}
		
		
		//need to set a position for when I get to 40 and reset the combo lock to position 0
		
		
		// figure out how to get around 0 and turn it to 39
		// example start at 3 turn left 5 you're supposed to be at 37
		
	}
	public void turnRight(int ticks) {
		counter++;
		if(index - ticks < 0) {
			index = index - ticks + 40;
		}
		else {
			index = index - ticks;
		}
		if(counter==2) {
			turn2 = index;
		}
	}
	public boolean open() {
		//turnRight() if secret1 != index return false.
		//left() if secret2 != return false.
		//turnRight() if secret3 != return false.
		
		
		if(turn1 == _secret1 && turn2 == _secret2 && turn3 == _secret3) {
			return true;
		}
		else return false;
	}
	
}
