package cn.zskxt.dao;

import cn.zskxt.entity.zsk_book_content;
import java.util.List;

public interface zsk_book_contentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zsk_book_content
     *
     * @mbggenerated Thu Oct 17 10:07:54 CST 2019
     */
    int insert(zsk_book_content record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zsk_book_content
     *
     * @mbggenerated Thu Oct 17 10:07:54 CST 2019
     */
    List<zsk_book_content> selectAll();
}