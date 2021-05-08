package entity.concretes;

public class User {
	private String ad;
	private String soyadi;
	private String ePosta;
	private String parola;
   
    
   public String getParola() {
		return parola;
	}


	public void setParola(String parola) {
		this.parola = parola;
	}


public User() {
	   
   }


public User(String ad, String soyadi, String ePosta) {
	super();
	this.ad = ad;
	this.soyadi = soyadi;
	this.ePosta = ePosta;
}


public String getAd() {
	return ad;
}


public void setAd(String ad) {
	this.ad = ad;
}


public String getSoyadi() {
	return soyadi;
}


public void setSoyadi(String soyadi) {
	this.soyadi = soyadi;
}


public String getePosta() {
	return ePosta;
}


public void setePosta(String ePosta) {
	this.ePosta = ePosta;
}
}