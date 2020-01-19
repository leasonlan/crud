package com.example.crud.service;

import com.example.crud.dto.Rsp;
import com.example.crud.entity.Myuser;
import com.example.crud.mapper.MyuserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author desheng.lan
 * @version 1.0
 * @date 2019/12/5 0005 下午 4:08
 */
@Service
public class MyuserService {
    @Value("dev")
    private String dataShow;

    @Autowired MyuserMapper myuserMapper;
    /*
    *
    * 根据班级号统计人数
    * 根据id查询用户详细信息
    *
    * */
    public Object getuserCount(String classNumTotal){
        Map<String, Object> pam = new HashMap<String, Object>();
        pam.put("classNumTotal",classNumTotal);
        pam.put("dataShow", dataShow);
        return myuserMapper.getuserCount(pam);
    }
    public Object getUserInfo(int id){
        Map<String,Object> pam=new HashMap<String, Object>();
        pam.put("id",id);
        pam.put("dataShow",dataShow);
        return myuserMapper.getUserInfo(pam);
    }
    /*
    * 增加新用户信息
    * */
    public Object addUser(Myuser myuser){
        try {
            myuserMapper.addUser(myuser);
        }
        catch (Exception e){
            System.out.println("新增失败!");
            e.printStackTrace();
            return false;
        }
        return Rsp.succ("添加用户成功!", true);
    }
    /*
    *
    *根据id删除用户信息
    * */
    public Object deleteUser(int id){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("id",id);
        map.put("dataShow",dataShow);
        return myuserMapper.deleteUser(map);
    }
    /*
    * 修改用户信息
    * */
    public Object updateUser(Myuser myuser){
/*      boolean flag=false;
        try {
            myuserMapper.updateUser(id,myuser);
            flag=true;
        }
        catch (Exception e){
            System.out.println("修改失败!");
            e.printStackTrace();
        }
        return flag;*/
        try{
            myuserMapper.update(myuser);
        }catch (Exception e){
            System.out.println("修改失败!");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public Map<String,Object> getUserNameandClassNum(int userId){
        Map<String,Object> mpp=myuserMapper.getUserNameandClassNum(userId);
        System.out.println("取出来的名字是"+mpp.get("mingzi"));
        System.out.println("取出来的班级是"+mpp.get("banji"));
        return mpp;
    }
}
