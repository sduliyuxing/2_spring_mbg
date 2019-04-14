package bao1.map;

import bao1.bean.book;
import bao1.bean.bookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface bookMapper {
    long countByExample(bookExample example);

    int deleteByExample(bookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(book record);

    int insertSelective(book record);

    List<book> selectByExample(bookExample example);

    book selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") book record, @Param("example") bookExample example);

    int updateByExample(@Param("record") book record, @Param("example") bookExample example);

    int updateByPrimaryKeySelective(book record);

    int updateByPrimaryKey(book record);
}