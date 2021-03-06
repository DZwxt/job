package com.dw.pojo;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Data
public class TbTransactionMessage implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

    private Integer version;

    private String editor;

    private String creater;

    private Date editTime;

    private Date createTime;

    private String messageId;

    private String messageDataType;

    private String consumerQueue;

    @Setter(value = AccessLevel.PRIVATE)
    @Getter(value = AccessLevel.PRIVATE)
    private Short messageSendTimes;

    private String areadlyDead;

    private String status;

    private String remark;

    private String field1;

    private String field2;

    private String field3;

    private String messageBody;


    public void addSendTimes() {
        messageSendTimes++;
    }
}