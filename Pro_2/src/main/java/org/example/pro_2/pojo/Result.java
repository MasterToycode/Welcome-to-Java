package org.example.pro_2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result <T>{
    private Integer code;//业务返回状态码，0表示yes 1表示失败
    private String message;
    private T data;//响应数据

    public static <E> Result<E> success(E data){
        return new Result<>(0,"操作成功",data);
    }//返回操作成功的相应结果

    public static Result success(){
        return new Result(0,"操作成功",null);
    }

    public static Result error(String message){
        return new Result(1,message,null);
    }

}
