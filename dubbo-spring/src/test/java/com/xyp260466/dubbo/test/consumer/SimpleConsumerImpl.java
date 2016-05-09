package com.xyp260466.dubbo.test.consumer;
import com.xyp260466.dubbo.annotation.Consumer;
import com.xyp260466.dubbo.test.provider.SimpleProvider;
import org.springframework.stereotype.Service;

/**
 * Created by xyp on 16-5-9.
 */
@Service("consumer")
public class SimpleConsumerImpl implements SimpleConsumer {

    @Consumer
    private SimpleProvider simpleProvider;


    public String sayHello(String name) {
        return "hello! "+name+", SimpleProvider: "+ simpleProvider.providerMethod(name);
    }
}
