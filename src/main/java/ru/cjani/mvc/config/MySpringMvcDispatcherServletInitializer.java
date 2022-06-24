package ru.cjani.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// большая часть конфига уже реализована командой Spring, поэтому,
// чтобы не париться используем абстракный класс, а не имплементируем интерфейс
public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //пока хз
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    // даем понять какой класс у нас является конфигурацией для Spring
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};
    }

    //настройка dispatcherServlet
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
