package co.pitam.ptmck.stream;

import co.pitam.ptmck.mode.Hero;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

@Slf4j
@Configuration
public class ProcessStream {

    @Bean
    public Consumer<Message<?>> processOrder(){
        return message->{
            String s = new String((byte[]) message.getPayload());
            log.info(s);
        };
    }
}
