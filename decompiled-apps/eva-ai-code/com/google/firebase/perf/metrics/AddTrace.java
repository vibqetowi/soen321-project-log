package com.google.firebase.perf.metrics;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes7.dex */
public @interface AddTrace {
    boolean enabled() default true;

    String name();
}
