package fe;

import com.google.firebase.firestore.FirebaseFirestore;
import java.util.HashMap;
import java.util.Map;
/* compiled from: QueryDocumentSnapshot.java */
/* loaded from: classes.dex */
public final class q extends g {
    public q(FirebaseFirestore firebaseFirestore, ke.i iVar, ke.g gVar, boolean z10, boolean z11) {
        super(firebaseFirestore, iVar, gVar, z10, z11);
    }

    @Override // fe.g
    public final HashMap a() {
        boolean z10;
        HashMap a10 = super.a();
        if (a10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return a10;
    }

    @Override // fe.g
    public final <T> T d(Class<T> cls) {
        boolean z10;
        T t3 = (T) e(cls);
        if (t3 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Object in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return t3;
    }

    @Override // fe.g
    public final Object e(Class cls) {
        boolean z10;
        Object e10 = super.e(cls);
        if (e10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Object in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return e10;
    }

    public final Map<String, Object> f() {
        boolean z10;
        HashMap a10 = a();
        if (a10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return a10;
    }
}
