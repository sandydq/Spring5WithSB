package com.sample;

import org.springframework.stereotype.Component;

@Component
public class SampleClassImpl implements SampleClass {
    @Override
    public String sampleMethod() {
        return "Inside sample method";
    }
}
