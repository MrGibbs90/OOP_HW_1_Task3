package transport;

import java.time.LocalDate;

public class Auto extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;
    private Key key;

    private Insurance insurance;

    public Auto(String brand,
                String model,
                double engineVolume,
                String color,
                int year,
                String country,
                int maximumMovementSpeed,
                String transmission,
                String bodyType,
                String registrationNumber,
                int numberOfSeats,
                boolean summerTires,
                Key key,
                Insurance insurance) {
        super(brand, model, year, country, color, maximumMovementSpeed);
        setEngineVolume(engineVolume);
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
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
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
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
                120,
                "МКПП",
                "седан",
                "х000хх000",
                5,
                true,
                new Key(),
                new Insurance()
        );
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
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

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void changeTires() {
        summerTires = !summerTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
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

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessaAccess;

        public Key(boolean remoteEngineStart, boolean keylessaAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessaAccess = keylessaAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessaAccess;
        }
    }

    public static class Insurance {
        private final LocalDate validityPeriod;
        private final double cost;
        private final String number;

        public Insurance(LocalDate validityPeriod, double cost, String number) {
            if (validityPeriod == null) {
                this.validityPeriod = LocalDate.now().plusDays(365);
            } else {
                this.validityPeriod = validityPeriod;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10_000D, null);
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkValidityPeriod() {
            if (validityPeriod.isBefore(LocalDate.now()) || validityPeriod.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "объём двигателя=" + engineVolume +
                ", коробка передач='" + transmission + '\'' +
                ", тип кузова='" + bodyType + '\'' +
                ", номер='" + registrationNumber + '\'' +
                ", количество мест=" + numberOfSeats + ", " +
                (summerTires ? "летняя" : "зимняя") + " резина" + ", " +
                key;
    }
}
