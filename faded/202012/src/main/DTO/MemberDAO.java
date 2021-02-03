package main.DTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MemberDAO {
					// key        value
	private static Map<String, MemberDTO> map = 
			new HashMap<String, MemberDTO>();
	private static long nextId = 0;
	public void insert(MemberDTO dto) {
		// 사용자 저장 
		dto.setId(++nextId);
		map.put(dto.getEmail(),dto);
	}
	public MemberDTO selectByEmail(String email) {
			   //       key   =====> value
		return map.get(email);
	}
	public Collection<MemberDTO> selectAll() {
		return map.values();
	}
}
