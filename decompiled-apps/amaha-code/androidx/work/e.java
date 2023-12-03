package androidx.work;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DirectExecutor.kt */
/* loaded from: classes.dex */
public final class e implements Executor {

    /* renamed from: u  reason: collision with root package name */
    public static final e f3238u;

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ e[] f3239v;

    static {
        e eVar = new e();
        f3238u = eVar;
        f3239v = new e[]{eVar};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f3239v.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        kotlin.jvm.internal.i.g(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
