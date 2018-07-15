import java.util.ArrayList;

public class Library {
	public ArrayList<Item> library;
	public String name;
	private int quantity;
	static int id = 0;

	// ������������
	Library(String name) {
		this.name = name;
		id++;
	}

	Library(String name, ArrayList<Item> library) {
		this.name = name;
		this.library = library;

		quantity = 0;
		for (Item x : library) {
			quantity++;
		}
		id++;
	}

	// ������
	public void setName(String name) {
		this.name = name;
	}

	// ������
	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = Integer.valueOf(name);
		result = prime * result;
		return (int) result;
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

		Library temp = (Library) obj;

		if (this.name != temp.name) {
			return false;
		}

		if (this.quantity != temp.quantity) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return "\n��������: " + name + "\n���������� ��������: " + quantity + "\n���������� �����: " + id;
	}

	// ����������
	public void addItem(Item x) {
		library.add(x);
	}

	// ��������
	public void delItem(Item x) {
		library.remove(x);
	}

	// �����
	public ArrayList<Item> findItem(String x) {
		ArrayList<Item> Found = new ArrayList<Item>();
		for (Item y : library) {
			if (y.name.equals(x)) {
				Found.add(y);
			}
		}

		return Found;
	}

	// ����� �������
	public void showList(String x) {
		ArrayList<Item> toShow = findItem(x);
		if (toShow.size() == 0) {
			System.out.println("���� �� �������.");
		} else {
			int count = 1;
			for (Item y : toShow) {
				System.out.print(count + ". ��������: " + y.name + ", ��� �������: " + y.year + "\t");
				count++;
			}
		}
	}

	// ����� ��������
	public void showTable(String x) {
		ArrayList<Item> toShow = findItem(x);
		if (toShow.size() == 0) {
			System.out.println("���� �� �������.");
		} else {
			int count = 1;
			for (Item y : toShow) {
				System.out.print("\n" + count + ". ��������: " + y.name + "\n��� �������: " + y.year);
			}
		}
	}

}
