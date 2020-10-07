package com.kgc.service;

import com.kgc.pojo.Bills;

import java.util.Date;
import java.util.List;

public interface BillsService {
    List<Bills> selectBytypeIdandbillTime(Integer typeid, Date billTime1, Date billTime2);

    List<Bills> selectAll();
}
