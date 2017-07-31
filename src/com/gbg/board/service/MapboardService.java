package com.gbg.board.service;

import java.util.List;

import com.gbg.board.model.MapboardDto;
import com.gbg.board.model.StopbyDto;

public interface MapboardService {

	int writeArticle(StopbyDto stopbyDto); 
	StopbyDto getArticle(int seq);
	List<StopbyDto> listArticle(int bcode, int pg, String key, String word);

	int replyArticle(StopbyDto stopbyDto);
	
	int modifyArticle(StopbyDto stopbyDto);
	int deleteArticle(int seq);
	
}
