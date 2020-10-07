package com.kgc.controller;

import com.kgc.pojo.Bills;
import com.kgc.pojo.Type;
import com.kgc.service.BillsService;
import com.kgc.service.TypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AppController {
    @Resource
    TypeService typeService;
    @Resource
    BillsService billsService;

    @RequestMapping("/")
    public String toindex(Model model, @RequestParam(value = "typeId", required = false, defaultValue = "0") Integer typeId,
                          @RequestParam(value = "billTime1", required = false, defaultValue = "") String billTime1,
                          @RequestParam(value = "billTime2", required = false, defaultValue = "") String billTime2) {
       /* Date date = null;
        Date date2 = null;
        if (billTime1.equals("") == false && billTime2.equals("") == false) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                date = simpleDateFormat.parse(billTime1);
                date2 = simpleDateFormat.parse(billTime2);
                System.out.println(date + ":" + date2);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        List<Bills> bills = billsService.selectBytypeIdandbillTime(typeId, date, date2);*/
       /* List<Bills> bills = billsService.selectAll();
        model.addAttribute("bills", bills);*/

        List<Bills> bills = billsService.selectAll();
        model.addAttribute("bills", bills);

        return "index";
    }

    @RequestMapping("/selType")
    @ResponseBody
    public List<Type> selType() {
        List<Type> types = typeService.selectAll();
        return types;
    }
}
