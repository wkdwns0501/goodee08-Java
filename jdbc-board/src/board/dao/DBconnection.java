package board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection {
    public Connection conn;
    public Statement stmt;
    public PreparedStatement pstmt;
    public ResultSet rs;
    
    // JDBC 사용 전체 흐름 요약
    // 1. 드라이버 로딩
    // 2. Connection으로 DB접속
    // 3. Statement 또는 PreparedStatement로 SQL 작성
    // 4. SQL 실행 후 ResultSet으로 결과 받기
    // 5. 모두 사용 후 close()로 자원 정리
    
    public DBconnection() {
        // MySQL JDBC 드라이버 로드
       try {
           // Driver 클래스의 풀네임
           Class.forName("com.mysql.cj.jdbc.Driver");
           System.out.println("드라이버 로딩 성공!");
       } catch (ClassNotFoundException e) {
           System.err.println("드라이버 로딩 실패!");
           e.printStackTrace();
       }
       
       // DB에 연결
       // jdbc:mysql://도메인:[PORT]/[스키마]?옵션파라미터
       String url = "jdbc:mysql://localhost:3306/jdbc_board";
       String user = "root";
       String password = "test1234";
       
       // DriverManager
       // 자바 프로그램이 적절한 JDBC 드라이버를 통해 DB에 접속할 수 있도록 연결을 중개
       // 자바 프로그램 -> JDBC 드라이버 -> DB
       // getConnection() 메소드로 DB에 연결 요청하고 생성된 Connection 객체를 반환
       try {
           conn = DriverManager.getConnection(url, user, password);
           System.out.println("DB 연결 성공!");
       } catch (SQLException e) {
           System.err.println("DB 연결 실패!");
           e.printStackTrace();
       }
       
    }
    
    // DB 연결 테스트
//    public static void main(String[] args) {
//        DBconnection jdbc = new DBconnection();
//    }
    
}
