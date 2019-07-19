package com.mqtt.mosquitto;

import com.mqtt.mosquitto.publish.PublishSample;
import com.mqtt.mosquitto.subscribe.SubscribeSample;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMosquittoApplication {

	public static void main(String[] args) throws MqttException {
		SpringApplication.run(SpringbootMosquittoApplication.class, args);
		SubscribeSample subscribeSample=new SubscribeSample();
		subscribeSample.sub();

		PublishSample publishSample=new PublishSample();
		publishSample.pub();
	}

}
