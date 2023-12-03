package v9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;
import t9.a;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class d0 implements a.InterfaceC0547a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t9.a f34877a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ya.i f34878b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f34879c;

    public d0(BasePendingResult basePendingResult, ya.i iVar, ug.l lVar) {
        this.f34877a = basePendingResult;
        this.f34878b = iVar;
        this.f34879c = lVar;
    }

    @Override // t9.a.InterfaceC0547a
    public final void a(Status status) {
        if (status.f0()) {
            t9.a aVar = this.f34877a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) aVar;
            o.j("Result has already been consumed.", !basePendingResult.f7327i);
            try {
                if (!basePendingResult.f7322c.await(0L, timeUnit)) {
                    basePendingResult.e(Status.C);
                }
            } catch (InterruptedException unused) {
                basePendingResult.e(Status.A);
            }
            o.j("Result is not ready.", basePendingResult.g());
            this.f34878b.b(this.f34879c.a(basePendingResult.j()));
            return;
        }
        this.f34878b.a(f6.b.x0(status));
    }
}
