package cn.project.mapper;

import cn.project.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
//@Mapper标记该类是一个mybatis的mapper接口，可以被spring boot自动扫描到spring上下文中
/**
 * 继承通用mapper
 */
public interface IAccountMapper extends tk.mybatis.mapper.common.Mapper <Account>{
    public Account findById(int id);
}

