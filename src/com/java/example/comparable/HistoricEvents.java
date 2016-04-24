package com.java.example.comparable;

public class HistoricEvents implements Comparable<HistoricEvents>{
	
	public HistoricEvents(String eventName,int happenedYear){
		this.eventName = eventName;
		this.happenedYear = happenedYear;
	}
	
	public String getEventName() {
		return eventName;
	}

	/*public void setEventName(String eventName) {
		this.eventName = eventName;
	}*/

	public int getHappenedYear() {
		return happenedYear;
	}

	/*public void setHappenedYear(int happenedYear) {
		this.happenedYear = happenedYear;
	}*/

	String eventName;
	int happenedYear;
	
	@Override
	public int compareTo(HistoricEvents o) {
		// TODO Auto-generated method stub
		if(this.getHappenedYear() > o.getHappenedYear())
			return 1;
		else if(this.getHappenedYear() < o.getHappenedYear())
			return -1;
		else
			return 0;
		
	}

	public static void main(String[] args) {
		HistoricEvents event1 = new HistoricEvents("Indian Independance",1947);
		HistoricEvents event2 = new HistoricEvents("Win Cricket WC",1983);
		
		if(event1.compareTo(event2)>0)
			System.out.println("Event " + event1.getEventName() + " Happened before " + event2.getEventName());
		else if(event1.compareTo(event2)<0)
			System.out.println("Event " + event2.getEventName() + " Happened after  " + event1.getEventName());
	}
	
}
