package org.apache.commons.lang3.builder;
@FunctionalInterface
/* loaded from: classes5.dex */
public interface Diffable<T> {
    DiffResult<T> diff(T t);
}
