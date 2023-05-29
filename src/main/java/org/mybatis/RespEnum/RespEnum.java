package org.mybatis.RespEnum;

/**
 * @Author  carl
 * @Description 通用响应编码枚举常量
 */
public enum RespEnum {
    RESP_500("500","请求失败"),
    RESP_00("00","请求成功");

    private String code;
    private String desc;

    RespEnum(String code,String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String Desc){
        this.desc = desc;
    }

    public Object value() {
        return null;
    }
}
