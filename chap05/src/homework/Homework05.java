package homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		// 가위바위보 게임
	 	Scanner sc = new Scanner(System.in);
        String[] choices = {"가위", "바위", "보"};
        int total = 0;
        int win = 0;
        int draw = 0;
        int lose = 0;
        while (true) {
        	
            System.out.print("가위바위보 : ");
            String input = sc.nextLine();
            if ("stop".equals(input)) {
                System.out.println(total + "전 " + win + "승 " + draw + "무 " + lose + "패 ");
                break;
            }
            
            int user = -1;
            for (int i = 0; i < choices.length; i++) {
                if (choices[i].equals(input)) {
                    user = i;
                    break;
                }
            }
            if (user == -1) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
            
            int com = (int) (Math.random() * 3);
            System.out.println("컴퓨터 : " + choices[com]);
            System.out.println("사용자 : " + input);
            if (user == com) {
                System.out.println("비겼습니다.");
                draw++;
//          } else if ((user + 2) % 3 == com) { // 가위(0)>보(2), 바위(1)>가위(0), 보(2)>바위(1)
            } else if ((user == 0 && com == 2) ||   
            				(user == 1 && com == 0) ||   
            				(user == 2 && com == 1)) { 
                System.out.println("이겼습니다!");
                win++;
            } else {
                System.out.println("졌습니다 ㅜ");
                lose++;
            }
            total++;
        }
        sc.close();
        
	}
}
