package org.zerock.board.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.board.entity.Board;
import org.zerock.board.entity.Member;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class BoardRepositoryTests {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void insertBoards() {
        IntStream.rangeClosed(1, 100).forEach(i -> {
            Member member = Member.builder().email("user" + i + "@test.com").build();
            Board board = Board.builder()
                    .title("Title..." + i)
                    .content("Content..." + i)
                    .writer(member)
                    .build();
            boardRepository.save(board);
        });
    }

    @Transactional
    @Test
    public void readBoard() {
        Optional<Board> result = boardRepository.findById(100L);
        Board board = result.get();
        System.out.println(board);
        System.out.println(board.getWriter());
    }

    @Test
    public void readBoardWithWriter() {
        Object result = boardRepository.getBoardWithWriter(100L);
        Object[] arr = (Object[]) result;
        System.out.println("-------------------------------");
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void readBoardWithReplies() {
        List<Object[]> result = boardRepository.getBoardWithReplies(100L);
        for (Object[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
