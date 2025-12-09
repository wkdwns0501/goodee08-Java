package sec03.exam01;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineEx {
    public static void main(String[] args) {
        // 불변 리스트를 만드는 2가지 방법
        // 1. Arrays.asList (크기 불변 리스트): 요소 변경 가능(set), (add, remove 불가)
        //                                      크기 변경 불가 + null 허용
//        List<Student> list = Arrays.asList(
//                new Student("홍길동", 10),
//                new Student("고길동", 20),
//                new Student("김길동", 30)
//        );
        
        // 2. List.of (완전 불변 리스트): 요소 변경 불가/크기 변경 불가 + null 금지
        List<Student> list = List.of(
                new Student("홍길동", 10),
                new Student("고길동", 20),
                new Student("김길동", 30)
        );
        
        // 방법1
        // Student 객체가 흘러가는 스트림 얻기
        Stream<Student> studentStream = list.stream();
        
        // 중간 처리(학생 객체를 점수로 매핑)
        // 이때 Student 객체의 어떤 값을 매핑 시킬지 람다식 제공
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        
        // 최종 처리(평균 점수)
        // IntStream에 들어있는 int 값에 대한 평균 구하기
        double avg = scoreStream.average().getAsDouble(); // OptionalDouble 객체에서 결과값 얻기 
        
        System.out.println("평균 점수: " + avg);
        
        // 방법2: 메소드 체이닝 이용
        double avg2 = list.stream().mapToInt(student -> student.getScore())
                                    .average()
                                    .getAsDouble();
        
        System.out.println("평균 점수: " + avg2);
        
        list.stream()
            .map(student -> student.getName()) // 중간 처리
            .forEach(t -> System.out.println(t)); // 최종 처리
        
    }
}
