package ne;

import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import java.io.Serializable;
import kotlinx.coroutines.o0;
import ne.b;
import tr.a;
import tr.c0;
import tr.i0;
import wn.p;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26230a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f26231b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f26232c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f26233d;

    public /* synthetic */ i(Object obj, Serializable serializable, Object obj2, int i6) {
        this.f26230a = i6;
        this.f26231b = obj;
        this.f26232c = serializable;
        this.f26233d = obj2;
    }

    @Override // ya.d
    public final void a(ya.h hVar) {
        switch (this.f26230a) {
            case 0:
                ya.h hVar2 = (ya.h) this.f26231b;
                a.AbstractC0558a abstractC0558a = (a.AbstractC0558a) this.f26233d;
                ya.h hVar3 = (ya.h) this.f26232c;
                tr.c0 c0Var = new tr.c0();
                if (hVar2.isSuccessful()) {
                    String str = (String) hVar2.getResult();
                    kc.f.A(1, "FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
                    if (str != null) {
                        c0Var.f(j.f26234c, "Bearer ".concat(str));
                    }
                } else {
                    Exception exception = hVar2.getException();
                    if (exception instanceof FirebaseApiNotAvailableException) {
                        kc.f.A(1, "FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
                    } else if (exception instanceof FirebaseNoSignedInUserException) {
                        kc.f.A(1, "FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
                    } else {
                        kc.f.A(2, "FirestoreCallCredentials", "Failed to get auth token: %s.", exception);
                        abstractC0558a.b(i0.f33485j.f(exception));
                        return;
                    }
                }
                if (hVar3.isSuccessful()) {
                    String str2 = (String) hVar3.getResult();
                    if (str2 != null && !str2.isEmpty()) {
                        kc.f.A(1, "FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                        c0Var.f(j.f26235d, str2);
                    }
                } else {
                    Exception exception2 = hVar3.getException();
                    if (exception2 instanceof FirebaseApiNotAvailableException) {
                        kc.f.A(1, "FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
                    } else {
                        kc.f.A(2, "FirestoreCallCredentials", "Failed to get AppCheck token: %s.", exception2);
                        abstractC0558a.b(i0.f33485j.f(exception2));
                        return;
                    }
                }
                abstractC0558a.a(c0Var);
                return;
            case 1:
                n nVar = (n) this.f26231b;
                tr.c[] cVarArr = (tr.c[]) this.f26232c;
                r rVar = (r) this.f26233d;
                c0.b bVar = n.f26244g;
                nVar.getClass();
                tr.c cVar = (tr.c) hVar.getResult();
                cVarArr[0] = cVar;
                k kVar = new k(nVar, rVar, cVarArr);
                tr.c0 c0Var2 = new tr.c0();
                c0Var2.f(n.f26244g, String.format("%s fire/%s grpc/", n.f26247j, "24.4.4"));
                c0Var2.f(n.f26245h, nVar.f26252e);
                c0Var2.f(n.f26246i, nVar.f26252e);
                q qVar = nVar.f;
                if (qVar != null) {
                    h hVar4 = (h) qVar;
                    re.b<pe.g> bVar2 = hVar4.f26227a;
                    if (bVar2.get() != null) {
                        re.b<mf.f> bVar3 = hVar4.f26228b;
                        if (bVar3.get() != null) {
                            int d10 = v.h.d(bVar2.get().b());
                            if (d10 != 0) {
                                c0Var2.f(h.f26225d, Integer.toString(d10));
                            }
                            c0Var2.f(h.f26226e, bVar3.get().a());
                            sc.f fVar = hVar4.f26229c;
                            if (fVar != null) {
                                String str3 = fVar.f31445b;
                                if (str3.length() != 0) {
                                    c0Var2.f(h.f, str3);
                                }
                            }
                        }
                    }
                }
                cVar.e(kVar, c0Var2);
                b.c cVar2 = (b.c) rVar;
                cVar2.getClass();
                cVar2.f26176a.a(new je.o(2, cVar2));
                cVarArr[0].c(1);
                return;
            default:
                wn.t tVar = (wn.t) this.f26231b;
                String str4 = (String) this.f26232c;
                MultiTrackerModel multiTrackerModel = (MultiTrackerModel) this.f26233d;
                if (hVar.isSuccessful()) {
                    ta.v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new p.a(multiTrackerModel, tVar, str4, null), 3);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ i(ya.h hVar, a.AbstractC0558a abstractC0558a, ya.h hVar2) {
        this.f26230a = 0;
        this.f26231b = hVar;
        this.f26233d = abstractC0558a;
        this.f26232c = hVar2;
    }
}
