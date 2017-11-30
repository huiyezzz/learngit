package com.hand.hap.exception.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.hand.hap.exception.dto.Exception_dev;
import com.hand.hap.exception.service.IExceptionService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class ExceptionServiceImpl extends BaseServiceImpl<Exception_dev> implements IExceptionService{

}