package org.checkerframework.checker.units.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UnitsMultiple(prefix = Prefix.milli, quantity = m.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({Length.class})
/* loaded from: classes5.dex */
public @interface mm {
}
