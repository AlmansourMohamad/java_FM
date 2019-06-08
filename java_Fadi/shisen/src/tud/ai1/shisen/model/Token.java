
public class Token implements IToken {
//	private int [][] spielFeld; // kann falsch sein.
	private int counter = 0; // counter = 0
	private int [] id; // id = 
	private TokenState state; // enum 
	private int value;
	private Vector2f pos; // pos hat zwei float Attribute x, y
	
	public Token (int value, TokenState state, Vector2f pos) {
		this.state = state;
		this.pos = pos;
		this.value = value;
		this.id = counter;
//		counter += 1; 
//		counter = counter + 1;
		counter ++;
	}
	
	public Token (int value) {
		this.pos = new Vector2f(0,0);
		this.state = TokenState.DEFAULT; 
		this.state = new TokenState(DEFAULT); // TokenState x = new TokenState(constructor);
		this.value = value;
		this.id = counter; 
		counter ++;
	}
}
