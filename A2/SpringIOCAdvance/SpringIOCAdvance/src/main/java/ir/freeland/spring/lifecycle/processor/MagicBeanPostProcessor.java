package ir.freeland.spring.lifecycle.processor;

import org.springframework.beans.factory.config.BeanPostProcessor;

import ir.freeland.spring.lifecycle.beans.Character;
public class MagicBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof Character) {
            System.out.println("BeanPostProcessor: Adding a touch of magic to " + ((Character) bean).getName());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof Character) {
            System.out.println("BeanPostProcessor: Magic continues for " + ((Character) bean).getName());
        }
        return bean;
    }
}
