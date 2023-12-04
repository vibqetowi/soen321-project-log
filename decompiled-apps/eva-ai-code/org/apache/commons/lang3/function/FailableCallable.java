package org.apache.commons.lang3.function;

import java.lang.Throwable;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableCallable<R, E extends Throwable> {
    R call() throws Throwable;
}
