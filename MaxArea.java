public class MaxArea {
    public int maxArea(int[] height) {
        int p1 = 0;
        int p2 = height.length - 1;
        int biggestArea = Integer.MIN_VALUE;

        while (p1 < p2) {
            int area = Math.min(height[p1], height[p2]) * Math.abs(p1 - p2);
            if (biggestArea < area) {
                biggestArea = area;
            }
            if (height[p1] > height[p2]) {
                p2--;
            } else {
                p1++;
            }

        }
        return biggestArea;
    }
    public static void main(String[] args) {
        MaxArea m = new MaxArea();
        System.out.println(m.maxArea(new int[]{2,3,4,5,18,17,6}));
    }
}
