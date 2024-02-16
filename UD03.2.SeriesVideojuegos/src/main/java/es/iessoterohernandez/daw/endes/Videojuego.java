package es.iessoterohernandez.daw.endes;

public class Videojuego implements Entregable {

	// Constantes

	// Horas estimadas por defecto (si no se indica ningún valor):
	private final static int HORAS_ESTIMADAS_DEF = 100;

	// Constantes que indican que un objeto es MAYOR / MENOR o IGUAL que otro
	public final static int MAYOR = 1;
	public final static int MENOR = -1;
	public final static int IGUAL = 0;

	// Atributos
	private String titulo;
	private int horasEstimadas;
	private boolean entregado; // Indica si el videojuego está entregada
	private String genero;
	private String compania;

	// Métodos publicos

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public void entregar() {
		entregado = true;
	}

	@Override
	public void devolver() {
		entregado = false;
	}

	@Override
	public boolean isEntregado() {
		if (entregado) {
			return true;
		}
		return false;
	}

	/*
	 * Compara dos viedojuegos según el número de horas estimadas Si el método
	 * devuelve 1, el videojuego 1 tiene una duración estimada, superior al 2 (es
	 * más largo); Si el método devuelve 0, los dos videojuegos tienen la misma
	 * duración estimada; Si el método devuelve -1, el videojuego 2 tiene una
	 * duración estimada, superior al 1 (es más largo);
	 */
	@Override
	public int compareTo(Object a) {
		int estado = MENOR;

		// Hacemos un casting de objetos para usar el metodo get
		Videojuego ref = (Videojuego) a;
		if (horasEstimadas > ref.getHorasEstimadas()) {
			estado = MAYOR;
		} else if (horasEstimadas == ref.getHorasEstimadas()) {
			estado = IGUAL;
		}

		return estado;
	}

	// Muestra información del videojuego
	@Override
	public String toString() {
		return "Informacion del videojuego: \n" + "\tTitulo: " + titulo + "\n" + "\tHoras estimadas: " + horasEstimadas
				+ "\n" + "\tGenero: " + genero + "\n" + "\tcompañia: " + compania;
	}

	// Compara si dos series son iguales, comprobando título y compañía:
	public boolean equals(Videojuego a) {
		if (titulo.equalsIgnoreCase(a.getTitulo()) && compania.equalsIgnoreCase(a.getCompania())) {
			return true;
		}
		return false;
	}

	// Constructores

	// Constructor por defecto
	public Videojuego() {
		this("", HORAS_ESTIMADAS_DEF, "", "");
	}

	// Constructor con dos parámetros: título y compañía:
	public Videojuego(String titulo, String compania) {
		this(titulo, HORAS_ESTIMADAS_DEF, "", compania);
	}

	// Constructor con 4 parametros: título, horas estimadas, género y compañía
	public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
		this.entregado = false;
	}
}
