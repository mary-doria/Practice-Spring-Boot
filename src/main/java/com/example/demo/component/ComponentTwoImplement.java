package com.example.demo.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency {
    @Override
    public void saludar(){
        System.out.println("Hola Mundo desdde mi componente 2");
    }
}
