package lt.baltic.talents.superhero.klounada.models;

public class Profile {

	private String author;
	private String songName;
	private String popularity;

	public Profile(String author, String songName, String popularity) {
		this.author = author;
		this.songName = songName;
		this.popularity = popularity;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getPopularity() {
		return popularity;
	}

	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}

}
