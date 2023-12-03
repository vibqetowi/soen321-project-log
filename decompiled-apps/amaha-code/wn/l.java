package wn;

import android.os.Bundle;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.d0;
/* compiled from: MultiTrackerMigrationViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerMigrationViewModel$migrateMoodListToFirestoreWithRetryAllowance$2$1", f = "MultiTrackerMigrationViewModel.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public v f36808u;

    /* renamed from: v  reason: collision with root package name */
    public int f36809v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ k f36810w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<Boolean> f36811x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(k kVar, kotlinx.coroutines.j<? super Boolean> jVar, ls.d<? super l> dVar) {
        super(2, dVar);
        this.f36810w = kVar;
        this.f36811x = jVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new l(this.f36810w, this.f36811x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((l) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[Catch: Exception -> 0x0093, TryCatch #1 {Exception -> 0x0093, blocks: (B:18:0x0064, B:20:0x006e, B:13:0x0026, B:15:0x002b, B:26:0x0095, B:28:0x009d, B:21:0x0074, B:23:0x007a), top: B:36:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[Catch: Exception -> 0x0093, TryCatch #1 {Exception -> 0x0093, blocks: (B:18:0x0064, B:20:0x006e, B:13:0x0026, B:15:0x002b, B:26:0x0095, B:28:0x009d, B:21:0x0074, B:23:0x007a), top: B:36:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[Catch: Exception -> 0x0093, TryCatch #1 {Exception -> 0x0093, blocks: (B:18:0x0064, B:20:0x006e, B:13:0x0026, B:15:0x002b, B:26:0x0095, B:28:0x009d, B:21:0x0074, B:23:0x007a), top: B:36:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d A[Catch: Exception -> 0x0093, TRY_LEAVE, TryCatch #1 {Exception -> 0x0093, blocks: (B:18:0x0064, B:20:0x006e, B:13:0x0026, B:15:0x002b, B:26:0x0095, B:28:0x009d, B:21:0x0074, B:23:0x007a), top: B:36:0x0064 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0061 -> B:36:0x0064). Please submit an issue!!! */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Exception e10;
        l lVar;
        v vVar;
        kotlinx.coroutines.j<Boolean> jVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36809v;
        try {
        } catch (Exception e11) {
            e10 = e11;
            lVar = this;
        }
        if (i6 != 0) {
            if (i6 == 1) {
                vVar = this.f36808u;
                sp.b.d0(obj);
                Object b10 = obj;
                lVar = this;
                try {
                    kotlinx.coroutines.j<Boolean> jVar2 = lVar.f36811x;
                } catch (Exception e12) {
                    e10 = e12;
                    LogHelper.INSTANCE.e(lVar.f36810w.f36803x, e10);
                    return hs.k.f19476a;
                }
                if (((Boolean) b10).booleanValue()) {
                    vVar.f23467u++;
                    if (vVar.f23467u < 3) {
                        String str = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        bundle.putInt("retryCount", vVar.f23467u);
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle, "moodtracker_migrate_node_start");
                        k kVar2 = lVar.f36810w;
                        lVar.f36808u = vVar;
                        lVar.f36809v = 1;
                        kVar2.getClass();
                        ls.h hVar = new ls.h(ca.a.G0(lVar));
                        ta.v.H(kc.f.H(kVar2), null, 0, new o(kVar2, hVar, null), 3);
                        b10 = hVar.b();
                        if (b10 == aVar) {
                            return aVar;
                        }
                        kotlinx.coroutines.j<Boolean> jVar22 = lVar.f36811x;
                        if (((Boolean) b10).booleanValue()) {
                            if (jVar22.a()) {
                                String str2 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("retryCount", vVar.f23467u);
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(bundle2, "moodtracker_migrate_node_success");
                                jVar22.resumeWith(Boolean.TRUE);
                            }
                        }
                    }
                    jVar = lVar.f36811x;
                    if (jVar.a()) {
                        gk.a.b(null, "moodtracker_migrate_node_failure");
                        jVar.resumeWith(Boolean.FALSE);
                    }
                    return hs.k.f19476a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            vVar = new v();
            lVar = this;
            if (vVar.f23467u < 3) {
            }
            jVar = lVar.f36811x;
            if (jVar.a()) {
            }
            return hs.k.f19476a;
        }
    }
}
