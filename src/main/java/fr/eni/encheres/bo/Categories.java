package fr.eni.encheres.bo;

public class Categories {
	private Integer id;
	private String libelle;

	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categories(Integer id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	
}