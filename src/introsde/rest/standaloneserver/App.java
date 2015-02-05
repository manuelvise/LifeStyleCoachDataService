package introsde.rest.standaloneserver;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class App {

	// private static final URI BASE_URI =
	// URI.create("http://localhost:443/sde/");
	public static void main(String[] args) throws IllegalArgumentException,
			IOException, URISyntaxException {

		String protocol = "http://";
		String port = ":6901/";
		String hostname = InetAddress.getLocalHost().getHostAddress();
		if (hostname.equals("127.0.0.1")) {
			hostname = "localhost";
		}

		URI BASE_URI = new URI(protocol + hostname + port + "sde/");

		System.out.println("Starting sde standalone HTTP server...");
		JdkHttpServerFactory.createHttpServer(BASE_URI, createApp());

		initDB();

		System.out.println("Server started on " + BASE_URI
				+ "\n[kill the process to exit]");

	}

	private static void initDB() {

		

	}

	public static ResourceConfig createApp() {
		System.out.println("Starting Lifestyle coach data REST service...");
		return new MyApplicationConfig();
	}
}