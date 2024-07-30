package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SampleClassTest {
	
	@Test
	public void testAdd()  throws IOException, InterruptedException  {
		ProcessBuilder pbGrep = new ProcessBuilder("grep -i demo");
		pbGrep.directory(new File("/home/runner/work/gh-action/gh-action"));
		List<String> pbArguments = new ArrayList<>();
        //pbGrep.command("grep -i demo application.properties");
	//pbGrep.command("ls -l");
        Process pgrep = pbGrep.start();
        int exitCode = pgrep.waitFor();
        System.out.println("Exit value is : " + exitCode);
	}

}
