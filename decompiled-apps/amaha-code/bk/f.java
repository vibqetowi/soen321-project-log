package bk;

import android.database.DataSetObserver;
import bk.a;
import hs.k;
/* compiled from: ViewPagerAttacher.kt */
/* loaded from: classes.dex */
public final class f extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ss.a<k> f4337a;

    public f(a.C0083a c0083a) {
        this.f4337a = c0083a;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        super.onChanged();
        this.f4337a.invoke();
    }
}
