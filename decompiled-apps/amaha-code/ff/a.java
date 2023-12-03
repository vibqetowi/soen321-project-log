package ff;
/* compiled from: FirebasePerfApplicationInfoValidator.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final df.a f15023b = df.a.d();

    /* renamed from: a  reason: collision with root package name */
    public final lf.c f15024a;

    public a(lf.c cVar) {
        this.f15024a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[RETURN] */
    @Override // ff.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z10;
        df.a aVar = f15023b;
        lf.c cVar = this.f15024a;
        if (cVar == null) {
            aVar.f("ApplicationInfo is null");
        } else if (!cVar.W()) {
            aVar.f("GoogleAppId is null");
        } else if (!cVar.U()) {
            aVar.f("AppInstanceId is null");
        } else if (!cVar.V()) {
            aVar.f("ApplicationProcessState is null");
        } else {
            if (cVar.T()) {
                if (!cVar.R().Q()) {
                    aVar.f("AndroidAppInfo.packageName is null");
                } else if (!cVar.R().R()) {
                    aVar.f("AndroidAppInfo.sdkVersion is null");
                }
            }
            z10 = true;
            if (!z10) {
                return true;
            }
            aVar.f("ApplicationInfo is invalid");
            return false;
        }
        z10 = false;
        if (!z10) {
        }
    }
}
