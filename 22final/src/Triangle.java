public class Triangle extends Shape{

    private String name;
    private int x1, y1, x2, y2, x3, y3;

    private int minBoundsX;
    private int minBoundsY;
    private int maxBoundsX;
    private int maxBoundsY;

    public Triangle(String name, int[] coords, int idx) {
        this.name = name;
        x1 = coords[idx+0];
        y1 = coords[idx+1];
        x2 = coords[idx+2];
        y2 = coords[idx+3];
        x3 = coords[idx+4];
        y3 = coords[idx+5];

        maxBoundsX = Math.max(x3, Math.max(x1, x2));
        maxBoundsY = Math.max(y3, Math.max(y1, y2));
        minBoundsX = Math.min(x3, Math.min(x1, x2));
        minBoundsY = Math.min(y3, Math.min(y1, y2));

    }

    public String getShapeName() {
        return name;
    }

    @Override
    public int getMinBoundsX() {
        return minBoundsX;
    }

    @Override
    public int getMinBoundsY() {
        return minBoundsY;
    }

    @Override
    public int getMaxBoundsX() {
        return maxBoundsX;
    }

    @Override
    public int getMaxBoundsY() {
        return maxBoundsY;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public boolean isSelected(int x, int y) {
        if (x <= maxBoundsX && x >= minBoundsX && y <= maxBoundsY && y >= minBoundsY) {
            return true;
        }
        return false;
    }

    @Override
    public void print() {
        System.out.println("Triangle1:");
        System.out.printf("minBoundsX: %d, minBoundsY: %d", minBoundsX, minBoundsY);
        System.out.printf("maxBoundsX: %d, maxBoundsY: %d", maxBoundsX, maxBoundsY);
    }
}
