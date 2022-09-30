package io.codelex.oop.computers;

public class ComputerMain {
    public static void main(String[] args) {
        Computer pc = new Computer("i9-10900K", 32, "RTX 3080", "Asus", "AC-11");
        Computer pcSame = new Computer("i9-10900K", 32, "RTX 3080", "Asus", "AC-11");
        Computer pc1 = new Computer("i7-7700K", 16, "GTX 1070", "Dell", "DK198u70");
        System.out.println(pc.equals(pc1));
        System.out.println(pc.equals(pcSame));
        pc.setRam(64);
        System.out.println(pc.equals(pcSame));
        System.out.println(pc.getCompany());
        System.out.println(pc);

        Laptop acer = new Laptop("Ryzen 5800H", 32, "integrated", "acer", "QB31", "BT15687");
        Laptop acer1 = new Laptop("Ryzen 5800H", 32, "integrated", "acer", "QB31", "BT15687");
        Laptop alienware = new Laptop("i9-12900HX", 64, "RTX 3080", "Dell", "AlienWareMax", "PH3145");
        System.out.println(acer);
        acer.setRam(64);
        System.out.println(acer.equals(acer1));
    }
}
