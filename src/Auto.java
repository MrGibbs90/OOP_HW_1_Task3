public class Auto {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Auto(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    public void auto() {
        System.out.println("Марка: " + brand + "; модель: " + model + "; объём двигателя: " + engineVolume + "; цвет: " + color + "; год выпуска: " + year + "; страна производитель: " + country);
    }
}
