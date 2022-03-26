package com.example.glassfishservletejb;

import javax.ejb.Local;

@Local
public interface Hello {
    public String sayHello();
}
