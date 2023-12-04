package io.opencensus.internal;

import io.opencensus.common.Scope;
/* loaded from: classes4.dex */
public final class NoopScope implements Scope {
    private static final Scope INSTANCE = new NoopScope();

    @Override // io.opencensus.common.Scope, io.opencensus.common.NonThrowingCloseable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    private NoopScope() {
    }

    public static Scope getInstance() {
        return INSTANCE;
    }
}
