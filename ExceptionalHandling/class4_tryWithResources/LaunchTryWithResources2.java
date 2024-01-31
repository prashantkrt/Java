package ExceptionalHandling.class4_tryWithResources;

class Human implements AutoCloseable {
    @Override
    public void close() throws Exception {

        System.out.println("close method of Human resource is invoked");
    }
}

public class LaunchTryWithResources2 {
    public static void main(String[] args) {
        try (Human h = new Human()) {
            System.out.println("Some body which is using the resource");
        } catch (Exception e) {
            System.out.println("Exception Occurred");
            e.printStackTrace();
        }
    }
}
