package com.kgc.service.impl;

import com.kgc.mapper.BillsMapper;
import com.kgc.pojo.Bills;
import com.kgc.service.BillsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("billsService")
public class BillsServiceImpl implements BillsService {
    @Resource
    BillsMapper billsMapper;

    @Override
    public List<Bills> selectBytypeIdandbillTime(Integer typeid, Date billTime1, Date billTime2) {
       /* BillsExample example = new BillsExample();
        BillsExample.Criteria criteria = example.createCriteria();*/
      /*  if (typeid != 0) {
            criteria.andTypeIdEqualTo(typeid);
        }
        if (billTime1 != null && billTime2 != null) {
            System.out.println("111111111");
            criteria.andBillTimeBetween(billTime1, billTime2);
        }*/
        List<Bills> bills = billsMapper.selectByExample(null);
        return bills;
    }

    @Override
    public List<Bills> selectAll() {
        List<Bills> bills = billsMapper.selectByExample(null);
        return bills;
    }
}
