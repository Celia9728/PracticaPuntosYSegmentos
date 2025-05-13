package clases;

/**
 * Clase que representa la linea que une 2 puntos.
 */
public class Segmento {

	private Punto a;
	private Punto b;
	
	/**
	 * Constructor por defecto donde el primer punto lo pone en (0,0) y el segundo en (1,1)
	 */
	public Segmento() {
		this.a = new Punto();
		this.b = new Punto(1,1);
	}
	
	/**
	 * Constructor donde se le pasa por parametro 2 puntos y ademas nos lanza una excepcion si los 2 puntos son iguales
	 * @param a
	 * @param b
	 * @throws IllegalArgumentException
	 */
	public Segmento(Punto a, Punto b)throws IllegalArgumentException {
		if(a.getX() == b.getX() && a.getY() == b.getY())  {
			 throw new IllegalArgumentException ("Numeros iguales");
		}
		
		this.a = a;
		this.b = b;
	}
	
	
	public Punto getA() {
		return this.a;
	}
	
	public Punto getB() {
		return this.b;
	}
	
	public void setA(Punto a) {
		this.a = a;
	}
	
	public void setB(Punto b) {
		this.b = b;
	}
	
	/**
	 * Metodo para calcular la distancia entre ambos puntos.
	 * 
	 * @return double
	 */
	public double distancia() {
		double x = Math.pow((b.getY() - a.getX()), 2);
		double y = Math.pow((b.getY() - a.getY()), 2);
		double d = Math.sqrt(x + y);
		return d;
	}
	
	@Override
	public String toString() {
		String mensaje;
		mensaje = "[(" + a.getX() + "," + a.getY() + "),(" + b.getX() + "," + b.getY() + ")";
		return mensaje;
	}
	
	
}
