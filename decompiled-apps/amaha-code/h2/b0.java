package h2;

import android.view.View;
import android.view.WindowId;
/* compiled from: WindowIdApi18.java */
/* loaded from: classes.dex */
public final class b0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f17028a;

    public b0(View view) {
        this.f17028a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b0) && ((b0) obj).f17028a.equals(this.f17028a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17028a.hashCode();
    }
}
