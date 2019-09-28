import java.math.*;

public class Assignment4_Temperature {
	
	private float temp;
	private char scale;

	public Assignment4_Temperature() { //constructor 
		temp = 0;
		scale = 'C';
	}

	public Assignment4_Temperature(float t) { //overloading
		temp = t;
		scale = 'C';
	}

	public Assignment4_Temperature(char sc) { //overloading
		temp = 0;
		scale = sc;
	}

	public Assignment4_Temperature(float t, char sc) { //overloading
		temp = t;
		scale = sc;
	}

	public void setTemp(float t) { //mutator
		temp = t;
	}

	public void setScale(char sc) { //mutator
		scale = sc;
	}

	public void setScaleTemp(float t, char sc) { //mutator
		temp = t;
		scale = sc;
	}

	public float getTemp() { //accessor method
		return temp;
	}

	public float getScale() { //accessor method
		return scale;
	}

	public float getCelsius() { //accessor method
		switch (scale) {
		case 'C':
			return temp;
		case 'F':
			BigDecimal convert = new BigDecimal (Double.toString(5*(temp-32)/9));
			convert = convert.setScale(1, RoundingMode.HALF_UP);
			return convert.floatValue();
		}
		return 0;
	}

	public float getFahrenheit() { //accessor method
		switch (scale) {
		case 'C':
			BigDecimal convert = new BigDecimal (Double.toString(9*temp/5+32));
			convert = convert.setScale(1, RoundingMode.HALF_UP);
			return convert.floatValue();
		case 'F':
			return temp;
		}
		return 0;
	}

	public boolean equals(float t, char sc) {
		switch (sc) {
		case 'C':
			if ( t == getCelsius() )
				return true;
			else 
				return false;
		case 'F':
			BigDecimal convert = new BigDecimal (Double.toString(5*(temp-32)/9));
			convert = convert.setScale(1, RoundingMode.HALF_UP);
			if (convert.floatValue() == getCelsius())
				return true;
			else 
				return false;
		}
		return false;
	}

	public boolean greaterThan(float t, char sc) {
		switch (sc) {
		case 'C':
			if ( t > getCelsius() )
				return true;
			else 
				return false;
		case 'F':
			BigDecimal convert = new BigDecimal (Double.toString(5*(temp-32)/9));
			convert = convert.setScale(1, RoundingMode.HALF_UP);
			if (convert.floatValue() > getCelsius())
				return true;
			else 
				return false;
		}
		return false;
	}

	public boolean lessThan(float t, char sc) {
		switch (sc) {
		case 'C':
			if ( t < getCelsius() )
				return true;
			else 
				return false;
		case 'F':
			BigDecimal convert = new BigDecimal (Double.toString(5*(temp-32)/9));
			convert = convert.setScale(1, RoundingMode.HALF_UP);
			if (convert.floatValue() < getCelsius())
				return true;
			else 
				return false;
		}
		return false;
	}

	public String toString() {
		return ("Current temperature:" + "\n\t" + getCelsius() + " in Celsius" + "\n\t" + getFahrenheit() + " in Fahrenheit");
	}


}