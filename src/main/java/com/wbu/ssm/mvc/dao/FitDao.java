package com.wbu.ssm.mvc.dao;

/**
 * @auther aqing
 */
import com.wbu.ssm.mvc.bean.Fit;
import com.wbu.ssm.mvc.mapper.FitDaoMapper;
import com.wbu.ssm.mvc.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FitDao implements FitDaoMapper {
    @Test
    @Override
    public List<Fit> findAllFit() {
        SqlSession sqlSession = SqlSessionUtil.getSession();
        FitDaoMapper mapper = sqlSession.getMapper(FitDaoMapper.class);
        List<Fit> allFit = mapper.findAllFit();
//        allFit.forEach(fit -> System.out.println(fit));
        System.out.println(allFit);
        return allFit;
    }

    @Test@Override
    public int changeQty(String task_item) {
        SqlSession sqlSession = SqlSessionUtil.getSession();
        FitDaoMapper mapper = sqlSession.getMapper(FitDaoMapper.class);
        int changeQty = mapper.changeQty(task_item);
        System.out.println(changeQty);
        return changeQty;
    }
}
