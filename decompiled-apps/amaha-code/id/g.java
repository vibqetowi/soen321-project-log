package id;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FirebaseExecutors.java */
/* loaded from: classes.dex */
public final class g implements Executor {

    /* renamed from: u  reason: collision with root package name */
    public static final g f19977u;

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ g[] f19978v;

    static {
        g gVar = new g();
        f19977u = gVar;
        f19978v = new g[]{gVar};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f19978v.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
