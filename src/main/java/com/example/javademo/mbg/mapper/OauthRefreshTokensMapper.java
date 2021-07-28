package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.OauthRefreshTokens;
import com.example.javademo.mbg.model.OauthRefreshTokensExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthRefreshTokensMapper {
    long countByExample(OauthRefreshTokensExample example);

    int deleteByExample(OauthRefreshTokensExample example);

    int deleteByPrimaryKey(String id);

    int insert(OauthRefreshTokens record);

    int insertSelective(OauthRefreshTokens record);

    List<OauthRefreshTokens> selectByExample(OauthRefreshTokensExample example);

    OauthRefreshTokens selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OauthRefreshTokens record, @Param("example") OauthRefreshTokensExample example);

    int updateByExample(@Param("record") OauthRefreshTokens record, @Param("example") OauthRefreshTokensExample example);

    int updateByPrimaryKeySelective(OauthRefreshTokens record);

    int updateByPrimaryKey(OauthRefreshTokens record);
}