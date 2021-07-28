package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.FailedJobs;
import com.example.javademo.mbg.model.FailedJobsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FailedJobsMapper {
    long countByExample(FailedJobsExample example);

    int deleteByExample(FailedJobsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FailedJobs record);

    int insertSelective(FailedJobs record);

    List<FailedJobs> selectByExampleWithBLOBs(FailedJobsExample example);

    List<FailedJobs> selectByExample(FailedJobsExample example);

    FailedJobs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FailedJobs record, @Param("example") FailedJobsExample example);

    int updateByExampleWithBLOBs(@Param("record") FailedJobs record, @Param("example") FailedJobsExample example);

    int updateByExample(@Param("record") FailedJobs record, @Param("example") FailedJobsExample example);

    int updateByPrimaryKeySelective(FailedJobs record);

    int updateByPrimaryKeyWithBLOBs(FailedJobs record);

    int updateByPrimaryKey(FailedJobs record);
}