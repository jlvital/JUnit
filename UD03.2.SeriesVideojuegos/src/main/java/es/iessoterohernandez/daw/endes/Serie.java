package es.iessoterohernandez.daw.endes;

public class Serie implements Entregable {

	// Constantes

	// Numero de temporadas por defecto (si no se indica ningún valor)
	private final static int NUM_TEMPORADAS_DEF = 3;

	// Constantes que indican que un objeto es MAYOR / MENOR / IGUAL que otro
	public final static int MAYOR = 1;
	public final static int MENOR = -1;
	public final static int IGUAL = 0;

	// Atributos

	private String titulo;
	private int numeroTemporadas;
	private boolean entregado; // Indica si la serie está entregada
	private String genero;
	private String creador;

	// Métodos publicos
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public void entregar() {
		entregado = true;
	}

	public void devolver() {
		entregado = false;
	}

	public boolean isEntregado() {
		if (entregado) {
			return true;
		}
		return false;
	}

	/*
	 * Compara dos series segun el número de temporadas Si el método devuelve 1, la
	 * Serie 1 tiene más temporadas que la 2; Si el método devuelve 0, las dos
	 * series tienen las mismas temporadas. Si el método devuelve -1, la Serie 2
	 * tiene más temporadas que la 1.
	 */
	public int compareTo(Object a) {
		int estado = MENOR;

		// Hacemos un casting de objetos para usar el metodo get
		Serie ref = (Serie) a;
		if (numeroTemporadas > ref.getNumeroTemporadas()) {
			estado = MAYOR;
		} else if (numeroTemporadas == ref.getNumeroTemporadas()) {
			estado = IGUAL;
		}

		return estado;
	}

	// Muestra información de la Serie

	public String toString() {
		return "Informacion de la Serie: \n" + "\tTitulo: " + titulo + "\n" + "\tNumero de temporadas: "
				+ numeroTemporadas + "\n" + "\tGenero: " + genero + "\n" + "\tCreador: " + creador;
	}

	// Compara si dos series son iguales, comprobando título y creador:
	public boolean equals(Serie a) {
		if (titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getCreador())) {
			return true;
		}
		return false;
	}

	// Constructores

	// Constructor por defecto
	public Serie() {
		this("", NUM_TEMPORADAS_DEF, "", "");
	}

	// Constructor con dos parámetros: título y creador:
	public Serie(String titulo, String creador) {
		this(titulo, NUM_TEMPORADAS_DEF, "", creador);
	}

	// Constructor con 4 parametros: título, número de temporadas, género y creador
	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = false;
	}
}
