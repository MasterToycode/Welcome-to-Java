package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



//newProxyInstance(ClassLoader loader,
//                 Class<?>[] interfaces,
//                 InvocationHandler h)
//  指定类加载器
//指定生成的代理长什么样子
//指定生成的代理的作用
public class ProxyUtil {
    public static Star_proxy create_proxy(Star big_star){
        Object o = Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),

                new Class[]{Star_proxy.class},
                new InvocationHandler() {
                    @Override
                    //代理对象做的事情，在这里书写！！
                    //invoke是一个回调方法

                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("sing".equals(method.getName())){
                            System.out.println("To prepare money and Mycroft");
                        }
                        else if ("dance".equals(method.getName())){
                            System.out.println("To prepare money and playground");
                        }
                            return method.invoke(big_star,args);
                    }
                });


        return (Star_proxy) o;
    }
}
