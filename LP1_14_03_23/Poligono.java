package LP1_14_03_23;
public class Poligono {
    double position_x;
    double position_y;
    double rotation_deg;

    public Poligono(double x, double y, double r) {
        position_x = x;
        position_y = y;
        rotation_deg = r;
    }

    public void setPosition (double x, double y) {
        position_x = x;
        position_y = y;
    }

    public void move (double x, double y) {
        setPosition(position_x + x, position_y + y);
    }

    public void rotate (double r) {
        rotation_deg = (((rotation_deg + r) % 360) + 360) % 360;
    }
}