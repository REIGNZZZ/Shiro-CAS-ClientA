package com.reignzzz.shirocas.dao;

import com.reignzzz.shirocas.entity.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

public interface PermissionDao {
    Set<String> getCodesByRoleIds(@Param(value = "roleIds") List<Long> roleIds);

    List<Permission> getPermissions();
}
