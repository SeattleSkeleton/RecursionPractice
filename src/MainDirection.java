public class MainDirection {
    public static void main(String[] args) {
        travel(1,3);
    }
    private static void explore(int targetX, int targetY, int currX, int currY, String path) {
        if (currX == targetX && currY == targetY) {
            System.out.println(path);
        } else if (currX <= targetX && currY <= targetY) {
            explore(targetX, targetY, currX, currY + 1, path + " N");
            explore(targetX, targetY, currX + 1, currY, path + " E");
            explore(targetX, targetY, currX + 1, currY + 1, path + " NE");
        }
    }
    public static void travel(int targetX, int targetY) {
        explore(targetX, targetY, 0, 0, "moves:");
    }
}
