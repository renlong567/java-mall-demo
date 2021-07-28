package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.OauthClients;
import com.example.javademo.mbg.model.OauthClientsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthClientsMapper {
    long countByExample(OauthClientsExample example);

    int deleteByExample(OauthClientsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OauthClients record);

    int insertSelective(OauthClients record);

    List<OauthClients> selectByExampleWithBLOBs(OauthClientsExample example);

    List<OauthClients> selectByExample(OauthClientsExample example);

    OauthClients selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OauthClients record, @Param("example") OauthClientsExample example);

    int updateByExampleWithBLOBs(@Param("record") OauthClients record, @Param("example") OauthClientsExample example);

    int updateByExample(@Param("record") OauthClients record, @Param("example") OauthClientsExample example);

    int updateByPrimaryKeySelective(OauthClients record);

    int updateByPrimaryKeyWithBLOBs(OauthClients record);

    int updateByPrimaryKey(OauthClients record);
}