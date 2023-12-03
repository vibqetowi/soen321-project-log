package ta;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f32614g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f32615a;

    /* renamed from: b  reason: collision with root package name */
    public final h2 f32616b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f32617c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f32618d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f32619e = new Object();
    public volatile Object f = null;

    public /* synthetic */ i2(String str, Object obj, Object obj2, h2 h2Var) {
        this.f32615a = str;
        this.f32617c = obj;
        this.f32618d = obj2;
        this.f32616b = h2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0048 A[Catch: all -> 0x004c, TRY_ENTER, TryCatch #3 {SecurityException -> 0x0057, blocks: (B:22:0x0023, B:23:0x0029, B:25:0x002f, B:27:0x003b, B:29:0x003f, B:32:0x0045, B:33:0x0047, B:40:0x004f, B:41:0x0056, B:34:0x0048, B:35:0x004a), top: B:60:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj) {
        Object obj2;
        h2 h2Var;
        Object obj3;
        synchronized (this.f32619e) {
        }
        if (obj != null) {
            return obj;
        }
        if (sc.b.N == null) {
            return this.f32617c;
        }
        synchronized (f32614g) {
            if (kotlinx.coroutines.e0.x()) {
                if (this.f == null) {
                    obj3 = this.f32617c;
                } else {
                    obj3 = this.f;
                }
                return obj3;
            }
            try {
                for (i2 i2Var : j2.f32639a) {
                    if (!kotlinx.coroutines.e0.x()) {
                        try {
                            h2Var = i2Var.f32616b;
                        } catch (IllegalStateException unused) {
                        }
                        if (h2Var != null) {
                            obj2 = h2Var.a();
                            synchronized (f32614g) {
                                i2Var.f = obj2;
                            }
                        }
                        obj2 = null;
                        synchronized (f32614g) {
                        }
                    } else {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                }
            } catch (SecurityException unused2) {
            }
            h2 h2Var2 = this.f32616b;
            if (h2Var2 == null) {
                return this.f32617c;
            }
            try {
                return h2Var2.a();
            } catch (IllegalStateException unused3) {
                return this.f32617c;
            } catch (SecurityException unused4) {
                return this.f32617c;
            }
        }
    }
}
