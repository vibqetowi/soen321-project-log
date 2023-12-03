package com.theinnerhour.b2b.components.expertCare.activity;

import a3.t;
import android.content.Intent;
import android.graphics.Insets;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowMetrics;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.ui.PlayerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertStoriesActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dc.h;
import hs.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import je.o;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import r1.b0;
import sp.b;
import t0.u0;
/* compiled from: ExpertStoriesActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/expertCare/activity/ExpertStoriesActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ExpertStoriesActivity extends c {
    public static final /* synthetic */ int I = 0;
    public int B;
    public long C;
    public boolean D;
    public boolean E;
    public boolean F;

    /* renamed from: v  reason: collision with root package name */
    public a0 f11142v;

    /* renamed from: x  reason: collision with root package name */
    public int f11144x;
    public final LinkedHashMap H = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<String> f11143w = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public final Handler f11145y = new Handler(Looper.getMainLooper());

    /* renamed from: z  reason: collision with root package name */
    public boolean f11146z = true;
    public final String A = LogHelper.INSTANCE.makeLogTag("ExpertStoriesActivity");
    public final i G = b.O(new a());

    /* compiled from: ExpertStoriesActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<com.theinnerhour.b2b.components.expertCare.activity.a> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final com.theinnerhour.b2b.components.expertCare.activity.a invoke() {
            return new com.theinnerhour.b2b.components.expertCare.activity.a(ExpertStoriesActivity.this);
        }
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.H;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void o0() {
        try {
            n0(R.id.blanketView).setOnTouchListener(new h(1, this));
            ((AppCompatImageView) n0(R.id.ivExpertStoriesBackButton)).setOnClickListener(new View.OnClickListener(this) { // from class: rl.c

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExpertStoriesActivity f30789v;

                {
                    this.f30789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    ExpertStoriesActivity this$0 = this.f30789v;
                    switch (i6) {
                        case 0:
                            int i10 = ExpertStoriesActivity.I;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.onBackPressed();
                            return;
                        default:
                            int i11 = ExpertStoriesActivity.I;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.E) {
                                if (Utils.INSTANCE.checkConnectivity(this$0)) {
                                    this$0.startActivity(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.THERAPIST_LISTING).putExtra("override_source_value", "app_km_video"));
                                    String str = gk.a.f16573a;
                                    Bundle f = e.f("source", "app_km_video", "flow", "therapy");
                                    hs.k kVar = hs.k.f19476a;
                                    gk.a.b(f, "therapy_psychiatry_view_providers_click");
                                    return;
                                }
                                return;
                            } else if (Utils.INSTANCE.checkConnectivity(this$0)) {
                                this$0.startActivity(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PSYCHIATRIST_LISTING).putExtra("override_source_value", "app_km_video"));
                                String str2 = gk.a.f16573a;
                                Bundle f2 = e.f("source", "app_km_video", "flow", "psychiatry");
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(f2, "therapy_psychiatry_view_providers_click");
                                return;
                            } else {
                                return;
                            }
                    }
                }
            });
            ((RobertoTextView) n0(R.id.tvExpertViewAllButton)).setOnClickListener(new View.OnClickListener(this) { // from class: rl.c

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExpertStoriesActivity f30789v;

                {
                    this.f30789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    ExpertStoriesActivity this$0 = this.f30789v;
                    switch (i6) {
                        case 0:
                            int i10 = ExpertStoriesActivity.I;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.onBackPressed();
                            return;
                        default:
                            int i11 = ExpertStoriesActivity.I;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.E) {
                                if (Utils.INSTANCE.checkConnectivity(this$0)) {
                                    this$0.startActivity(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.THERAPIST_LISTING).putExtra("override_source_value", "app_km_video"));
                                    String str = gk.a.f16573a;
                                    Bundle f = e.f("source", "app_km_video", "flow", "therapy");
                                    hs.k kVar = hs.k.f19476a;
                                    gk.a.b(f, "therapy_psychiatry_view_providers_click");
                                    return;
                                }
                                return;
                            } else if (Utils.INSTANCE.checkConnectivity(this$0)) {
                                this$0.startActivity(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PSYCHIATRIST_LISTING).putExtra("override_source_value", "app_km_video"));
                                String str2 = gk.a.f16573a;
                                Bundle f2 = e.f("source", "app_km_video", "flow", "psychiatry");
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(f2, "therapy_psychiatry_view_providers_click");
                                return;
                            } else {
                                return;
                            }
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        String str;
        String str2 = gk.a.f16573a;
        Bundle a10 = b0.a("source", "app_km_video");
        if (this.E) {
            str = "therapy";
        } else {
            str = "psychiatry";
        }
        a10.putString("flow", str);
        a10.putInt("step_num", this.f11144x + 1);
        hs.k kVar = hs.k.f19476a;
        gk.a.b(a10, "therapy_psychiatry_km_step_back");
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        int i6;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int systemBars;
        Insets insetsIgnoringVisibility;
        Rect bounds;
        int i10;
        int i11;
        u0.e aVar;
        String str = this.A;
        super.onCreate(bundle);
        setContentView(R.layout.fragment_expert_stories);
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Window window = getWindow();
                View decorView = getWindow().getDecorView();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    aVar = new u0.d(window);
                } else if (i12 >= 26) {
                    aVar = new u0.c(decorView, window);
                } else if (i12 >= 23) {
                    aVar = new u0.b(decorView, window);
                } else {
                    aVar = new u0.a(decorView, window);
                }
                aVar.d(true);
            }
            getWindow().setStatusBarColor(g0.a.b(this, R.color.login_grey_background));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, "Error in setting custom status bar", e10);
        }
        try {
            Window window2 = getWindow();
            if (window2 != null) {
                window2.addFlags(128);
            }
            this.f11144x = getIntent().getIntExtra(Constants.DAYMODEL_POSITION, 0);
            this.E = getIntent().getBooleanExtra("isTherapy", false);
            this.F = getIntent().getBooleanExtra("isExpertCare", false);
            RobertoTextView robertoTextView = (RobertoTextView) n0(R.id.tvExpertViewAllButton);
            if (this.E) {
                string = getString(R.string.expert_stories_view_all, "THERAPISTS");
            } else {
                string = getString(R.string.expert_stories_view_all, "PSYCHIATRISTS");
            }
            robertoTextView.setText(string);
            int i13 = Build.VERSION.SDK_INT;
            if (i13 < 25) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) n0(R.id.lvExpertStoriesLoader);
                if (lottieAnimationView != null) {
                    lottieAnimationView.setRenderMode(t.SOFTWARE);
                }
            } else {
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) n0(R.id.lvExpertStoriesLoader);
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setRenderMode(t.HARDWARE);
                }
            }
            boolean z10 = this.E;
            ArrayList<String> arrayList = this.f11143w;
            if (z10) {
                arrayList.add("https://assets.theinnerhour.com/activity_assets/t1669621213844.mp4");
                arrayList.add("https://assets.theinnerhour.com/activity_assets/t1669621248795.mp4");
                arrayList.add("https://assets.theinnerhour.com/activity_assets/t1669621277340.mp4");
                arrayList.add("https://assets.theinnerhour.com/activity_assets/t1669621297463.mp4");
            } else {
                arrayList.add("https://assets.theinnerhour.com/activity_assets/p1669621335969.mp4");
                arrayList.add("https://assets.theinnerhour.com/activity_assets/p1669621361679.mp4");
                arrayList.add("https://assets.theinnerhour.com/activity_assets/p1669621400111.mp4");
                arrayList.add("https://assets.theinnerhour.com/activity_assets/p1669621422652.mp4");
            }
            if (i13 >= 30) {
                currentWindowMetrics = getWindowManager().getCurrentWindowMetrics();
                kotlin.jvm.internal.i.f(currentWindowMetrics, "windowManager.currentWindowMetrics");
                windowInsets = currentWindowMetrics.getWindowInsets();
                systemBars = WindowInsets.Type.systemBars();
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars);
                kotlin.jvm.internal.i.f(insetsIgnoringVisibility, "windowMetrics.windowInse…Insets.Type.systemBars())");
                bounds = currentWindowMetrics.getBounds();
                int width = bounds.width();
                i10 = insetsIgnoringVisibility.left;
                i11 = insetsIgnoringVisibility.right;
                i6 = (width - i10) - i11;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                i6 = displayMetrics.widthPixels;
            }
            this.B = i6 / 2;
            try {
                a0 a10 = new j.b(this).a();
                a10.E((com.theinnerhour.b2b.components.expertCare.activity.a) this.G.getValue());
                this.f11142v = a10;
                q0();
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(str, e11);
            }
            o0();
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str, e12);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        String str = this.A;
        super.onDestroy();
        try {
            Window window = getWindow();
            if (window != null) {
                window.clearFlags(128);
            }
            try {
                a0 a0Var = this.f11142v;
                if (a0Var != null) {
                    a0Var.a();
                }
                this.f11142v = null;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, e10);
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            if (this.D) {
                a0 a0Var = this.f11142v;
                if (a0Var != null) {
                    a0Var.z(true);
                }
                this.f11146z = true;
                this.f11145y.postDelayed(new o(29, this), 100L);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
        boolean z10;
        super.onStop();
        try {
            a0 a0Var = this.f11142v;
            if (a0Var != null && a0Var.isPlaying()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.D = true;
                a0 a0Var2 = this.f11142v;
                if (a0Var2 != null) {
                    a0Var2.z(false);
                }
            }
            this.f11146z = false;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p0() {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        try {
            ProgressBar progressBar = (ProgressBar) n0(R.id.pbExpertStoriesOne);
            int i18 = this.f11144x;
            if (i18 != 3 && i18 != 2 && i18 != 1) {
                i6 = 0;
                progressBar.setMax(i6);
                ProgressBar progressBar2 = (ProgressBar) n0(R.id.pbExpertStoriesOne);
                i10 = this.f11144x;
                if (i10 != 3 && i10 != 2 && i10 != 1) {
                    i11 = 0;
                    progressBar2.setProgress(i11);
                    ProgressBar progressBar3 = (ProgressBar) n0(R.id.pbExpertStoriesTwo);
                    i12 = this.f11144x;
                    if (i12 != 3 && i12 != 2) {
                        i13 = 0;
                        progressBar3.setMax(i13);
                        ProgressBar progressBar4 = (ProgressBar) n0(R.id.pbExpertStoriesTwo);
                        i14 = this.f11144x;
                        if (i14 != 3 && i14 != 2) {
                            i15 = 0;
                            progressBar4.setProgress(i15);
                            ProgressBar progressBar5 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
                            if (this.f11144x != 3) {
                                i16 = 100;
                            } else {
                                i16 = 0;
                            }
                            progressBar5.setMax(i16);
                            ProgressBar progressBar6 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
                            if (this.f11144x != 3) {
                                i17 = 100;
                            } else {
                                i17 = 0;
                            }
                            progressBar6.setProgress(i17);
                            ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setMax(100);
                            ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setProgress(0);
                        }
                        i15 = 100;
                        progressBar4.setProgress(i15);
                        ProgressBar progressBar52 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
                        if (this.f11144x != 3) {
                        }
                        progressBar52.setMax(i16);
                        ProgressBar progressBar62 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
                        if (this.f11144x != 3) {
                        }
                        progressBar62.setProgress(i17);
                        ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setMax(100);
                        ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setProgress(0);
                    }
                    i13 = 100;
                    progressBar3.setMax(i13);
                    ProgressBar progressBar42 = (ProgressBar) n0(R.id.pbExpertStoriesTwo);
                    i14 = this.f11144x;
                    if (i14 != 3) {
                        i15 = 0;
                        progressBar42.setProgress(i15);
                        ProgressBar progressBar522 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
                        if (this.f11144x != 3) {
                        }
                        progressBar522.setMax(i16);
                        ProgressBar progressBar622 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
                        if (this.f11144x != 3) {
                        }
                        progressBar622.setProgress(i17);
                        ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setMax(100);
                        ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setProgress(0);
                    }
                    i15 = 100;
                    progressBar42.setProgress(i15);
                    ProgressBar progressBar5222 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
                    if (this.f11144x != 3) {
                    }
                    progressBar5222.setMax(i16);
                    ProgressBar progressBar6222 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
                    if (this.f11144x != 3) {
                    }
                    progressBar6222.setProgress(i17);
                    ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setMax(100);
                    ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setProgress(0);
                }
                i11 = 100;
                progressBar2.setProgress(i11);
                ProgressBar progressBar32 = (ProgressBar) n0(R.id.pbExpertStoriesTwo);
                i12 = this.f11144x;
                if (i12 != 3) {
                    i13 = 0;
                    progressBar32.setMax(i13);
                    ProgressBar progressBar422 = (ProgressBar) n0(R.id.pbExpertStoriesTwo);
                    i14 = this.f11144x;
                    if (i14 != 3) {
                    }
                    i15 = 100;
                    progressBar422.setProgress(i15);
                    ProgressBar progressBar52222 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
                    if (this.f11144x != 3) {
                    }
                    progressBar52222.setMax(i16);
                    ProgressBar progressBar62222 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
                    if (this.f11144x != 3) {
                    }
                    progressBar62222.setProgress(i17);
                    ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setMax(100);
                    ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setProgress(0);
                }
                i13 = 100;
                progressBar32.setMax(i13);
                ProgressBar progressBar4222 = (ProgressBar) n0(R.id.pbExpertStoriesTwo);
                i14 = this.f11144x;
                if (i14 != 3) {
                }
                i15 = 100;
                progressBar4222.setProgress(i15);
                ProgressBar progressBar522222 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
                if (this.f11144x != 3) {
                }
                progressBar522222.setMax(i16);
                ProgressBar progressBar622222 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
                if (this.f11144x != 3) {
                }
                progressBar622222.setProgress(i17);
                ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setMax(100);
                ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setProgress(0);
            }
            i6 = 100;
            progressBar.setMax(i6);
            ProgressBar progressBar22 = (ProgressBar) n0(R.id.pbExpertStoriesOne);
            i10 = this.f11144x;
            if (i10 != 3) {
                i11 = 0;
                progressBar22.setProgress(i11);
                ProgressBar progressBar322 = (ProgressBar) n0(R.id.pbExpertStoriesTwo);
                i12 = this.f11144x;
                if (i12 != 3) {
                }
                i13 = 100;
                progressBar322.setMax(i13);
                ProgressBar progressBar42222 = (ProgressBar) n0(R.id.pbExpertStoriesTwo);
                i14 = this.f11144x;
                if (i14 != 3) {
                }
                i15 = 100;
                progressBar42222.setProgress(i15);
                ProgressBar progressBar5222222 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
                if (this.f11144x != 3) {
                }
                progressBar5222222.setMax(i16);
                ProgressBar progressBar6222222 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
                if (this.f11144x != 3) {
                }
                progressBar6222222.setProgress(i17);
                ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setMax(100);
                ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setProgress(0);
            }
            i11 = 100;
            progressBar22.setProgress(i11);
            ProgressBar progressBar3222 = (ProgressBar) n0(R.id.pbExpertStoriesTwo);
            i12 = this.f11144x;
            if (i12 != 3) {
            }
            i13 = 100;
            progressBar3222.setMax(i13);
            ProgressBar progressBar422222 = (ProgressBar) n0(R.id.pbExpertStoriesTwo);
            i14 = this.f11144x;
            if (i14 != 3) {
            }
            i15 = 100;
            progressBar422222.setProgress(i15);
            ProgressBar progressBar52222222 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
            if (this.f11144x != 3) {
            }
            progressBar52222222.setMax(i16);
            ProgressBar progressBar62222222 = (ProgressBar) n0(R.id.pbExpertStoriesThree);
            if (this.f11144x != 3) {
            }
            progressBar62222222.setProgress(i17);
            ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setMax(100);
            ((ProgressBar) n0(R.id.pbExpertStoriesFour)).setProgress(0);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    public final void q0() {
        Uri parse;
        try {
            if (Utils.INSTANCE.checkConnectivity(this)) {
                p0();
                a0 a0Var = this.f11142v;
                if (a0Var != null) {
                    String str = this.f11143w.get(this.f11144x);
                    com.google.firebase.messaging.j jVar = q.f6683z;
                    q.a aVar = new q.a();
                    if (str == null) {
                        parse = null;
                    } else {
                        parse = Uri.parse(str);
                    }
                    aVar.f6690b = parse;
                    a0Var.h0(aVar.a());
                    ((PlayerView) n0(R.id.pvExpertStories)).setPlayer(a0Var);
                    a0Var.z(true);
                    a0Var.l();
                }
                this.f11145y.postDelayed(new o(29, this), 100L);
                return;
            }
            Toast.makeText(this, getString(R.string.no_internet_msg), 0).show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }
}
