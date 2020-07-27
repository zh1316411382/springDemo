package com.example.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.entity.TagCondition;
import com.example.service.TagService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TagServiceImplTest extends TestCase {
 /*   @Autowired
    TagService tagService;

    @Reference(url = "dubbo://127.0.0.1:20880")
    IForecastService iForecastService;*/

    public void testGetTagBaseInfoPage() {
    }
    @Test
    public void testFindTagsByCondition() throws Exception {
        new Solution().isSubsequence("abc","ahbgdc");
        /*iForecastService.forecast(null);

        TagCondition tagCondition = TagCondition.builder()
//                        .tagId(1424l)
//                .createName("张")
//                        .chargeId()
                .pageNum(1)
                .pageSize(10)
                .build();
        System.out.println(tagService.findTagsByCondition(tagCondition));*/
    }

    public static void main(String[] args) {
       /* "abc"
        "ahbgdc"*/

    }

    static class Solution {
        public boolean isSubsequence(String s, String t) {
            if(s.equals(t) || "".equals(s)){
                return true;
            }
            if("".equals(t)){
                return false;
            }
            int j = 0;
            int i = 0;
            while(j < t.length() && i < s.length() ){
                if(s.charAt(i) == t.charAt(j)){
                    i++;
                    j++;
                    continue;
                }else{
                    if(j == t.length() -1){
                        return false;
                    }
                    j++;
                }
            }

            if(i != s.length() -1){
                return false;
            }else{
                return true;
            }


        }
    }
}