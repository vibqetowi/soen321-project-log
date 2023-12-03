package kotlinx.coroutines.sync;

import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: Mutex.kt */
/* loaded from: classes2.dex */
public final class d extends k implements l<Throwable, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f23694u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f23695v = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar) {
        super(1);
        this.f23694u = cVar;
    }

    @Override // ss.l
    public final hs.k invoke(Throwable th2) {
        this.f23694u.a(this.f23695v);
        return hs.k.f19476a;
    }
}
