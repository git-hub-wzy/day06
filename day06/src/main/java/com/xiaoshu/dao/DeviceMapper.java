package com.xiaoshu.dao;

import java.util.List;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Device;
import com.xiaoshu.entity.DeviceVo;

public interface DeviceMapper extends BaseMapper<Device> {

	List<DeviceVo> findList(DeviceVo dv);
}