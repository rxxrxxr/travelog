package travelog;

import java.util.Scanner;

public class BoardDetail {
	public static void main(String[] args) {

		DB db = new DB();
		Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
		System.out.println("게시물 번호를 입력하세요.");
		int choice = sc.nextInt();
		sc.nextLine();
		db.detailSelect(choice);
		System.out.println();
		System.out.println("1. 게시물 수정, 2. 게시물 삭제, 3.메인화면으로 이동");
=======

		while (true) {
			System.out.println("게시물 번호를 입력하세요.");
			int choice = sc.nextInt();
			sc.nextLine();
			db.detailSelect(choice);
			boolean bo = true;

			while (bo) {
				System.out.println("1. 게시물 수정, 2. 게시물 삭제 3. 메인으로 이동");
				String BD = sc.nextLine();
				switch (BD) {
				case "1":
					BoardUpdate.main(args);
					break;
				case "2":
					db.delete(choice);
					Listpage.main(args);
					break;
				case "3":
					BoardDetail.main(args);;
					break;
				case "0":
					System.out.println("종료합니다.");
					bo = false;
				default:
					System.out.println("게시물 번호를 다시 입력해주세요");
					continue;

				}
			}

		}
>>>>>>> c219d090de4ab318e7ca78465b71becb6defca21
	}

}
