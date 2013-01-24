package com.site.home;

public class HomeForm {
	String tituloBanner;
	String descricaoBanner;
	String linkBanner;
	
	public HomeForm(String tituloBanner, String descricaoBanner, String linkBanner){
		setTitulo(tituloBanner);
		setDescricao(descricaoBanner);
		setLink(linkBanner);
	}
	public String getTitulo() {
		return tituloBanner;
	}
	public void setTitulo(String tituloBanner) {
		this.tituloBanner = tituloBanner;
	}
	public String getDescricao() {
		return descricaoBanner;
	}
	public void setDescricao(String descricaoBanner) {
		this.descricaoBanner = descricaoBanner;
	}
	public String getLink() {
		return linkBanner;
	}
	public void setLink(String linkBanner) {
		this.linkBanner = linkBanner;
	}
}
