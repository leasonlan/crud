package com.example.crud.test;

/**
 * @author desheng.lan
 * @version 1.0
 * @date 2019/12/16 0016 上午 11:17
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class JUTest {
//
//
//        @Resource
//        private RedisUtils redisUtils;
//
//
//        @Test
//        public void testSet() {
//            Boolean flag = redisUtils.set("mingyu","mingyu123sb");
//            System.out.println("testSet："+flag);
//        }
//
//        @Test
//        public void testGet() {
//            String value = redisUtils.get("mingyu");
//            System.out.println("testGet："+value);
//        }
//
//        @Test
//        public void testDelete() {
//            Boolean flag = redisUtils.delete("mingyu");
//            System.out.println("testDelete："+flag);
//        }
//        @Test
//        public void testSetEX() {
//            Boolean flag = redisUtils.setEX("mingyu","cmy",1000L);
//            System.out.println("testSetEX："+flag);
//        }
//        @Test
//        public void testGetExpireTime() {
//            Long time = redisUtils.getExpireTime("mingyu");
//            System.out.println("testSetEX："+time);
//        }
//    }