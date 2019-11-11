package testing;

public class JunitTesting {
	//Text for AsserEquals
	public int multiply(int x, int y) {
		return x*y;
	}
	
	
public String countA(String word) {
	//Test for AssertNull and AssertNotNull
	int count=0;
	for(int i=0; i<word.length();i++) {
		if(word.charAt(i)=='a'|| word.charAt(i)=='A') {
			count++;
		}
	}
	if (count==0) {
		return null;
	}
	return "Number of A is:" + count;
}

public boolean greaterThan(int x, int y) {
	//Test AssertTrue/ Test AssertFalse
	if (x>y) {
		return true;
	}
	else {
		return false;
	}
}



public String chkSame(int x, int y) {
	String answer;
	if (x==y) {
		answer = "same";
	}else { 
		answer = "different";
		}
	return answer;
}
		
public char[] TestArray(String word){
	char[] arr = new char[word.length()];

	for(int i=0; i<word.length();i++) {
		arr[i]=word.charAt(i);
	}
	return arr;
}
}

