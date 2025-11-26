package sec01.exam04;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// id 필드값이 같은 모든 Member 객체는 동일한 해시코드가 나오게 만들기
		return id.hashCode(); // String은 문자열이 같으면 동일한 해시코드가 나오도록 재정의 되어있음
	}
	
}
