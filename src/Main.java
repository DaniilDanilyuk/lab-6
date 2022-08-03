public class Main {

    public static void main(String[] args) {
        Circles circles = new Circles();
        circles.add(new Circle(7));
        circles.add(new Circle(9));
        circles.add(new Circle(12));
        System.out.println(circles.toString());

        Celinder celinder = new Celinder(6, 5);
        Celinder celinder1 = new Celinder(10, 12);
        Celinders celinders = new Celinders();
        celinders.add(celinder);
        celinders.add(celinder1);
        celinders.add(new Celinder(5,12));
        System.out.println(celinders.toString());
        System.out.println("\nCelinders avarage volume = " + celinders.getAvarageVolume());

    }
}