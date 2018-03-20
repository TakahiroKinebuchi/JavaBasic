package practice11;

import java.util.Scanner;

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します

		Book[] bookData = FileReaderClass.readBookDataFile();
		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		Scanner scanner = new Scanner(System.in);

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");

		// コマンドプロンプトで入力した文字列が変数lineに代入されます
		String line = scanner.nextLine();

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください

		for(int i = 0;i < bookData.length;i++) {
			if(bookData[i].title.indexOf(line)!=-1) {
				System.out.println(bookData[i].dispBookInfo());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}
	}
}
