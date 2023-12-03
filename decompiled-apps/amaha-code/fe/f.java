package fe;

import com.google.firebase.firestore.FirebaseFirestoreException;
import he.h0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14985a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f14986b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14987c;

    public /* synthetic */ f(Object obj, h hVar, int i6) {
        this.f14985a = i6;
        this.f14987c = obj;
        this.f14986b = hVar;
    }

    @Override // fe.h
    public final void a(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        boolean z10;
        g gVar;
        int i6 = this.f14985a;
        h hVar = this.f14986b;
        Object obj2 = this.f14987c;
        boolean z11 = true;
        switch (i6) {
            case 0:
                com.google.firebase.firestore.a aVar = (com.google.firebase.firestore.a) obj2;
                h0 h0Var = (h0) obj;
                aVar.getClass();
                if (firebaseFirestoreException != null) {
                    hVar.a(null, firebaseFirestoreException);
                    return;
                }
                if (h0Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ca.a.u0(z10, "Got event without value or error set", new Object[0]);
                if (h0Var.f17520b.size() > 1) {
                    z11 = false;
                }
                ca.a.u0(z11, "Too many documents returned on a document query", new Object[0]);
                ke.g gVar2 = h0Var.f17520b.f23278u.get(aVar.f9625a);
                if (gVar2 != null) {
                    boolean contains = h0Var.f.contains(gVar2.getKey());
                    gVar = new g(aVar.f9626b, gVar2.getKey(), gVar2, h0Var.f17523e, contains);
                } else {
                    gVar = new g(aVar.f9626b, aVar.f9625a, null, h0Var.f17523e, false);
                }
                hVar.a(gVar, null);
                return;
            default:
                com.google.firebase.firestore.d dVar = (com.google.firebase.firestore.d) obj2;
                h0 h0Var2 = (h0) obj;
                dVar.getClass();
                if (firebaseFirestoreException != null) {
                    hVar.a(null, firebaseFirestoreException);
                    return;
                }
                if (h0Var2 == null) {
                    z11 = false;
                }
                ca.a.u0(z11, "Got event without value or error set", new Object[0]);
                hVar.a(new r(dVar, h0Var2, dVar.f9635b), null);
                return;
        }
    }
}
