package org.mybatis.RespDto;

import lombok.Data;
import org.mybatis.RespEnum.RespEnum;

import java.io.Serializable;

@Data
public class ResponseDto<T> implements Serializable {
    /**
     * 响应编码
     */
    private String respCode;
    /**
     * 响应编码
     */
    private String respDesc;
    /**
     * 响应体
     */
    private T respData;

    public ResponseDto() {

    }

    public ResponseDto(T respData) {
        this(RespEnum.RESP_00.getCode(),RespEnum.RESP_00.getDesc(),respData);
    }

    public ResponseDto(String respCode, String respDesc) {
        this.respCode = respCode;
        this.respDesc = respDesc;
    }

    public ResponseDto(String respCode, String respDesc, T respData) {
        this.respCode = respCode;
        this.respDesc = respDesc;
        this.respData = respData;
    }

    public ResponseDto(RespEnum respEnum, T respData) {
        this.respCode = respEnum.getCode();
        this.respDesc = respEnum.getDesc();
        this.respData = respData;
    }

}
