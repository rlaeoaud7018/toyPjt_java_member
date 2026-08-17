package member_delete;

import java.util.Scanner;

public class DeleteController {
	
	private DeleteService deleteService = new DeleteService();
	
	public void deleteMember() {
		
		Scanner scanner = new Scanner(System.in);
		
		// 사용자 입력
		System.out.println("아이디: ");
		String memId = scanner.nextLine();
		
		System.out.println("비밀번호: ");
		String memPw = scanner.nextLine();
		
		// DTO 생성
		DeleteDto dto = new DeleteDto();
		dto.setMemId(memId);
		dto.setMemPw(memPw);
		
		// Service 호출
		deleteService.doDelete(dto);
		
	}

}
