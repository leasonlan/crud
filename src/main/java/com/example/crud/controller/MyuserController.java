package com.example.crud.controller;

import com.example.crud.dto.Rsp;
import com.example.crud.entity.Myuser;
import com.example.crud.service.MyuserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author desheng.lan
 * @version 1.0
 * @date 2019/12/5 0005 下午 4:21
 */
@RestController
@RequestMapping("/myuser")
public class MyuserController {

    @Autowired
    MyuserService myuserService;

    @ApiOperation(value ="查询同一个班级人数",notes="查询同一个班级人数")
    @ApiImplicitParam(name = "classNumTotal",value = "班级号", required = true, dataType = "String", paramType = "query")

    @RequestMapping(value = "/getuserCount",method = RequestMethod.GET)
    Object getuserCount(@RequestParam String classNumTotal){
        System.out.println("传入班级为"+classNumTotal);
        return Rsp.succ("查询成功!", myuserService.getuserCount(classNumTotal));
    }

    @ApiOperation(value ="查询用户详细信息",notes="查询用户详细信息")
    @ApiImplicitParam(name = "id",value = "id", required = true, dataType = "Integer", paramType = "query")
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.GET)
    Object getUserInfo(int id){
        System.out.println("传入班级为"+id);
        return Rsp.succ("查询成功!", myuserService.getUserInfo(id));
    }

    @ApiOperation(value ="添加用户信息",notes="添加用户信息")
    @ApiImplicitParam(name = "myuser",value = "新用户实体类", required = true, dataType = "Myuser")

    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public Object addUser(@RequestBody Myuser myuser){
        System.out.println("controller传入用户对象为"+myuser.toString());
        return myuserService.addUser(myuser);
    }

    @ApiOperation(value ="删除用户信息",notes="删除用户信息")
    @ApiImplicitParam(name = "id",value = "输入id", required = true,dataType = "Integer",paramType = "query")
    @RequestMapping(value = "/deleteUser",method = RequestMethod.DELETE)
    Object deleteUser(int id){
        return Rsp.succ("删除成功！",myuserService.deleteUser(id));
    }



    @ApiOperation(value ="修改用户信息",notes="修改用户信息")
    @ApiImplicitParam(name = "myuser",value = "修改用户实体类", required = true, dataType = "Myuser")
    @RequestMapping(value = "updateUser",method = RequestMethod.PUT)
    Object updateUser(@RequestBody Myuser myuser) {
        return myuserService.updateUser(myuser);
    }
    @ApiOperation(value ="demo",notes="demo")
    @ApiImplicitParam(name = "userId",value = "demo",paramType = "query")
    @RequestMapping(value = "getuserNameandClass",method = RequestMethod.GET)
    Object getUserNameandClassNum(int userId){
        return myuserService.getUserNameandClassNum(userId);
    }
}
