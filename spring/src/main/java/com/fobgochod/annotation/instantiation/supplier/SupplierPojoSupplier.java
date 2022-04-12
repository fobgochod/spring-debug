package com.fobgochod.annotation.instantiation.supplier;

import org.springframework.stereotype.Component;

@Component
public class SupplierPojoSupplier {

    public static SupplierPojo createObject() {
        return new SupplierPojo("zhangsan");
    }
}
