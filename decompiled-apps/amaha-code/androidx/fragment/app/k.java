package androidx.fragment.app;

import java.util.ArrayList;
/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2223u;

    public k(ArrayList arrayList) {
        this.f2223u = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0.a(this.f2223u, 4);
    }
}
