package com.example.javademo.mbg.mapper;

import com.example.javademo.mbg.model.OauthPersonalAccessClients;
import com.example.javademo.mbg.model.OauthPersonalAccessClientsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthPersonalAccessClientsMapper {
    long countByExample(OauthPersonalAccessClientsExample example);

    int deleteByExample(OauthPersonalAccessClientsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OauthPersonalAccessClients record);

    int insertSelective(OauthPersonalAccessClients record);

    List<OauthPersonalAccessClients> selectByExample(OauthPersonalAccessClientsExample example);

    OauthPersonalAccessClients selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OauthPersonalAccessClients record, @Param("example") OauthPersonalAccessClientsExample example);

    int updateByExample(@Param("record") OauthPersonalAccessClients record, @Param("example") OauthPersonalAccessClientsExample example);

    int updateByPrimaryKeySelective(OauthPersonalAccessClients record);

    int updateByPrimaryKey(OauthPersonalAccessClients record);
}