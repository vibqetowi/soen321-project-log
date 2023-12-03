package t0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final e f32380a;

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Window f32381a;

        /* renamed from: b  reason: collision with root package name */
        public final View f32382b;

        public a(View view, Window window) {
            this.f32381a = window;
            this.f32382b = view;
        }

        @Override // t0.u0.e
        public final void a() {
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((7 & i6) != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 8) {
                                Window window = this.f32381a;
                                ((InputMethodManager) window.getContext().getSystemService("input_method")).hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                            }
                        } else {
                            g(2);
                        }
                    } else {
                        g(4);
                    }
                }
            }
        }

        @Override // t0.u0.e
        public final void e() {
            h(Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID);
            g(4096);
        }

        @Override // t0.u0.e
        public final void f() {
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((7 & i6) != 0) {
                    Window window = this.f32381a;
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 8) {
                                View view = this.f32382b;
                                if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                                    view = window.getCurrentFocus();
                                } else {
                                    view.requestFocus();
                                }
                                if (view == null) {
                                    view = window.findViewById(16908290);
                                }
                                if (view != null && view.hasWindowFocus()) {
                                    view.post(new t0(view, 0));
                                }
                            }
                        } else {
                            h(2);
                        }
                    } else {
                        h(4);
                        window.clearFlags(Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);
                    }
                }
            }
        }

        public final void g(int i6) {
            View decorView = this.f32381a.getDecorView();
            decorView.setSystemUiVisibility(i6 | decorView.getSystemUiVisibility());
        }

        public final void h(int i6) {
            View decorView = this.f32381a.getDecorView();
            decorView.setSystemUiVisibility((~i6) & decorView.getSystemUiVisibility());
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        public b(View view, Window window) {
            super(view, window);
        }

        @Override // t0.u0.e
        public final boolean b() {
            if ((this.f32381a.getDecorView().getSystemUiVisibility() & 8192) != 0) {
                return true;
            }
            return false;
        }

        @Override // t0.u0.e
        public final void d(boolean z10) {
            if (z10) {
                Window window = this.f32381a;
                window.clearFlags(67108864);
                window.addFlags(LinearLayoutManager.INVALID_OFFSET);
                g(8192);
                return;
            }
            h(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class c extends b {
        public c(View view, Window window) {
            super(view, window);
        }

        @Override // t0.u0.e
        public final void c(boolean z10) {
            if (z10) {
                Window window = this.f32381a;
                window.clearFlags(134217728);
                window.addFlags(LinearLayoutManager.INVALID_OFFSET);
                g(16);
                return;
            }
            h(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsetsController f32383a;

        /* renamed from: b  reason: collision with root package name */
        public final Window f32384b;

        public d(Window window) {
            WindowInsetsController insetsController;
            insetsController = window.getInsetsController();
            new t.h();
            this.f32383a = insetsController;
            this.f32384b = window;
        }

        @Override // t0.u0.e
        public final void a() {
            this.f32383a.hide(7);
        }

        @Override // t0.u0.e
        public final boolean b() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f32383a.getSystemBarsAppearance();
            if ((systemBarsAppearance & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // t0.u0.e
        public final void c(boolean z10) {
            WindowInsetsController windowInsetsController = this.f32383a;
            Window window = this.f32384b;
            if (z10) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                windowInsetsController.setSystemBarsAppearance(16, 16);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            }
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }

        @Override // t0.u0.e
        public final void d(boolean z10) {
            WindowInsetsController windowInsetsController = this.f32383a;
            Window window = this.f32384b;
            if (z10) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                windowInsetsController.setSystemBarsAppearance(8, 8);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }

        @Override // t0.u0.e
        public final void e() {
            this.f32383a.setSystemBarsBehavior(2);
        }

        @Override // t0.u0.e
        public final void f() {
            Window window = this.f32384b;
            this.f32383a.show(7);
        }
    }

    public u0(View view, Window window) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            this.f32380a = new d(window);
        } else if (i6 >= 26) {
            this.f32380a = new c(view, window);
        } else if (i6 >= 23) {
            this.f32380a = new b(view, window);
        } else {
            this.f32380a = new a(view, window);
        }
    }

    public final void a(boolean z10) {
        this.f32380a.d(z10);
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public void a() {
            throw null;
        }

        public boolean b() {
            return false;
        }

        public void e() {
            throw null;
        }

        public void f() {
            throw null;
        }

        public void c(boolean z10) {
        }

        public void d(boolean z10) {
        }
    }
}
