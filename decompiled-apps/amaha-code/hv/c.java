package hv;

import kotlinx.coroutines.j;
import kotlinx.coroutines.k;
/* compiled from: Runnable.kt */
/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f19599u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f19600v;

    public c(k kVar, e eVar) {
        this.f19599u = kVar;
        this.f19600v = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19599u.k(this.f19600v, hs.k.f19476a);
    }
}
