package com.coding.techblog.dao;


import com.coding.techblog.modal.Bo.ArchiveBo;
import com.coding.techblog.modal.Vo.ContentVo;
import com.coding.techblog.modal.Vo.ContentVoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ContentVoMapper {
    long countByExample(ContentVoExample example);

    int deleteByExample(ContentVoExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(ContentVo record);

    int insertSelective(ContentVo record);

    List<ContentVo> selectByExampleWithBLOBs(ContentVoExample example);

    List<ContentVo> selectByExample(ContentVoExample example);

    ContentVo selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") ContentVo record, @Param("example") ContentVoExample example);

    int updateByExampleWithBLOBs(@Param("record") ContentVo record, @Param("example") ContentVoExample example);

    int updateByExample(@Param("record") ContentVo record, @Param("example") ContentVoExample example);

    int updateByPrimaryKeySelective(ContentVo record);

    int updateByPrimaryKeyWithBLOBs(ContentVo record);

    int updateByPrimaryKey(ContentVo record);

    List<ArchiveBo> findReturnArchiveBo();

    List<ContentVo> findByCatalog(Integer mid);
}