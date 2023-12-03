package yi;

import android.content.Context;
import com.moengage.core.internal.exception.NetworkRequestDisabledException;
import ih.p;
import is.u;
import java.util.ArrayList;
import java.util.Iterator;
import mi.h1;
import mi.i1;
import vi.o;
/* compiled from: AppOpenHandler.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38626a;

    /* renamed from: b  reason: collision with root package name */
    public final p f38627b;

    /* renamed from: c  reason: collision with root package name */
    public final String f38628c = "InApp_6.5.0_AppOpenJob";

    /* renamed from: d  reason: collision with root package name */
    public final o f38629d;

    /* renamed from: e  reason: collision with root package name */
    public final h1 f38630e;

    /* compiled from: AppOpenHandler.kt */
    /* renamed from: yi.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0654a extends kotlin.jvm.internal.k implements ss.a<String> {
        public C0654a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" clearHtmlAssetsCache() : clearing html assets", a.this.f38628c);
        }
    }

    /* compiled from: AppOpenHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" syncMeta() : Account or SDK Disabled.", a.this.f38628c);
        }
    }

    /* compiled from: AppOpenHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" syncMeta() : ", a.this.f38628c);
        }
    }

    public a(Context context, p pVar) {
        this.f38626a = context;
        this.f38627b = pVar;
        i1.f25206a.getClass();
        this.f38629d = i1.d(context, pVar);
        this.f38630e = i1.b(pVar);
    }

    public final void a() {
        p pVar = this.f38627b;
        hh.g.b(pVar.f20105d, 0, new C0654a(), 3);
        ArrayList k10 = df.b.k(this.f38629d.f());
        ArrayList arrayList = new ArrayList();
        Iterator it = k10.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            boolean z10 = true;
            if (((si.e) next).f31592d.f31580j != 1) {
                z10 = false;
            }
            if (z10) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((si.e) it2.next()).f31592d.f31572a);
        }
        new vi.c(this.f38626a, pVar).a(u.M2(arrayList2));
    }

    public final void b() {
        h1 h1Var = this.f38630e;
        p pVar = this.f38627b;
        Context context = this.f38626a;
        try {
            o oVar = this.f38629d;
            oVar.C(di.b.g(context), di.b.q(context));
            oVar.u();
            oVar.H();
            h1Var.c(context);
            i1.f25206a.getClass();
            for (ih.i iVar : i1.a(pVar).f35173e) {
                h1Var.d(context, iVar);
            }
            i1.f25206a.getClass();
            i1.a(pVar).f35173e.clear();
        } catch (Exception e10) {
            if (e10 instanceof NetworkRequestDisabledException) {
                hh.g.b(pVar.f20105d, 1, new b(), 2);
            } else {
                pVar.f20105d.a(1, e10, new c());
            }
        }
    }
}
