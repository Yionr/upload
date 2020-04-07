package cloud.yionr.dao;

import cloud.yionr.entity.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
    @Select("select * from student where name=#{name}")
    Student findByName(String name);
    @Select("select * from student where id=#{id}")
    Student findById(String id);
    @Select("select * from student where id like #{lastId}")
    Student findByLastId(String lastId);
}