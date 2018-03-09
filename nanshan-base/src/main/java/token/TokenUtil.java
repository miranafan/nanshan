// Copyright (C) 2018 Nanshan
// All rights reserved
package token;

/**
 * @author mirana
 * @version 1.0
 * @created 2018/3/5 上午11:11
 **/
public class TokenUtil {
    private String key = "NANSHAN";
    private int[] keyPosition = {5,7,13,17,30,37,48};
    private String[] chars = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    public String generateToken() {
        return "";
    }

    private Long RandomNum(Integer min, Integer max){
        Integer range = max - min;
        Long num = min + Math.round(Math.random() * range);
        return num;
    }
}
