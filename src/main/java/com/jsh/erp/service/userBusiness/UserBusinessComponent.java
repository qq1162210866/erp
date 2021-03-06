package com.jsh.erp.service.userBusiness;

import com.jsh.erp.constants.BusinessConstants;
import com.jsh.erp.service.ICommonQuery;
import com.jsh.erp.service.depot.DepotResource;
import com.jsh.erp.service.depot.DepotService;
import com.jsh.erp.utils.Constants;
import com.jsh.erp.utils.QueryUtils;
import com.jsh.erp.utils.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Service(value = "userBusiness_component")
@UserBusinessResource
public class UserBusinessComponent implements ICommonQuery {

    @Resource
    private UserBusinessService userBusinessService;

    @Override
    public Object selectOne(String condition)throws Exception {
        return null;
    }

    @Override
    public List<?> select(Map<String, String> map)throws Exception {
        return getUserBusinessList(map);
    }

    private List<?> getUserBusinessList(Map<String, String> map)throws Exception {
        return null;
    }

    @Override
    public Long counts(Map<String, String> map)throws Exception {
        return BusinessConstants.DEFAULT_LIST_NULL_NUMBER;
    }

    @Override
    public int insert(String beanJson, HttpServletRequest request) throws Exception {
        return userBusinessService.insertUserBusiness(beanJson, request);
    }

    @Override
    public int update(String beanJson, Long id)throws Exception {
        return userBusinessService.updateUserBusiness(beanJson, id);
    }

    @Override
    public int delete(Long id)throws Exception {
        return userBusinessService.deleteUserBusiness(id);
    }

    @Override
    public int batchDelete(String ids)throws Exception {
        return userBusinessService.batchDeleteUserBusiness(ids);
    }

    @Override
    public int checkIsNameExist(Long id, String name)throws Exception {
        return userBusinessService.checkIsNameExist(id, name);
    }

}
