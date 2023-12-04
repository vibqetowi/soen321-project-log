package io.grpc.netty.shaded.io.netty.util.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes4.dex */
public @interface SuppressJava6Requirement {
    String reason();
}
