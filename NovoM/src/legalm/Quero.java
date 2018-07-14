package legalm;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("sdsd")
public class Quero {

	@GET
	public String sayHello() {
		return "Olá";
	}
}
