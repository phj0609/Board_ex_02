package me.hyun.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.hyun.config.AppTest;
import me.hyun.model.Board;

public class BoardMapperTest extends AppTest {

	@Autowired
	BoardMapper mapper;
	
	@Test
	public void getListTest() {
		List<Board> list = mapper.getList();
		assertEquals(6, list.size());
	}
	
}
