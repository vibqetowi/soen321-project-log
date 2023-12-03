package ne;
/* compiled from: FirestoreChannel.java */
/* loaded from: classes.dex */
public final class m extends tr.q<Object, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ tr.c[] f26241a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ya.h f26242b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f26243c;

    public m(n nVar, tr.c[] cVarArr, ya.h hVar) {
        this.f26243c = nVar;
        this.f26241a = cVarArr;
        this.f26242b = hVar;
    }

    @Override // tr.e0, tr.c
    public final void b() {
        if (this.f26241a[0] == null) {
            this.f26242b.addOnSuccessListener(this.f26243c.f26248a.f27381a, new ya.f() { // from class: ne.l
                @Override // ya.f
                public final void onSuccess(Object obj) {
                    ((tr.c) obj).b();
                }
            });
            return;
        }
        super.b();
    }

    @Override // tr.e0
    public final tr.c<Object, Object> f() {
        boolean z10;
        tr.c<Object, Object>[] cVarArr = this.f26241a;
        if (cVarArr[0] != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "ClientCall used before onOpen() callback", new Object[0]);
        return cVarArr[0];
    }
}
