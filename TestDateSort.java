public class TestDateSort {
	 public static void main(String[] args) {
		Date[] days = new Date[5];
		days[0] = new Date(2012,5,2);
		days[1] = new Date(2012,4,2);
		days[2] = new Date(2012,4,1);
		days[3] = new Date(2014,1,3);
		days[4] = new Date(2015,3,1); 
		//bubleSort(days);
		selectSort(days);
		for(int i = 1;i < 5;i++) {
			System.out.println(days[i]);
			}
	
		}
		public static void bubleSort(Date[] a) {
			for(int i = a.length -1;i >= 0;i--){
				for(int j = 0;j < i-1;j++){
						if(a[j].compare(a[j+1])>0) {
							Date temp = a[j];
							a[j] = a[j+1];
							a[j+1] = temp;
						}
					} 
				}
			
			}
		public static void selectSort(Date[] a) {
			for(int i = 0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i].compare(a[j]) >0 ) {
						Date temp = a[i];
						a[i] = a[j];
						a[j] = temp;
						}
					}
				}
			}
	}

class Date { 
	private int year;
	private int month;
	private int day;
	Date(int y, int m, int d){
		this.year = y;
		this.month = m;
		this.day = d;
		}
		
		public int compare(Date date){
			return year > date.year ? 1
							:year < date.year ? -1
							:month > date.month ? 1
							:month <date.month ? -1
							:day > date.day ? 1
							:day < date.day ? -1
							: 0;
			}
		public String toString() {
				return "year:month:day--"+year+"-"+month+"-"+day;
			}
	}