package e4;

import com.android.volley.VolleyError;
import e4.a;
/* compiled from: Response.java */
/* loaded from: classes.dex */
public final class l<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f13788a;

    /* renamed from: b  reason: collision with root package name */
    public final a.C0214a f13789b;

    /* renamed from: c  reason: collision with root package name */
    public final VolleyError f13790c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13791d;

    /* compiled from: Response.java */
    /* loaded from: classes.dex */
    public interface a {
        void onErrorResponse(VolleyError volleyError);
    }

    /* compiled from: Response.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(T t3);
    }

    public l(T t3, a.C0214a c0214a) {
        this.f13791d = false;
        this.f13788a = t3;
        this.f13789b = c0214a;
        this.f13790c = null;
    }

    public l(VolleyError volleyError) {
        this.f13791d = false;
        this.f13788a = null;
        this.f13789b = null;
        this.f13790c = volleyError;
    }
}
