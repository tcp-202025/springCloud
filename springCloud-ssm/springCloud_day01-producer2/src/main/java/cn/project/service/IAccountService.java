package cn.project.service;

import cn.project.domain.Account;

public interface IAccountService {

    /**
     * 根据id查询
     */
    public Account findById(int id);

}
