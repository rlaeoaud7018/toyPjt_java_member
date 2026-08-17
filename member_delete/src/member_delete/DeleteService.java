package member_delete;

public class DeleteService {
	
	private DeleteDao deleteDao = new DeleteDao();

	public void doDelete(DeleteDto dto ) {
		
		// 1. 회원 조회
		DeleteDto selected =
				deleteDao.selectedMemberByMemId(dto.getMemId());
		
		// 2. 회원 존재 여부 확인
		if (selected == null) {
			System.out.println("존재하지 않는 회원입니다.");
		}
		
		//3. 비밀번호 확인
		if (!selected.getMemPw().equals(dto.getMemPw())) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}
		
		// 4. 삭제 요청
		boolean result = deleteDao.deleteMember(selected);
		
		// 5. 결과 출력
		if (result) {
			System.out.println("회원 탈퇴 완료");
		} else {
			System.out.println("회원 탈퇴 실패");
			
		}
		
		
		
	}
	
	

}
