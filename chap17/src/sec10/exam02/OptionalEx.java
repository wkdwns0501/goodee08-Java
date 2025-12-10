package sec10.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        
        // 테스트: 예외 발생(java.util.NoSuchElementException)
//        double avg = list.stream()
//            .mapToInt(e -> e.intValue())
//            .average()
//            .getAsDouble();
        
        // 방법1: isPresent() 메소드가 true를 리턴할 때만 집계값을 얻음
        OptionalDouble od = list.stream()
              .mapToInt(e -> e.intValue()) // 언박싱
              .average();
        
        if (od.isPresent()) {
            System.out.println("방법1_평균: " + od.getAsDouble());
        } else {
            System.out.println("방법1_평균: 0.0");
        }
        
        // 방법2: orElse() 메소드로 집계값이 없을 경우를 대비해서 디폴트 값을 설정
        double avg = list.stream()
                        .mapToInt(e -> e.intValue())
                        .average()
                        .orElse(0.0);
        
        System.out.println("방법2_평균: " + avg);
        
        // 방법3: ifPresent() 메소드로 집계값이 있을 경우에만 동작하는 Consumer 람다식을 제공
        list.stream()
            .mapToInt(e -> e.intValue())
            .average()
            .ifPresent(a -> System.out.println("방법3_평균: " + a)); // 집계값이 존재할 때만 람다식 실행
        
        
    }
}
