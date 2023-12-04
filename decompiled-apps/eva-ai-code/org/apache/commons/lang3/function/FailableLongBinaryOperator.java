package org.apache.commons.lang3.function;

import java.lang.Throwable;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface FailableLongBinaryOperator<E extends Throwable> {
    long applyAsLong(long j, long j2) throws Throwable;
}
