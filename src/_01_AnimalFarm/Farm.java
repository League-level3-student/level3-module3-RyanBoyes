package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm extends Animal{

	
	
	
	
	
public static void main(String[] args) {
		
	ArrayList<Animal> farm = new ArrayList<Animal>();
	
	farm.add(new Cow());
	farm.add(new Pig());
	farm.add(new Pig());
	farm.add(new Horse());
	farm.add(new Horse());
	farm.add(new Chicken());
	
	
	
	for(int i = 0; i<farm.size(); i++) {
		farm.get(i).makeNoise();
		farm.get(i).eat();
	}
	
}

@Override
void makeNoise() {
	// TODO Auto-generated method stub
	
}

@Override
void eat() {
	// TODO Auto-generated method stub
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
