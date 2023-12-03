package c4;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public int f4918a;

    /* renamed from: b  reason: collision with root package name */
    public String f4919b;

    /* compiled from: com.android.billingclient:billing@@5.0.0 */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f4920a;

        /* renamed from: b  reason: collision with root package name */
        public String f4921b = "";

        public final g a() {
            g gVar = new g();
            gVar.f4918a = this.f4920a;
            gVar.f4919b = this.f4921b;
            return gVar;
        }
    }

    public static a a() {
        return new a();
    }

    public final String toString() {
        oa.a aVar;
        int i6 = this.f4918a;
        int i10 = oa.i.f27330a;
        oa.g gVar = oa.a.f27312w;
        Integer valueOf = Integer.valueOf(i6);
        if (!gVar.containsKey(valueOf)) {
            aVar = oa.a.f27311v;
        } else {
            aVar = (oa.a) gVar.get(valueOf);
        }
        String obj = aVar.toString();
        String str = this.f4919b;
        return "Response Code: " + obj + ", Debug Message: " + str;
    }
}
