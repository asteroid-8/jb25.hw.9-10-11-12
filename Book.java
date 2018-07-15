import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Book extends Item {
	static LinkedList<Book> books = new LinkedList<Book>();
	public String author;
	public String publishing;

	// ������������
	Book(String name, String author) {
		super(name);
		this.author = author;
		books.add(this);
	}

	Book(String name, String coverType, String author) {
		super(name, coverType);
		this.author = author;
		books.add(this);
	}

	Book(String name, String coverType, String author, String publishing) {
		super(name, coverType);
		this.author = author;
		this.publishing = publishing;
		books.add(this);
	}

	Book(String name, String coverType, int year, String author, String publishing) {
		super(name, coverType, year);
		this.author = author;
		this.publishing = publishing;
		books.add(this);
	}

	Book(String name, String coverType, int year, double cost, String author, String publishing) {
		super(name, coverType, year, cost);
		this.author = author;
		this.publishing = publishing;
		books.add(this);
	}

	// �������
	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	// �������
	public String getAuthor() {
		System.out.println("����� �����: " + author);
		return author;
	}

	public String getPublishing() {
		System.out.println("������������ \"" + publishing + "\"");
		return publishing;
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

		Book temp = (Book) obj;

		if (this.name != temp.name) {
			return false;
		}

		if (this.year != temp.year) {
			return false;
		}

		if (this.author != temp.author) {
			return false;
		}

		if (this.publishing != temp.publishing) {
			return false;
		}

		return true;
	}

	// ����� �� ������
	static ArrayList<Book> findBookByAuthor(String x) {
		ArrayList Found = new ArrayList();
		for (Book y : books) {
			if (y.author.equals(x)) {
				Found.add(y);
			}
		}
		return Found;
	}

	// ���������� �� ���������
	public static void sortCost(String x) {
		ArrayList<Book> sortCost = findBookByAuthor(x);

		TreeMap<Double, Book> treeMap = new TreeMap<>();
		for (Book y : sortCost) {
			treeMap.put(y.cost, y);
		}
		for (Map.Entry<Double, Book> entry : treeMap.entrySet()) {
			System.out.println("��������: " + entry.getValue().name + " �����: " + entry.getValue().author
					+ " ���������: " + entry.getKey());
		}
	}

	// ���������� �� ��� ������
	public static void sortYear(String x) {
		ArrayList<Book> sortCost = findBookByAuthor(x);
		TreeMap<Integer, Book> treeMap = new TreeMap<>();
		for (Book y : sortCost) {
			treeMap.put(y.year, y);
		}
		for (Map.Entry<Integer, Book> entry : treeMap.entrySet()) {
			System.out.println("��������: " + entry.getValue().name + " �����: " + entry.getValue().author + " ���: "
					+ entry.getKey());
		}
	}

}
