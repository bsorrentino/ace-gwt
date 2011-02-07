package ace.server;

import ace.client.service.MyService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class MyServiceImpl extends RemoteServiceServlet implements MyService {

	public String echo(String value) {
		return value;
	}

	public void raiseException() throws Exception {
		throw new Exception( "exception test");

	}

}
