public class TwoSum {
    List<Integer> list = new ArrayList<Integer>();
    // Add the number to an internal data structure.
	public void add(int number) {
	    list.add(number);
	}

    // Find if there exists any pair of numbers which sum is equal to the value.
	public boolean find(int value) {
	    Set<Integer> set = new HashSet<Integer>();
	    for(int i = 0; i < list.size(); i++) {
	        if(set.contains(list.get(i))) return true;
	        else {
	            set.add(value - list.get(i)); // use list.get(i) not i!!!! 
	        }
	    }
	    return false;
	}
}


// Your TwoSum object will be instantiated and called as such:
// TwoSum twoSum = new TwoSum();
// twoSum.add(number);
// twoSum.find(value);