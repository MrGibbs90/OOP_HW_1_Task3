import transport.Auto;
import transport.Bus;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Auto lada = new Auto(
                "Lada",
                "Granta",
                1.7,
                "Жёлтый",
                2015,
                "Россия",
                150,
                "МКПП",
                "седан",
                "у758ке949",
                5,
                true,
                null,
                null
                );
        System.out.println(lada);
        Auto audi = new Auto(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "Чёрный",
                2020,
                "Германия",
                230,
                "АКПП",
                "седан",
                "к869ен151",
                5,
                true,
                null,
                null);
        System.out.println(audi);
        Auto bmw = new Auto(
                "BMW",
                "Z8",
                3.0,
                "Чёрный",
                2021,
                "Германия",
                300,
                "АКПП",
                "купе",
                "е971нх262",
                5,
                true,
                null,
                null);
        System.out.println(bmw);
        Auto kia = new Auto(
                "KIA",
                "Sportage 4-го поколения",
                2.4,
                "Красный",
                2018,
                "Южная Корея",
                180,
                "АКПП",
                "кроссовер",
                "о596см694",
                5,
                true,
                null,
                null);
        System.out.println(kia);
        Auto hyundai = new Auto(
                "Hyundai",
                "Avante",
                1.6,
                "Оранжевый",
                2016,
                "Южная Корея",
                -180,
                "АКПП",
                "седан",
                "т495ук390",
                5,
                true,
                null,
                null);
        System.out.println(hyundai);

        for (int i = 1; i <= 3; i++) {
            Bus bus = new Bus(
                    "Bus brand №" + i,
                    "Bus model №" + i,
                    2015 + i,
                    "Россия",
                    "жёлтый",
                    110
            );
            System.out.println(bus);
        }
    }


}