import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Book book1 = new Book("Java 8. ����������� ��� ����������", "hard", 2017, 80.5, "�����", "Oracle");
		//Book book2 = new Book("Java 8. ������ �����������", "hard", 2016, 60.4, "�����", "Oracle");
		//Book book3 = new Book("������������ ������������ �����������", "soft", 2015, 15.0, "�������", "Epam");
		//Book book4 = new Book("��� ����������� � �������", "glossy", 2018, 70.99, "�����", "Pinguin");
		
		
		//Book.sortCost("�����");
		
		
		String path = "C:\\Users\\Marina\\Desktop\\������\\Java\\Homework9-10-11\\test.txt";
		
		try {
		File test = new File(path);
		
		FileReader reader = new FileReader(test);
		
		Scanner scan = new Scanner(reader);
		while (scan.hasNextLine()) {
			String data[] = scan.nextLine().split(";");
			String nameToAdd = "";
			String coverTypeToAdd = ""; 
			int yearToAdd = 0;
			double costToAdd = 0;
			String authorToAdd = "";
			String publishingToAdd = "";
			for(int i = 0; i < data.length; i++) {
				if(data[i].contains("name: ")) {
					nameToAdd = data[i].replace("name: ", "").trim();
				}
				if(data[i].contains("coverType: ")) {
					coverTypeToAdd = data[i].replace("coverType: ", "").trim();				
				}
				if(data[i].contains("year: ")) {
					yearToAdd = Integer.parseInt(data[i].trim().replace("year: ", ""));
				}
				if(data[i].contains("cost: ")) {
					costToAdd = Double.parseDouble(data[i].replace("cost: ", ""));
				}
				if(data[i].contains("author: ")) {
					authorToAdd = data[i].replace("author: ", "").trim();
				}
				if(data[i].contains("publishing: ")) {
					publishingToAdd = data[i].replace("publishing: ", "").trim();
				}
				
			}
			
			Book.books.add(new Book(nameToAdd, coverTypeToAdd, yearToAdd, costToAdd, authorToAdd, publishingToAdd));
		
		}
		reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Book.sortCost("�����");
	}

}
