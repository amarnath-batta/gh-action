import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Sample {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		ProcessBuilder pbGrep = new ProcessBuilder();
		List<String> pbArguments = new ArrayList<>();
        pbGrep.command("grep -Pnr --include=*.properties demo");
        Process pgrep = pbGrep.start();
        pgrep.waitFor();
        System.out.println("Exit value is : " + pgrep.exitValue());
	}

}
