package l5;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.i;
/* compiled from: RCTCodelessLoggingEventListener.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f24078a = 0;

    /* compiled from: RCTCodelessLoggingEventListener.kt */
    /* loaded from: classes.dex */
    public static final class a implements View.OnTouchListener {

        /* renamed from: u  reason: collision with root package name */
        public final m5.a f24079u;

        /* renamed from: v  reason: collision with root package name */
        public final WeakReference<View> f24080v;

        /* renamed from: w  reason: collision with root package name */
        public final WeakReference<View> f24081w;

        /* renamed from: x  reason: collision with root package name */
        public final View.OnTouchListener f24082x;

        /* renamed from: y  reason: collision with root package name */
        public final boolean f24083y = true;

        public a(m5.a aVar, View view, View view2) {
            this.f24079u = aVar;
            this.f24080v = new WeakReference<>(view2);
            this.f24081w = new WeakReference<>(view);
            this.f24082x = m5.f.f(view2);
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            i.g(view, "view");
            i.g(motionEvent, "motionEvent");
            View view2 = this.f24081w.get();
            View view3 = this.f24080v.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                l5.a aVar = l5.a.f24048a;
                l5.a.a(this.f24079u, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f24082x;
            if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
                return true;
            }
            return false;
        }
    }

    static {
        new d();
    }
}
