package com.dw.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TbCategory implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

    private String name;

    private Integer sortOrder;

    private Date created;

    private Date updated;

}