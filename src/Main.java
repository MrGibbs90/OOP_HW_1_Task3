public class Main {
    public static void main(String[] args) {
        Auto ladaGranta = new Auto("Lada", "Granta", 1.7, "жёлтый", 2015, "Россия");
        ladaGranta.auto();
        Auto audi = new Auto("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, "Германия");
        audi.auto();
        Auto bmw = new Auto("BMW", "Z8", 3.0, "чёрный", 2021, "Германия");
        bmw.auto();
        Auto kia = new Auto("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея");
        kia.auto();
        Auto hyundai = new Auto("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        hyundai.auto();
    }
}