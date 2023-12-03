package q;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.internal.p000firebaseauthapi.cf;
import com.google.android.gms.internal.p000firebaseauthapi.ef;
import com.google.android.gms.internal.p000firebaseauthapi.jf;
import com.google.android.gms.internal.p000firebaseauthapi.ke;
import com.google.android.gms.internal.p000firebaseauthapi.p2;
import com.google.android.gms.internal.p000firebaseauthapi.pd;
import com.google.android.gms.internal.p000firebaseauthapi.se;
import g.x;
import gt.a0;
import j7.k;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ke.r;
import kotlin.jvm.internal.i;
import mc.n;
import mc.p;
import st.j;
import v9.o;
import vu.l;
/* compiled from: CustomTabsSession.java */
/* loaded from: classes.dex */
public final class f implements se {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f29103u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f29104v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f29105w;

    /* renamed from: x  reason: collision with root package name */
    public final Object f29106x;

    /* renamed from: y  reason: collision with root package name */
    public final Object f29107y;

    /* renamed from: z  reason: collision with root package name */
    public final Object f29108z;

    public f(x xVar, k kVar, p2 p2Var, se seVar, jf jfVar) {
        this.f29103u = 1;
        this.f29108z = xVar;
        this.f29104v = seVar;
        this.f29105w = p2Var;
        this.f29106x = jfVar;
        this.f29107y = kVar;
    }

    public final a0 a() {
        return ((st.c) this.f29104v).f31947o;
    }

    public final l b() {
        return ((st.c) this.f29104v).f31934a;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void e(String str) {
        ((se) this.f29104v).e(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void j(ke keVar) {
        List list = ((cf) keVar).f7767u.f7866u;
        Object obj = this.f29104v;
        if (list != null && !list.isEmpty()) {
            p2 p2Var = (p2) this.f29105w;
            jf jfVar = (jf) this.f29106x;
            ef efVar = (ef) list.get(0);
            k kVar = (k) this.f29107y;
            se seVar = (se) obj;
            o.h(p2Var);
            o.h(jfVar);
            o.h(efVar);
            o.h(kVar);
            o.h(seVar);
            ((com.android.volley.toolbox.a) ((x) this.f29108z).f16143v).E(kVar, new pd(kVar, p2Var, seVar, efVar, jfVar));
            return;
        }
        ((se) obj).e("No users");
    }

    public final String toString() {
        switch (this.f29103u) {
            case 5:
                return "RemoteEvent{snapshotVersion=" + ((r) this.f29104v) + ", targetChanges=" + ((Map) this.f29105w) + ", targetMismatches=" + ((Set) this.f29106x) + ", documentUpdates=" + ((Map) this.f29107y) + ", resolvedLimboDocuments=" + ((Set) this.f29108z) + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i6) {
        this.f29103u = i6;
        this.f29104v = obj;
        this.f29105w = obj2;
        this.f29106x = obj3;
        this.f29107y = obj4;
        this.f29108z = obj5;
    }

    public f(st.c components, j typeParameterResolver, hs.d delegateForDefaultTypeQualifiers) {
        this.f29103u = 6;
        i.g(components, "components");
        i.g(typeParameterResolver, "typeParameterResolver");
        i.g(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f29104v = components;
        this.f29105w = typeParameterResolver;
        this.f29106x = delegateForDefaultTypeQualifiers;
        this.f29107y = delegateForDefaultTypeQualifiers;
        this.f29108z = new ut.c(this, typeParameterResolver);
    }

    public f(Context context) {
        this.f29103u = 2;
        this.f29104v = this;
        p pVar = new p(context);
        this.f29105w = pVar;
        mc.a b10 = n.b(f6.b.E);
        this.f29106x = b10;
        mc.a b11 = n.b(new androidx.appcompat.widget.l(pVar, 29, b10));
        this.f29107y = b11;
        this.f29108z = n.b(new x(29, b11));
    }

    public f(a.b bVar, b bVar2, ComponentName componentName) {
        this.f29103u = 0;
        this.f29104v = new Object();
        this.f29105w = bVar;
        this.f29106x = bVar2;
        this.f29107y = componentName;
        this.f29108z = null;
    }
}
