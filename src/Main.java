import transport.Auto;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Auto lada = new Auto(
                "Lada",
                "Granta",
                1.7,
                "Жёлтый",
                2015,
                "Россия");
        lada.setRegistrationNumber("у758ке949");
        System.out.println(lada.isCorrectRegNumber());
        Auto audi = new Auto(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "Чёрный",
                2020,
                "Германия");
        audi.setTransmission("автомат");
        audi.setKey(new Auto.Key(true, true));
        Auto bmw = new Auto(
                "BMW",
                "Z8",
                3.0,
                "Чёрный",
                2021,
                "Германия");
        bmw.setSummerTires(false);
        bmw.setInsurance(new Auto.Insurance(LocalDate.now(), 30_000D, "7485903"));
        bmw.getInsurance().checkValidityPeriod();
        bmw.getInsurance().checkNumber();
        Auto kia = new Auto(
                "KIA",
                "Sportage 4-го поколения",
                2.4,
                "Красный",
                2018,
                "Южная Корея");
        Auto hyundai = new Auto(
                "Hyundai",
                "Avante",
                1.6,
                "Оранжевый",
                2016,
                "Южная Корея");
        System.out.println(
                "Марка автомобиля " + lada.getBrand() +
                        ", модель " + lada.getModel() +
                        ", год выпуска " + lada.getYear() +
                        ", страна производства " + lada.getCountry() +
                        ", цвет " + lada.getColor() +
                        ", объём двигателя " + lada.getEngineVolume());
        System.out.println(
                "Марка автомобиля " + audi.getBrand() +
                        ", модель " + audi.getModel() +
                        ", год выпуска " + audi.getYear() +
                        ", страна производства " + audi.getCountry() +
                        ", цвет " + audi.getColor() +
                        ", объём двигателя " + audi.getEngineVolume());
        System.out.println(
                "Марка автомобиля " + bmw.getBrand() +
                        ", модель " + bmw.getModel() +
                        ", год выпуска " + bmw.getYear() +
                        ", страна производства " + bmw.getCountry() +
                        ", цвет " + bmw.getColor() +
                        ", объём двигателя " + bmw.getEngineVolume());
        System.out.println(
                "Марка автомобиля " + kia.getBrand() +
                        ", модель " + kia.getModel() +
                        ", год выпуска " + kia.getYear() +
                        ", страна производства " + kia.getCountry() +
                        ", цвет " + kia.getColor() +
                        ", объём двигателя " + kia.getEngineVolume());
        System.out.println(
                "Марка автомобиля " + hyundai.getBrand() +
                        ", модель " + hyundai.getModel() +
                        ", год выпуска " + hyundai.getYear() +
                        ", страна производства " + hyundai.getCountry() +
                        ", цвет " + hyundai.getColor() +
                        ", объём двигателя " + hyundai.getEngineVolume());
        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);
    }

    public static void printInfo(Auto auto) {
        System.out.println(
                auto.getBrand() + " " + auto.getModel() +
                        ", год выпуска: " + auto.getYear() +
                        ", страна сборки: " + auto.getCountry() +
                        ", цвет кузова: " + auto.getColor() +
                        ", объём двигателя: " + auto.getEngineVolume() +
                        ", коробка передач: " + auto.getTransmission() +
                        ", тип кузова: " + auto.getBodyType() +
                        ", рег. номер: " + auto.getRegistrationNumber() +
                        ", количество мест: " + auto.getNumberOfSeats() +
                        ", " + (auto.isSummerTires() ? "летняя" : "зимняя") + " резина" +
                        ", " + (auto.getKey().isKeylessAccess() ? "безключевой доступ" : "доступ только с ключа") +
                        ", " + (auto.getKey().isRemoteEngineStart() ? "удалённый запуск" : "удалённый запуск отсутствует") +
                        ", номер страховки: " + auto.getInsurance().getNumber() +
                        ", стоимость страховки: " + auto.getInsurance().getCost() +
                        ", срок действия страховки: " + auto.getInsurance().getValidityPeriod()

        );
    }
}