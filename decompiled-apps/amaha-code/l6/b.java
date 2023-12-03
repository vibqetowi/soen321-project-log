package l6;

import android.content.Context;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import g.x;
/* compiled from: ScrollerViewProvider.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public FastScroller f24094a;

    /* renamed from: b  reason: collision with root package name */
    public x f24095b;

    public final x a() {
        if (this.f24095b == null) {
            this.f24095b = new x(8, new d(((a) this).f24092c, 1.0f, 1.0f));
        }
        return this.f24095b;
    }

    public final Context b() {
        return this.f24094a.getContext();
    }

    public final x c() {
        return null;
    }
}
