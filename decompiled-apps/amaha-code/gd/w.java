package gd;

import android.os.Looper;
import com.google.android.gms.internal.p000firebaseauthapi.m6;
import java.util.concurrent.Executor;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class w implements Executor {

    /* renamed from: v  reason: collision with root package name */
    public static final w f16450v = new w();

    /* renamed from: u  reason: collision with root package name */
    public final m6 f16451u = new m6(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f16451u.post(runnable);
    }
}
