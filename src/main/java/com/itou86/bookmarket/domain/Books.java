package com.itou86.bookmarket.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>书籍记录持久化类</p>
 *
 * @author : Itou86
 * @version : 1.1.0
 * @date : 2021-06-16 20:02
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private Integer id; //书籍ID
    private String bookName; //书籍名称
    private Integer bookCounts; //书籍数量
    private String bookDetail; //书籍描述

}
