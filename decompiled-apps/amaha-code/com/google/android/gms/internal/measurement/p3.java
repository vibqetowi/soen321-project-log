package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class p3 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q3 f8547a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(q3 q3Var) {
        super(null);
        this.f8547a = q3Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        q3 q3Var = this.f8547a;
        synchronized (q3Var.f8568e) {
            q3Var.f = null;
            q3Var.f8566c.run();
        }
        synchronized (q3Var) {
            Iterator it = q3Var.f8569g.iterator();
            while (it.hasNext()) {
                ((r3) it.next()).a();
            }
        }
    }
}
