package com.springmvc.config;

import org.springframework.web.servlet.support.
        AbstractAnnotationConfigDispatcherServletInitializer;
// any class which extends AbstractAnnotationConfigDispatcherServletInitializer will be used to configure 
//the DispatcherServlet and the application context
public class AppInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { RootConfig.class };
    }

    //When the DispatcherServlet starts up, it creates Spring application context 
    //and starts loading it with beans declared in the WebConfig
    //class which is defined by the getServletConfigClasses() method.
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() { // The method getServletMappings() identifies the path where the DispatcherServlet will be mapped to.
        return new String[] { "/" };
    }
}
