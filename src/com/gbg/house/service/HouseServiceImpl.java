package com.gbg.house.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbg.host.dao.HostDao;
import com.gbg.host.model.GuestHouseDto;
import com.gbg.host.model.RoomDto;
import com.gbg.house.dao.HouseDao;
import com.gbg.house.model.HouseDto;

@Service
public class HouseServiceImpl implements HouseService{

	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public int reservation(HouseDto houseDto) {
//		System.out.println(houseDto);
		return sqlSession.getMapper(HouseDao.class).reservation(houseDto);
		
	}

	@Override
	public GuestHouseDto houseInfo(String guesthouseId) {
		return sqlSession.getMapper(HouseDao.class).houseInfo(guesthouseId);
	}

	@Override
	public int hostInfo(GuestHouseDto gusethouseDto) {
		return sqlSession.getMapper(HouseDao.class).hostInfo(gusethouseDto);
	}

	@Override
	public int reservation(RoomDto roomDto) {
		return sqlSession.getMapper(HouseDao.class).reservation(roomDto);
	}

}
