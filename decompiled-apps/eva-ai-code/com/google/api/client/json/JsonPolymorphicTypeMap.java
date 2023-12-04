package com.google.api.client.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface JsonPolymorphicTypeMap {

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes7.dex */
    public @interface TypeDef {
        String key();

        Class<?> ref();
    }

    TypeDef[] typeDefinitions();
}
