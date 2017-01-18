import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Defines Beans and configurations.
 *
 * @author tlmader.dev@gmail.com
 * @since 2016-11-17
 */
@Configuration
public class AppConfig extends WebMvcConfigurationSupport {

    @Bean
    ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }

    @Bean
    public HibernateJpaSessionFactoryBean createSessionFactory() {
        return new HibernateJpaSessionFactoryBean();
    }
}
