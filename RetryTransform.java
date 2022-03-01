package assignmentweek6.day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryTransform implements IAnnotationTransformer
{
	@SuppressWarnings("rawtypes")
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) 
		  {
		    annotation.setRetryAnalyzer( assignmentweek6.day2.RetryListener.class);
		  }
}