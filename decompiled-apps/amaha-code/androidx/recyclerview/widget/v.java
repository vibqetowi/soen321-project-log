package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.m f3055a;

    /* renamed from: b  reason: collision with root package name */
    public int f3056b = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3057c = new Rect();

    public v(RecyclerView.m mVar) {
        this.f3055a = mVar;
    }

    public static v a(RecyclerView.m mVar, int i6) {
        if (i6 != 0) {
            if (i6 == 1) {
                return new u(mVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new t(mVar);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i6);
}
