package com.dw.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TbContentCategory implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private Long parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Boolean isParent;

    private Date created;

    private Date updated;

}