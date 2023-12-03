package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* compiled from: RequestDeduplicator.java */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f9788a;

    /* renamed from: b  reason: collision with root package name */
    public final t.b f9789b = new t.b();

    public z(ExecutorService executorService) {
        this.f9788a = executorService;
    }
}
