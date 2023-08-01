package pt.fyld.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PessoaPageRedirect implements WebMvcConfigurer {

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/pessoa-info")
        .setViewName("forward:index.xhtml");
    registry.setOrder(Ordered.HIGHEST_PRECEDENCE);

    registry.addViewController("/api/M")
            .setViewName("forward:pessoaM.xhtml");
    registry.setOrder(Ordered.HIGHEST_PRECEDENCE);

    registry.addViewController("/api/F")
            .setViewName("forward:pessoaF.xhtml");
    registry.setOrder(Ordered.HIGHEST_PRECEDENCE);

    registry.addViewController("/template/template")
            .setViewName("forward:template.xhtml");
    registry.setOrder(Ordered.HIGHEST_PRECEDENCE);

    registry.addViewController("/template/dashboards")
            .setViewName("forward:dashboards.xhtml");
    registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
  }
}
