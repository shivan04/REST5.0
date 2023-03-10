package sr.unasat.rest50;

import sr.unasat.rest50.config.JPAConfiguration;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.Map;

@ApplicationPath("/api")
public class HelloApplication extends Application {
    @Override
    public Map<String, Object> getProperties() {
        //Map<String, Object> properties = new HashMap<String, Object>();
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("jersey.config.server.provider.packages", "sr.unasat.rest50.controller");//sr/unasat/webreserveringv02/controller
//        JPAConfiguration.getEntityManager();
        return properties;
    }


}