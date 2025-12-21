package board;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import board.dto.BoardDTO;
import board.service.BoardService;
import board.service.BoardServiceImpl;

public class Main {
    
    private static Scanner sc = new Scanner(System.in);
    
    // 게시판 비즈니스 로직 객체
    private static BoardService boardService = new BoardServiceImpl(); 
    
    public static void main(String[] args) {
        int menuNo = 0;
        
        while (true) {
            // 메뉴판 출력
            menu();
            
            // 메뉴 번호 입력
            menuNo = sc.nextInt();
            sc.nextLine();
            
            // 0 -> 프로그램 종료
            if (menuNo == 0) break;
                
            // 메뉴 선택
            switch (menuNo) {
              case 1: list(); break;   // 게시글 목록
              case 2: select(); break; // 게시글 조회
              case 3: insert(); break; // 게시글 등록
              case 4: update(); break; // 게시글 수정
              case 5: delete(); break; // 게시글 삭제
            }
        }
        System.out.println("프로그램을 종료합니다!");
    }
    
    /**
     * 메뉴판
     */
    public static void menu() {
        System.out.println("========== 게시판 ==========");
        System.out.println("1. 게시글 목록");
        System.out.println("2. 게시글 조회");
        System.out.println("3. 게시글 등록");
        System.out.println("4. 게시글 수정");
        System.out.println("5. 게시글 삭제");
        System.out.println("0. 프로그램 종료");
        System.out.print("번호 입력: ");
    }
    
    /**
     * 게시글 단일 출력
     * @param board
     */
    public static void print(BoardDTO board) {
        if (board == null) {
//            System.out.println("조회할 수 없는 게시글 입니다.");
            return;
        }
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
        System.out.println("========================================");
        System.out.println("★ 글 번호: " + board.getNo());
        System.out.println("★ 제목: " + board.getTitle());
        System.out.println("★ 작성자: " + board.getWriter());
        System.out.println("----------------------------------------");
        System.out.println(" " + board.getContent());
        System.out.println();
        System.out.println("★ 등록일: " + df.format(board.getRegDate()));
        System.out.println("★ 수정일: " + df.format(board.getUpdDate()));
        System.out.println("========================================");
        System.out.println();
    }
    
    /**
     * 게시글 목록 출력
     * @param boardList
     */
    public static void printAll(List<BoardDTO> boardList) {
        // 글 목록이 존재하는지 확인
        if(boardList == null || boardList.isEmpty()) {
            System.out.println("조회된 글이 없습니다.");
            return;
        }
        
        // 글 목록 출력
        for (BoardDTO board : boardList) {
            print(board);
        }
    }
    
    /**
     * 게시글 목록 조회
     */
    public static void list() {
        System.out.println("========== 게시글 목록 ==========");
        
        // 게시글 목록 데이터 요청
        List<BoardDTO> boardList = boardService.list();
        
        // 게시글 목록 출력
        printAll(boardList);
    }
    
    /**
     * 게시글 단일 조회
     */
    public static void select() {
        System.out.println("========== 게시글 조회 ==========");
        System.out.print("글 번호: ");
        int no = sc.nextInt();
        sc.nextLine();
        
        // 글 번호(no)를 전달하여 게시글 정보 데이터 요청
        BoardDTO board = boardService.select(no);
        
        // 게시글 출력
        print(board);
    }
    
    /**
     * 게시글 정보 입력
     * @return
     */
    public static BoardDTO inputForInsert() {
        // 필수 입력값: 제목, 작성자, 내용
        System.out.print("제목: ");
        String title = sc.nextLine();
        System.out.print("작성자: ");
        String writer = sc.nextLine();
        System.out.print("내용: ");
        String content = sc.nextLine();
        
        BoardDTO board = new BoardDTO(title, writer, content);
        
        return board;
    }
    
    /**
     * 게시글 등록
     */
    public static void insert() {
        System.out.println("========== 게시글 등록 ==========");
        
        BoardDTO board = inputForInsert();
        
        // 게시글 등록 요청
        int result = boardService.insert(board);
        if (result > 0) {
            System.out.println("★ 게시글이 등록되었습니다.");
        } else {
            System.out.println("★ 게시글 등록에 실패하였습니다.");
        }
    }
    
    /**
     * 게시글 기본 수정
     */
//    public static void update() {
//        System.out.println("========== 게시글 수정 ==========");
//        
//        System.out.print("게시글 번호: ");
//        int no = sc.nextInt();
//        sc.nextLine();
//
//        BoardDTO board = input();
//        board.setNo(no);
//        
//        // 게시글 수정 요청
//        int result = boardService.update(board);
//        if (result > 0) {
//            System.out.println("★ 게시글이 수정되었습니다.");
//        } else {
//            System.out.println("★ 게시글 수정에 실패하였습니다.");
//        }
//    }
    
    /**
     * 게시글 수정 입력
     * @return
     */
    public static BoardDTO inputForUpdate() {
        System.out.print("새 제목: ");
        String title = sc.nextLine();
        System.out.print("새 내용: ");
        String content = sc.nextLine();

        BoardDTO board = new BoardDTO();
        board.setTitle(title);
        board.setContent(content);

        return board;
    }

    /**
     * 게시글 수정
     */
    public static void update() {
        System.out.println("========== 게시글 수정 ==========");
        System.out.println("(작성자가 같아야만 수정 가능합니다.)");
        System.out.print("게시글 번호 : ");
        int no = sc.nextInt();
        sc.nextLine();
        
        System.out.print("작성자 확인 : ");
        String inputWriter = sc.nextLine();

        BoardDTO originalBoard = boardService.selectForUpdate(no, inputWriter);

        if (originalBoard == null) {
            System.out.println("작성자가 같지 않거나, 해당 번호의 게시글이 존재하지 않습니다.");
            System.out.println("★ 게시글 수정에 실패하였습니다.");
            return;
        }

        BoardDTO updateBoard = inputForUpdate();

        int result = boardService.updateWithOriginal(no, originalBoard, updateBoard);
        if (result > 0) {
            System.out.println("★ 게시글이 수정되었습니다.");
        } else {
            System.out.println("★ 게시글 수정에 실패하였습니다.");
        }
    }
    
    public static void delete() {
        System.out.println("========== 게시글 삭제 ==========");
        System.out.print("게시글 번호 : ");
        int no = sc.nextInt();
        
        int result = boardService.delete(no);
        if (result > 0) {
            System.out.println("★ 게시글이 삭제되었습니다.");
        } else {
            System.out.println("★ 게시글 삭제에 실패하였습니다.");
        }
    }
    
}
