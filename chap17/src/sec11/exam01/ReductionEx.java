package sec11.exam01;

import java.util.Arrays;
import java.util.List;

public class ReductionEx {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 92),
                new Student("김재현", 95),
                new Student("유재석", 88)
        );
        
        // 방법1
        int sum1 = studentList.stream()
                    .mapToInt(s -> s.getScore())
                    .sum();
        System.out.println("sum1: " + sum1);
        
        // 방법2: sum과 동일한 결과를 산출하도록 커스텀 집계 구현
        int sum2 = studentList.stream()
                    .mapToInt(s -> s.getScore())
                    .reduce(0, (a, b) -> a + b);
             // identity: 초기값 지정, accumulator: 수행할 누적 연산
        System.out.println("sum2: " + sum2);
        
        // reduce()를 활용하면 다양한 커스텀 집계 구현 가능
        // max
        int max = studentList.stream()
                    .mapToInt(s -> s.getScore())
                    .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("max: " + max);
        
        // min
        int min = studentList.stream()
                .mapToInt(s -> s.getScore())
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        System.out.println("max: " + min);
    }
}
