package fe;

import com.google.firebase.firestore.FirebaseFirestore;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import oe.e;
/* compiled from: DocumentSnapshot.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final FirebaseFirestore f14988a;

    /* renamed from: b  reason: collision with root package name */
    public final ke.i f14989b;

    /* renamed from: c  reason: collision with root package name */
    public final ke.g f14990c;

    /* renamed from: d  reason: collision with root package name */
    public final u f14991d;

    /* compiled from: DocumentSnapshot.java */
    /* loaded from: classes.dex */
    public enum a {
        NONE,
        /* JADX INFO: Fake field, exist only in values array */
        ESTIMATE,
        /* JADX INFO: Fake field, exist only in values array */
        PREVIOUS
    }

    public g(FirebaseFirestore firebaseFirestore, ke.i iVar, ke.g gVar, boolean z10, boolean z11) {
        firebaseFirestore.getClass();
        this.f14988a = firebaseFirestore;
        iVar.getClass();
        this.f14989b = iVar;
        this.f14990c = gVar;
        this.f14991d = new u(z11, z10);
    }

    public HashMap a() {
        x xVar = new x(this.f14988a);
        ke.g gVar = this.f14990c;
        if (gVar == null) {
            return null;
        }
        return xVar.a(gVar.getData().b().e0().P());
    }

    public final String b() {
        return this.f14989b.f23275u.k();
    }

    public final String c() {
        Object obj;
        rf.s e10;
        j a10 = j.a("goalFrequency");
        Object obj2 = null;
        ke.g gVar = this.f14990c;
        if (gVar != null && (e10 = gVar.e(a10.f14996a)) != null) {
            obj = new x(this.f14988a).b(e10);
        } else {
            obj = null;
        }
        if (obj != null) {
            if (String.class.isInstance(obj)) {
                obj2 = String.class.cast(obj);
            } else {
                throw new RuntimeException("Field 'goalFrequency' is not a ".concat(String.class.getName()));
            }
        }
        return (String) obj2;
    }

    public <T> T d(Class<T> cls) {
        return (T) e(cls);
    }

    public Object e(Class cls) {
        HashMap a10 = a();
        if (a10 == null) {
            return null;
        }
        com.google.firebase.firestore.a aVar = new com.google.firebase.firestore.a(this.f14989b, this.f14988a);
        ConcurrentHashMap concurrentHashMap = oe.e.f27403a;
        return oe.e.c(a10, cls, new e.b(e.c.f27415d, aVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f14988a.equals(gVar.f14988a) && this.f14989b.equals(gVar.f14989b)) {
            ke.g gVar2 = gVar.f14990c;
            ke.g gVar3 = this.f14990c;
            if (gVar3 != null ? gVar3.equals(gVar2) : gVar2 == null) {
                if (this.f14991d.equals(gVar.f14991d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = (this.f14989b.hashCode() + (this.f14988a.hashCode() * 31)) * 31;
        int i10 = 0;
        ke.g gVar = this.f14990c;
        if (gVar != null) {
            i6 = gVar.getKey().hashCode();
        } else {
            i6 = 0;
        }
        int i11 = (hashCode + i6) * 31;
        if (gVar != null) {
            i10 = gVar.getData().hashCode();
        }
        return this.f14991d.hashCode() + ((i11 + i10) * 31);
    }

    public final String toString() {
        return "DocumentSnapshot{key=" + this.f14989b + ", metadata=" + this.f14991d + ", doc=" + this.f14990c + '}';
    }
}
