package Retry_Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class My_Transformer implements IAnnotationTransformer
{
	public void transform(ITestAnnotation annotation, Class test_Class, Constructor test_Constructor, Method test_Method)
	{
		 annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}
}
