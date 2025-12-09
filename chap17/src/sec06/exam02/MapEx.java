package sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapEx {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        
        IntStream intStream = Arrays.stream(intArr);
//        intStream.mapToDouble(value -> value) // int 1을 double 1.0으로
//            .forEach(value -> System.out.println(value));
        
        // 간편화 메소드 제공됨
        intStream.asDoubleStream() // 간단히 타입 변환만 할 때
            .forEach(value -> System.out.println(value));
        System.out.println();
        
        // 스트림은 최종 처리 후에 재사용 안됨
        // 새로운 스트림 생성
        intStream = Arrays.stream(intArr);
        intStream.boxed() // Stream<Integer>를 반환 = Integer 객체로 변환된 스트림
            .forEach(obj -> System.out.println(obj.intValue()));
    }
}
