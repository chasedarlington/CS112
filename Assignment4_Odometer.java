public class Assignment4_Odometer {
	
	private float mpg, odometer, fuel_used, trip, trip_fuel;

	public Assignment4_Odometer() {
		mpg = 0;
		odometer = 0;
		fuel_used = 0;
		trip = 0;
		trip_fuel = 0;
	}

	public void setMpg(float e) { //mutator method to set fuel efficiency (mpg)
		mpg = e;
	}

	public void setOdometer(float m) { //mutator method to set odometer (mileage)
		odometer = m;
	}

	public void setFuelUsed(float f) { //mutator method to set total fuel consumption
		fuel_used = f;
	}

	public void setTrip(float m) { //mutator method to set trip odometer (mileage)
		trip = m;
	}

	public void setTripFuel(float f) { //mutator method to set trip fuel consumption
		trip_fuel = f;
	}

	public void resetOdometer() { //mutator method to reset odometer to 0 miles
		odometer = 0;
	}

	public void resetTrip() { //mutator method to reset odometer to 0 miles
		trip = 0;
	}

	public float getMpg() { //accessor method to get fuel efficiency (mpg)
		return mpg;
	}

	public float getOdometer() { //accessor method to get odometer (mileage)
		return odometer;
	}

	public float getFuelUsed() { //accessor method to get total fuel consumption
		return fuel_used;
	}

	public float getTrip() { //accessor method to get trip odometer (mileage)
		return trip;
	}

	public float getTripFuel() { //accessor method to get trip fuel consumption
		return trip_fuel;
	}

//--------------------calculation methods-----------------------//

	public void odometer() { //method to calculate total odometer miles (by adding trip miles)
		odometer += trip;
	}

	public void tripFuel() { //method to calculate trip fuel consumption
		trip_fuel = trip/mpg;
	}

	public void fuelUsed() { //method to calculate total fuel consumption (by adding trip fuel consumption to total fuel consumption)
		fuel_used += trip_fuel;
	}

}