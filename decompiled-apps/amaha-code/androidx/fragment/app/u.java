package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;
/* compiled from: FragmentHostCallback.java */
/* loaded from: classes.dex */
public abstract class u<E> extends r {

    /* renamed from: u  reason: collision with root package name */
    public final Activity f2291u;

    /* renamed from: v  reason: collision with root package name */
    public final Context f2292v;

    /* renamed from: w  reason: collision with root package name */
    public final Handler f2293w;

    /* renamed from: x  reason: collision with root package name */
    public final z f2294x;

    public u(p pVar) {
        Handler handler = new Handler();
        this.f2294x = new z();
        this.f2291u = pVar;
        if (pVar != null) {
            this.f2292v = pVar;
            this.f2293w = handler;
            return;
        }
        throw new NullPointerException("context == null");
    }

    public abstract void d(PrintWriter printWriter, String[] strArr);

    public abstract p e();

    public abstract LayoutInflater f();

    public abstract boolean g(String str);

    public abstract void h();
}
