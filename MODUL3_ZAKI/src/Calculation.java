public class Calculation implements Runnable {
    double radius, side, area;
    double phi = 3.14;

    public void setSquare(double side) {
        this.side = side;
        try {
            if (side < 1) {
                throw new IllegalArgumentException();
            } else {
                double area = side * side;
            }
        } catch (IllegalArgumentException err) {
            System.out.println(err);
        }
    }

    public double getSquare() {
        return area;
    }

    public void setCircle(double radius) {
        this.radius = radius;
        try {
            if (radius < 1) {
                throw new IllegalArgumentException();
            } else {
                double area = radius * phi;
            }
        } catch (IllegalArgumentException err) {
            System.out.println(err);
        }
    }

    public double getCircle() {
        return area;
    }

    public void setTrapezoid(double a, double b, double t) {
        try {
            if (a < 1 && b < 1 && t < 1) {
                throw new IllegalArgumentException();
            } else {
                double area = ((a + b) * t) / 2;
            }
        } catch (IllegalArgumentException err) {
            System.out.println(err);
        }
    }

    public double getTrapezoid() {
        return area;
    }

    @Override
    public void run() {
        System.out.println("====Program will start in====");
        for (int i = 3; i > 0; i = i - 1) {
            try {
                System.out.println("Starting with thread " + i);
                Thread.sleep(2000);
            } catch (Exception err) {
                System.out.println(err);
            }
        }
    }
}
