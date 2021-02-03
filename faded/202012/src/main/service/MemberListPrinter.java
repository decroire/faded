package main.service;

import java.util.Collection;
import java.util.List;

import main.DTO.MemberDAO;
import main.DTO.MemberDTO;

public class MemberListPrinter {
	//의존객체
	MemberDAO dao = new MemberDAO();
	public void printAll() {
		Collection<MemberDTO> list = dao.selectAll();
		/*
		for(int i=0; i<list.size(); i++) {
			MemberDTO dto = list.get(i);
		}
		*/
		for(MemberDTO dto : list) {
			System.out.printf(			//decimal			String			timeFormat
							  "회원정보는 : 아이디 = %d , 이메일 = %s , 이름 = %s , 등록일 = %tF \n ",
							  dto.getId(),dto.getEmail(),dto.getName(),dto.getRegisterDate()); 
		}
	}
}
