package recursion;

public class BinarySearch {
	
	public static boolean binarySearch(int[] data, int target, int low, int high) {
		
		if (low > high) {
			return false;
		} else {
			int mid = (low+high) / 2;
			if (target == data[mid]) {
				return true;
			} else if (target < data[mid]) {
				return binarySearch(data, target, low, mid-1);
			} else {
				return binarySearch(data, target, mid+1, high);
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] searchThis = new int[] {1,2,3,4,5,6,7,8};
		int low = 0;
		int high = searchThis.length - 1;
		
		boolean found = binarySearch(searchThis, 3, low, high);
		System.out.println(found);
		

	}

}
