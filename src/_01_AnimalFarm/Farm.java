package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm extends Animal{

	
	
	
	
	
public static void main(String[] args) {
		
	ArrayList<Animal> farm = new ArrayList<Animal>();
	farm.add(Pig);
	farm.add(Cow);
	farm.add(Cow);
	farm.add(Horse);
	farm.add(Horse);
	farm.add(Chicken);
	
	for(int i = 0; i<farm.size(); i++) {
		System.out.print(farm.get(i));
	}
	
}

@Override
void makeNoise(Animal a) {
	// TODO Auto-generated method stub
	
}

@Override
void eat(Animal a) {
	// TODO Auto-generated method stub
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
