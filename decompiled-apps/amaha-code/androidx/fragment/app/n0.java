package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t0.d0;
/* compiled from: FragmentTransitionImpl.java */
/* loaded from: classes.dex */
public final class n0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f2250u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2251v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2252w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2253x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2254y;

    public n0(int i6, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f2250u = i6;
        this.f2251v = arrayList;
        this.f2252w = arrayList2;
        this.f2253x = arrayList3;
        this.f2254y = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i6 = 0; i6 < this.f2250u; i6++) {
            WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
            d0.i.v((View) this.f2251v.get(i6), (String) this.f2252w.get(i6));
            d0.i.v((View) this.f2253x.get(i6), (String) this.f2254y.get(i6));
        }
    }
}
