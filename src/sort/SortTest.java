package sort;

public class SortTest {

	public static void main(String[] args) {

		int[] argss = { 2, 1, 6, 4, 4, 2, 9, 0 };

		int[] argsss = SortTest.insertionSort(argss);

		for (int i = 0; i < argsss.length; i++) {
			System.out.print(argsss[i]);
		}
	}

	public static int[] bubbleSort(int[] args) {
		int len = args.length;
		int temp;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1 - i; j++) {
				if (args[j] > args[j + 1]) {
					temp = args[j + 1];
					args[j + 1] = args[j];
					args[j] = temp;
				}
			}
		}
		return args;
	}

	public static int[] selectionSort(int[] args) {
		int len = args.length;
		int minIndex, temp;
		for (int i = 0; i < len - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < len; j++) {
				if (args[minIndex] > args[j]) {
					minIndex = j;
				}
			}
			temp = args[i];
			args[i] = args[minIndex];
			args[minIndex] = temp;
		}
		return args;
	}

	public static int[] insertionSort(int[] args) {
		int len = args.length;
		int preIndex, current;
		for (int i = 1; i < len; i++) {
			preIndex = i - 1;
			current = args[i];
			while (preIndex >= 0 && args[preIndex] > current) {
				args[preIndex + 1] = args[preIndex];
				preIndex--;
			}
			args[preIndex + 1] = current;
		}
		return args;
	}
}
