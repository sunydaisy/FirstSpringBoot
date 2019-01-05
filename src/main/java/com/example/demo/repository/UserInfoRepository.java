package com.example.demo.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.demo.domain.UserInfo;
import com.example.demo.vo.UserInfoVO;

@Mapper
public interface UserInfoRepository{

	List<UserInfo> findAll(@Param("params")UserInfoVO UserInfo);

}
