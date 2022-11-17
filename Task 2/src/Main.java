import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //��������� ������� �� ���������� ��
    public static int[][]getArray(int length){
        int[][] array=new int[length][length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = ((int) (Math.random() * 31) - 15);//���������� ����� ���������� ������� �� -15 �� 15
            }
        }
        return array;//���������� array
    }
    //�������� �������
    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print("\t|\t"+array[i][j]+"\t|\t");
            }
            System.out.println();
        }
    }

    //����� �� ������� �����
    public static void Search(int[][] array,int number){
            System.out.println("����� ����� " +number);
            for (int i = 0; i < array.length; i++) {
                System.out.print("\t|\t"+array[number - 1][i] +"\t|\t");//�������� �����
            }
            System.out.println();
    }




    public static void main(String[] arghs) {
        Scanner sc = new Scanner(System.in, "cp1251");
        try {
            int max=10;
            System.out.print("������ ����� �������(����=10):");
            int length = sc.nextInt();//������� �����
            int[][] array = getArray(length);
            printArray(array);
            while (max>=length)
            {
                try {
                    System.out.print("������ ����� �����:");
                    int number = sc.nextInt();//������� ����� ����� ���� ������ �������
                    Search(array,number);
                    break;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("���� ������ ������ �����");//������� �� ������ ���������� �����
                    continue;
                }
                catch (Exception e){
                    sc.nextLine();
                    System.out.println("������ ���� �����");
                    continue;
                }
            }
        }
        catch (InputMismatchException e){
            sc.nextLine();
            System.out.println("������� ������. ������ ���� �����");
            main(arghs);
        }
    }
}
