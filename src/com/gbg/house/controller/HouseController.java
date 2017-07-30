package com.gbg.house.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gbg.host.model.GuestHouseDto;
import com.gbg.host.model.RoomDto;
import com.gbg.house.model.HouseDto;
import com.gbg.house.service.HouseService;
import com.gbg.house.service.HouseServiceImpl;
import com.gbg.member.model.UsersDto;

@Controller
@RequestMapping("/house")
public class HouseController {

	@Autowired
	private HouseService houseservice;
	
	@RequestMapping(value="/reservation.gbg", method=RequestMethod.GET)
	public ModelAndView room(@RequestParam("guesthouseId") int guesthouseId){
		ModelAndView mav = new ModelAndView();
		List<RoomDto> list = houseservice.room(guesthouseId);
		mav.addObject("room",list);
		mav.setViewName("/page/house/house");
		return mav;
		
	}
	
	
//	
//	@RequestMapping(value="/reservation.gbg", method=RequestMethod.GET)
//	public String reservation(){
//		
//	return "/page/house/house";
//	}
	
	@RequestMapping(value="/reservation.gbg", method=RequestMethod.POST)
	public ModelAndView reservation(//@RequestParam("roomId") String roomId,
									@RequestParam("reservationId") String reservationId,
									@RequestParam("oksign") String oksign,
									@RequestParam("userId") String userId,
									HouseDto houseDto, HttpSession session, int guesthouseId){
		ModelAndView mav = new ModelAndView();
//		System.out.println(houseDto);
//		RoomDto roomDto = new RoomDto();
		UsersDto usersDto = (UsersDto) session.getAttribute("user");
		if (usersDto != null) {
			int cnt = houseservice.reservation(houseDto);
			List<RoomDto> list = houseservice.room(guesthouseId);
			mav.addObject("room",list);
//			cnt += houseservice.room(roomDto); 
//			mav.addObject("room", roomDto);
//			houseDto.setRoomId(roomDto.getRoomId());
			mav.addObject("house", houseDto);
			mav.setViewName("/page/house/reservationok");
		}
		return mav;

	}
	
	
}
