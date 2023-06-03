package ExceptionsHomeWork1;

public class HomeWork2 {
    public static void main(String[] args) {
        String[][] twoDimArray = new String[3][4];
        twoDimArray[0][0] = "1";//записали значение 5 в ячейку на пересечении нулевой строки и нулевого столбца
        twoDimArray[0][1] = "1"; //записали значение 7 в ячейку на пересечении нулевой строки и первого столбца
        twoDimArray[0][2] = "1";
        twoDimArray[0][3] = "1";
        twoDimArray[1][0] = "1";
        twoDimArray[1][1] = "1gghg";
        twoDimArray[1][2] = "1";
        twoDimArray[1][3] = "1";
        twoDimArray[2][0] = "1";
        twoDimArray[2][1] = "1";
        twoDimArray[2][2] = "1";
        twoDimArray[2][3] = "1";
        System.out.println(sum2d(twoDimArray));
    }

    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 4; j++) {
                if(arr[0].length != 4) throw new RuntimeException("Нессответсвие количества столбцов");
                try {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
                catch (NumberFormatException e){
                    System.out.println("Невозможно преобразовать в число");
                }
            }
        } return sum;
    }
}
