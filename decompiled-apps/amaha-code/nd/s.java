package nd;

import android.os.Bundle;
import com.google.firebase.database.core.ServerValues;
import java.util.concurrent.Callable;
/* compiled from: CrashlyticsController.java */
/* loaded from: classes.dex */
public final class s implements Callable<Void> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ long f26109u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t f26110v;

    public s(t tVar, long j10) {
        this.f26110v = tVar;
        this.f26109u = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        Bundle k10 = defpackage.c.k("fatal", 1);
        k10.putLong(ServerValues.NAME_OP_TIMESTAMP, this.f26109u);
        this.f26110v.f26121k.e(k10);
        return null;
    }
}
