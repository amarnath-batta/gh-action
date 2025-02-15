package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SampleClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		ProcessBuilder pbGrep = new ProcessBuilder();
		List<String> pbArguments = new ArrayList<>();

        pbArguments.add("grep");
        pbArguments.add(" -Pnr ");
        pbArguments.add(" --include=*.properties ");
        pbArguments.add(" (?i)^.*(password|pwd|passwd)\\\\s*[=:]\\\\s*(?!cyberark|false)\\\\S+\\r?$");
        pbGrep.command(pbArguments);
        Process pgrep = pbGrep.start();
        pgrep.waitFor();
        System.out.println("Exit value is : " + pgrep.exitValue());
	}

	
	public int add(int a, int b) {
		return a + b;
	}

}
