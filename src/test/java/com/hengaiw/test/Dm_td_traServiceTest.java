package com.hengaiw.test;

import com.hengaiw.commons.utils.HaPageInfo;
import com.hengaiw.service.Dm_td_traService;
import com.hengaiw.test.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description：Dm_td_traServiceTest
 * @author：hengaiw.com
 * @date：2016年9月22日 下午5:23:24
 */
public class Dm_td_traServiceTest extends BaseTest {

    @Autowired
    private Dm_td_traService dmtdtraService;

    @Test
    public void testFindQcwork(){
    	HaPageInfo pageInfo = new HaPageInfo(1, 10,"E_PL_STATE","desc");
    	dmtdtraService.findQcworkList(pageInfo);
    	System.out.println(pageInfo.getTotal());
    }
}

