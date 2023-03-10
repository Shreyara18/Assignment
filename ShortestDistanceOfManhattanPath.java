
import java.util.Scanner;

public class ShortestDistanceOfManhattanPath {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] startPoint = new int[2];
        System.out.print("Enter start point: ");
        startPoint[0] = input.nextInt();
        startPoint[1] = input.nextInt();

        System.out.print("Enter a string of directions: ");
        String directions = input.next().toUpperCase();

        int xAxis = startPoint[0];
        int yAxis = startPoint[1];

        for (int i = 0; i < directions.length(); i++) {
            char direction = directions.charAt(i);
            switch (direction) {
                case 'N':
                    yAxis++;
                    break;
                case 'S':
                    yAxis--;
                    break;
                case 'E':
                    xAxis++;
                    break;
                case 'W':
                    xAxis--;
                    break;
                default:
                    break;
            }
        }

        double distance = Math.sqrt(Math.pow(xAxis - startPoint[0], 2) + Math.pow(yAxis - startPoint[1], 2));

        System.out.println("Shortest distance from start to end point: " + distance);
        input.close();
    }
}
