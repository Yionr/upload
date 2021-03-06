package cn.yionr.controller;

import cn.yionr.common.Log4jUtils;
import cn.yionr.common.ServerFileTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {

    ServerFileTool serverFileTool;
    Log4jUtils log4jUtils;

    @Autowired
    public ShowController(ServerFileTool serverFileTool,Log4jUtils log4jUtils){
        this.serverFileTool = serverFileTool;
        this.log4jUtils = log4jUtils;
    }

    @GetMapping("/show")
    public String show(){
        log4jUtils.addVisitCount();
        return serverFileTool.getFileList().toString();
    }

    @GetMapping("/showVisitCount")
    public int showVisitCount(){
        return log4jUtils.getVisitCount();
    }
}
