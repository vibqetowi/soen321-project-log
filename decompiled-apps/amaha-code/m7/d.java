package m7;

import android.os.SystemClock;
/* compiled from: UptimeClock.java */
/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24923a;

    @Override // m7.a
    public final long a() {
        switch (this.f24923a) {
            case 0:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }
}
