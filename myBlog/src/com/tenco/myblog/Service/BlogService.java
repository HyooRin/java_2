package com.tenco.myblog.Service;

import com.tenco.myblog.DTO.BlogDto;
import com.tenco.myblog.dao.BlogDAO;

public class BlogService {

	private BlogDAO blogDao;

	public BlogService() {
		blogDao = new BlogDAO();
	}

	// 하나의 게시글 찾는 로직 만들기
	public BlogDto selectByBoardId(int id) {

		BlogDto resultDto = blogDao.select(id);

		return resultDto;
	}

	public int deleteBoardById(int boardId, int userId) {

		int resultRow = 0;
		// 검증 userId 값과
		// board 테이블에 있는 작성자의 userId 값이 같은지 확인
		BlogDto blogDto = selectByBoardId(boardId);
		// blogDto가 null 일때 방어적 코드 작성 
		if (blogDto != null) {
			int blogWriterId = blogDto.getUserId();

			if (blogWriterId == userId) {
				// 삭제요청 처리
				resultRow = blogDao.delete(boardId);

			}

		}

		return resultRow;
	}

}
