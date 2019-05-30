package com.mmj.core.dto;

import com.alibaba.druid.util.StringUtils;
import com.mmj.inf.dto.AbstractRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Optional;

/**
 * Created by Administrator on 2019/5/24.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UpdateAdminRequest extends AbstractRequest {

    private Integer id;

    private String name;

    private String sex;

    private String username;

    private String password;

    private String telephone;

    private String email;

    private String level;

    @Override
    public Optional<String> validateParam() {
        return Optional.empty();
    }
}
