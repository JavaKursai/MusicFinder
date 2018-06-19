package lt.baltic.talents.superhero.klounada.models;

public class Profile {

	private String author;
	private String songName;
	private int popularity;

	public Profile(String author, String songName, int popularity) {
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

	public int getPopularity() {
		return popularity;
	}

	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}

}
