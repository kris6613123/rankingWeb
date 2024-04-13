package com.chouette.rankingWeb.dao.std;

import com.chouette.rankingWeb.vo.GameVO;
import com.chouette.rankingWeb.vo.std.StdWinningBuyinVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StdWinningBuyinDAO {

    void pushIdx();

    void add( StdWinningBuyinVO vo );

    Double getWeight( GameVO vo );

    List<StdWinningBuyinVO> getList();

    List<StdWinningBuyinVO> getRecentList();

}
