package com.xiaoshu.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.DeviceMapper;
import com.xiaoshu.entity.Device;
import com.xiaoshu.entity.DeviceVo;

@Service
public class DeviceService {

	@Autowired
	private DeviceMapper dm;
	
	public PageInfo<DeviceVo> findList(DeviceVo dv,Integer pageNum,Integer pageSize)
	{
		PageHelper.startPage(pageNum, pageSize);
		List<DeviceVo> dlist=dm.findList(dv);
 		return new PageInfo<>(dlist);
	}
	public  Device findByName(String name)
	{
		Device d=new Device();
		d.setDevicename(name);
		return dm.selectOne(d);
	}
	public void updateDevice(Device device)
	{
		device.setCreatetime(new Date());
		dm.updateByPrimaryKey(device);
	}
	public void addDevice(Device device)
	{
		device.setCreatetime(new Date());
		dm.insert(device);
	}
	public void delDevice(Integer id)
	{
		dm.deleteByPrimaryKey(id);
	}
	public List<DeviceVo> findList(DeviceVo dv)
	{
		return dm.findList(dv);
	}
}
