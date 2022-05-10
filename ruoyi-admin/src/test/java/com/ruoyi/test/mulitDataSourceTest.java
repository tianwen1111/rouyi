package com.ruoyi.test;

import com.ruoyi.system.domain.TmUser;
import com.ruoyi.system.mapper.TmUserMapper;
import com.ruoyi.system.service.ITmUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class mulitDataSourceTest {

    @Autowired
    ITmUserService iTmUserService;
    @Resource
    TmUserMapper tmUserMapper;

    @Test
    public void test(){
        long id = 1L;
        TmUser tmUser = iTmUserService.selectTmUserById(id);
        System.out.printf(tmUser.toString());
    }

    @Test
    public void test2(){
        long id = 1L;
        TmUser tmUser = tmUserMapper.selectTmUserById(id);
        System.out.printf(tmUser.toString());
    }
}
