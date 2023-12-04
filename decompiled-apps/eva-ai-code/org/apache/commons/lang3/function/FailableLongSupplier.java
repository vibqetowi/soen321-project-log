package org.apache.commons.lang3.function;

import java.lang.Throwable;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableLongSupplier<E extends Throwable> {
    long getAsLong() throws Throwable;
}
