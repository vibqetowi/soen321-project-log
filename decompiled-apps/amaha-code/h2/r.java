package h2;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: TransitionValues.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public final View f17069b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f17068a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<k> f17070c = new ArrayList<>();

    @Deprecated
    public r() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f17069b == rVar.f17069b && this.f17068a.equals(rVar.f17068a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17068a.hashCode() + (this.f17069b.hashCode() * 31);
    }

    public final String toString() {
        HashMap hashMap;
        StringBuilder d10 = v.g.d("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        d10.append(this.f17069b);
        d10.append("\n");
        String f = pl.a.f(d10.toString(), "    values:");
        for (String str : this.f17068a.keySet()) {
            f = f + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return f;
    }

    public r(View view) {
        this.f17069b = view;
    }
}
