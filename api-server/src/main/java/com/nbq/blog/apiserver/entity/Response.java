package com.nbq.blog.apiserver.entity;

import java.util.Date;

public class Response {
    private String respCode;
    private String respDesc;
    private Object respData;
    private Date respDate;

    public Response() {
    }

    public Response(String respCode) {
        this.respCode = respCode;
        this.respDate = new Date();
    }

    public Response(String respCode, String respDesc) {
        this.respCode = respCode;
        this.respDesc = respDesc;
        this.respDate = new Date();
    }

    public Response(String respCode, String respDesc, Object respData) {
        this.respCode = respCode;
        this.respDesc = respDesc;
        this.respData = respData;
        this.respDate = new Date();
    }

    public Response(String respCode, String respDesc, Object respData, Date respDate) {
        this.respCode = respCode;
        this.respDesc = respDesc;
        this.respData = respData;
        this.respDate = respDate;
    }

    public static Response succ() {
        return new Response("0", "成功", (Object)null);
    }

    public static Response succ(Object respData) {
        return new Response("0", "成功", respData);
    }

    public static Response fail() {
        return new Response("-1", "失败", (Object)null);
    }

    public static Response fail(String respDesc) {
        return new Response("-1", respDesc);
    }

    public static Response fail(String respCode, String respDesc) {
        return new Response(respCode, respDesc);
    }

    public static Response fail(Object respData) {
        return new Response("-1", "失败", respData);
    }

    public static Response failBy400() {
        return new Response("400", "错误的请求", (Object)null);
    }

    public static Response failBy400(Object respData) {
        return new Response("400", "错误的请求", respData);
    }

    public static Response failBy401() {
        return new Response("401", "没有授权访问", (Object)null);
    }

    public static Response failBy401(Object respData) {
        return new Response("401", "没有授权访问", respData);
    }

    public static Response failBy403() {
        return new Response("403", "没有权限访问", (Object)null);
    }

    public static Response failBy403(Object respData) {
        return new Response("403", "没有权限访问", respData);
    }

    public static Response failBy404() {
        return new Response("404", "页面不存在", (Object)null);
    }

    public static Response failBy404(Object respData) {
        return new Response("404", "页面不存在", respData);
    }

    public static Response failBy500() {
        return new Response("500", "系统繁忙，请稍候再试", (Object)null);
    }

    public static Response failBy500(Object respData) {
        return new Response("500", "系统繁忙，请稍候再试", respData);
    }

    public String getRespCode() {
        return this.respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return this.respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public Object getRespData() {
        return this.respData;
    }

    public void setRespData(Object respData) {
        this.respData = respData;
    }

    public Date getRespDate() {
        return this.respDate;
    }

    public void setRespDate(Date respDate) {
        this.respDate = respDate;
    }
}

