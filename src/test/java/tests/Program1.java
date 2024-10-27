package tests;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Program1
{
	@Test
	public void method()
	{
		List<String> names=Arrays.asList("kalam","bros","steave","sisters","ratan");
		List<String> result=names.stream().sorted().collect(Collectors.toList());
        System.out.println("Output: "+result);
	}
}
