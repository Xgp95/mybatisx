package com.mybatisplus.mybatisx.mapper;
import java.util.List;
import java.util.Collection;
import org.apache.ibatis.annotations.Param;

import com.mybatisplus.mybatisx.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author Administrator
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-07-08 16:16:50
* @Entity com.mybatisplus.mybatisx.bean.User
*/
@Repository
public interface UserMapper extends BaseMapper<User> {
    int insertSelective(User user);

    int insertAll(User user);

    int insertBatch(@Param("userCollection") Collection<User> userCollection);

    int deleteByAgeBetween(@Param("beginAge") Integer beginAge, @Param("endAge") Integer endAge);

    int deleteByAgeGreaterThan(@Param("age") Integer age);

    int delByIdLessThanEqual(@Param("id") Long id);

    List<User> selectAllByAgeGreaterThan(@Param("age") Integer age);
}




