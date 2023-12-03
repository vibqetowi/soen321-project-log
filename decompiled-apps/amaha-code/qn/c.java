package qn;

import android.os.Bundle;
import c4.p;
import c4.t;
import c4.u;
import c4.z;
import com.android.billingclient.api.Purchase;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.network.model.SubscriptionRegistrationModel;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.r;
import ta.v;
/* compiled from: MonetizationRepository.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f29931a = LogHelper.INSTANCE.makeLogTag("MonetizationRepository");

    /* compiled from: MonetizationRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c4.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<List<c4.h>> f29932a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f29933b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.work.k f29934c;

        /* compiled from: MonetizationRepository.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.monetization.viewModel.MonetizationRepository$fetchProductData$2$1$onBillingSetupFinished$1", f = "MonetizationRepository.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m = "invokeSuspend")
        /* renamed from: qn.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0506a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f29935u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ArrayList<String> f29936v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ androidx.work.k f29937w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.j<List<c4.h>> f29938x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0506a(ArrayList<String> arrayList, androidx.work.k kVar, kotlinx.coroutines.j<? super List<c4.h>> jVar, ls.d<? super C0506a> dVar) {
                super(2, dVar);
                this.f29936v = arrayList;
                this.f29937w = kVar;
                this.f29938x = jVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0506a(this.f29936v, this.f29937w, this.f29938x, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((C0506a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f29935u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> it = this.f29936v.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        p.b.a aVar2 = new p.b.a();
                        aVar2.f4946a = next;
                        aVar2.f4947b = "subs";
                        if (next != null) {
                            arrayList.add(new p.b(aVar2));
                        } else {
                            throw new IllegalArgumentException("Product id must be provided.");
                        }
                    }
                    p.a aVar3 = new p.a();
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        boolean z10 = false;
                        boolean z11 = false;
                        while (it2.hasNext()) {
                            p.b bVar = (p.b) it2.next();
                            z10 |= bVar.f4945b.equals("inapp");
                            z11 |= bVar.f4945b.equals("subs");
                        }
                        if (z10 && z11) {
                            throw new IllegalArgumentException("All products should be of the same product type.");
                        }
                        aVar3.f4943a = oa.q.v(arrayList);
                        c4.p pVar = new c4.p(aVar3);
                        this.f29935u = 1;
                        r rVar = new r(null);
                        c4.b bVar2 = new c4.b(rVar);
                        c4.a aVar4 = (c4.a) this.f29937w;
                        if (!aVar4.D()) {
                            bVar2.a(z.f4977h, new ArrayList());
                        } else if (!aVar4.f4893p) {
                            oa.i.f("BillingClient", "Querying product details is not supported.");
                            bVar2.a(z.f4983n, new ArrayList());
                        } else if (aVar4.H(new t(3, aVar4, pVar, bVar2), 30000L, new u(2, bVar2), aVar4.E()) == null) {
                            bVar2.a(aVar4.G(), new ArrayList());
                        }
                        obj = rVar.x(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        throw new IllegalArgumentException("Product list cannot be empty.");
                    }
                }
                c4.j jVar = (c4.j) obj;
                int i10 = jVar.f4936a.f4918a;
                kotlinx.coroutines.j<List<c4.h>> jVar2 = this.f29938x;
                if (i10 == 0) {
                    if (jVar2.a()) {
                        jVar2.resumeWith(jVar.f4937b);
                    }
                } else if (jVar2.a()) {
                    jVar2.resumeWith(null);
                }
                return hs.k.f19476a;
            }
        }

        public a(kotlinx.coroutines.k kVar, ArrayList arrayList, c4.a aVar) {
            this.f29932a = kVar;
            this.f29933b = arrayList;
            this.f29934c = aVar;
        }

        @Override // c4.e
        public final void a(c4.g p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            int i6 = p02.f4918a;
            kotlinx.coroutines.j<List<c4.h>> jVar = this.f29932a;
            if (i6 == 0) {
                v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new C0506a(this.f29933b, this.f29934c, jVar, null), 3);
            } else if (jVar.a()) {
                jVar.resumeWith(null);
            }
        }

        @Override // c4.e
        public final void b() {
            kotlinx.coroutines.j<List<c4.h>> jVar = this.f29932a;
            if (jVar.a()) {
                jVar.resumeWith(null);
            }
        }
    }

    /* compiled from: MonetizationRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c4.o {

        /* renamed from: u  reason: collision with root package name */
        public static final b f29939u = new b();

        @Override // c4.o
        public final void i(c4.g gVar, List<Purchase> list) {
            kotlin.jvm.internal.i.g(gVar, "<anonymous parameter 0>");
            LogHelper.INSTANCE.d(PaymentUtils.INSTANCE.getTAG(), "purchase updated");
        }
    }

    /* compiled from: MonetizationRepository.kt */
    /* renamed from: qn.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0507c implements CustomRetrofitCallback<sf.m> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f29941v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Bundle f29942w;

        public C0507c(ls.h hVar, Bundle bundle) {
            this.f29941v = hVar;
            this.f29942w = bundle;
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(dw.b<sf.m> call, Throwable t3) {
            kotlin.jvm.internal.i.g(call, "call");
            kotlin.jvm.internal.i.g(t3, "t");
            LogHelper.INSTANCE.e(c.this.f29931a, "request onFailure");
            this.f29941v.resumeWith(Boolean.FALSE);
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
            boolean z10;
            kotlin.jvm.internal.i.g(call, "call");
            kotlin.jvm.internal.i.g(response, "response");
            sf.m mVar = response.f13696b;
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            if (response.a()) {
                try {
                    Bundle bundle = this.f29942w;
                    if (bundle != null) {
                        if (String.valueOf(mVar).length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            bundle.putString("serverResponse", String.valueOf(mVar));
                        }
                        gk.a.b(bundle, "premuim_buy_success");
                    }
                    this.f29941v.resumeWith(Boolean.TRUE);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(c.this.f29931a, e10);
                }
            }
        }
    }

    public static Object a(ArrayList arrayList, ls.d dVar) {
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        c4.a aVar = new c4.a(true, MyApplication.V.a(), b.f29939u);
        aVar.C(new a(kVar, arrayList, aVar));
        return kVar.s();
    }

    public final Object b(String str, String str2, Bundle bundle, ls.d<? super Boolean> dVar) {
        boolean z10;
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            boolean z11 = false;
            if (str2.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (str.length() > 0) {
                    z11 = true;
                }
                if (z11) {
                    String a10 = FirebaseAuth.getInstance().a();
                    kotlin.jvm.internal.i.d(a10);
                    ((or.e) nr.b.a(or.e.class)).d("https://nitro.theinnerhour.com/subscriptions", new SubscriptionRegistrationModel(str, str2, a10, "wt!K+8vautRF0t0")).I(new C0507c(hVar, bundle));
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f29931a, e10);
        }
        return hVar.b();
    }
}
