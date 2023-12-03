package kv;

import java.util.concurrent.Executor;
/* compiled from: Tasks.kt */
/* loaded from: classes2.dex */
public final class a implements Executor {

    /* renamed from: u  reason: collision with root package name */
    public static final a f23957u = new a();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
