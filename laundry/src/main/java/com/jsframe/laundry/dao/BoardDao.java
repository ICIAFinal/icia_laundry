package com.jsframe.laundry.dao;

import com.jsframe.laundry.dto.BoardDto;
import com.jsframe.laundry.dto.BoardfileDto;
import com.jsframe.laundry.dto.ListDto;
import com.jsframe.laundry.dto.ReplyDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {
    //게시글 목록 가져오기
    public List<BoardDto> boardListSelect(ListDto list);
    //전체 글개수 구하기
    public int bcntSelect(ListDto list);
    //게시글 저장하기
    public void boardInsert(BoardDto board);
    //파일 정보 저장하기
    public void fileInsert(BoardfileDto bfile);
    //게시글 내용 가져오기
    public BoardDto boardSelect(Integer bnum);
    //파일 목록 가져오기
    public List<BoardfileDto> fileSelect(Integer bnum);
    //댓글 목록 가져오기
    public List<ReplyDto> ReplySelect(Integer bnum);
    //댓글 저장하기
    public void ReplyInsert(ReplyDto review);
    //파일 삭제(개별 - 게시글 수정)
    public void fileDelete(String sysname);
    //게시글 수정
    public void boardUpdate(BoardDto board);
    //댓글 삭제
    public void ReplyDelete(Integer bnum);
    //파일목록 삭제
    public void fListDelete(Integer bnum);
    //게시글 삭제
    public void boardDelete(Integer bnum);
    //새로 추가한 댓글 가져오기
    public ReplyDto ReplySelectLast(int re_num);
    //댓글 수 수정
    public void boardRpUpdate(int bnum);
}
