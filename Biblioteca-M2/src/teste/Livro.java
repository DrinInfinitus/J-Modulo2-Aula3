package teste;

import java.util.Calendar;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "LIVRO")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_LIVRO", nullable =false)
	private int id;
	
	@Column(name = "TITULO", nullable = false)
	private String titulo;
	
	@Column(name = "AUTOR", nullable = false)
	private String autor;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_PUBLICACAO", nullable = false)
	private Calendar dataPublicacao;
	
	@Override
	public int hashCode() {
		return Objects.hash(autor, id, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(autor, other.autor) && id == other.id && Objects.equals(titulo, other.titulo);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Calendar getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Calendar dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	
	

}
