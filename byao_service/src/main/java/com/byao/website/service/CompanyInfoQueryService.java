package com.byao.website.service;

import com.byao.website.dao.CompanyInfoDao;
import com.byao.website.entity.CompanyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyInfoQueryService
{
    @Autowired
    private CompanyInfoDao companyInfoDao;

    public CompanyInfo selectCompanyInfoById(Integer id)
    {
        return companyInfoDao.selectCompanyInfoById(id);
    }
}
