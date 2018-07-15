
public class Periodical extends Item {
	public int releaseNumber;
	
	//конструктор
	Periodical(String name, int releaseNumber){
		super(name);
		this.releaseNumber = releaseNumber;
	}
	
	Periodical(String name, int year, int releaseNumber){
		super(name, year);
		this.releaseNumber = releaseNumber;
	}
	
	Periodical(String name, int year, double cost, int releaseNumber){
		super(name, year, cost);
		this.releaseNumber = releaseNumber;
	}
	
	
	//сеттер
	public void setReleaseNumber(int releaseNumber) {
		this.releaseNumber = releaseNumber;
	}
	
	
	//геттер
	public int getReleaseNumber() {
		System.out.println("Номер выпуска: " + releaseNumber);
		return releaseNumber;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
			
		if (getClass() != obj.getClass()) {
			return false;
		}
			
		Periodical temp = (Periodical) obj;
		
		if (this.name != temp.name) {
			return false;
		} 
		
		if(this.releaseNumber != temp.releaseNumber){
			return false;
		}
		
		if(this.year != temp.year){
			return false;
		}
						
		return true;
	}

}
