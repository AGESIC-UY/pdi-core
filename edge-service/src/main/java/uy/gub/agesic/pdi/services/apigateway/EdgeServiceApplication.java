package uy.gub.agesic.pdi.services.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import uy.gub.agesic.pdi.services.apigateway.filters.PDIPreFilter;

@SpringBootApplication(
		scanBasePackages = {"uy.gub.agesic.pdi.services", "uy.gub.agesic.pdi.common"}
)
@EnableZuulProxy
@EnableEurekaClient
@EnableAspectJAutoProxy
public class EdgeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServiceApplication.class, args);
	}

	@Bean
	public PDIPreFilter pdiPreFilter() {
		return new PDIPreFilter();
	}
}
