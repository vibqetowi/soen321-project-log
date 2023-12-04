package org.checkerframework.checker.signature.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({FullyQualifiedName.class, CanonicalNameOrEmpty.class, CanonicalNameOrPrimitiveType.class})
/* loaded from: classes5.dex */
public @interface CanonicalName {
}
