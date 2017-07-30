package com.gbg.memberAdmin.controller;

import java.util.List;
import java.util.StringTokenizer;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gbg.member.model.UsersDto;
import com.gbg.memberAdmin.service.MemberAdminService;

@Controller
@RequestMapping("/memberAdmin")
public class MemberAdminController {

	@Autowired
	private MemberAdminService memberAdminService;
	
	@RequestMapping("/list.gbg")
	public ModelAndView listMemberAdmin(@RequestParam(value="pg") String pg){
		ModelAndView mav = new ModelAndView();
		List<UsersDto> list = memberAdminService.listMemberAdmin();
		mav.addObject("userAdminlist", list);
		System.out.println(list.size());
		mav.setViewName("/page/memberadmin/memberAdmin");
		return mav;
	}
	@RequestMapping("/blacklist.gbg")
	public ModelAndView blacklist(@RequestParam(value="pg") String pg){
		System.out.println("블랙리스트에 왔니");
		ModelAndView mav = new ModelAndView();
		List<UsersDto> list = memberAdminService.blacklist();
		mav.addObject("userAdminlist", list);
		mav.setViewName("/page/memberadmin/blacklist");
		return mav;
	}
	@RequestMapping("/idcheck.gbg")
	public @ResponseBody String searchMemberAdmin(@RequestParam("namemodel") String userId){
		System.out.println("컨트롤 에 왔다 체크임");
		String genderr="0";
		UsersDto usersDto = memberAdminService.searchMemberAdmin(userId);
		JSONObject json = new JSONObject();
		json.put("tel", usersDto.getTel());
		json.put("gemail", usersDto.getEmail());
		if(usersDto.getGender().equals("1")){
			genderr="남자";
		}else{
			genderr="여자";
		}
		json.put("gender", genderr);
		json.put("regDate", usersDto.getRegDate());
		json.put("userId", userId);
		System.out.println("여기는 컨트롤 에서 서치 부분입니다"+json.toJSONString());
		return json.toJSONString();
	}
	
	@RequestMapping("/delete.gbg")
	public String delete(@RequestParam("id") String userId){
	//	System.out.println("지금 딜리트에 욌어요");
		int cnt=0;
		cnt = memberAdminService.memberAdminDelete(userId);
		
		if(cnt !=0){
			System.out.println("성공했습니다");
		}else{
			System.out.println("실패했습니다");
		}
		//일단 이렇게 하고 수정할 가능성이 매우 높다.
		return "redirect:/memberAdmin/list.gbg?pg=1";
	}
	@RequestMapping("/black.gbg")
	public String black(@RequestParam("id") String valueArr){
		System.out.println(valueArr+"컨틀로 ");
		String blackck = null;
		int cnt=0;
		//여기 Tokenizer 을 이용해서 배열에 있는 것을 분리 시킬 예정 입니다
		StringTokenizer st = new StringTokenizer(valueArr, ",");
		System.out.println(st);
		while(st.hasMoreTokens()){
			blackck= st.nextToken();
			System.out.println(blackck);
		  cnt +=memberAdminService.memberAdminBlack( blackck);
			
		}
		System.out.println(cnt);
		return "redirect:/memberAdmin/list.gbg?pg=1";
	}
	@RequestMapping("/soso.gbg")
	public String soso(@RequestParam("id") String valueArr){
		System.out.println(valueArr+"컨틀로 ");
		String soso = null;
		int cnt=0;
		//여기 Tokenizer 을 이용해서 배열에 있는 것을 분리 시킬 예정 입니다
		StringTokenizer st = new StringTokenizer(valueArr, ",");
		System.out.println(st);
		while(st.hasMoreTokens()){
			soso= st.nextToken();
			System.out.println(soso);
		  cnt +=memberAdminService.memberAdminSoso(soso);
		}
		System.out.println(cnt);
		return "redirect:/memberAdmin/blacklist.gbg?pg=1";
	}
}
