package org.checkerframework.checker.calledmethods.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.PostconditionAnnotation;
import org.checkerframework.framework.qual.QualifierArgument;
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@PostconditionAnnotation(qualifier = CalledMethods.class)
/* loaded from: classes5.dex */
public @interface EnsuresCalledMethods {
    @QualifierArgument("value")
    String[] methods();

    String[] value();
}
