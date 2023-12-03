package mc;

import com.appsflyer.R;
/* compiled from: com.google.android.play:integrity@@1.0.1 */
/* loaded from: classes.dex */
public final class n implements a {

    /* renamed from: w  reason: collision with root package name */
    public static final Object f25036w = new Object();

    /* renamed from: u  reason: collision with root package name */
    public volatile a f25037u;

    /* renamed from: v  reason: collision with root package name */
    public volatile Object f25038v = f25036w;

    public n(o oVar) {
        this.f25037u = oVar;
    }

    public static a b(o oVar) {
        if (oVar instanceof n) {
            return oVar;
        }
        return new n(oVar);
    }

    @Override // mc.a
    public final Object a() {
        Object obj = this.f25038v;
        Object obj2 = f25036w;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f25038v;
                if (obj == obj2) {
                    obj = this.f25037u.a();
                    Object obj3 = this.f25038v;
                    if (obj3 != obj2 && obj3 != obj) {
                        String valueOf = String.valueOf(obj3);
                        String valueOf2 = String.valueOf(obj);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + R.styleable.AppCompatTheme_windowActionBarOverlay + valueOf2.length());
                        sb2.append("Scoped provider was invoked recursively returning different results: ");
                        sb2.append(valueOf);
                        sb2.append(" & ");
                        sb2.append(valueOf2);
                        sb2.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    this.f25038v = obj;
                    this.f25037u = null;
                }
            }
        }
        return obj;
    }
}
