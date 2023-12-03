package fe;

import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
/* compiled from: WriteBatch.java */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final FirebaseFirestore f15020a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<le.f> f15021b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public boolean f15022c = false;

    public y(FirebaseFirestore firebaseFirestore) {
        firebaseFirestore.getClass();
        this.f15020a = firebaseFirestore;
    }

    public final ya.v a() {
        if (!this.f15022c) {
            this.f15022c = true;
            if (this.f15021b.size() > 0) {
                return this.f15020a.f9617i.b(this.f15021b);
            }
            return ya.k.e(null);
        }
        throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
    }

    public final void b(com.google.firebase.firestore.a aVar, Object obj) {
        s1.s f;
        FirebaseFirestore firebaseFirestore = this.f15020a;
        firebaseFirestore.getClass();
        if (aVar.f9626b == firebaseFirestore) {
            if (obj != null) {
                t tVar = t.f15011c;
                ca.a.w(tVar, "Provided options must not be null.");
                if (!this.f15022c) {
                    boolean z10 = tVar.f15013a;
                    w wVar = firebaseFirestore.f9615g;
                    if (z10) {
                        f = wVar.d(obj, tVar.f15014b);
                    } else {
                        f = wVar.f(obj);
                    }
                    this.f15021b.add(f.L(aVar.f9625a, le.l.f24227c));
                    return;
                }
                throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
            }
            throw new NullPointerException("Provided data must not be null.");
        }
        throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
    }
}
