package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maximumMovementSpeed;

    public Transport(String brand,
                     String model,
                     int year,
                     String country,
                     String color,
                     int maximumMovementSpeed) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        this.year = year;
        if (country == null || country.isEmpty()) {
            country = "default";
        }
        this.country = country;
        setColor(color);
        setMaximumMovementSpeed(maximumMovementSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "белый";
        }
        this.color =color;
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        if (maximumMovementSpeed <= 0) {
            maximumMovementSpeed = 120;
        }
        this.maximumMovementSpeed = maximumMovementSpeed;
    }

    @Override
    public String toString() {
        return "Автомобиль" + " : " +
                "Марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", год выпуска=" + year +
                ", страна производитель='" + country + '\'' +
                ", цвет='" + color + '\'' +
                ", максимальная скорость=" + maximumMovementSpeed
                ;
    }
}
