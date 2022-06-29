package com.cqu.store_admin.util;

import java.io.Serializable;
//json���ݸ�ʽ����Ӧ

public class JsonResult<E> implements Serializable {
    //״̬��
    private Integer state;
    //������Ϣ
    private String message;
    //����
    private E data;


    public JsonResult() {
        super();
    }

    public JsonResult(Integer state) {
        super();
        this.state = state;
    }

    /**
     * �����쳣ʱ����
     */
    public JsonResult(Throwable e) {
        super();
        // ��ȡ�쳣�����е��쳣��Ϣ
        this.message = e.getMessage();
    }

    public JsonResult(Integer state, E data) {
        super();
        this.state = state;
        this.data = data;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
