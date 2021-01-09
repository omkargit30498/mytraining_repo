package day2.methods;

public class Exmpl7 {

	
		public void displayNamesArray(String[] names) {
			for (String n:names) {
				System.out.println(n);//passing arrays as parameters
			}
			
		}
		public String[] getArrayOfNames() {
			String[] names = {"John", "David", "Patrick", "Derek"};
			return names;
			}

	}


