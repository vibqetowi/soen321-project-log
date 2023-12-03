package rc;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DirectExecutor.java */
/* loaded from: classes.dex */
public final class a implements Executor {

    /* renamed from: u  reason: collision with root package name */
    public static final a f30653u;

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ a[] f30654v;

    static {
        a aVar = new a();
        f30653u = aVar;
        f30654v = new a[]{aVar};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f30654v.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
