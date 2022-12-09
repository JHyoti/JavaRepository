package enumprograms;

public enum Days1 {
		
		Sunday(0),
		Monday(1),
		Tuesday(2),
		Wednesday(3),
		Thursday(4),
		Friday(5),
		Saturday(6);
		
		private int dayIndex; // private variable dayIndex
		Days1(int i) {			//construction
			setDayIndex(i); 				
		}
		public int getDayIndex() {
			return dayIndex;                   // get a value and return
			
		}
		public void setDayIndex(int dayIndex) {
			this.dayIndex = dayIndex;			// set a value for 
			
		}

	}


