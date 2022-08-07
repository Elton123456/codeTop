package com.jd.yibo.hash;

import java.util.*;
import java.util.stream.Collectors;

public class SingleNumberSolution_136 {
    public static final Integer SHOW_NUM_1 = 1;

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        SingleNumberSolution_136 singleNumberSolution_136 = new SingleNumberSolution_136();
        System.out.println(singleNumberSolution_136.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        // int转Integer列表
        List<Integer> numList = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        for(Integer tmp : numList){
            map.put(tmp,map.getOrDefault(tmp,0) + 1);
        }
        for (Map.Entry entry : map.entrySet()){
            if (Objects.equals(SHOW_NUM_1,entry.getValue())){
                return (int)entry.getKey();
            }
        }
        return 0;
    }
}
