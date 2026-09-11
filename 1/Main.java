import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner xz = new Scanner(System.in);

        System.out.println("r1");
        double r1 = xz.nextDouble();
        System.out.println("R2");
        double R2 = xz.nextDouble();
        System.out.println("Storona kvadrata");
        double ab = xz.nextDouble();

        if (r1 <= 0) {
            System.out.println("Oshibka: r1 dolzhen byt polozhitelnym!");
            return;
        }
        if (R2 <= 0) {
            System.out.println("Oshibka: R2 dolzhen byt polozhitelnym!");
            return;
        }
        if (ab <= 0) {
            System.out.println("Oshibka: Storona kvadrata dolzhna byt polozhitelnoj!");
            return;
        }
        if (R2 <= r1) {
            System.out.println("R2 dolzno bit bolshe r1");
            return;
        }

        double treug = (ab * ab) / 8;
        double sector = (3.14 * (R2 * R2)) / 4;
        double nuznoe = sector - treug;
        double Sr1 = ((3.14 * (r1 * r1)) / 8) * 3;
        double SR2 = ((3.14 * (R2 * R2 - r1 * r1)) / 4) * 3;

        System.out.println("Sr1 figna = " + Sr1);
        System.out.println("SR2 figna= " + SR2);
        System.out.println("melkayaFigna =" + nuznoe);
    }
}
