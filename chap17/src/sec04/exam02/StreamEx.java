package sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        String[] strArr = {"홍길동", "김재현", "김미나"};
        Stream<String> strStream = Arrays.stream(strArr);
        strStream.forEach(item -> System.out.print(item + ", "));
        System.out.println();
        
        // 다른 방법
//        Stream<String> strStream2 = Stream.of(strArr);
        Stream<String> strStream2 = Stream.of("홍길동", "김재현", "김미나");
        strStream2.forEach(item -> System.out.print(item + ", "));
        System.out.println();
        
        int[] intArr = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArr);
        intStream.forEach(item -> System.out.print(item + ", "));
        System.out.println();
        
        // 다른 방법 주의
        // 배열 자체가 하나의 요소로 흘러가는 스트림이 되어버림
//        Stream<int[]> intStream2 = Stream.of(intArr);
//        Stream<Integer> intStream2 = Stream.of(1, 2, 3, 4, 5);
        IntStream intStream2 = IntStream.of(intArr);
        intStream2.forEach(item -> System.out.print(item + ", "));
        System.out.println();
        
        // => 둘 다 다른점이 없기 때문에 헷갈리지 않게 Arrays.stream(...) 로 사용하자
    }
}
