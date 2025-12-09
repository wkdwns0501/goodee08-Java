package sec04.exam03;

import java.util.stream.IntStream;

public class StreamEx {
    
    public static int sum;
    
    public static void main(String[] args) {
//        int sum = 0;
        IntStream intStream = IntStream.rangeClosed(1, 100);
        intStream.forEach(a -> sum += a); // 람다식 내부에는 불변의 수만 들어갈수 있음(지역 변수X)
        System.out.println("총합: " + sum);
        
        // 권장 방식
        int sum1 = IntStream.rangeClosed(1, 100).reduce(0, (a, b) -> a + b);
        System.out.println("총합: " + sum1);
        
        int sum2 = IntStream.rangeClosed(1, 100).sum();
        System.out.println("총합: " + sum2);
    }
}
