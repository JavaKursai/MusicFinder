package lt.baltic.talents.superhero.klounada.models;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_SONGS")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SONG_ID")
	private Long id;

	@Column(name = "AUTHOR_NAME", unique = true)
	private String author;

	@Column(name = "SONG_NAME")
	private char[] songName;

	@Column(name = "SONG_POPULARITY")
	private Long popularity;

	public User() {
	}

	public User(String author, char[] songName, Long popularity) {
		this.author = author;
		this.songName = songName.clone();
		this.popularity = popularity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public char[] getSongName() {
		return songName;
	}

	public void setSongName(char[] songName) {
		this.songName = songName;
	}

	public Long getPopularity() {
		return popularity;
	}

	public void setPopularity(Long popularity) {
		this.popularity = popularity;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", author=" + author + ", songName=" + Arrays.toString(songName) + ", popularity="
				+ popularity + "]";
	}
}
