package entities;

public enum Curso {

	DIREITO(6.0), 
	MEDICINA(8.0), 
	INFORMATICA(7.0);
	
	private double media;
	
	Curso(double media) {
		this.media = media;
	}

	public double getMedia() {
		return media;
	}	

}
