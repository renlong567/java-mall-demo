package com.example.javademo.dao;

import com.example.javademo.mbg.model.UmsAdminRoleRelation;
import com.example.javademo.mbg.model.UmsPermission;
import com.example.javademo.mbg.model.UmsResource;
import com.example.javademo.mbg.model.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户与角色关系管理自定义Dao
 * Created by macro on 2018/10/8.
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 批量插入用户角色关系
     */
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    /**
     * 获取用于所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有可访问资源
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);

    /**
     * 获取资源相关用户ID列表
     */
    List<Long> getAdminIdList(@Param("resourceId") Long resourceId);

    /**
     *
     * @param adminId
     * @return
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
