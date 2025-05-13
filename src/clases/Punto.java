package clases;

public class Punto {

	private int x;
	private int y;
	
	/**
	 * Constructor por defecto que pone los valores en 0.
	 */
	public Punto () {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Constructor para pasarle por parametros los valores de x e y.
	 * 
	 * @param x
	 * @param y
	 */
	public Punto (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY (int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		String mensaje = "(" + this.x + "," + this.y + ")";
		return mensaje;
	}
}
