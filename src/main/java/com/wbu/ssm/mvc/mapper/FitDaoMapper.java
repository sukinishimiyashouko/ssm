package com.wbu.ssm.mvc.mapper;

/**
 * @auther aqing
 */
import com.wbu.ssm.mvc.bean.Fit;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
public interface FitDaoMapper {
    @Select("SELECT * FROM tb_fit")
    List<Fit> findAllFit();

    @Update("UPDATE tb_fit SET fit_qty = fit_qty-1 WHERE fit_name = #{task_item}")
    int changeQty(@Param("task_item") String task_item);


}
