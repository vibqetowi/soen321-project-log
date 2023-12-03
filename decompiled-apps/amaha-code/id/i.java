package id;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UiExecutor.java */
/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: u  reason: collision with root package name */
    public static final i f19988u;

    /* renamed from: v  reason: collision with root package name */
    public static final Handler f19989v;

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ i[] f19990w;

    static {
        i iVar = new i();
        f19988u = iVar;
        f19990w = new i[]{iVar};
        f19989v = new Handler(Looper.getMainLooper());
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f19990w.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f19989v.post(runnable);
    }
}
