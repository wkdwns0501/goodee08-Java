package homework03;

import java.util.Scanner;

public class FileMenu {

	Scanner sc = new Scanner(System.in);

	FileController fc = new FileController();

	public void mainMenu() {
//		 ***** My Note ***** 
//		 1. 노트 새로 만들기 -> fileSave() 
//		 2. 노트 열기 -> fileOpen() 
//		 3. 노트 열어서 수정하기 -> fileEdit() 
//		 9. 끝내기 -> “프로그램을 종료합니다.” 출력 후 종료 
//		 메뉴 번호 :  
//		 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복

		while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");

			int menuNo = Integer.parseInt(sc.nextLine());
			switch (menuNo) {
			case 1: fileSave(); break;
			case 2: fileOpen(); break;
			case 3: fileEdit(); break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	public void fileSave() { 
		StringBuilder sb = new StringBuilder();
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("exit를 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str = sc.nextLine();
			// "exit"를 입력할 때까지 사용자가 입력하게 하고 
			if ("exit".equals(str)) break;
			// 그 값들을 StringBuilder에 저장 
			sb.append(str + "\n");
		}
		// 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면 
		// "이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)"가 출력됨 
		// y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 sb를 넘김
		// n를 입력하면 "저장할 파일 명을 입력해주세요 ~"가 다시 나오게끔 반복 
		// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면  
		// 파일 명과 내용을 fc에 fileSave 메소드로 넘김 
		while (true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			String fileName = sc.nextLine();
			boolean isExist = fc.checkName(fileName);
			if (isExist) { // 존재하면 덮어쓰기
	            System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
	            String yn = sc.nextLine();
	            if ("y".equalsIgnoreCase(yn)) {
	                fc.fileSave(fileName, sb);
	                System.out.println("파일이 덮어쓰기되었습니다.");
	                break;
	            } else continue;
	        } else { // 존재하지 않으면 새 파일로 저장
	            fc.fileSave(fileName, sb);
	            System.out.println("파일이 저장되었습니다.");
	            break;
	        }
		}
	 }

	public void fileOpen() { 
		System.out.print("열 파일 명 : ");
		String fileName = sc.nextLine();
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨 
		boolean checkName = fc.checkName(fileName);
		if (checkName) { // 반환 값이 true일 경우
			// fc의 fileOpen() 메소드의 매개변수로 넘겨반환 값 출력 
			System.out.println(fc.fileOpen(fileName));;
		} else { // 반환 값이 false일 경우
			// "없는 파일입니다." 출력 후 mainMenu()로 돌아감 
			System.out.println("없는 파일입니다.");
		}
	}

	public void fileEdit() { 
		System.out.print("수정할 파일 명 : ");
		String changeFileName = sc.nextLine();
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨 
		boolean checkName = fc.checkName(changeFileName);
		if (!checkName) { // 반환 값이 false일 경우 
			//"없는 파일입니다." 출력 후 mainMenu()로 돌아감 
			System.out.println("없는 파일입니다.");
		} else { // 반환 값이 true일 경우
			// fileSave()처럼 안내문 출력 후 내용에 대해 받음
			StringBuilder sb = new StringBuilder();
			while (true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("exit를 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String str = sc.nextLine();
				// exit를 입력하면 반복문 종료 후
				if ("exit".equals(str)) break;
				sb.append(str + "\n");
			}
			// fc의 fileEdit()에 파일 명과 StringBuilder 전달 
			fc.fileEdit(changeFileName, sb);
		}
	 }
	
}
