package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes.dex */
public class z extends t0.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f3063d;

    /* renamed from: e  reason: collision with root package name */
    public final a f3064e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    public static class a extends t0.a {

        /* renamed from: d  reason: collision with root package name */
        public final z f3065d;

        /* renamed from: e  reason: collision with root package name */
        public final WeakHashMap f3066e = new WeakHashMap();

        public a(z zVar) {
            this.f3065d = zVar;
        }

        @Override // t0.a
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            t0.a aVar = (t0.a) this.f3066e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // t0.a
        public final u0.i b(View view) {
            t0.a aVar = (t0.a) this.f3066e.get(view);
            if (aVar != null) {
                return aVar.b(view);
            }
            return super.b(view);
        }

        @Override // t0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            t0.a aVar = (t0.a) this.f3066e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // t0.a
        public final void d(View view, u0.h hVar) {
            boolean z10;
            z zVar = this.f3065d;
            RecyclerView recyclerView = zVar.f3063d;
            if (recyclerView.P && !recyclerView.f2713b0 && !recyclerView.f2738y.g()) {
                z10 = false;
            } else {
                z10 = true;
            }
            AccessibilityNodeInfo accessibilityNodeInfo = hVar.f33731a;
            View.AccessibilityDelegate accessibilityDelegate = this.f32269a;
            if (!z10) {
                RecyclerView recyclerView2 = zVar.f3063d;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, hVar);
                    t0.a aVar = (t0.a) this.f3066e.get(view);
                    if (aVar != null) {
                        aVar.d(view, hVar);
                        return;
                    } else {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                        return;
                    }
                }
            }
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }

        @Override // t0.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            t0.a aVar = (t0.a) this.f3066e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // t0.a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            t0.a aVar = (t0.a) this.f3066e.get(viewGroup);
            if (aVar != null) {
                return aVar.f(viewGroup, view, accessibilityEvent);
            }
            return super.f(viewGroup, view, accessibilityEvent);
        }

        @Override // t0.a
        public final boolean g(View view, int i6, Bundle bundle) {
            boolean z10;
            z zVar = this.f3065d;
            RecyclerView recyclerView = zVar.f3063d;
            if (recyclerView.P && !recyclerView.f2713b0 && !recyclerView.f2738y.g()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                RecyclerView recyclerView2 = zVar.f3063d;
                if (recyclerView2.getLayoutManager() != null) {
                    t0.a aVar = (t0.a) this.f3066e.get(view);
                    if (aVar != null) {
                        if (aVar.g(view, i6, bundle)) {
                            return true;
                        }
                    } else if (super.g(view, i6, bundle)) {
                        return true;
                    }
                    return recyclerView2.getLayoutManager().performAccessibilityActionForItem(view, i6, bundle);
                }
            }
            return super.g(view, i6, bundle);
        }

        @Override // t0.a
        public final void h(View view, int i6) {
            t0.a aVar = (t0.a) this.f3066e.get(view);
            if (aVar != null) {
                aVar.h(view, i6);
            } else {
                super.h(view, i6);
            }
        }

        @Override // t0.a
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            t0.a aVar = (t0.a) this.f3066e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public z(RecyclerView recyclerView) {
        this.f3063d = recyclerView;
        a aVar = this.f3064e;
        if (aVar != null) {
            this.f3064e = aVar;
        } else {
            this.f3064e = new a(this);
        }
    }

    @Override // t0.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z10;
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f3063d;
            if (recyclerView.P && !recyclerView.f2713b0 && !recyclerView.f2738y.g()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
                }
            }
        }
    }

    @Override // t0.a
    public void d(View view, u0.h hVar) {
        boolean z10;
        this.f32269a.onInitializeAccessibilityNodeInfo(view, hVar.f33731a);
        RecyclerView recyclerView = this.f3063d;
        if (recyclerView.P && !recyclerView.f2713b0 && !recyclerView.f2738y.g()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(hVar);
        }
    }

    @Override // t0.a
    public final boolean g(View view, int i6, Bundle bundle) {
        boolean z10 = true;
        if (super.g(view, i6, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f3063d;
        if (recyclerView.P && !recyclerView.f2713b0 && !recyclerView.f2738y.g()) {
            z10 = false;
        }
        if (z10 || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i6, bundle);
    }
}
