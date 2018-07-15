
public class Item {
	public int idNumber = 1; //уникальный идентификатор в библиотеке
	public String name;
	public String coverType; //тип обложки: твердая, мягкая, глянцевая, без обложки
	public int year;
	public double cost;
	
	//конструкторы
	Item(String name){
		this.name = name;
		idNumber++;
	}
	
	Item(String name, String coverType){
		this.name = name;
		this.coverType = coverType;
		idNumber++;
	}
	
	Item(String name, int year){
		this.name = name;
		this.year = year;
		idNumber++;
	}
	
	Item(String name, int year, double cost){
		this.name = name;
		this.year = year;
		this.cost = cost;
		idNumber++;
	}
	
	Item(String name, String coverType, int year){
		this.name = name;
		this.coverType = coverType;
		this.year = year;
		idNumber++;
	}
	
	Item(String name, String coverType, int year, double cost){
		this.name = name;
		this.coverType = coverType;
		this.year = year;
		this.cost = cost;
		idNumber++;
	}
	
	
	
	//сеттеры
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}
		
	
	//геттеры
	public String getName() {
		System.out.println("Название издания: " + name);
		return name;
	}
	
	public String getCoverType() {
		System.out.println("Тип обложки - " + coverType);
		return coverType;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		double result = 1;
		result = prime * result + idNumber;
		return (int)result;
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
			
		Item temp = (Item) obj;
		
		if (this.name != temp.name) {
			return false;
		} 
		
		if(this.coverType != temp.coverType){
			return false;
		}
						
		return true;
	}
	
	@Override
	public String toString() {
		return "Уникальный номер: " + idNumber + "\nНазвание: " + name;
	}
	
	
	

}
