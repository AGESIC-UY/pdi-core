package uy.gub.agesic.pdi.hystrix;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(
		scanBasePackages = {"uy.gub.agesic.pdi.hystrix", "uy.gub.agesic.pdi.pys", "uy.gub.agesic.pdi.services", "uy.gub.agesic.pdi.common"}
)
@EnableTurbine
@EnableHystrixDashboard
@EnableEurekaClient
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAdminServer
@EnableAspectJAutoProxy
public class DashboardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashboardServiceApplication.class, args);
	}
}
