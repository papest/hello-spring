package ru.papest.hellospring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
class PostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.printf("Hello, I'm postProcessBeforeInitialization with %s %s!\n", beanName, bean);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.printf("Hello, I'm postProcessAfterInitialization with %s %s!\n", beanName, bean);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}

