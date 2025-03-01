package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.MsgService;

@RestController
public class RMsgController {
	
	@Autowired
	private MsgService msgservice;
	
	@GetMapping("/Morning")
	public String getdata()
	{
		  return msgservice.getMsg();
	}

}
