package gd.gz.highlight_spring4.ch1.javaconfig;

public class UseFunctionService {
	public FunctionService getFunctionService() {
		return functionService;
	}

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}

	FunctionService functionService;

	public String sayHello(String word) {
		return functionService.sayHello(word);
	}

}
