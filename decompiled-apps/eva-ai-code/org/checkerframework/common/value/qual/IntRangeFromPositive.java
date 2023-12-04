package org.checkerframework.common.value.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;
@Target({})
@Documented
@Retention(RetentionPolicy.SOURCE)
@SubtypeOf({UnknownVal.class})
/* loaded from: classes5.dex */
public @interface IntRangeFromPositive {
}
