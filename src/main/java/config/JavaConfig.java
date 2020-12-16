package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"model","data"})
public class JavaConfig {
//    @Bean(name = "cameraRoll")
//    public CameraRoll cameraRoll() {
//        return new ColorCameraRoll() ;
//    }

}
