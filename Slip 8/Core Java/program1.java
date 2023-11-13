class program1 {
    public static void main(String args[]) {
        circle obj = new circle(12);
        obj.area();
        sphere obj1 = new sphere(12);
        obj1.area();
    }
}

interface Shape {
    void area();
}

class circle implements Shape {
    final double PI = 3.14;
    int radius;

    circle(int radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of circle is " + PI * this.radius * this.radius);
    }
}

class sphere implements Shape {
    final double PI = 3.14;
    int radius;

    sphere(int radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of circle is " + 4 * PI * this.radius * this.radius);
    }
}