package com.dw.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TbCategorySecondary implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private String cid;

    private Long parentId;

    private String name;

    private String url;

    private Integer status;

    private Integer sortOrder;

    private Boolean isParent;

    private Date created;

    private Date updated;

}