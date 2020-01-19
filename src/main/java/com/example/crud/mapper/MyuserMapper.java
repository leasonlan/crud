package com.example.crud.mapper;

import com.example.crud.entity.Myuser;

import java.util.List;
import java.util.Map;

/**
 * @author desheng.lan
 * @version 1.0
 * @date 2019/12/5 0005 下午 3:54
 */
//@Mapper
// 在启动器上加了@MapperScan("com.example.crud.mapper")这里就没必要写上面那句
//    用的依赖是<dependency>
//			<groupId>org.mybatis.spring.boot</groupId>
//			<artifactId>mybatis-spring-boot-starter</artifactId>
//			<version>1.3.0</version>
//		</dependency>
//@Repository
public interface MyuserMapper {
    /*
    * 查询统计班级人数
    * */
    public int getuserCount(Map<String, Object> params);
    /*
    * 查询用户详细信息
    * */
    public List<Map<String,Object>> getUserInfo(Map<String,Object> mpa);
    /*
    *增加用户
    * */
    public boolean addUser(Myuser myuser);
    /*
    *删除用户
    * */
    public int deleteUser(Map<String,Object> map);
    /*
    * 修改用户
    * */
    public void update(Myuser myuser);
    /*
    * 根据id 有时候用的上的项目抽取
    * */
    public Map<String,Object> getUserNameandClassNum(int userId);
}
