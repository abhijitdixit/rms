package com.rms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rms.entity.Group;
import com.rms.repository.GroupRepository;
import com.rms.vo.GroupVO;

@Service("groupService")
public class GroupService {
	
	@Resource
	GroupRepository groupRepository;
	
	public List<GroupVO> getGroupVOList(){
		List<Group> groupList = groupRepository.findAll();
		List<GroupVO> groupVOList = Group.toVOList(groupList);
		return groupVOList;
	}

}
