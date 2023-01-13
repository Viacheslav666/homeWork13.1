public class Main {
    public static void main(String[] args) {
        Athor kombat = new Athor ("Максм "," Батырев" );
        Book tatu   = new Book("45 татуировок менеджера", kombat, 2019);
        tatu.setAge(2020);
        System.out.println("tatu.getAge() = " + tatu.getAge());
        Athor java = new Athor("inсognito", "incognito");
        Book book = new Book("Погружение в мир Java", java, 2011);
        System.out.println("book.toString() = " + book.toString());
        System.out.println("kombat.toString() = " + kombat.toString());


    }
}