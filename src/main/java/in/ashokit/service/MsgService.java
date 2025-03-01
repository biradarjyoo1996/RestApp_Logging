package in.ashokit.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

@Service
public class MsgService {
	
	private static final Logger logger = LoggerFactory.getLogger(MsgService.class);
	
	public String getMsg()
	{
		logger.info("getMsg()started....");
		String msg="Hi jyoti Good Morning";
		logger.info("getMsg()ended....");
		return msg;
	}

}
