package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.PasswordResets;
import com.example.javademo.mbg.model.PasswordResetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PasswordResetsMapper {
    long countByExample(PasswordResetsExample example);

    int deleteByExample(PasswordResetsExample example);

    int insert(PasswordResets record);

    int insertSelective(PasswordResets record);

    List<PasswordResets> selectByExample(PasswordResetsExample example);

    int updateByExampleSelective(@Param("record") PasswordResets record, @Param("example") PasswordResetsExample example);

    int updateByExample(@Param("record") PasswordResets record, @Param("example") PasswordResetsExample example);
}