package Lab3.Lesson;

public class Arrays2d {
    public static void main(String[] args) {
        char [][] phone = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {'*', 0, '#'}
        };
        for(char[] row : phone){
            for(char button : row){
                System.out.print(button + " ");
            }
            System.out.println();
        }
    }
}
