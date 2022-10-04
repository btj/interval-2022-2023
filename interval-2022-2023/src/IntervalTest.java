import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {

	class Interval {
		// datarepresentatie
	    int ondergrens;
	    int bovengrens;
	}
	
	void setOndergrens(Interval interval, int waarde) {
		interval.ondergrens = waarde;
	}
	
	void setBovengrens(Interval interval, int waarde) {
		interval.bovengrens = waarde;
	}
	
	int getLengte(Interval interval) {
		return interval.bovengrens - interval.ondergrens;
	}
	
	@Test
	void test() {
		Interval mijnInterval = new Interval();
		setOndergrens(mijnInterval, 0);
		setBovengrens(mijnInterval, 2);
		int lengte = getLengte(mijnInterval);
		assert lengte == 2;
	}

}
