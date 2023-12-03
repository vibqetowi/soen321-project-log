package x2;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DirectExecutor.java */
/* loaded from: classes.dex */
public final class b implements Executor {

    /* renamed from: u  reason: collision with root package name */
    public static final b f37604u;

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ b[] f37605v;

    static {
        b bVar = new b();
        f37604u = bVar;
        f37605v = new b[]{bVar};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f37605v.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
