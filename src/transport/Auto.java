package transport;

public class Auto {
   private final String brand;
   private final String model;
    private double engineVolume;
    private String color;
   private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;

    public Auto(String brand,
                String model,
                double engineVolume,
                String color,
                int year,
                String country,
                String transmission,
                String bodyType,
                String registrationNumber,
                int numberOfSeats,
                boolean summerTires) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
            this.engineVolume = engineVolume;
        if (color == null) {
            this.color = "default";
        } else {
            this.color = color;
        }
        if (country == null || country == "") {
            country = "default";
        }
        this.year = year;
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
        this.country = country;
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (bodyType == null) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }
        this.numberOfSeats = numberOfSeats;
        this.summerTires = summerTires;
    }

    public Auto(String brand,
                String model,
                double engineVolume,
                String color,
                int year,
                String country) {
        this(
                brand,
                model,
                engineVolume,
                color,
                year,
                country,
                "МКПП",
                "седан",
                "х000хх000",
                5,
                true
        );
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }
        public String getRegistrationNumber () {
                return registrationNumber;
            }
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }
    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
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

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void changeTires() {
        summerTires = !summerTires;
    }

    public boolean isCorrectRegNumber(){
        //х000хх000
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) ||
                !Character.isAlphabetic(chars[5])){
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

}
