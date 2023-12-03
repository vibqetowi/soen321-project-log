package ad;
/* compiled from: HttpErrorResponse.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f504a;

    /* renamed from: b  reason: collision with root package name */
    public final String f505b;

    public /* synthetic */ h(int i6, String str) {
        this.f504a = i6;
        this.f505b = str;
    }

    public h(String versionName, int i6, int i10) {
        if (i10 == 3) {
            kotlin.jvm.internal.i.g(versionName, "versionName");
            this.f505b = versionName;
            this.f504a = i6;
        } else if (i10 != 4) {
            kotlin.jvm.internal.i.g(versionName, "advertisingId");
            this.f505b = versionName;
            this.f504a = i6;
        } else {
            this.f505b = versionName;
            this.f504a = i6;
        }
    }
}
