package com.google.api.client.util;
/* loaded from: classes7.dex */
public final class Joiner {
    private final com.google.common.base.Joiner wrapped;

    public static Joiner on(char c) {
        return new Joiner(com.google.common.base.Joiner.on(c));
    }

    private Joiner(com.google.common.base.Joiner joiner) {
        this.wrapped = joiner;
    }

    public final String join(Iterable<?> iterable) {
        return this.wrapped.join((Iterable<? extends Object>) iterable);
    }
}
