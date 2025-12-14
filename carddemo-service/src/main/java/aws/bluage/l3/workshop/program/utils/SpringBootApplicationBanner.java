package aws.bluage.l3.workshop.program.utils;

import java.io.PrintStream;
import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

public class SpringBootApplicationBanner implements Banner {

	private String programName;
	
	public SpringBootApplicationBanner(String programName) {
		this.programName = programName;
	}
	
	@Override
	public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
		out.println("    ____  __                          _    __     __           _ __       ");
		out.println("   / __ )/ /_  ______ _____ ____     | |  / /__  / /___  _____(_) /___  __");
		out.println("  / __  / / / / / __ `/ __ `/ _ \\    | | / / _ \\/ / __ \\/ ___/ / __/ / / /");
		out.println(" / /_/ / / /_/ / /_/ / /_/ /  __/    | |/ /  __/ / /_/ / /__/ / /_/ /_/ / ");
		out.println("/_____/_/\\__,_/\\__,_/\\__, /\\___/     |___/\\___/_/\\____/\\___/_/\\__/\\__, /  ");
		out.println("                    /____/                                       /____/   ");
		out.println(">>> program : " + programName + " >>> thread id : " + Thread.currentThread().getId() + " >>>");
		out.println("");
	}

}
