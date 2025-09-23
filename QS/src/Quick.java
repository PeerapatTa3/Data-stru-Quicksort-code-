
public class Quick {
	private int[] data;
	
	public Quick(int[] arr) {
		data = arr;
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
		
		for(int j = start; j < end; j++) {
			if (data[j] < pivot){
				i++;
				temp = data[j];
				data[j] = data[i];
				data[i] = temp;
			}
		}
		i++;
		temp = data[end];
		data[end] = data[i];
		data[i] = temp;
		
		return i;
	}
	
	@Override
	public String toString() {
		String str = "\nSorted data\n";
		for(int i:data) {
			str += i + "\t";
		}
		str += "\n";
		return str;
	}
}
