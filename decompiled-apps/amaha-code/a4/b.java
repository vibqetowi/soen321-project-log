package a4;
/* compiled from: IMIdentityStorage.kt */
/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    public String f285a;

    /* renamed from: b  reason: collision with root package name */
    public String f286b;

    @Override // a4.i
    public final c a() {
        return new c(this.f285a, this.f286b);
    }

    @Override // a4.i
    public final void b(String str) {
        this.f286b = str;
    }

    @Override // a4.i
    public final void c(String str) {
        this.f285a = str;
    }
}
