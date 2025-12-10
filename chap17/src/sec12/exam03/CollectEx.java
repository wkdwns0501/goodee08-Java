package sec12.exam03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectEx {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<Student>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("이수진", "여", 87));
        totalList.add(new Student("김재현", "남", 95));
        totalList.add(new Student("양지은", "여", 93));
        
        // (그룹핑 이후) 남학생의 수, 여학생의 수 얻기
        Map<String, Long> stuNumByGender = totalList.stream()
            // 그룹핑해서 / 어떻게? 성별로 / 그룹핑해서 뭐 할건지? 그룹별로 요소 수 구하기
            .collect(Collectors.groupingBy(s -> s.getGender(), Collectors.counting()));
        System.out.println(stuNumByGender);
        
        // 남학생의 평균 점수, 여학생의 평균 점수 얻기
        Map<String, Double> avgByGender = totalList.stream()
            .collect(
                Collectors.groupingBy(
                    s -> s.getGender(),
                    Collectors.averagingDouble(s -> s.getScore())
                )
            );
        System.out.println(avgByGender);
        
        Map<String, Optional<Student>> topScoreByGender = totalList.stream()
            .collect(Collectors.groupingBy(
                        s -> s.getGender(), 
//                        Collectors.maxBy((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                        Collectors.maxBy(Comparator.comparingInt(s -> s.getScore()))
                    ));
        System.out.println(topScoreByGender);
        System.out.println("남학생의 최고 점수: " + topScoreByGender.get("남").get().getScore());
        System.out.println("여학생의 최고 점수: " + topScoreByGender.get("여").get().getScore());
    }
}
