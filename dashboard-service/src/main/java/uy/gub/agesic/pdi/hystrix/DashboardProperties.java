package uy.gub.agesic.pdi.hystrix;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@RefreshScope
public class DashboardProperties implements Serializable {

    @Value("${spring.boot.admin.client.metadata.user.name:admin}")
    private String user;

    @Value("${spring.boot.admin.client.metadata.user.password:admin}")
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}