package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.j;
/* compiled from: LifecycleService.java */
/* loaded from: classes.dex */
public class s extends Service implements p {

    /* renamed from: u  reason: collision with root package name */
    public final j0 f2463u = new j0(this);

    @Override // androidx.lifecycle.p
    public final j getLifecycle() {
        return this.f2463u.f2426a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.f2463u.a(j.b.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f2463u.a(j.b.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        j.b bVar = j.b.ON_STOP;
        j0 j0Var = this.f2463u;
        j0Var.a(bVar);
        j0Var.a(j.b.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i6) {
        this.f2463u.a(j.b.ON_START);
        super.onStart(intent, i6);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i6, int i10) {
        return super.onStartCommand(intent, i6, i10);
    }
}
