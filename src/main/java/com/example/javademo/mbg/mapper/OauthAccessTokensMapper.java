package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.OauthAccessTokens;
import com.example.javademo.mbg.model.OauthAccessTokensExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthAccessTokensMapper {
    long countByExample(OauthAccessTokensExample example);

    int deleteByExample(OauthAccessTokensExample example);

    int deleteByPrimaryKey(String id);

    int insert(OauthAccessTokens record);

    int insertSelective(OauthAccessTokens record);

    List<OauthAccessTokens> selectByExampleWithBLOBs(OauthAccessTokensExample example);

    List<OauthAccessTokens> selectByExample(OauthAccessTokensExample example);

    OauthAccessTokens selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OauthAccessTokens record, @Param("example") OauthAccessTokensExample example);

    int updateByExampleWithBLOBs(@Param("record") OauthAccessTokens record, @Param("example") OauthAccessTokensExample example);

    int updateByExample(@Param("record") OauthAccessTokens record, @Param("example") OauthAccessTokensExample example);

    int updateByPrimaryKeySelective(OauthAccessTokens record);

    int updateByPrimaryKeyWithBLOBs(OauthAccessTokens record);

    int updateByPrimaryKey(OauthAccessTokens record);
}