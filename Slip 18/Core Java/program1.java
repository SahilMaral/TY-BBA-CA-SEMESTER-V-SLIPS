class program1 {
    float area(float radius) {
        return (float) (3.14 * radius * radius);
    }

    float area(float a, float b, float c) {
        float s = (a + b + c) / 2;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    float area(float length, float width) {
        return length * width;
    }

    public static void main(String args[]) {

        float radius = 5;
        float sideA = 3;
        float sideB = 4;
        float sideC = 5;
        float length = 10;
        float width = 6;
        program1 obj = new program1();
        System.out.println("Area of circle with radius " + radius + " is " + obj.area(radius));
        System.out.println("Area of triangle with sides " + sideA + ", " + sideB + ", and " + sideC + " is "
                + obj.area(sideA, sideB, sideC));
        System.out.println(
                "Area of rectangle with length " + length + " and width " + width + " is " + obj.area(length, width));
    }
}
