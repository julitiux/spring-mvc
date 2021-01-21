package mx.com

import mx.com.config.WebConfig
import org.springframework.web.WebApplicationInitializer
import org.springframework.web.context.ContextLoaderListener
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext
import org.springframework.web.servlet.DispatcherServlet

import javax.servlet.ServletContext
import javax.servlet.ServletException
import javax.servlet.ServletRegistration

class ApplicationInitializer implements WebApplicationInitializer {

  @Override
  void onStartup(ServletContext servletContext) throws ServletException {

    System.out.println("Initializing Application for " + servletContext.getServerInfo())

    AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext()
    rootContext.register(WebConfig)
    //rootContext.register(ApiBannerWebConfig.class, ApiBannerServiceConfig.class, ApiBannerDataSourceConfig.class)
    servletContext.addListener(new ContextLoaderListener(rootContext))

    AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext()
    ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(dispatcherContext))
    dispatcher.setLoadOnStartup(1)
    dispatcher.addMapping("/")
  }
}

