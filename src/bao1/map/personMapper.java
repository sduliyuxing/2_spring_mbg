package bao1.map;

import bao1.bean.person;
import bao1.bean.personExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface personMapper {
    long countByExample(personExample example);

    int deleteByExample(personExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(person record);

    int insertSelective(person record);

    List<person> selectByExample(personExample example);

    person selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") person record, @Param("example") personExample example);

    int updateByExample(@Param("record") person record, @Param("example") personExample example);

    int updateByPrimaryKeySelective(person record);

    int updateByPrimaryKey(person record);
}