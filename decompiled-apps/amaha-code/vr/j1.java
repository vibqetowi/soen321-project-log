package vr;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: InternalSubchannel.java */
/* loaded from: classes2.dex */
public final class j1 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ tr.i0 f35726u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c1 f35727v;

    public j1(c1 c1Var, tr.i0 i0Var) {
        this.f35727v = c1Var;
        this.f35726u = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = new ArrayList(this.f35727v.f35455s).iterator();
        while (it.hasNext()) {
            ((g2) it.next()).c(this.f35726u);
        }
    }
}
