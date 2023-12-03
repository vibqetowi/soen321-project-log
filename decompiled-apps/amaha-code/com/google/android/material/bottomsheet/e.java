package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import g.r;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import t0.r0;
import t0.s0;
import t0.u0;
/* compiled from: BottomSheetDialog.java */
/* loaded from: classes.dex */
public final class e extends r {
    public CoordinatorLayout A;
    public FrameLayout B;
    public boolean C;
    public boolean D;
    public boolean E;
    public b F;
    public final boolean G;
    public final a H;

    /* renamed from: y  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f8860y;

    /* renamed from: z  reason: collision with root package name */
    public FrameLayout f8861z;

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes.dex */
    public static class b extends BottomSheetBehavior.f {

        /* renamed from: a  reason: collision with root package name */
        public final Boolean f8863a;

        /* renamed from: b  reason: collision with root package name */
        public final s0 f8864b;

        /* renamed from: c  reason: collision with root package name */
        public Window f8865c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f8866d;

        public b(FrameLayout frameLayout, s0 s0Var) {
            ColorStateList g5;
            this.f8864b = s0Var;
            yb.f materialShapeDrawable = BottomSheetBehavior.from(frameLayout).getMaterialShapeDrawable();
            if (materialShapeDrawable != null) {
                g5 = materialShapeDrawable.f38424u.f38433c;
            } else {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                g5 = d0.i.g(frameLayout);
            }
            if (g5 != null) {
                this.f8863a = Boolean.valueOf(f6.b.I0(g5.getDefaultColor()));
            } else if (frameLayout.getBackground() instanceof ColorDrawable) {
                this.f8863a = Boolean.valueOf(f6.b.I0(((ColorDrawable) frameLayout.getBackground()).getColor()));
            } else {
                this.f8863a = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void b(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void c(int i6, View view) {
            d(view);
        }

        public final void d(View view) {
            boolean booleanValue;
            int top = view.getTop();
            s0 s0Var = this.f8864b;
            if (top < s0Var.d()) {
                Window window = this.f8865c;
                if (window != null) {
                    Boolean bool = this.f8863a;
                    if (bool == null) {
                        booleanValue = this.f8866d;
                    } else {
                        booleanValue = bool.booleanValue();
                    }
                    new u0(window.getDecorView(), window).a(booleanValue);
                }
                view.setPadding(view.getPaddingLeft(), s0Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                Window window2 = this.f8865c;
                if (window2 != null) {
                    new u0(window2.getDecorView(), window2).a(this.f8866d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void e(Window window) {
            if (this.f8865c == window) {
                return;
            }
            this.f8865c = window;
            if (window != null) {
                this.f8866d = new u0(window.getDecorView(), window).f32380a.b();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Context context, int i6) {
        super(context, i6);
        if (i6 == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
                i6 = typedValue.resourceId;
            } else {
                i6 = 2132083336;
            }
        }
        this.C = true;
        this.D = true;
        this.H = new a();
        c().t(1);
        this.G = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f8860y == null) {
            e();
        }
        super.cancel();
    }

    public final void e() {
        if (this.f8861z == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f8861z = frameLayout;
            this.A = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f8861z.findViewById(R.id.design_bottom_sheet);
            this.B = frameLayout2;
            BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from(frameLayout2);
            this.f8860y = from;
            from.addBottomSheetCallback(this.H);
            this.f8860y.setHideable(this.C);
        }
    }

    public final FrameLayout f(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f8861z.findViewById(R.id.coordinator);
        if (i6 != 0 && view == null) {
            view = getLayoutInflater().inflate(i6, (ViewGroup) coordinatorLayout, false);
        }
        if (this.G) {
            FrameLayout frameLayout = this.B;
            com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(this);
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.i.u(frameLayout, aVar);
        }
        this.B.removeAllViews();
        if (layoutParams == null) {
            this.B.addView(view);
        } else {
            this.B.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new com.google.android.material.bottomsheet.b(this));
        d0.q(this.B, new c(this));
        this.B.setOnTouchListener(new d());
        return this.f8861z;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.G && Color.alpha(window.getNavigationBarColor()) < 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            FrameLayout frameLayout = this.f8861z;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.A;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            r0.a(window, !z10);
            b bVar = this.F;
            if (bVar != null) {
                bVar.e(window);
            }
        }
    }

    @Override // g.r, androidx.activity.g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i6 = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(LinearLayoutManager.INVALID_OFFSET);
            if (i6 < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        b bVar = this.F;
        if (bVar != null) {
            bVar.e(null);
        }
    }

    @Override // androidx.activity.g, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f8860y;
        if (bottomSheetBehavior != null && bottomSheetBehavior.getState() == 5) {
            this.f8860y.setState(4);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.C != z10) {
            this.C = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f8860y;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z10);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.C) {
            this.C = true;
        }
        this.D = z10;
        this.E = true;
    }

    @Override // g.r, androidx.activity.g, android.app.Dialog
    public final void setContentView(int i6) {
        super.setContentView(f(null, i6, null));
    }

    @Override // g.r, androidx.activity.g, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(f(view, 0, null));
    }

    @Override // g.r, androidx.activity.g, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(f(view, 0, layoutParams));
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes.dex */
    public class a extends BottomSheetBehavior.f {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void c(int i6, View view) {
            if (i6 == 5) {
                e.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void b(View view) {
        }
    }
}
