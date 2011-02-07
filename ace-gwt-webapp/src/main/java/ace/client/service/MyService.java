package ace.client.service;

import com.google.gwt.user.client.rpc.RemoteService;

public interface MyService extends RemoteService {

	String echo( String value );
	
	/**
	 * test exception serialization 
	 * 
	 * @throws Exception
	 */
	void raiseException() throws Exception;
}
