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
@Table(name = "TBL_USERS")
public class Vartotojas implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VAR_ID")
	private Long id;

	@Column(name = "VAR_LOGIN", unique = true)
	private String login;
	
	@Column(name = "VAR_PWD")
	private char[] pwd;
	
	public Vartotojas() {}

	public Vartotojas(String login, char[] pwd) {
		this.login = login;
		this.pwd = pwd.clone();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public char[] getPwd() {
		return pwd;
	}

	public void setPwd(char[] pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Vartotojas [id=" + id + ", login=" + login + ", pwd=" + Arrays.toString(pwd) + "]";
	}



	
}
