public class Libro {

    private String titulo;
    private String genero;
    private Integer numPaginas;


    public Libro(String titulo, String genero, int numPaginas) {
        this.titulo = titulo;
        this.genero = genero;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

}
