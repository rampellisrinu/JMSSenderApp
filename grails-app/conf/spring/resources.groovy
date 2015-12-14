import org.apache.activemq.spring.ActiveMQConnectionFactory
import org.springframework.jms.connection.SingleConnectionFactory

// Place your Spring DSL code here
beans = {
    jmsConnectionFactory(SingleConnectionFactory) {
        targetConnectionFactory = { ActiveMQConnectionFactory cf ->
            brokerURL = "tcp://localhost:61616"
        }
    }
}
