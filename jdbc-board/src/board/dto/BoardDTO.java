package board.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/*
 * 게시글 정보
 * board 테이블과 일치시켜주는 것이 좋음
 *                  DB          Java
 * - 게시글 번호    no          no
 * - 제목           title       title
 * - 작성자         writer      writer
 * - 내용           content     content
 * - 등록일         reg_date    regDate
 * - 수정일         upd_date    updDate
 * 
 * DB에서 레코드를 가져오면 DTO 객체에 매핑해서 담을 예정(DB에 넣을 때도 마찬가지)
 * 컬렉션에 담으면 게시글 목록이 됨
 */

@Data // getter/setter 자동 생성(lombok)
@NoArgsConstructor // 기본 생성자 자동 생성(lombok)
@AllArgsConstructor // 전체 필드 생성자 자동 생성(lombok)
@RequiredArgsConstructor // 필수 필드(@NonNull) 생성자 자동 생성(lombok)
public class BoardDTO {
    
    private int no;
    @NonNull private String title;
    @NonNull private String writer;
    @NonNull private String content;
    private LocalDateTime regDate;
    private LocalDateTime updDate;
    
//    public BoardDTO() {
//        this("(제목없음)", "(작성자없음)", "");
//    }

//    public BoardDTO(String title, String writer, String content) {
//        this.title = title;
//        this.writer = writer;
//        this.content = content;
//    }

//    public BoardDTO(int no, String title, String writer, 
//                    String content, LocalDateTime regDate, LocalDateTime updDate) {
//        this.no = no;
//        this.title = title;
//        this.writer = writer;
//        this.content = content;
//        this.regDate = regDate;
//        this.updDate = updDate;
//    }

//    public int getNo() {
//        return no;
//    }
//
//    public void setNo(int no) {
//        this.no = no;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getWriter() {
//        return writer;
//    }
//
//    public void setWriter(String writer) {
//        this.writer = writer;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public LocalDateTime getRegDate() {
//        return regDate;
//    }
//
//    public void setRegDate(LocalDateTime regDate) {
//        this.regDate = regDate;
//    }
//
//    public LocalDateTime getUpdDate() {
//        return updDate;
//    }
//
//    public void setUpdDate(LocalDateTime updDate) {
//        this.updDate = updDate;
//    }
//
//    @Override
//    public String toString() {
//        return "BoardDTO [no=" + no + ", title=" + title + ", writer=" + writer 
//                + ", content=" + content + ", regDate=" + regDate + ", updDate=" + updDate + "]";
//    }
    
}
