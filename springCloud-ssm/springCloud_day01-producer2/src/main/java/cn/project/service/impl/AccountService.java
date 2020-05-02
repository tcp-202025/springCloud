package cn.project.service.impl;

import cn.project.domain.Account;
import cn.project.mapper.IAccountMapper;
import cn.project.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private IAccountMapper accountMapper;


    @Override
    public Account findById(int id) {
        return accountMapper.selectByPrimaryKey(id);
    }
}
