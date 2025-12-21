package board.service;

import java.util.List;
import java.util.Objects;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

/*
 * 게시판 기능 구현
 * 실제 비즈니스 로직(핵심 로직)을 작성
 */
public class BoardServiceImpl implements BoardService{
    
    private BoardDAO boardDAO = new BoardDAO();
    
    @Override
    public List<BoardDTO> list() {
        // DAO로 게시글 목록을 요청하고 그 결과로 List<BoardDTO>를 받아옴
        List<BoardDTO> boardList = boardDAO.list();
        
        // 게시글 목록 반환
        return boardList;
    }

    @Override
    public BoardDTO select(int no) {
        // 게시글 번호(no)를 DB로 넘겨주고 게시글 정보 요청
        BoardDTO board = boardDAO.select(no);
        
        // 게시글 정보 반환
        return board;
    }

    @Override
    public int insert(BoardDTO board) {
        // 게시글 정보를 전달하여 DB에 데이터 등록 요청
        int result = boardDAO.insert(board);
        
//        if (result > 0) {
//            System.out.println("데이터 등록 성공!");
//        } else {
//            System.out.println("데이터 등록 실패!");
//        }
        
        return result;
    }
    
    // 기본 수정(update)
//    @Override
//    public int update(int no, BoardDTO board) {
//        int result = boardDAO.update(no, board);
//        
//        if (result > 0) {
//            System.out.println("데이터 수정 성공!");
//        } else {
//            System.out.println("데이터 수정 실패!");
//        }
//        return result;
//    }
    
    // 수정을 위한 조회
    @Override
    public BoardDTO selectForUpdate(int no, String inputWriter) {
        BoardDTO originalBoard = boardDAO.select(no);
        if (originalBoard == null) return null;

        if (!Objects.equals(originalBoard.getWriter(), inputWriter)) return null;

        return originalBoard;
    }
    
    // 검증 로직 추가 수정(update)
    @Override
    public int updateWithOriginal(int no, BoardDTO originalBoard, BoardDTO updateBoard) {
        if (updateBoard.getTitle() == null 
                || updateBoard.getTitle().isBlank()) {
            updateBoard.setTitle(originalBoard.getTitle());
        }
        if (updateBoard.getContent() == null 
                || updateBoard.getContent().isBlank()) {
            updateBoard.setContent(originalBoard.getContent());
        }
        updateBoard.setWriter(originalBoard.getWriter());
        
        int result = boardDAO.update(no, updateBoard);
        return result;
    }

    @Override
    public int delete(int no) {
        int result = boardDAO.delete(no);
        
        if (result > 0) {
            System.out.println("데이터 삭제 성공!");
        } else {
            System.out.println("데이터 삭제 실패!");
        }
        return result;
    }
    
}
