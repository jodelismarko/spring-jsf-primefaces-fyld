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

    registry.addViewController("/M")
            .setViewName("forward:pessoaM.xhtml");
    registry.setOrder(Ordered.HIGHEST_PRECEDENCE);

    registry.addViewController("/F")
            .setViewName("forward:pessoaF.xhtml");
    registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
  }
}
