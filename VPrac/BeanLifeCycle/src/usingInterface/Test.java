package usingInterface;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean, DisposableBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init method has been invoked");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destory method has been invoked");

	}
}
