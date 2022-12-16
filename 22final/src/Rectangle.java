public class Rectangle extends Shape{
    private String name;
    private int x1, y1, x2, y2;

    private int minBoundsX;
    private int minBoundsY;
    private int maxBoundsX;
    private int maxBoundsY;

    public void setMinBoundsX(int minBoundsX) {
        this.minBoundsX = minBoundsX;
    }

    public void setMinBoundsY(int minBoundsY) {
        this.minBoundsY = minBoundsY;
    }

    public void setMaxBoundsX(int maxBoundsX) {
        this.maxBoundsX = maxBoundsX;
    }

    public void setMaxBoundsY(int maxBoundsY) {
        this.maxBoundsY = maxBoundsY;
    }

    public Rectangle(String name, int[] coords, int idx) {
        this.name = name;
        x1 = coords[idx];
        y1 = coords[idx+1];
        x2 = coords[idx+2];
        y2 = coords[idx+3];

        if (x1 > x2) {
            this.setMinBoundsX(x1);
            this.setMaxBoundsX(x2);
        }
        else {
            this.setMinBoundsX(x2);
            this.setMaxBoundsX(x1);
        }

        if (y1 > y2) {
            this.setMinBoundsX(y1);
            this.setMaxBoundsX(y2);
        }
        else {
            this.setMinBoundsX(y2);
            this.setMaxBoundsX(y1);
        }


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
        return null;
    }

    @Override
    public boolean isSelected(int x, int y) {
        if (x <= maxBoundsX && x >= minBoundsX && y <= maxBoundsY && y >= minBoundsY) {
            return true;
        }
        return false;
    }

    // 이름과 bounding box 정보 출력
    // 출력 서식은 출력 화면 참조
    // Group에서는 Group의 bounding box뿐만 아니라 각 요소들도 출력
    @Override
    public void print() {
        System.out.println("Rectangle1:");
        System.out.printf("minBoundsX: %d, minBoundsY: %d", minBoundsX, minBoundsY);
        System.out.printf("maxBoundsX: %d, maxBoundsY: %d", maxBoundsX, maxBoundsY);
        // System.out.printf("Rectangle 1 is selected at (%d, %d): ", ?,?, isSelected(?,?));


    }

}
