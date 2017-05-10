package com.neusoft.user.util;

import com.alibaba.fastjson.JSON;
import com.system.consts.OperationFinal;

/**
 * Created by xiyem on 2017/3/23.
 */
public class ResultMsg {

    private int error_code;
    private String result;
    private static long userid;

    private static ResultMsg resultMsg;

    public ResultMsg() {
    }

    public ResultMsg(int error_code, String result) {
        this.error_code = error_code;
        this.result = result;
    }

    public static long getUserid() {
        return userid;
    }

    public static void setUserid(long userid) {
        ResultMsg.userid = userid;
    }

    /**
     * 获取成功类型
     * @return String JSON串
     */
    public static String getOk(){
        resultMsg = new ResultMsg();
        resultMsg.setError_code(OperationFinal.OPERATION_OK);
        resultMsg.setResult("ok");
        return resultMsg.toString();
    }

    /**
     * 获取失败类型
     * @return String JSON串
     */
    public static String getFail(){
        resultMsg = new ResultMsg();
        resultMsg.setError_code(OperationFinal.OPERATION_DATA);
        resultMsg.setResult("no");
        return resultMsg.toString();
    }

    /**
     * 获取异常类型
     * @return String JSON串
     */
    public static String getError(){
        resultMsg = new ResultMsg();
        resultMsg.setError_code(OperationFinal.OPERATION_EXCEPTION);
        resultMsg.setResult("操作异常！");
        return resultMsg.toString();
    }

    /**
     * 获取异常类型 用户密码格斯不正确异常
     * @return String JSON串
     */
    public static String getErrorName(){
        resultMsg = new ResultMsg();
        resultMsg.setError_code(OperationFinal.OPERATION_DATA);
        resultMsg.setResult("操作异常:请检查您的用户名、密码、昵称格式是否正确");
        return resultMsg.toString();
    }

    /**
     * 获取异常类型 用户密码格斯不正确异常
     * @return String JSON串
     */
    public static String getErrorTel(){
        resultMsg = new ResultMsg();
        resultMsg.setError_code(OperationFinal.OPERATION_EXCEPTION);
        resultMsg.setResult("操作异常:请检查您的邮箱或电话格式是否正确");
        return resultMsg.toString();
    }

    /**
     * 获取异常类型 用户名已存在异常
     * @return String JSON串
     */
    public static String getErrorBe(){
        resultMsg = new ResultMsg();
        resultMsg.setError_code(OperationFinal.OPERATION_EXCEPTION);
        resultMsg.setResult("操作异常:用户名已存在！");
        return resultMsg.toString();
    }
    
    /**
     * 获取异常类型对象为空
     * @return String JSON串
     */
    public static String getErrorNull(){
        resultMsg = new ResultMsg();
        resultMsg.setError_code(OperationFinal.OPERATION_EXCEPTION);
        resultMsg.setResult("操作异常:值不允许为空！");
        return resultMsg.toString();
    }

    public static ResultMsg getResultMsg() {
        if(resultMsg == null){
            resultMsg = new ResultMsg();
            resultMsg.setError_code(OperationFinal.OPERATION_EXCEPTION);
            resultMsg.setResult("操作异常！");
            return resultMsg;
        }
        return resultMsg;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
