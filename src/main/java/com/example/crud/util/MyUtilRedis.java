package com.example.crud.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author desheng.lan
 * @version 1.0
 * @date 2019/12/16 0016 下午 2:44
 */
@Component
public class MyUtilRedis {
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     *
     * @param key
     * @param value
     * @return
     */
    public Boolean set(String key,String value){
        try {
            if (StringUtils.isBlank(key) || StringUtils.isBlank(value)) {
                return false;
            }
            stringRedisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e){
            System.out.println(String.format("设置字符串异常！ key ：%s ,value：%s",key,value));
            e.printStackTrace();
        }
        return false;
    }

    /**
     *
     * @param key
     * @return
     */
    public String get(String key){
        try{
            if(StringUtils.isBlank(key)){
                return null;
            }
            return  stringRedisTemplate.opsForValue().get(key);
        }
        catch (Exception e){
            System.out.println(String.format("获取字符串异常！ key ：%s",key));
            e.printStackTrace();
        }
        return null;
    }
}
