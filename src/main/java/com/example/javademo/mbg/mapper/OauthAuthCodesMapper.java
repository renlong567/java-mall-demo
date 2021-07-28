package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.OauthAuthCodes;
import com.example.javademo.mbg.model.OauthAuthCodesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthAuthCodesMapper {
    long countByExample(OauthAuthCodesExample example);

    int deleteByExample(OauthAuthCodesExample example);

    int deleteByPrimaryKey(String id);

    int insert(OauthAuthCodes record);

    int insertSelective(OauthAuthCodes record);

    List<OauthAuthCodes> selectByExampleWithBLOBs(OauthAuthCodesExample example);

    List<OauthAuthCodes> selectByExample(OauthAuthCodesExample example);

    OauthAuthCodes selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OauthAuthCodes record, @Param("example") OauthAuthCodesExample example);

    int updateByExampleWithBLOBs(@Param("record") OauthAuthCodes record, @Param("example") OauthAuthCodesExample example);

    int updateByExample(@Param("record") OauthAuthCodes record, @Param("example") OauthAuthCodesExample example);

    int updateByPrimaryKeySelective(OauthAuthCodes record);

    int updateByPrimaryKeyWithBLOBs(OauthAuthCodes record);

    int updateByPrimaryKey(OauthAuthCodes record);
}