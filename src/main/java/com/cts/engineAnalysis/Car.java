package com.cts.engineAnalysis;

public class Car {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	private String name;
    private Engine engine;

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public Car() {
    }


	public void getReport() {
        System.out.println(this.name + " car with " + engine.getFuel() + " engine gives " + engine.getPerformance() + " horsepower");
    }

}
