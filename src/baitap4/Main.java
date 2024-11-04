package baitap4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int inputKey = -1;
		while (inputKey != 0) {
			System.out.println("|-----------------MENU---------------------|");
			System.out.println("| 1. Chương trình 1                        |");
			System.out.println("| 2. Chương trình 2                        |");
			System.out.println("| 3. Chương trình 3                        |");
			System.out.println("| 4. Chương trình 4                        |");
			System.out.println("| 0. Thoát                                 |");
			System.out.println("|------------------------------------------|");
			System.out.print("Vui lòng chọn một số : ");
			inputKey = console.nextInt();
			switch (inputKey) {
			case 0:
				System.out.println("Tạm biệt!");
				break;
			case 1:
				System.out.print("Nhập số thứ nhất: ");
				int a = console.nextInt();
				System.out.print("Nhập số thứ hai: ");
				int b = console.nextInt();
				System.out.print("Nhập số thứ ba: ");
				int c = console.nextInt();

				System.out.println("Số lớn nhất là: " + timSoLonNhat(a, b, c));
				break;
			case 2:
				System.out.print("Nhập vào một số: ");
				int num = console.nextInt();

				System.out.println("Số vừa nhập số " + num + " là số " + timChanLe(num));
				break;
			case 3:
				System.out.print("Nhập số thứ nhất: ");
				int so1 = console.nextInt();
				System.out.print("Nhập số thứ hai: ");
				int so2 = console.nextInt();
				System.out.print("Nhập số thứ ba: ");
				int so3 = console.nextInt();

				System.out.println("Tổng ba số là: " + tinhTongBaSo(so1, so2, so3));
				break;
			case 4:
				System.out.println("Chọn toán tử: 1 cho +, 2 cho -, 3 cho *, 4 cho :");
				System.out.print("Nhập lựa chọn của bạn (1/2/3/4): ");
				int choice = console.nextInt();

				System.out.print("Nhập số thứ nhất: ");
				int num1 = console.nextInt();
				System.out.print("Nhập số thứ hai: ");
				int num2 = console.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Kết quả: " + cong(num1, num2));
					break;
				case 2:
					System.out.println("Kết quả: " + tru(num1, num2));
					break;
				case 3:
					System.out.println("Kết quả: " + nhan(num1, num2));
					break;
				case 4:
					try {
						System.out.println("Kết quả: " + chia(num1, num2));
					} catch (ArithmeticException e) {
						System.out.println(e.getMessage());
					}
					break;
				default:
					System.out.println("Hãy chọn lại một số từ 1-4");
				}
				break;
			default:
				System.out.println("Hãy chọn lại!");
				break;
			}
		}
		console.close();

	}

	public static int timSoLonNhat(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}

	public static String timChanLe(int number) {
		return (number % 2 == 0) ? "Chẵn" : "Lẻ";
	}

	public static int tinhTongBaSo(int a, int b, int c) {
		return a + b + c;
	}

	public static int cong(int x, int y) {
		return x + y;
	}

	public static int tru(int x, int y) {
		return x - y;
	}

	public static int nhan(int x, int y) {
		return x * y;
	}

	public static double chia(int x, int y) {
		if (y != 0) {
			return (double) x / y;
		} else {
			throw new ArithmeticException("Lỗi: Chia cho 0");
		}
	}
}
