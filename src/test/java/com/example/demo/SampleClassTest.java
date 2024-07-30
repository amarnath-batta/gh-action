package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SampleClassTest {
	
	@Test
	public void testAdd()  throws IOException, InterruptedException  {
		ProcessBuilder pbGrep = new ProcessBuilder();
		List<String> pbArguments = new ArrayList<>();
        //pbGrep.command("grep -i demo application.properties");
	pbGrep.command("ls -l");
        Process pgrep = pbGrep.start();
        pgrep.waitFor();
        System.out.println("Exit value is : " + pgrep.exitValue());
	}

}
