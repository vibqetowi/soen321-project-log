package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
public final class c1 implements ThreadFactory {

    /* renamed from: u  reason: collision with root package name */
    public final ThreadFactory f8317u = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f8317u.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
