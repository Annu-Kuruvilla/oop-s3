import java.util.Scanner;

class QuickSort{
	int partition(String str[], int left, int right) {
		String pivot = str[right];
		int i = (left - 1);
		for (int j = left; j < right; j++) {
			if (str[j].compareTo(pivot) <= 0) {
				i++;
				String temp = str[i];
				str[i] = str[j];
				str[j] = temp;
			}
		}
		String temp = str[i + 1];
		str[i + 1] = str[right];
		str[right] = temp;
		return i + 1;
	}

	void sort(String str[], int left, int right) {
		if (left < right) {
			int pi = partition(str, left, right);
			sort(str, left, pi - 1);
			sort(str, pi + 1, right);
		}
	}

	static void printArray(String str[], int n) {
		for (int i = 0; i < n; ++i)
			System.out.print(str[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str[] = new String[30];
		int n, i;
		System.out.println("Enter the number of names: ");
		n = in.nextInt();
		n = n + 1;
		System.out.println("Enter the names: ");
		for (i = 0; i < n; i++) {
			str[i] = in.nextLine();
		}
		QuickSort ob = new QuickSort();
		ob.sort(str, 0, n -     1);
		System.out.println("Sorted names");
		printArray(str, n);
	}
}
