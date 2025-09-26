
public class Quick {
	private int[] data;
	private int round;
	
	public Quick(int[] arr) {
		data = arr;
		round = 1;
	}
	
	public void sort(int start, int end) {
		if (end <= start) return;
		
		int pivot = findPivot(start, end);
		sort(start, pivot - 1);
		sort(pivot + 1, end);
	}
	
	public int findPivot(int start, int end) {
		int pivot = data[end];
		int i = start - 1;
		int temp;
		
		System.out.println("\nRound >>> " + round);
		round++;
		System.out.println("Pivot : " + pivot);
		
		for(int j = start; j < end; j++) {
			if (data[j] < pivot){
				i++;
				if(data[i] != data[j]) {
					System.out.println("Swap : " + data[j] + " <-> " + data[i]);	
					temp = data[j];
					data[j] = data[i];
					data[i] = temp;
					printData(start, end);
				}		
			}
		}
		i++;
		if(data[i] != data[end]){
			System.out.println("Swap pivot : " + data[i] + " <-> " + data[end]);
			temp = data[end];
			data[end] = data[i];
			data[i] = temp;
		}
		printData(start, end);
		System.out.print("==============================================");
		return i;
	}
	
	public void printData(int start, int end) {
		for(int i = start; i <= end; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.print("\n");
	}
	
	@Override
	public String toString() {
		String str = "\nData\n";
		for(int i:data) {
			str += i + "\t";
		}
		str += "\n";
		return str;
	}
}
