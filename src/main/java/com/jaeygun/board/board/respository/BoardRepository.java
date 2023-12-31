package com.jaeygun.board.board.respository;

import com.jaeygun.board.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

    Board getBoardByBoardUid(long boardUid);
}
