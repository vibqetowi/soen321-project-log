package w6;

import android.view.GestureDetector;
import android.view.View;
import p6.b;
/* compiled from: ChartTouchListener.java */
/* loaded from: classes.dex */
public abstract class b<T extends p6.b<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* renamed from: u  reason: collision with root package name */
    public int f36566u = 0;

    /* renamed from: v  reason: collision with root package name */
    public t6.c f36567v;

    /* renamed from: w  reason: collision with root package name */
    public final GestureDetector f36568w;

    /* renamed from: x  reason: collision with root package name */
    public final T f36569x;

    public b(T t3) {
        this.f36569x = t3;
        this.f36568w = new GestureDetector(t3.getContext(), this);
    }
}
