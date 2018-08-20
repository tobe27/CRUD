package utils;

import java.io.Serializable;

/**
 * json数据返回值工具类
 */
public class Result implements Serializable {
    private static final long serialVersionUID = -3948389268046368059L;
    private Integer code; //http状态码
    private String msg; //返回值信息
    private Object data; //对象

    public Result(){}

    public Result(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    //返回成功码
    public static Result success(){
        Result result =new Result();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }
    public static Result success(Object data){
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    //返回失败码
    public static Result failure(ResultCode resultCode){
        Result result = new Result();
        result.setResultCode(resultCode);
        return result;
    }
    public static Result failure(ResultCode resultCode,Object data){
        Result result = new Result();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }


    public void setResultCode(ResultCode resultCode){
        this.code = resultCode.code();
        this.msg = resultCode.message();

    }

//    getter and setter
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
