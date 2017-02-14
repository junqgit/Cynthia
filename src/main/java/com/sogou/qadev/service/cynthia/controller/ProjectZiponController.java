package com.sogou.qadev.service.cynthia.controller;

import com.sogou.qadev.service.cynthia.bean.Project;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author kin
 * @version $: v 0.1 2017/2/14 Exp $$
 */
@Controller
@RequestMapping("/zipon")
public class ProjectZiponController extends BaseController {

   @RequestMapping("/selectProject")
    @ResponseBody
    public String selectProject(String userName){
      Project project = das.queryProjectByUserName(userName);
       //TODO
       String abc= null;
       return abc;
   }
}
