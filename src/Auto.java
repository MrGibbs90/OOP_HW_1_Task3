public class Auto {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Auto(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand == "") {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model == "") {
            model = "default";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
        if (color == null || color == "") {
            color = "белый";
        }
        this.color = color;
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country == "") {
            country = "default";
        }
        this.country = country;
    }

    public void auto() {
        System.out.println("Марка: " + brand + "; модель: " + model + "; объём двигателя: " + engineVolume + "; цвет: " + color + "; год выпуска: " + year + "; страна производитель: " + country);
    }
}
