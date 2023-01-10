    public class Main {
        public static void main(String[] args) {
            System.out.println("************** Завдання 1 **************");
            Cat c = new Cat();
            Dog d = new Dog();
            Cow cw = new Cow();

            c.pt.voice();
            d.pt.voice();
            cw.pt.voice();

            System.out.println("************** Завдання 2 **************");
            Frog f = new Frog();

            f.eat.doing();
            f.sleep.doing();
            f.swim.doing();
            f.walk.doing();
        }
    }