package fe;

import com.google.firebase.firestore.FirebaseFirestore;
/* compiled from: CollectionReference.java */
/* loaded from: classes.dex */
public final class c extends com.google.firebase.firestore.d {
    public c(ke.p pVar, FirebaseFirestore firebaseFirestore) {
        super(he.y.a(pVar), firebaseFirestore);
        if (pVar.p() % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException("Invalid collection reference. Collection references must have an odd number of segments, but " + pVar.h() + " has " + pVar.p());
    }

    public final com.google.firebase.firestore.a q(String str) {
        if (str != null) {
            ke.p f = this.f9634a.f17581e.f(ke.p.u(str));
            if (f.p() % 2 == 0) {
                return new com.google.firebase.firestore.a(new ke.i(f), this.f9635b);
            }
            throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + f.h() + " has " + f.p());
        }
        throw new NullPointerException("Provided document path must not be null.");
    }
}
