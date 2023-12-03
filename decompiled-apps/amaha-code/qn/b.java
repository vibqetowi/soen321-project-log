package qn;

import android.text.TextUtils;
import c4.r;
import c4.t;
import c4.u;
import c4.z;
import com.android.billingclient.api.Purchase;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import java.util.Iterator;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: MonetizationRepository.kt */
/* loaded from: classes2.dex */
public final class b implements c4.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<Boolean> f29922a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ androidx.work.k f29923b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f29924c;

    /* compiled from: MonetizationRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.monetization.viewModel.MonetizationRepository$fetchAndActivatePendingPurchases$2$1$onBillingSetupFinished$1", f = "MonetizationRepository.kt", l = {161, 166}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public Iterator f29925u;

        /* renamed from: v  reason: collision with root package name */
        public int f29926v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ androidx.work.k f29927w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ r f29928x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c f29929y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<Boolean> f29930z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(androidx.work.k kVar, r rVar, c cVar, kotlinx.coroutines.j<? super Boolean> jVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f29927w = kVar;
            this.f29928x = rVar;
            this.f29929y = cVar;
            this.f29930z = jVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f29927w, this.f29928x, this.f29929y, this.f29930z, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ef -> B:39:0x00f2). Please submit an issue!!! */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Iterator it;
            kotlinx.coroutines.j<Boolean> jVar;
            char c10;
            ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f29926v;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        it = this.f29925u;
                        sp.b.d0(obj);
                        aVar = this;
                        kotlinx.coroutines.j<Boolean> jVar2 = aVar.f29930z;
                        if (jVar2.a()) {
                            jVar2.resumeWith(Boolean.TRUE);
                        }
                        while (it.hasNext()) {
                            Purchase purchase = (Purchase) it.next();
                            if (purchase.f5860c.optInt("purchaseState", 1) != 4) {
                                c10 = 1;
                            } else {
                                c10 = 2;
                            }
                            if (c10 == 1 && !purchase.f5860c.optBoolean("acknowledged", true)) {
                                ApplicationPersistence.getInstance().setBooleanValue(Constants.APP_RESTART_ACKNOWLEDGE_PURCHASE, false);
                                String b10 = purchase.b();
                                kotlin.jvm.internal.i.f(b10, "tt.purchaseToken");
                                Object obj2 = purchase.a().get(0);
                                kotlin.jvm.internal.i.f(obj2, "tt.products[0]");
                                aVar.f29925u = it;
                                aVar.f29926v = 2;
                                if (aVar.f29929y.b(b10, (String) obj2, null, aVar) == aVar2) {
                                    return aVar2;
                                }
                                kotlinx.coroutines.j<Boolean> jVar22 = aVar.f29930z;
                                if (jVar22.a()) {
                                }
                                while (it.hasNext()) {
                                }
                            }
                        }
                        jVar = aVar.f29930z;
                        if (jVar.a()) {
                            jVar.resumeWith(Boolean.TRUE);
                        }
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                String str = this.f29928x.f4949a;
                if (str != null) {
                    this.f29926v = 1;
                    kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(null);
                    c4.d dVar = new c4.d(rVar);
                    c4.a aVar3 = (c4.a) this.f29927w;
                    aVar3.getClass();
                    if (!aVar3.D()) {
                        c4.g gVar = z.f4977h;
                        oa.o oVar = oa.q.f27340v;
                        dVar.a(gVar, oa.b.f27315y);
                    } else if (TextUtils.isEmpty(str)) {
                        oa.i.f("BillingClient", "Please provide a valid product type.");
                        c4.g gVar2 = z.f4974d;
                        oa.o oVar2 = oa.q.f27340v;
                        dVar.a(gVar2, oa.b.f27315y);
                    } else if (aVar3.H(new t(1, aVar3, str, dVar), 30000L, new u(0, dVar), aVar3.E()) == null) {
                        c4.g G = aVar3.G();
                        oa.o oVar3 = oa.q.f27340v;
                        dVar.a(G, oa.b.f27315y);
                    }
                    obj = rVar.x(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    throw new IllegalArgumentException("Product type must be set");
                }
            }
            c4.n nVar = (c4.n) obj;
            if (nVar.f4940a.f4918a == 0) {
                it = nVar.f4941b.iterator();
                aVar = this;
                while (it.hasNext()) {
                }
                jVar = aVar.f29930z;
                if (jVar.a()) {
                }
                return hs.k.f19476a;
            }
            aVar = this;
            jVar = aVar.f29930z;
            if (jVar.a()) {
            }
            return hs.k.f19476a;
        }
    }

    public b(kotlinx.coroutines.k kVar, c4.a aVar, c cVar) {
        this.f29922a = kVar;
        this.f29923b = aVar;
        this.f29924c = cVar;
    }

    @Override // c4.e
    public final void a(c4.g p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
        if (p02.f4918a == 0) {
            r rVar = new r();
            rVar.f4949a = "subs";
            v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new a(this.f29923b, rVar, this.f29924c, this.f29922a, null), 3);
            return;
        }
        kotlinx.coroutines.j<Boolean> jVar = this.f29922a;
        if (jVar.a()) {
            jVar.resumeWith(Boolean.FALSE);
        }
    }

    @Override // c4.e
    public final void b() {
        kotlinx.coroutines.j<Boolean> jVar = this.f29922a;
        if (jVar.a()) {
            jVar.resumeWith(Boolean.FALSE);
        }
    }
}
