package com.coalvalue.employee.service;

import com.coalvalue.employee.domain.dto.ResourceGroupDto;
import com.coalvalue.employee.domain.entity.ResourceGroup;
import com.coalvalue.employee.domain.pojo.ResourceNode;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Peter Xu on 02/01/2015.
 */
public interface ResourceService extends BaseService {

    public ResourceGroup queryResGroupById(Integer id);

    public Page<ResourceGroup> queryResGroups(ResourceGroupDto resGrpDto, Pageable pageable);

    /**
     * @param resGrp
     * @param resStr comma separated String MENU/RESOURCE,resourceId,status(true,false)
     * @return
     */
    public ResourceGroup createResourceGroup(ResourceGroup resGrp, String resStr);

    public ResourceGroup updateResourceGroup(ResourceGroup resGrp, String resStr);

    public void deleteResourceGroup(Integer id);

    /**
     * menuList & buttonList contains user assigned menu & button
     * add this to indicate check status in the resource tree.
     * @param pid
     * @param resGrpId
     * @return
     */
    public ResourceNode queryResourceNodeByPID(Integer pid, Integer resGrpId);
}
