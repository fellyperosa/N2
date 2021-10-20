package br.com.fellyperrosa.model;


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "films")
	public class Film {
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String CRT;
		private String title;
		private String diretor;
		private String publishingCompany;



		

		public Film(int id, String CRT, String title, String diretor, String publishingCompany) {
			this.id = id;
			this.CRT = CRT;
			this.title = title;
			this.diretor = diretor;
			this.publishingCompany = publishingCompany;
		}

		public Film() {
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCRT() {
			return CRT;
		}

		public void setCRT(String cRT) {
			CRT = cRT;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDiretor() {
			return diretor;
		}

		public void setDiretor(String diretor) {
			this.diretor = diretor;
		}

		public String getPublishingCompany() {
			return publishingCompany;
		}

		public void setPublishingCompany(String publishingCompany) {
			this.publishingCompany = publishingCompany;
		}

}
