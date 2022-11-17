import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] arghs) {
        Scanner sc = new Scanner(System.in, "cp1251");
        try {
            int max=10;
            System.out.print("������ ����� �������(����=10):");
            int length = sc.nextInt();//������� �����
            int[][] array=new int[length][length];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = ((int) (Math.random() * 31) - 15);//���������� ����� ���������� ������� �� -15 �� 15
                    System.out.print("\t|\t"+array[i][j]+"\t|\t");
                }
                System.out.println();
            }
            while (max>=length)
            {
                try {
                    System.out.print("������ ����� �����:");
                    int number = sc.nextInt();//������� ����� ����� ���� ������ �������

                    System.out.println("����� ����� " +number);
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(" " +array[number - 1][i] + " ");//�������� �����
                    }
                    System.out.println();
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

