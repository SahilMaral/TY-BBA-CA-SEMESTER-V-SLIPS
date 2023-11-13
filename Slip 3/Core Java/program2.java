class program2 {
    public static void main(String args[]) {
        Cone obj = new Cone(5, 10);
        System.out.println("Area of cone: " + obj.area());
        System.out.println("Volume of cone: " + obj.volume());

        Cylinder obj1 = new Cylinder(5, 10);
        System.out.println("Area of cylinder: " + obj1.area());
        System.out.println("Volume of cylinder: " + obj1.volume());
    }
}

abstract class Shape {
    abstract float area();

    abstract float volume();
}

class Cone extends Shape {
    float radius, height;

    Cone(float r, float h) {
        super();
        radius = r;
        height = h;
    }

    float area() {
        return (float) (3.14 * radius * (radius + (radius * radius) + (height * height)));
    }

    float volume() {
        return (float) (3.14 * radius * radius * height / 3);
    }
}

class Cylinder extends Shape {
    float radius, height;

    Cylinder(float r, float h) {
        super();
        radius = r;
        height = h;
    }

    float area() {
        return (float) (2 * 3.14 * radius * (radius + height));
    }

    float volume() {
        return (float) (3.14 * radius * radius * height);
    }
}
