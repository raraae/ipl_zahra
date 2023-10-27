class Main {
    public static void main(String[] args) {
        Car fuelCar = new Car(new PetrolEngine());
        Car dieselCar = new Car(new DieselEngine());
        Car HybridEngine = new Car(new HybridEngine());

        // Booom boom
        fuelCar.start();
        dieselCar.start();
        hybridCar.start();
    }
}