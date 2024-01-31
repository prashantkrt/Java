package annotations;

@FunctionalInterface
interface Add {
    public void add();
}

@FunctionalInterface
interface Subtract {
    public void subtract();
}


class AeroPlane {

    public void PlaneFliesAtHeight() {
        System.out.println("Plane is flying high");
    }
}

class FighterPlane extends AeroPlane{
    @Override
    public void PlaneFliesAtHeight() {
        System.out.println("FighterPlane is flying high");
    }
}


public class LaunchAn1 {
    public static void main(String[] args) {
        Add add = () -> System.out.println("Add method definition");
        add.add();
        Subtract sub = () -> System.out.println("Add subtract method definition");
        sub.subtract();
    }
}
