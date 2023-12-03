package com.theinnerhour.b2b.components.learningHub.experiment.activities;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.lifecycle.l0;
import androidx.viewpager.widget.ViewPager;
import cn.e1;
import cn.w;
import cn.x;
import cn.y;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubArticleExperimentActivity;
import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.CustomViewPager;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.t;
import g0.a;
import il.n;
import is.u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import r4.q;
import ss.l;
import ss.p;
import t0.u0;
import ta.v;
/* compiled from: LearningHubArticleExperimentActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/theinnerhour/b2b/components/learningHub/experiment/activities/LearningHubArticleExperimentActivity;", "Landroidx/appcompat/app/c;", "Lil/n;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LearningHubArticleExperimentActivity extends androidx.appcompat.app.c implements n {
    public static final /* synthetic */ int I = 0;
    public int A;
    public final boolean C;
    public final hs.i D;
    public int E;
    public final ApplicationPersistence F;
    public boolean G;

    /* renamed from: w  reason: collision with root package name */
    public LearningHubModel f11241w;

    /* renamed from: x  reason: collision with root package name */
    public w f11242x;

    /* renamed from: y  reason: collision with root package name */
    public ConstraintLayout f11243y;
    public final LinkedHashMap H = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11240v = LogHelper.INSTANCE.makeLogTag(LearningHubArticleExperimentActivity.class);

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f11244z = new ArrayList<>();
    public Boolean B = Boolean.FALSE;

    /* compiled from: LearningHubArticleExperimentActivity.kt */
    /* loaded from: classes2.dex */
    public final class a extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<String> f11245c;

        /* renamed from: d  reason: collision with root package name */
        public final Context f11246d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ LearningHubArticleExperimentActivity f11247e;

        public a(LearningHubArticleExperimentActivity learningHubArticleExperimentActivity, Context context, ArrayList<String> imgUrls) {
            kotlin.jvm.internal.i.g(context, "context");
            kotlin.jvm.internal.i.g(imgUrls, "imgUrls");
            this.f11247e = learningHubArticleExperimentActivity;
            this.f11245c = new ArrayList<>();
            this.f11245c = imgUrls;
            this.f11246d = context;
        }

        @Override // k2.a
        public final void e(ViewGroup container, int i6, Object object) {
            kotlin.jvm.internal.i.g(container, "container");
            kotlin.jvm.internal.i.g(object, "object");
            try {
                container.removeView((View) object);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f11247e.f11240v, e10);
            }
        }

        @Override // k2.a
        public final int g() {
            return this.f11245c.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup container) {
            Integer num;
            Resources resources;
            kotlin.jvm.internal.i.g(container, "container");
            Context context = this.f11246d;
            View inflate = LayoutInflater.from(context).inflate(R.layout.row_carousel_view_pager, container, false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            if (context != null && (resources = context.getResources()) != null) {
                num = Integer.valueOf(resources.getDimensionPixelSize(R.dimen.margin_16));
            } else {
                num = null;
            }
            if (num != null) {
                num.intValue();
                if (context != null) {
                    ((ProgressBar) constraintLayout.findViewById(R.id.pbCarousel)).setVisibility(0);
                    com.bumptech.glide.e<Drawable> x10 = Glide.c(context).c(context).p(this.f11245c.get(i6)).x(new z4.f().r(new q(num.intValue()), true));
                    com.theinnerhour.b2b.components.learningHub.experiment.activities.b bVar = new com.theinnerhour.b2b.components.learningHub.experiment.activities.b(constraintLayout);
                    x10.f5952a0 = null;
                    x10.w(bVar);
                    x10.e(R.drawable.background_lock_code_error).B((AppCompatImageView) constraintLayout.findViewById(R.id.ivPhoto));
                }
            }
            ((AppCompatImageView) constraintLayout.findViewById(R.id.ivPhoto)).setOnClickListener(DebouncedOnClickListener.wrap(new vm.d(this.f11247e, 1)));
            container.addView(constraintLayout);
            return constraintLayout;
        }

        @Override // k2.a
        public final boolean j(View view, Object object) {
            kotlin.jvm.internal.i.g(view, "view");
            kotlin.jvm.internal.i.g(object, "object");
            if (view == object) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: LearningHubArticleExperimentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<il.q> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final il.q invoke() {
            LearningHubArticleExperimentActivity learningHubArticleExperimentActivity = LearningHubArticleExperimentActivity.this;
            return new il.q(learningHubArticleExperimentActivity, learningHubArticleExperimentActivity);
        }
    }

    /* compiled from: LearningHubArticleExperimentActivity.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubArticleExperimentActivity$onCreate$10$1$1", f = "LearningHubArticleExperimentActivity.kt", l = {449}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f11251u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f11253w;

        /* compiled from: LearningHubArticleExperimentActivity.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubArticleExperimentActivity$onCreate$10$1$1$1$1", f = "LearningHubArticleExperimentActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ LearningHubArticleExperimentActivity f11254u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ Bitmap f11255v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LearningHubArticleExperimentActivity learningHubArticleExperimentActivity, Bitmap bitmap, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f11254u = learningHubArticleExperimentActivity;
                this.f11255v = bitmap;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f11254u, this.f11255v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                sp.b.d0(obj);
                Bitmap bitmap = this.f11255v;
                kotlin.jvm.internal.i.f(bitmap, "bitmap");
                int i6 = LearningHubArticleExperimentActivity.I;
                this.f11254u.s0(bitmap);
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, ls.d<? super d> dVar) {
            super(2, dVar);
            this.f11253w = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new d(this.f11253w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f11251u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                LearningHubArticleExperimentActivity learningHubArticleExperimentActivity = LearningHubArticleExperimentActivity.this;
                com.bumptech.glide.e<Bitmap> a10 = Glide.i(learningHubArticleExperimentActivity).a();
                a10.Z = this.f11253w;
                a10.f5953b0 = true;
                kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                a aVar2 = new a(learningHubArticleExperimentActivity, (Bitmap) a10.E().get(), null);
                this.f11251u = 1;
                if (v.S(k1Var, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LearningHubArticleExperimentActivity.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubArticleExperimentActivity$onCreate$10$3$1", f = "LearningHubArticleExperimentActivity.kt", l = {460}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f11256u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f11258w;

        /* compiled from: LearningHubArticleExperimentActivity.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubArticleExperimentActivity$onCreate$10$3$1$1$1", f = "LearningHubArticleExperimentActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ LearningHubArticleExperimentActivity f11259u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ Bitmap f11260v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LearningHubArticleExperimentActivity learningHubArticleExperimentActivity, Bitmap bitmap, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f11259u = learningHubArticleExperimentActivity;
                this.f11260v = bitmap;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f11259u, this.f11260v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                sp.b.d0(obj);
                Bitmap bitmap = this.f11260v;
                kotlin.jvm.internal.i.f(bitmap, "bitmap");
                int i6 = LearningHubArticleExperimentActivity.I;
                this.f11259u.s0(bitmap);
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, ls.d<? super e> dVar) {
            super(2, dVar);
            this.f11258w = obj;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new e(this.f11258w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f11256u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                LearningHubArticleExperimentActivity learningHubArticleExperimentActivity = LearningHubArticleExperimentActivity.this;
                com.bumptech.glide.e<Bitmap> a10 = Glide.i(learningHubArticleExperimentActivity).a();
                a10.Z = this.f11258w;
                a10.f5953b0 = true;
                kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                a aVar2 = new a(learningHubArticleExperimentActivity, (Bitmap) a10.E().get(), null);
                this.f11256u = 1;
                if (v.S(k1Var, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LearningHubArticleExperimentActivity.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubArticleExperimentActivity$onCreate$10$5$1", f = "LearningHubArticleExperimentActivity.kt", l = {471}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f11261u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f11263w;

        /* compiled from: LearningHubArticleExperimentActivity.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubArticleExperimentActivity$onCreate$10$5$1$1$1", f = "LearningHubArticleExperimentActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ LearningHubArticleExperimentActivity f11264u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ Bitmap f11265v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LearningHubArticleExperimentActivity learningHubArticleExperimentActivity, Bitmap bitmap, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f11264u = learningHubArticleExperimentActivity;
                this.f11265v = bitmap;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f11264u, this.f11265v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                sp.b.d0(obj);
                Bitmap bitmap = this.f11265v;
                kotlin.jvm.internal.i.f(bitmap, "bitmap");
                int i6 = LearningHubArticleExperimentActivity.I;
                this.f11264u.s0(bitmap);
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj, ls.d<? super f> dVar) {
            super(2, dVar);
            this.f11263w = obj;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new f(this.f11263w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f11261u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                LearningHubArticleExperimentActivity learningHubArticleExperimentActivity = LearningHubArticleExperimentActivity.this;
                com.bumptech.glide.e<Bitmap> a10 = Glide.i(learningHubArticleExperimentActivity).a();
                a10.Z = this.f11263w;
                a10.f5953b0 = true;
                kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                a aVar2 = new a(learningHubArticleExperimentActivity, (Bitmap) a10.E().get(), null);
                this.f11261u = 1;
                if (v.S(k1Var, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LearningHubArticleExperimentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage cm2) {
            kotlin.jvm.internal.i.g(cm2, "cm");
            return true;
        }
    }

    /* compiled from: LearningHubArticleExperimentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class h extends WebViewClient {
        public h() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView view, String url) {
            kotlin.jvm.internal.i.g(view, "view");
            kotlin.jvm.internal.i.g(url, "url");
            if (!gv.n.H0(url, "http://") && !gv.n.H0(url, "https://")) {
                return false;
            }
            LearningHubArticleExperimentActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
            return true;
        }
    }

    /* compiled from: LearningHubArticleExperimentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class i extends k implements l<hs.f<? extends String, ? extends UserLibraryItemAccessModel>, hs.k> {
        public i() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends String, ? extends UserLibraryItemAccessModel> fVar) {
            Boolean bool;
            int i6;
            hs.f<? extends String, ? extends UserLibraryItemAccessModel> fVar2 = fVar;
            if (fVar2 != null) {
                UserLibraryItemAccessModel userLibraryItemAccessModel = (UserLibraryItemAccessModel) fVar2.f19465v;
                if (userLibraryItemAccessModel != null) {
                    bool = Boolean.valueOf(userLibraryItemAccessModel.isFavourite());
                } else {
                    bool = null;
                }
                LearningHubArticleExperimentActivity learningHubArticleExperimentActivity = LearningHubArticleExperimentActivity.this;
                learningHubArticleExperimentActivity.B = bool;
                AppCompatImageView appCompatImageView = (AppCompatImageView) learningHubArticleExperimentActivity.n0(R.id.ivRowBookmark1);
                if (appCompatImageView != null) {
                    if (kotlin.jvm.internal.i.b(learningHubArticleExperimentActivity.B, Boolean.TRUE)) {
                        i6 = R.drawable.ic_saved;
                    } else {
                        i6 = R.drawable.ic_unsaved;
                    }
                    Object obj = g0.a.f16164a;
                    appCompatImageView.setImageDrawable(a.c.b(learningHubArticleExperimentActivity, i6));
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LearningHubArticleExperimentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class j extends k implements l<SingleUseEvent<? extends String>, hs.k> {
        public j() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends String> singleUseEvent) {
            String contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            if (contentIfNotHandled != null) {
                LearningHubArticleExperimentActivity learningHubArticleExperimentActivity = LearningHubArticleExperimentActivity.this;
                Toast.makeText(learningHubArticleExperimentActivity, contentIfNotHandled, 1).show();
                learningHubArticleExperimentActivity.onBackPressed();
            }
            return hs.k.f19476a;
        }
    }

    public LearningHubArticleExperimentActivity() {
        boolean z10;
        User user = FirebasePersistence.getInstance().getUser();
        boolean z11 = false;
        if (user != null) {
            HashMap<String, Object> appConfig = user.getAppConfig();
            if (appConfig != null && appConfig.containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !kotlin.jvm.internal.i.b(user.getAppConfig().get(Constants.DASHBOARD_LIBRARY_EXPERIMENT), "default")) {
                z11 = true;
            }
        }
        this.C = z11;
        this.D = sp.b.O(new c());
        this.F = ApplicationPersistence.getInstance();
    }

    @Override // il.n
    public final void H(int i6, String str) {
        if (this.f11242x != null) {
            w p02 = p0();
            v.H(kc.f.H(p02), o0.f23642c, 0, new y(p02, i6, str, null), 2);
        }
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        boolean z10;
        if (Build.VERSION.SDK_INT < 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        super.applyOverrideConfiguration(configuration);
    }

    @Override // il.n
    public final void k(String str) {
        if (this.f11242x != null) {
            w p02 = p0();
            v.H(kc.f.H(p02), o0.f23642c, 0, new x(p02, str, null), 2);
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

    public final void o0(int i6, int i10) {
        try {
            View[] viewArr = new View[i10];
            ConstraintLayout constraintLayout = this.f11243y;
            if (constraintLayout != null) {
                ((LinearLayout) constraintLayout.findViewById(R.id.layoutDots)).removeAllViews();
                boolean z10 = false;
                for (int i11 = 0; i11 < i10; i11++) {
                    LayoutInflater layoutInflater = getLayoutInflater();
                    ConstraintLayout constraintLayout2 = this.f11243y;
                    if (constraintLayout2 != null) {
                        View inflate = layoutInflater.inflate(R.layout.navigation_dot, (ViewGroup) ((LinearLayout) constraintLayout2.findViewById(R.id.layoutDots)), false);
                        viewArr[i11] = inflate;
                        kotlin.jvm.internal.i.d(inflate);
                        Object obj = g0.a.f16164a;
                        inflate.setBackground(a.c.b(this, R.drawable.circle_filled_white_carousel));
                        ConstraintLayout constraintLayout3 = this.f11243y;
                        if (constraintLayout3 != null) {
                            ((LinearLayout) constraintLayout3.findViewById(R.id.layoutDots)).addView(viewArr[i11]);
                        } else {
                            kotlin.jvm.internal.i.q("heading");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.i.q("heading");
                        throw null;
                    }
                }
                if (i10 == 0) {
                    z10 = true;
                }
                if (!z10) {
                    View view = viewArr[i6];
                    kotlin.jvm.internal.i.d(view);
                    Object obj2 = g0.a.f16164a;
                    view.setBackground(a.c.b(this, R.drawable.circle_filled_sea_carousel));
                    return;
                }
                return;
            }
            kotlin.jvm.internal.i.q("heading");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBackPressed() {
        boolean z10;
        hs.k kVar;
        int i6 = this.E;
        boolean z11 = false;
        if (i6 != 3 && i6 % 5 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean containsKey = FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.LIBRARY_EXPERIMENT_V3);
        ApplicationPersistence applicationPersistence = this.F;
        if (containsKey && !kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.LIBRARY_EXPERIMENT_V3), "default") && !applicationPersistence.getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
            long longValue = applicationPersistence.getLongValue(Constants.APP_FEEDBACK_DATE, 0L);
            Utils utils = Utils.INSTANCE;
            if (longValue != utils.getTodayCalendar().getTimeInMillis() && ((applicationPersistence.getIntValue(Constants.APP_OPEN_DAY) - applicationPersistence.getIntValue(Constants.APP_FEEDBACK_DAY) >= 2 || applicationPersistence.getIntValue(Constants.APP_FEEDBACK_DAY, -1) == -1) && z10)) {
                applicationPersistence.setLongValue(Constants.APP_FEEDBACK_DATE, utils.getTodayCalendar().getTimeInMillis());
                applicationPersistence.setIntValue(Constants.APP_FEEDBACK_DAY, applicationPersistence.getIntValue(Constants.APP_OPEN_DAY));
                applicationPersistence.setBooleanValue(Constants.RESOURCES_SHOW_FEEDBACK, false);
                this.G = true;
                z11 = true;
                if (z11) {
                    super.onBackPressed();
                    return;
                }
                Dialog b10 = ((il.q) this.D.getValue()).b(Constants.LEARNING_HUB_READ);
                if (b10 != null) {
                    b10.show();
                    kVar = hs.k.f19476a;
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    super.onBackPressed();
                    return;
                }
                return;
            }
        }
        if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.LIBRARY_EXPERIMENT_V3) && !kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.LIBRARY_EXPERIMENT_V3), "default") && !applicationPersistence.getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false) && !this.G && z10) {
            applicationPersistence.setBooleanValue(Constants.RESOURCES_SHOW_FEEDBACK, true);
        }
        if (z11) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0303 A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0322 A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x036d A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0383 A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04f0 A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0509 A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0571 A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0576 A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x069c A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06b5 A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06fa A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06ff A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0846 A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x08ae A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x08c7 A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x090c A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0911 A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0a4f A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0a6e A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0ab9 A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0acd A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a2 A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d4 A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ff A[Catch: Exception -> 0x0bb4, TryCatch #0 {Exception -> 0x0bb4, blocks: (B:3:0x000b, B:5:0x0032, B:9:0x0057, B:12:0x0061, B:14:0x0070, B:16:0x0080, B:22:0x009b, B:18:0x0088, B:20:0x0090, B:21:0x0096, B:23:0x009e, B:24:0x00c9, B:26:0x00d5, B:28:0x00e5, B:30:0x00e9, B:32:0x00fa, B:37:0x0104, B:38:0x0108, B:39:0x010b, B:40:0x010c, B:42:0x0116, B:44:0x0135, B:49:0x013f, B:50:0x0142, B:52:0x014c, B:54:0x0150, B:55:0x0172, B:56:0x0175, B:57:0x0176, B:59:0x0180, B:65:0x018c, B:67:0x0190, B:73:0x01ca, B:75:0x01d4, B:78:0x01f9, B:79:0x01ff, B:80:0x0202, B:68:0x019e, B:69:0x01a1, B:70:0x01a2, B:72:0x01a6, B:81:0x0203, B:82:0x0206, B:83:0x0207, B:86:0x0211, B:88:0x0220, B:90:0x0230, B:96:0x024b, B:92:0x0238, B:94:0x0240, B:95:0x0246, B:97:0x024e, B:98:0x0279, B:100:0x027f, B:102:0x028f, B:104:0x0293, B:106:0x02a4, B:111:0x02ae, B:112:0x02b2, B:113:0x02b5, B:114:0x02b6, B:116:0x02c0, B:118:0x02df, B:123:0x02e9, B:124:0x02ed, B:126:0x02f7, B:132:0x0303, B:134:0x0307, B:141:0x0351, B:143:0x036d, B:146:0x037d, B:147:0x0383, B:148:0x0386, B:136:0x031e, B:137:0x0321, B:138:0x0322, B:140:0x0326, B:149:0x0387, B:150:0x038a, B:151:0x038b, B:154:0x0395, B:156:0x03b3, B:157:0x03e9, B:158:0x0414, B:160:0x0420, B:162:0x0430, B:164:0x0438, B:167:0x043f, B:168:0x0457, B:170:0x0461, B:172:0x0469, B:175:0x0470, B:176:0x0475, B:178:0x0481, B:180:0x0495, B:181:0x04a2, B:182:0x04a5, B:183:0x04a6, B:185:0x04b0, B:187:0x04b4, B:188:0x04d6, B:189:0x04d9, B:190:0x04da, B:192:0x04e4, B:198:0x04f0, B:200:0x04f4, B:207:0x0532, B:209:0x0571, B:210:0x0576, B:211:0x0579, B:202:0x0505, B:203:0x0508, B:204:0x0509, B:206:0x050d, B:212:0x057a, B:213:0x057d, B:214:0x057e, B:217:0x0588, B:218:0x05b3, B:220:0x05bf, B:222:0x05d1, B:224:0x05d7, B:226:0x05dd, B:231:0x05ea, B:230:0x05e5, B:232:0x05ed, B:233:0x05f0, B:235:0x05fa, B:237:0x060b, B:242:0x0615, B:243:0x0625, B:245:0x0631, B:247:0x0639, B:250:0x0640, B:251:0x0645, B:253:0x064f, B:255:0x0653, B:257:0x066b, B:261:0x0674, B:262:0x0682, B:263:0x0685, B:264:0x0686, B:266:0x0690, B:272:0x069c, B:274:0x06a0, B:281:0x06de, B:283:0x06fa, B:284:0x06ff, B:285:0x0702, B:276:0x06b1, B:277:0x06b4, B:278:0x06b5, B:280:0x06b9, B:286:0x0703, B:287:0x0706, B:288:0x0707, B:291:0x0711, B:293:0x0720, B:295:0x0730, B:301:0x074b, B:297:0x0738, B:299:0x0740, B:300:0x0746, B:302:0x074e, B:303:0x076b, B:305:0x0777, B:307:0x0787, B:309:0x0798, B:314:0x07a2, B:316:0x07b6, B:318:0x07c2, B:320:0x07e1, B:325:0x07eb, B:326:0x07ee, B:328:0x07fa, B:330:0x080e, B:331:0x081b, B:332:0x081e, B:333:0x081f, B:335:0x082b, B:337:0x0833, B:340:0x083a, B:346:0x0846, B:348:0x084a, B:350:0x0853, B:351:0x0860, B:352:0x0863, B:353:0x0864, B:355:0x086e, B:357:0x0872, B:358:0x0894, B:359:0x0897, B:360:0x0898, B:362:0x08a2, B:368:0x08ae, B:370:0x08b2, B:377:0x08f0, B:379:0x090c, B:380:0x0911, B:381:0x0914, B:372:0x08c3, B:373:0x08c6, B:374:0x08c7, B:376:0x08cb, B:382:0x0915, B:383:0x0918, B:384:0x0919, B:387:0x0923, B:389:0x0932, B:391:0x0942, B:397:0x095d, B:393:0x094a, B:395:0x0952, B:396:0x0958, B:398:0x0960, B:399:0x098b, B:401:0x0991, B:403:0x09a1, B:405:0x09a5, B:407:0x09b6, B:412:0x09c0, B:413:0x09c4, B:414:0x09c7, B:415:0x09c8, B:417:0x09d2, B:419:0x09f1, B:424:0x09fb, B:426:0x0a05, B:428:0x0a11, B:430:0x0a15, B:432:0x0a26, B:437:0x0a30, B:438:0x0a35, B:439:0x0a38, B:440:0x0a39, B:442:0x0a43, B:448:0x0a4f, B:450:0x0a53, B:457:0x0a9d, B:459:0x0ab9, B:462:0x0ac8, B:463:0x0acd, B:464:0x0ad0, B:452:0x0a6a, B:453:0x0a6d, B:454:0x0a6e, B:456:0x0a72, B:465:0x0ad1, B:466:0x0ad4, B:467:0x0ad5, B:469:0x0afb, B:471:0x0b7e, B:470:0x0b64), top: B:476:0x000b }] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z10;
        ConstraintLayout constraintLayout;
        String str;
        String str2;
        String str3;
        u0.e aVar;
        boolean z11;
        ConstraintLayout constraintLayout2;
        String str4;
        boolean z12;
        String str5;
        String str6;
        u0.e aVar2;
        boolean z13;
        ConstraintLayout constraintLayout3;
        String str7;
        String str8;
        String str9;
        ArrayList arrayList;
        boolean z14;
        ConstraintLayout constraintLayout4;
        String str10;
        String str11;
        boolean z15;
        ConstraintLayout constraintLayout5;
        String str12;
        String str13;
        u0.e aVar3;
        boolean z16;
        ConstraintLayout constraintLayout6;
        String str14;
        String str15;
        u0.e aVar4;
        super.onCreate(bundle);
        setContentView(R.layout.activity_learning_hub_article_experiment);
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("model");
            kotlin.jvm.internal.i.e(serializableExtra, "null cannot be cast to non-null type com.theinnerhour.b2b.model.LearningHubModel");
            u0((LearningHubModel) serializableExtra);
            final ArrayList<LearningHubFieldModel> fields = q0().getFields();
            String post_type = q0().getPost_type();
            if (post_type != null) {
                switch (post_type.hashCode()) {
                    case -1864532585:
                        if (!post_type.equals("Quotes")) {
                            break;
                        } else {
                            getWindow().setStatusBarColor(g0.a.b(this, R.color.csaDepressionBg));
                            if (Build.VERSION.SDK_INT >= 23) {
                                Window window = getWindow();
                                View decorView = getWindow().getDecorView();
                                int i6 = Build.VERSION.SDK_INT;
                                if (i6 >= 30) {
                                    aVar = new u0.d(window);
                                } else if (i6 >= 26) {
                                    aVar = new u0.c(decorView, window);
                                } else if (i6 >= 23) {
                                    aVar = new u0.b(decorView, window);
                                } else {
                                    aVar = new u0.a(decorView, window);
                                }
                                aVar.d(true);
                            }
                            View inflate = getLayoutInflater().inflate(R.layout.layout_quotes_experiment, (ViewGroup) ((LinearLayout) n0(R.id.headerContainer)), false);
                            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                            ConstraintLayout constraintLayout7 = (ConstraintLayout) inflate;
                            this.f11243y = constraintLayout7;
                            kotlin.jvm.internal.i.f((AppCompatImageView) constraintLayout7.findViewById(R.id.quotesLogo), "heading.quotesLogo");
                            Iterator<LearningHubFieldModel> it = fields.iterator();
                            while (it.hasNext()) {
                                LearningHubFieldModel next = it.next();
                                if (kotlin.jvm.internal.i.b(next.getData_title(), "short_desc")) {
                                    ConstraintLayout constraintLayout8 = this.f11243y;
                                    if (constraintLayout8 != null) {
                                        RobertoTextView robertoTextView = (RobertoTextView) constraintLayout8.findViewById(R.id.quotesQuote);
                                        Object value = next.getValue();
                                        if (value instanceof String) {
                                            str3 = (String) value;
                                        } else {
                                            str3 = null;
                                        }
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        robertoTextView.setText(str3);
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                                if (kotlin.jvm.internal.i.b(next.getData_title(), "long_desc")) {
                                    ((LinearLayout) n0(R.id.linearLayout)).setVisibility(8);
                                    RobertoTextView robertoTextView2 = (RobertoTextView) n0(R.id.learningHubDescription);
                                    Object value2 = next.getValue();
                                    if (value2 instanceof String) {
                                        str2 = (String) value2;
                                    } else {
                                        str2 = null;
                                    }
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    robertoTextView2.setText(str2);
                                }
                                if (kotlin.jvm.internal.i.b(next.getData_title(), "author")) {
                                    ConstraintLayout constraintLayout9 = this.f11243y;
                                    if (constraintLayout9 != null) {
                                        RobertoTextView robertoTextView3 = (RobertoTextView) constraintLayout9.findViewById(R.id.authorName);
                                        Object value3 = next.getValue();
                                        if (value3 instanceof String) {
                                            str = (String) value3;
                                        } else {
                                            str = null;
                                        }
                                        if (str == null) {
                                            str = "";
                                        }
                                        robertoTextView3.setText(str);
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                            }
                            String duration = q0().getDuration();
                            if (duration != null && duration.length() != 0) {
                                z10 = false;
                                if (!z10) {
                                    ConstraintLayout constraintLayout10 = this.f11243y;
                                    if (constraintLayout10 != null) {
                                        ((RobertoTextView) constraintLayout10.findViewById(R.id.quotesHeading)).setText(getString(R.string.quoteOfTheDay));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                } else {
                                    ConstraintLayout constraintLayout11 = this.f11243y;
                                    if (constraintLayout11 != null) {
                                        ((RobertoTextView) constraintLayout11.findViewById(R.id.quotesHeading)).setText(getString(R.string.learningHubExperimentSubHeader, getString(R.string.quoteOfTheDay), q0().getDuration()));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                                ((AppCompatImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.title_high_contrast), PorterDuff.Mode.SRC_ATOP);
                                LinearLayout linearLayout = (LinearLayout) n0(R.id.headerContainer);
                                constraintLayout = this.f11243y;
                                if (constraintLayout == null) {
                                    linearLayout.addView(constraintLayout);
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) n0(R.id.headerContainerFooter);
                                    if (appCompatImageView != null) {
                                        appCompatImageView.setVisibility(0);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    kotlin.jvm.internal.i.q("heading");
                                    throw null;
                                }
                            }
                            z10 = true;
                            if (!z10) {
                            }
                            ((AppCompatImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.title_high_contrast), PorterDuff.Mode.SRC_ATOP);
                            LinearLayout linearLayout2 = (LinearLayout) n0(R.id.headerContainer);
                            constraintLayout = this.f11243y;
                            if (constraintLayout == null) {
                            }
                        }
                        break;
                    case -1732810888:
                        if (!post_type.equals("Videos")) {
                            break;
                        } else {
                            getWindow().setStatusBarColor(g0.a.b(this, R.color.csaDepressionBg));
                            if (Build.VERSION.SDK_INT >= 23) {
                                Window window2 = getWindow();
                                View decorView2 = getWindow().getDecorView();
                                int i10 = Build.VERSION.SDK_INT;
                                if (i10 >= 30) {
                                    aVar2 = new u0.d(window2);
                                } else if (i10 >= 26) {
                                    aVar2 = new u0.c(decorView2, window2);
                                } else if (i10 >= 23) {
                                    aVar2 = new u0.b(decorView2, window2);
                                } else {
                                    aVar2 = new u0.a(decorView2, window2);
                                }
                                aVar2.d(true);
                            }
                            View inflate2 = getLayoutInflater().inflate(R.layout.layout_videos_experiment, (ViewGroup) ((LinearLayout) n0(R.id.headerContainer)), false);
                            kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                            this.f11243y = (ConstraintLayout) inflate2;
                            Iterator<LearningHubFieldModel> it2 = fields.iterator();
                            while (it2.hasNext()) {
                                LearningHubFieldModel next2 = it2.next();
                                if (kotlin.jvm.internal.i.b(next2.getData_title(), "title")) {
                                    RobertoTextView robertoTextView4 = (RobertoTextView) n0(R.id.learningHubTitle);
                                    Object value4 = next2.getValue();
                                    if (value4 instanceof String) {
                                        str6 = (String) value4;
                                    } else {
                                        str6 = null;
                                    }
                                    if (str6 == null) {
                                        str6 = "";
                                    }
                                    robertoTextView4.setText(str6);
                                    ((RobertoTextView) n0(R.id.learningHubTitle)).setVisibility(0);
                                }
                                if (kotlin.jvm.internal.i.b(next2.getData_title(), "description")) {
                                    ((LinearLayout) n0(R.id.linearLayout)).setVisibility(8);
                                    RobertoTextView robertoTextView5 = (RobertoTextView) n0(R.id.learningHubDescription);
                                    Object value5 = next2.getValue();
                                    if (value5 instanceof String) {
                                        str5 = (String) value5;
                                    } else {
                                        str5 = null;
                                    }
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    robertoTextView5.setText(str5);
                                }
                                if (kotlin.jvm.internal.i.b(next2.getData_title(), "thumbnail")) {
                                    com.bumptech.glide.e<Bitmap> a10 = Glide.i(this).a();
                                    a10.Z = next2.getValue();
                                    a10.f5953b0 = true;
                                    ConstraintLayout constraintLayout12 = this.f11243y;
                                    if (constraintLayout12 != null) {
                                        a10.B((AppCompatImageView) constraintLayout12.findViewById(R.id.videosHeaderImage));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                                if (kotlin.jvm.internal.i.b(next2.getData_title(), "video")) {
                                    Object value6 = next2.getValue();
                                    if (value6 instanceof String) {
                                        str4 = (String) value6;
                                    } else {
                                        str4 = null;
                                    }
                                    if (str4 != null && !gv.n.B0(str4)) {
                                        z12 = false;
                                        if (!z12) {
                                            ConstraintLayout constraintLayout13 = this.f11243y;
                                            if (constraintLayout13 != null) {
                                                View findViewById = constraintLayout13.findViewById(R.id.videosHeaderImage);
                                                if (findViewById != null) {
                                                    findViewById.setOnClickListener(new t(28, this, next2, fields));
                                                    hs.k kVar = hs.k.f19476a;
                                                }
                                            } else {
                                                kotlin.jvm.internal.i.q("heading");
                                                throw null;
                                            }
                                        }
                                    }
                                    z12 = true;
                                    if (!z12) {
                                    }
                                }
                                if (kotlin.jvm.internal.i.b(next2.getData_title(), "duration")) {
                                    ConstraintLayout constraintLayout14 = this.f11243y;
                                    if (constraintLayout14 != null) {
                                        ((RobertoTextView) constraintLayout14.findViewById(R.id.videosHeading)).setText(getString(R.string.learningHubExperimentSubHeader, getString(R.string.video), next2.getValue()));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                            }
                            String duration2 = q0().getDuration();
                            if (duration2 != null && duration2.length() != 0) {
                                z11 = false;
                                if (!z11) {
                                    ConstraintLayout constraintLayout15 = this.f11243y;
                                    if (constraintLayout15 != null) {
                                        ((RobertoTextView) constraintLayout15.findViewById(R.id.videosHeading)).setText(getString(R.string.video));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                } else {
                                    ConstraintLayout constraintLayout16 = this.f11243y;
                                    if (constraintLayout16 != null) {
                                        ((RobertoTextView) constraintLayout16.findViewById(R.id.videosHeading)).setText(getString(R.string.learningHubExperimentSubHeader, getString(R.string.video), q0().getDuration()));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                                ((AppCompatImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.title_high_contrast), PorterDuff.Mode.SRC_ATOP);
                                LinearLayout linearLayout3 = (LinearLayout) n0(R.id.headerContainer);
                                constraintLayout2 = this.f11243y;
                                if (constraintLayout2 == null) {
                                    linearLayout3.addView(constraintLayout2);
                                    break;
                                } else {
                                    kotlin.jvm.internal.i.q("heading");
                                    throw null;
                                }
                            }
                            z11 = true;
                            if (!z11) {
                            }
                            ((AppCompatImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.title_high_contrast), PorterDuff.Mode.SRC_ATOP);
                            LinearLayout linearLayout32 = (LinearLayout) n0(R.id.headerContainer);
                            constraintLayout2 = this.f11243y;
                            if (constraintLayout2 == null) {
                            }
                        }
                        break;
                    case -1692490108:
                        if (!post_type.equals("Creatives")) {
                            break;
                        } else {
                            getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
                            View inflate3 = getLayoutInflater().inflate(R.layout.layout_creatives_experiment, (ViewGroup) ((LinearLayout) n0(R.id.headerContainer)), false);
                            kotlin.jvm.internal.i.e(inflate3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                            this.f11243y = (ConstraintLayout) inflate3;
                            Iterator<LearningHubFieldModel> it3 = fields.iterator();
                            while (it3.hasNext()) {
                                LearningHubFieldModel next3 = it3.next();
                                if (kotlin.jvm.internal.i.b(next3.getData_title(), "infographic")) {
                                    Object value7 = next3.getValue();
                                    if (value7 != null) {
                                        ArrayList<String> arrayList2 = this.f11244z;
                                        if (value7 instanceof ArrayList) {
                                            arrayList = (ArrayList) value7;
                                        } else {
                                            arrayList = null;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList2.addAll(arrayList);
                                    }
                                    v0();
                                }
                                if (kotlin.jvm.internal.i.b(next3.getData_title(), "title")) {
                                    RobertoTextView robertoTextView6 = (RobertoTextView) n0(R.id.learningHubTitle);
                                    Object value8 = next3.getValue();
                                    if (value8 instanceof String) {
                                        str9 = (String) value8;
                                    } else {
                                        str9 = null;
                                    }
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    robertoTextView6.setText(str9);
                                    ((RobertoTextView) n0(R.id.learningHubTitle)).setVisibility(0);
                                }
                                if (kotlin.jvm.internal.i.b(next3.getData_title(), "short")) {
                                    Object value9 = next3.getValue();
                                    if (value9 instanceof String) {
                                        str8 = (String) value9;
                                    } else {
                                        str8 = null;
                                    }
                                    if (str8 != null) {
                                        r0(str8);
                                        hs.k kVar2 = hs.k.f19476a;
                                    }
                                }
                                if (kotlin.jvm.internal.i.b(next3.getData_title(), "duration")) {
                                    ConstraintLayout constraintLayout17 = this.f11243y;
                                    if (constraintLayout17 != null) {
                                        RobertoTextView robertoTextView7 = (RobertoTextView) constraintLayout17.findViewById(R.id.creativesHeading);
                                        Object[] objArr = new Object[2];
                                        objArr[0] = getString(R.string.creative);
                                        Object value10 = next3.getValue();
                                        if (value10 instanceof String) {
                                            str7 = (String) value10;
                                        } else {
                                            str7 = null;
                                        }
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        objArr[1] = str7;
                                        robertoTextView7.setText(getString(R.string.learningHubExperimentSubHeader, objArr));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                            }
                            String duration3 = q0().getDuration();
                            if (duration3 != null && duration3.length() != 0) {
                                z13 = false;
                                if (!z13) {
                                    ConstraintLayout constraintLayout18 = this.f11243y;
                                    if (constraintLayout18 != null) {
                                        ((RobertoTextView) constraintLayout18.findViewById(R.id.creativesHeading)).setText(getString(R.string.creative));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                } else {
                                    ConstraintLayout constraintLayout19 = this.f11243y;
                                    if (constraintLayout19 != null) {
                                        ((RobertoTextView) constraintLayout19.findViewById(R.id.creativesHeading)).setText(getString(R.string.learningHubExperimentSubHeader, getString(R.string.creative), q0().getDuration()));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                                ((AppCompatImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.title_high_contrast), PorterDuff.Mode.SRC_ATOP);
                                LinearLayout linearLayout4 = (LinearLayout) n0(R.id.headerContainer);
                                constraintLayout3 = this.f11243y;
                                if (constraintLayout3 == null) {
                                    linearLayout4.addView(constraintLayout3);
                                    break;
                                } else {
                                    kotlin.jvm.internal.i.q("heading");
                                    throw null;
                                }
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            ((AppCompatImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.title_high_contrast), PorterDuff.Mode.SRC_ATOP);
                            LinearLayout linearLayout42 = (LinearLayout) n0(R.id.headerContainer);
                            constraintLayout3 = this.f11243y;
                            if (constraintLayout3 == null) {
                            }
                        }
                        break;
                    case -1164233123:
                        if (!post_type.equals("Articles")) {
                            break;
                        } else {
                            if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getCourseArticleList().contains(q0().getId())) {
                                FirebasePersistence.getInstance().getUser().getUserGamificationModel().getCourseArticleList().add(q0().getId());
                                FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(5, Constants.GAMIFICATION_READING_ARTICLE_TASK, FirebasePersistence.getInstance().getUser().getCurrentCourseName()));
                            }
                            getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
                            View inflate4 = getLayoutInflater().inflate(R.layout.layout_article_experiment, (ViewGroup) ((LinearLayout) n0(R.id.headerContainer)), false);
                            kotlin.jvm.internal.i.e(inflate4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                            this.f11243y = (ConstraintLayout) inflate4;
                            Iterator<LearningHubFieldModel> it4 = fields.iterator();
                            while (it4.hasNext()) {
                                LearningHubFieldModel next4 = it4.next();
                                if (kotlin.jvm.internal.i.b(next4.getData_title(), "title")) {
                                    Object value11 = next4.getValue();
                                    if (value11 instanceof String) {
                                        str11 = (String) value11;
                                    } else {
                                        str11 = null;
                                    }
                                    if (str11 != null) {
                                        ((RobertoTextView) n0(R.id.learningHubTitle)).setVisibility(0);
                                        ((RobertoTextView) n0(R.id.learningHubTitle)).setText(str11);
                                        hs.k kVar3 = hs.k.f19476a;
                                    }
                                }
                                if (kotlin.jvm.internal.i.b(next4.getData_title(), "long_desc")) {
                                    Object value12 = next4.getValue();
                                    if (value12 instanceof String) {
                                        str10 = (String) value12;
                                    } else {
                                        str10 = null;
                                    }
                                    if (str10 != null) {
                                        r0(str10);
                                        hs.k kVar4 = hs.k.f19476a;
                                    }
                                }
                                if (kotlin.jvm.internal.i.b(next4.getData_title(), "cover")) {
                                    com.bumptech.glide.e<Bitmap> a11 = Glide.i(this).a();
                                    a11.Z = next4.getValue();
                                    a11.f5953b0 = true;
                                    ConstraintLayout constraintLayout20 = this.f11243y;
                                    if (constraintLayout20 != null) {
                                        a11.B((AppCompatImageView) constraintLayout20.findViewById(R.id.articleHeaderImage));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                                if (kotlin.jvm.internal.i.b(next4.getData_title(), "duration")) {
                                    ConstraintLayout constraintLayout21 = this.f11243y;
                                    if (constraintLayout21 != null) {
                                        ((RobertoTextView) constraintLayout21.findViewById(R.id.articleHeading)).setText(getString(R.string.learningHubExperimentSubHeader, getString(R.string.article), next4.getValue()));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                            }
                            String duration4 = q0().getDuration();
                            if (duration4 != null && duration4.length() != 0) {
                                z14 = false;
                                if (!z14) {
                                    ConstraintLayout constraintLayout22 = this.f11243y;
                                    if (constraintLayout22 != null) {
                                        ((RobertoTextView) constraintLayout22.findViewById(R.id.articleHeading)).setText(getString(R.string.article));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                } else {
                                    ConstraintLayout constraintLayout23 = this.f11243y;
                                    if (constraintLayout23 != null) {
                                        ((RobertoTextView) constraintLayout23.findViewById(R.id.articleHeading)).setText(getString(R.string.learningHubExperimentSubHeader, getString(R.string.article), q0().getDuration()));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                                ((AppCompatImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.title_high_contrast), PorterDuff.Mode.SRC_ATOP);
                                ((AppCompatImageView) n0(R.id.ivClose)).setBackground(getDrawable(R.drawable.circle_filled_white));
                                ((AppCompatImageView) n0(R.id.ivRowBookmark1)).setBackground(getDrawable(R.drawable.circle_filled_white));
                                LinearLayout linearLayout5 = (LinearLayout) n0(R.id.headerContainer);
                                constraintLayout4 = this.f11243y;
                                if (constraintLayout4 == null) {
                                    linearLayout5.addView(constraintLayout4);
                                    break;
                                } else {
                                    kotlin.jvm.internal.i.q("heading");
                                    throw null;
                                }
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            ((AppCompatImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.title_high_contrast), PorterDuff.Mode.SRC_ATOP);
                            ((AppCompatImageView) n0(R.id.ivClose)).setBackground(getDrawable(R.drawable.circle_filled_white));
                            ((AppCompatImageView) n0(R.id.ivRowBookmark1)).setBackground(getDrawable(R.drawable.circle_filled_white));
                            LinearLayout linearLayout52 = (LinearLayout) n0(R.id.headerContainer);
                            constraintLayout4 = this.f11243y;
                            if (constraintLayout4 == null) {
                            }
                        }
                        break;
                    case -312086034:
                        if (!post_type.equals("Therapist says")) {
                            break;
                        } else {
                            getWindow().setStatusBarColor(g0.a.b(this, R.color.csaDepressionBg));
                            if (Build.VERSION.SDK_INT >= 23) {
                                Window window3 = getWindow();
                                View decorView3 = getWindow().getDecorView();
                                int i11 = Build.VERSION.SDK_INT;
                                if (i11 >= 30) {
                                    aVar3 = new u0.d(window3);
                                } else if (i11 >= 26) {
                                    aVar3 = new u0.c(decorView3, window3);
                                } else if (i11 >= 23) {
                                    aVar3 = new u0.b(decorView3, window3);
                                } else {
                                    aVar3 = new u0.a(decorView3, window3);
                                }
                                aVar3.d(true);
                            }
                            View inflate5 = getLayoutInflater().inflate(R.layout.layout_therapist_says_experiment, (ViewGroup) ((LinearLayout) n0(R.id.headerContainer)), false);
                            kotlin.jvm.internal.i.e(inflate5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                            ConstraintLayout constraintLayout24 = (ConstraintLayout) inflate5;
                            this.f11243y = constraintLayout24;
                            kotlin.jvm.internal.i.f((AppCompatImageView) constraintLayout24.findViewById(R.id.therapistSaysLogo), "heading.therapistSaysLogo");
                            Iterator<LearningHubFieldModel> it5 = fields.iterator();
                            while (it5.hasNext()) {
                                LearningHubFieldModel next5 = it5.next();
                                if (kotlin.jvm.internal.i.b(next5.getData_title(), "short_desc")) {
                                    ConstraintLayout constraintLayout25 = this.f11243y;
                                    if (constraintLayout25 != null) {
                                        RobertoTextView robertoTextView8 = (RobertoTextView) constraintLayout25.findViewById(R.id.therapistSaysQuote);
                                        Object value13 = next5.getValue();
                                        if (value13 instanceof String) {
                                            str13 = (String) value13;
                                        } else {
                                            str13 = null;
                                        }
                                        if (str13 == null) {
                                            str13 = "";
                                        }
                                        robertoTextView8.setText(str13);
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                                if (kotlin.jvm.internal.i.b(next5.getData_title(), "long_desc")) {
                                    ((LinearLayout) n0(R.id.linearLayout)).setVisibility(8);
                                    RobertoTextView robertoTextView9 = (RobertoTextView) n0(R.id.learningHubDescription);
                                    Object value14 = next5.getValue();
                                    if (value14 instanceof String) {
                                        str12 = (String) value14;
                                    } else {
                                        str12 = null;
                                    }
                                    if (str12 == null) {
                                        str12 = "";
                                    }
                                    robertoTextView9.setText(str12);
                                }
                            }
                            String duration5 = q0().getDuration();
                            if (duration5 != null && duration5.length() != 0) {
                                z15 = false;
                                if (!z15) {
                                    ConstraintLayout constraintLayout26 = this.f11243y;
                                    if (constraintLayout26 != null) {
                                        ((RobertoTextView) constraintLayout26.findViewById(R.id.therapistSaysHeading)).setText(getString(R.string.therapistSays));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                } else {
                                    ConstraintLayout constraintLayout27 = this.f11243y;
                                    if (constraintLayout27 != null) {
                                        ((RobertoTextView) constraintLayout27.findViewById(R.id.therapistSaysHeading)).setText(getString(R.string.learningHubExperimentSubHeader, getString(R.string.therapistSays), q0().getDuration()));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                                ((AppCompatImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.title_high_contrast), PorterDuff.Mode.SRC_ATOP);
                                LinearLayout linearLayout6 = (LinearLayout) n0(R.id.headerContainer);
                                constraintLayout5 = this.f11243y;
                                if (constraintLayout5 == null) {
                                    linearLayout6.addView(constraintLayout5);
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) n0(R.id.headerContainerFooter);
                                    if (appCompatImageView2 != null) {
                                        appCompatImageView2.setVisibility(0);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    kotlin.jvm.internal.i.q("heading");
                                    throw null;
                                }
                            }
                            z15 = true;
                            if (!z15) {
                            }
                            ((AppCompatImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.title_high_contrast), PorterDuff.Mode.SRC_ATOP);
                            LinearLayout linearLayout62 = (LinearLayout) n0(R.id.headerContainer);
                            constraintLayout5 = this.f11243y;
                            if (constraintLayout5 == null) {
                            }
                        }
                        break;
                    case 2606936:
                        if (!post_type.equals("Tips")) {
                            break;
                        } else {
                            getWindow().setStatusBarColor(g0.a.b(this, R.color.csaDepressionBg));
                            if (Build.VERSION.SDK_INT >= 23) {
                                Window window4 = getWindow();
                                View decorView4 = getWindow().getDecorView();
                                int i12 = Build.VERSION.SDK_INT;
                                if (i12 >= 30) {
                                    aVar4 = new u0.d(window4);
                                } else if (i12 >= 26) {
                                    aVar4 = new u0.c(decorView4, window4);
                                } else if (i12 >= 23) {
                                    aVar4 = new u0.b(decorView4, window4);
                                } else {
                                    aVar4 = new u0.a(decorView4, window4);
                                }
                                aVar4.d(true);
                            }
                            View inflate6 = getLayoutInflater().inflate(R.layout.layout_tips_experiment, (ViewGroup) ((LinearLayout) n0(R.id.headerContainer)), false);
                            kotlin.jvm.internal.i.e(inflate6, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                            ConstraintLayout constraintLayout28 = (ConstraintLayout) inflate6;
                            this.f11243y = constraintLayout28;
                            kotlin.jvm.internal.i.f((AppCompatImageView) constraintLayout28.findViewById(R.id.tipsLogo), "heading.tipsLogo");
                            Iterator<LearningHubFieldModel> it6 = fields.iterator();
                            while (it6.hasNext()) {
                                LearningHubFieldModel next6 = it6.next();
                                if (kotlin.jvm.internal.i.b(next6.getData_title(), "short_desc")) {
                                    ConstraintLayout constraintLayout29 = this.f11243y;
                                    if (constraintLayout29 != null) {
                                        RobertoTextView robertoTextView10 = (RobertoTextView) constraintLayout29.findViewById(R.id.tipsQuote);
                                        Object value15 = next6.getValue();
                                        if (value15 instanceof String) {
                                            str15 = (String) value15;
                                        } else {
                                            str15 = null;
                                        }
                                        if (str15 == null) {
                                            str15 = "";
                                        }
                                        robertoTextView10.setText(str15);
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                                if (kotlin.jvm.internal.i.b(next6.getData_title(), "long_desc")) {
                                    ((LinearLayout) n0(R.id.linearLayout)).setVisibility(8);
                                    RobertoTextView robertoTextView11 = (RobertoTextView) n0(R.id.learningHubDescription);
                                    Object value16 = next6.getValue();
                                    if (value16 instanceof String) {
                                        str14 = (String) value16;
                                    } else {
                                        str14 = null;
                                    }
                                    if (str14 == null) {
                                        str14 = "";
                                    }
                                    robertoTextView11.setText(str14);
                                }
                                if (kotlin.jvm.internal.i.b(next6.getData_title(), "duration")) {
                                    ConstraintLayout constraintLayout30 = this.f11243y;
                                    if (constraintLayout30 != null) {
                                        ((RobertoTextView) constraintLayout30.findViewById(R.id.tipsHeading)).setText(getString(R.string.learningHubExperimentSubHeader, getString(R.string.innerHourTip), next6.getValue()));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                            }
                            String duration6 = q0().getDuration();
                            if (duration6 != null && duration6.length() != 0) {
                                z16 = false;
                                if (!z16) {
                                    ConstraintLayout constraintLayout31 = this.f11243y;
                                    if (constraintLayout31 != null) {
                                        ((RobertoTextView) constraintLayout31.findViewById(R.id.tipsHeading)).setText(getString(R.string.innerHourTip));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                } else {
                                    ConstraintLayout constraintLayout32 = this.f11243y;
                                    if (constraintLayout32 != null) {
                                        ((RobertoTextView) constraintLayout32.findViewById(R.id.tipsHeading)).setText(getString(R.string.learningHubExperimentSubHeader, getString(R.string.innerHourTip), q0().getDuration()));
                                    } else {
                                        kotlin.jvm.internal.i.q("heading");
                                        throw null;
                                    }
                                }
                                LinearLayout linearLayout7 = (LinearLayout) n0(R.id.headerContainer);
                                constraintLayout6 = this.f11243y;
                                if (constraintLayout6 == null) {
                                    linearLayout7.addView(constraintLayout6);
                                    ((AppCompatImageView) n0(R.id.ivClose)).setColorFilter(g0.a.b(this, R.color.title_high_contrast), PorterDuff.Mode.SRC_ATOP);
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) n0(R.id.headerContainerFooter);
                                    if (appCompatImageView3 != null) {
                                        appCompatImageView3.setVisibility(0);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    kotlin.jvm.internal.i.q("heading");
                                    throw null;
                                }
                            }
                            z16 = true;
                            if (!z16) {
                            }
                            LinearLayout linearLayout72 = (LinearLayout) n0(R.id.headerContainer);
                            constraintLayout6 = this.f11243y;
                            if (constraintLayout6 == null) {
                            }
                        }
                        break;
                }
            }
            ((WebView) n0(R.id.webview)).setWebChromeClient(new g());
            ((WebView) n0(R.id.webview)).setWebViewClient(new h());
            if (this.C) {
                e1 e1Var = new e1();
                Application application = getApplication();
                kotlin.jvm.internal.i.f(application, "this.application");
                l0 a12 = new androidx.lifecycle.o0(this, new kk.c(e1Var, application)).a(w.class);
                w wVar = (w) a12;
                wVar.g().e(this, new qm.c(7, new i()));
                ((androidx.lifecycle.w) wVar.G.getValue()).e(this, new qm.c(8, new j()));
                wVar.e(q0());
                t0((w) a12);
                ((AppCompatImageView) n0(R.id.ivRowBookmark1)).setOnClickListener(new View.OnClickListener(this) { // from class: vm.c

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ LearningHubArticleExperimentActivity f35281v;

                    {
                        this.f35281v = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c9, code lost:
                        if (r0.equals("Quotes") == false) goto L183;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cc, code lost:
                        r0 = r15.f11243y;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:138:0x02ce, code lost:
                        if (r0 == null) goto L110;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d0, code lost:
                        r15.s0(t0.l0.h(r0));
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d9, code lost:
                        kotlin.jvm.internal.i.q("heading");
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:142:0x02df, code lost:
                        throw null;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f3, code lost:
                        if (r0.equals("Tips") == false) goto L183;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:95:0x01fd, code lost:
                        if (r0.equals("Therapist says") == false) goto L183;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:146:0x0314  */
                    /* JADX WARN: Type inference failed for: r2v41 */
                    /* JADX WARN: Type inference failed for: r2v42 */
                    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void onClick(View view) {
                        String str16;
                        Iterator it7;
                        String str17;
                        String str18;
                        Object obj;
                        Object value17;
                        String str19;
                        Object obj2;
                        Object value18;
                        Object obj3;
                        Object obj4;
                        String str20;
                        String str21;
                        int i13;
                        int i14;
                        String str22;
                        String str23;
                        String str24;
                        ?? r22;
                        boolean z17;
                        boolean z18;
                        int i15 = r3;
                        ArrayList values = fields;
                        LearningHubArticleExperimentActivity this$0 = this.f35281v;
                        switch (i15) {
                            case 0:
                                int i16 = LearningHubArticleExperimentActivity.I;
                                i.g(this$0, "this$0");
                                i.g(values, "$values");
                                if (this$0.q0().getId() != null && this$0.f11242x != null) {
                                    Iterator it8 = this$0.q0().getFields().iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            obj3 = it8.next();
                                            LearningHubFieldModel learningHubFieldModel = (LearningHubFieldModel) obj3;
                                            if (i.b(learningHubFieldModel.getData_title(), "title") && i.b(learningHubFieldModel.getData_type(), "text")) {
                                                z18 = true;
                                                continue;
                                            } else {
                                                z18 = false;
                                                continue;
                                            }
                                            if (z18) {
                                            }
                                        } else {
                                            obj3 = null;
                                        }
                                    }
                                    LearningHubFieldModel learningHubFieldModel2 = (LearningHubFieldModel) obj3;
                                    if (learningHubFieldModel2 == null) {
                                        Iterator it9 = this$0.q0().getFields().iterator();
                                        while (true) {
                                            if (it9.hasNext()) {
                                                r22 = it9.next();
                                                LearningHubFieldModel learningHubFieldModel3 = (LearningHubFieldModel) r22;
                                                if (i.b(learningHubFieldModel3.getData_title(), "short_desc") && i.b(learningHubFieldModel3.getData_type(), "text")) {
                                                    z17 = true;
                                                    continue;
                                                } else {
                                                    z17 = false;
                                                    continue;
                                                }
                                                if (z17) {
                                                }
                                            } else {
                                                r22 = 0;
                                            }
                                        }
                                        learningHubFieldModel2 = r22;
                                    }
                                    if (learningHubFieldModel2 != null) {
                                        obj4 = learningHubFieldModel2.getValue();
                                    } else {
                                        obj4 = null;
                                    }
                                    if (obj4 instanceof String) {
                                        str20 = (String) obj4;
                                    } else {
                                        str20 = null;
                                    }
                                    Boolean bool = this$0.B;
                                    Boolean bool2 = Boolean.TRUE;
                                    if (i.b(bool, bool2)) {
                                        this$0.B = Boolean.FALSE;
                                        Object obj5 = g0.a.f16164a;
                                        ((AppCompatImageView) this$0.n0(R.id.ivRowBookmark1)).setImageDrawable(a.c.b(this$0, R.drawable.ic_unsaved));
                                    } else {
                                        this$0.B = bool2;
                                        Object obj6 = g0.a.f16164a;
                                        ((AppCompatImageView) this$0.n0(R.id.ivRowBookmark1)).setImageDrawable(a.c.b(this$0, R.drawable.ic_saved));
                                    }
                                    w p02 = this$0.p0();
                                    String id2 = this$0.q0().getId();
                                    if (str20 == null) {
                                        str21 = "";
                                    } else {
                                        str21 = str20;
                                    }
                                    Boolean bool3 = this$0.B;
                                    i.d(bool3);
                                    boolean booleanValue = bool3.booleanValue();
                                    if (id2 == null) {
                                        i13 = 0;
                                    } else {
                                        i13 = 0;
                                        v.H(kc.f.H(p02), null, 0, new cn.v(p02, id2, str21, booleanValue, null), 3);
                                    }
                                    if (i.b(this$0.B, bool2)) {
                                        i14 = R.string.notV4BookmarkSavedToast;
                                    } else {
                                        i14 = R.string.notV4BookmarkUnsavedToast;
                                    }
                                    Toast.makeText(this$0, this$0.getString(i14), i13).show();
                                    String str25 = gk.a.f16573a;
                                    if (i.b(this$0.B, bool2)) {
                                        str22 = "cm_post_favourite_click";
                                    } else {
                                        str22 = "cm_post_favourite_remove_click";
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                    bundle2.putString("post_id", this$0.q0().getId());
                                    bundle2.putString("post_type", this$0.q0().getPost_type());
                                    Iterator it10 = values.iterator();
                                    while (it10.hasNext()) {
                                        LearningHubFieldModel learningHubFieldModel4 = (LearningHubFieldModel) it10.next();
                                        if (i.b(learningHubFieldModel4.getData_title(), "title")) {
                                            Object value19 = learningHubFieldModel4.getValue();
                                            if (value19 instanceof String) {
                                                str23 = (String) value19;
                                            } else {
                                                str23 = null;
                                            }
                                            if (str23 == null) {
                                                str23 = "";
                                            }
                                            bundle2.putString("post_name", str23);
                                        } else if (i.b(learningHubFieldModel4.getData_title(), "short_desc")) {
                                            Object value20 = learningHubFieldModel4.getValue();
                                            if (value20 instanceof String) {
                                                str24 = (String) value20;
                                            } else {
                                                str24 = null;
                                            }
                                            if (str24 == null) {
                                                str24 = "";
                                            }
                                            bundle2.putString("post_name", str24);
                                        }
                                    }
                                    bundle2.putString("post_course", this$0.q0().getProgramme());
                                    hs.k kVar5 = hs.k.f19476a;
                                    gk.a.b(bundle2, str22);
                                    return;
                                }
                                return;
                            default:
                                int i17 = LearningHubArticleExperimentActivity.I;
                                i.g(this$0, "this$0");
                                i.g(values, "$values");
                                String post_type2 = this$0.q0().getPost_type();
                                if (post_type2 != null) {
                                    switch (post_type2.hashCode()) {
                                        case -1864532585:
                                            break;
                                        case -1732810888:
                                            if (post_type2.equals("Videos")) {
                                                Iterator it11 = this$0.q0().getFields().iterator();
                                                while (true) {
                                                    if (it11.hasNext()) {
                                                        obj = it11.next();
                                                        if (i.b(((LearningHubFieldModel) obj).getData_title(), "thumbnail")) {
                                                        }
                                                    } else {
                                                        obj = null;
                                                    }
                                                }
                                                LearningHubFieldModel learningHubFieldModel5 = (LearningHubFieldModel) obj;
                                                if (learningHubFieldModel5 != null && (value17 = learningHubFieldModel5.getValue()) != null) {
                                                    str19 = null;
                                                    v.H(h.c(o0.f23642c), null, 0, new LearningHubArticleExperimentActivity.f(value17, null), 3);
                                                    str16 = str19;
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                                    bundle3.putString("post_id", this$0.q0().getId());
                                                    bundle3.putString("post_type", this$0.q0().getPost_type());
                                                    it7 = values.iterator();
                                                    while (it7.hasNext()) {
                                                        LearningHubFieldModel learningHubFieldModel6 = (LearningHubFieldModel) it7.next();
                                                        if (i.b(learningHubFieldModel6.getData_title(), "title")) {
                                                            Object value21 = learningHubFieldModel6.getValue();
                                                            if (value21 instanceof String) {
                                                                str17 = (String) value21;
                                                            } else {
                                                                str17 = str16;
                                                            }
                                                            if (str17 == null) {
                                                                str17 = "";
                                                            }
                                                            bundle3.putString("post_name", str17);
                                                        } else if (i.b(learningHubFieldModel6.getData_title(), "short_desc")) {
                                                            Object value22 = learningHubFieldModel6.getValue();
                                                            if (value22 instanceof String) {
                                                                str18 = (String) value22;
                                                            } else {
                                                                str18 = str16;
                                                            }
                                                            if (str18 == null) {
                                                                str18 = "";
                                                            }
                                                            bundle3.putString("post_name", str18);
                                                        }
                                                    }
                                                    bundle3.putString("post_course", this$0.q0().getProgramme());
                                                    gk.a.b(bundle3, "cm_post_share");
                                                    return;
                                                }
                                            }
                                            break;
                                        case -1692490108:
                                            if (post_type2.equals("Creatives")) {
                                                String str26 = (String) u.j2(this$0.A, this$0.f11244z);
                                                if (str26 != null) {
                                                    str19 = null;
                                                    v.H(h.c(o0.f23642c), null, 0, new LearningHubArticleExperimentActivity.d(str26, null), 3);
                                                    str16 = str19;
                                                    Bundle bundle32 = new Bundle();
                                                    bundle32.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                                    bundle32.putString("post_id", this$0.q0().getId());
                                                    bundle32.putString("post_type", this$0.q0().getPost_type());
                                                    it7 = values.iterator();
                                                    while (it7.hasNext()) {
                                                    }
                                                    bundle32.putString("post_course", this$0.q0().getProgramme());
                                                    gk.a.b(bundle32, "cm_post_share");
                                                    return;
                                                }
                                            }
                                            break;
                                        case -1164233123:
                                            if (post_type2.equals("Articles")) {
                                                Iterator it12 = this$0.q0().getFields().iterator();
                                                while (true) {
                                                    if (it12.hasNext()) {
                                                        obj2 = it12.next();
                                                        if (i.b(((LearningHubFieldModel) obj2).getData_title(), "cover")) {
                                                        }
                                                    } else {
                                                        obj2 = null;
                                                    }
                                                }
                                                LearningHubFieldModel learningHubFieldModel7 = (LearningHubFieldModel) obj2;
                                                if (learningHubFieldModel7 != null && (value18 = learningHubFieldModel7.getValue()) != null) {
                                                    str19 = null;
                                                    v.H(h.c(o0.f23642c), null, 0, new LearningHubArticleExperimentActivity.e(value18, null), 3);
                                                    str16 = str19;
                                                    Bundle bundle322 = new Bundle();
                                                    bundle322.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                                    bundle322.putString("post_id", this$0.q0().getId());
                                                    bundle322.putString("post_type", this$0.q0().getPost_type());
                                                    it7 = values.iterator();
                                                    while (it7.hasNext()) {
                                                    }
                                                    bundle322.putString("post_course", this$0.q0().getProgramme());
                                                    gk.a.b(bundle322, "cm_post_share");
                                                    return;
                                                }
                                            }
                                            break;
                                        case -312086034:
                                            break;
                                        case 2606936:
                                            break;
                                    }
                                }
                                str16 = null;
                                Bundle bundle3222 = new Bundle();
                                bundle3222.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                bundle3222.putString("post_id", this$0.q0().getId());
                                bundle3222.putString("post_type", this$0.q0().getPost_type());
                                it7 = values.iterator();
                                while (it7.hasNext()) {
                                }
                                bundle3222.putString("post_course", this$0.q0().getProgramme());
                                gk.a.b(bundle3222, "cm_post_share");
                                return;
                        }
                    }
                });
            } else {
                ((AppCompatImageView) n0(R.id.ivRowBookmark1)).setVisibility(8);
                ((AppCompatImageView) n0(R.id.ivRowBookmark2)).setVisibility(8);
            }
            ((AppCompatImageView) n0(R.id.learningHubFAB)).setOnClickListener(new View.OnClickListener(this) { // from class: vm.c

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ LearningHubArticleExperimentActivity f35281v;

                {
                    this.f35281v = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:135:0x02c9, code lost:
                    if (r0.equals("Quotes") == false) goto L183;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:137:0x02cc, code lost:
                    r0 = r15.f11243y;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:138:0x02ce, code lost:
                    if (r0 == null) goto L110;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:139:0x02d0, code lost:
                    r15.s0(t0.l0.h(r0));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:141:0x02d9, code lost:
                    kotlin.jvm.internal.i.q("heading");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:142:0x02df, code lost:
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:92:0x01f3, code lost:
                    if (r0.equals("Tips") == false) goto L183;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:95:0x01fd, code lost:
                    if (r0.equals("Therapist says") == false) goto L183;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:146:0x0314  */
                /* JADX WARN: Type inference failed for: r2v41 */
                /* JADX WARN: Type inference failed for: r2v42 */
                /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view) {
                    String str16;
                    Iterator it7;
                    String str17;
                    String str18;
                    Object obj;
                    Object value17;
                    String str19;
                    Object obj2;
                    Object value18;
                    Object obj3;
                    Object obj4;
                    String str20;
                    String str21;
                    int i13;
                    int i14;
                    String str22;
                    String str23;
                    String str24;
                    ?? r22;
                    boolean z17;
                    boolean z18;
                    int i15 = r3;
                    ArrayList values = fields;
                    LearningHubArticleExperimentActivity this$0 = this.f35281v;
                    switch (i15) {
                        case 0:
                            int i16 = LearningHubArticleExperimentActivity.I;
                            i.g(this$0, "this$0");
                            i.g(values, "$values");
                            if (this$0.q0().getId() != null && this$0.f11242x != null) {
                                Iterator it8 = this$0.q0().getFields().iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        obj3 = it8.next();
                                        LearningHubFieldModel learningHubFieldModel = (LearningHubFieldModel) obj3;
                                        if (i.b(learningHubFieldModel.getData_title(), "title") && i.b(learningHubFieldModel.getData_type(), "text")) {
                                            z18 = true;
                                            continue;
                                        } else {
                                            z18 = false;
                                            continue;
                                        }
                                        if (z18) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                LearningHubFieldModel learningHubFieldModel2 = (LearningHubFieldModel) obj3;
                                if (learningHubFieldModel2 == null) {
                                    Iterator it9 = this$0.q0().getFields().iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            r22 = it9.next();
                                            LearningHubFieldModel learningHubFieldModel3 = (LearningHubFieldModel) r22;
                                            if (i.b(learningHubFieldModel3.getData_title(), "short_desc") && i.b(learningHubFieldModel3.getData_type(), "text")) {
                                                z17 = true;
                                                continue;
                                            } else {
                                                z17 = false;
                                                continue;
                                            }
                                            if (z17) {
                                            }
                                        } else {
                                            r22 = 0;
                                        }
                                    }
                                    learningHubFieldModel2 = r22;
                                }
                                if (learningHubFieldModel2 != null) {
                                    obj4 = learningHubFieldModel2.getValue();
                                } else {
                                    obj4 = null;
                                }
                                if (obj4 instanceof String) {
                                    str20 = (String) obj4;
                                } else {
                                    str20 = null;
                                }
                                Boolean bool = this$0.B;
                                Boolean bool2 = Boolean.TRUE;
                                if (i.b(bool, bool2)) {
                                    this$0.B = Boolean.FALSE;
                                    Object obj5 = g0.a.f16164a;
                                    ((AppCompatImageView) this$0.n0(R.id.ivRowBookmark1)).setImageDrawable(a.c.b(this$0, R.drawable.ic_unsaved));
                                } else {
                                    this$0.B = bool2;
                                    Object obj6 = g0.a.f16164a;
                                    ((AppCompatImageView) this$0.n0(R.id.ivRowBookmark1)).setImageDrawable(a.c.b(this$0, R.drawable.ic_saved));
                                }
                                w p02 = this$0.p0();
                                String id2 = this$0.q0().getId();
                                if (str20 == null) {
                                    str21 = "";
                                } else {
                                    str21 = str20;
                                }
                                Boolean bool3 = this$0.B;
                                i.d(bool3);
                                boolean booleanValue = bool3.booleanValue();
                                if (id2 == null) {
                                    i13 = 0;
                                } else {
                                    i13 = 0;
                                    v.H(kc.f.H(p02), null, 0, new cn.v(p02, id2, str21, booleanValue, null), 3);
                                }
                                if (i.b(this$0.B, bool2)) {
                                    i14 = R.string.notV4BookmarkSavedToast;
                                } else {
                                    i14 = R.string.notV4BookmarkUnsavedToast;
                                }
                                Toast.makeText(this$0, this$0.getString(i14), i13).show();
                                String str25 = gk.a.f16573a;
                                if (i.b(this$0.B, bool2)) {
                                    str22 = "cm_post_favourite_click";
                                } else {
                                    str22 = "cm_post_favourite_remove_click";
                                }
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                bundle2.putString("post_id", this$0.q0().getId());
                                bundle2.putString("post_type", this$0.q0().getPost_type());
                                Iterator it10 = values.iterator();
                                while (it10.hasNext()) {
                                    LearningHubFieldModel learningHubFieldModel4 = (LearningHubFieldModel) it10.next();
                                    if (i.b(learningHubFieldModel4.getData_title(), "title")) {
                                        Object value19 = learningHubFieldModel4.getValue();
                                        if (value19 instanceof String) {
                                            str23 = (String) value19;
                                        } else {
                                            str23 = null;
                                        }
                                        if (str23 == null) {
                                            str23 = "";
                                        }
                                        bundle2.putString("post_name", str23);
                                    } else if (i.b(learningHubFieldModel4.getData_title(), "short_desc")) {
                                        Object value20 = learningHubFieldModel4.getValue();
                                        if (value20 instanceof String) {
                                            str24 = (String) value20;
                                        } else {
                                            str24 = null;
                                        }
                                        if (str24 == null) {
                                            str24 = "";
                                        }
                                        bundle2.putString("post_name", str24);
                                    }
                                }
                                bundle2.putString("post_course", this$0.q0().getProgramme());
                                hs.k kVar5 = hs.k.f19476a;
                                gk.a.b(bundle2, str22);
                                return;
                            }
                            return;
                        default:
                            int i17 = LearningHubArticleExperimentActivity.I;
                            i.g(this$0, "this$0");
                            i.g(values, "$values");
                            String post_type2 = this$0.q0().getPost_type();
                            if (post_type2 != null) {
                                switch (post_type2.hashCode()) {
                                    case -1864532585:
                                        break;
                                    case -1732810888:
                                        if (post_type2.equals("Videos")) {
                                            Iterator it11 = this$0.q0().getFields().iterator();
                                            while (true) {
                                                if (it11.hasNext()) {
                                                    obj = it11.next();
                                                    if (i.b(((LearningHubFieldModel) obj).getData_title(), "thumbnail")) {
                                                    }
                                                } else {
                                                    obj = null;
                                                }
                                            }
                                            LearningHubFieldModel learningHubFieldModel5 = (LearningHubFieldModel) obj;
                                            if (learningHubFieldModel5 != null && (value17 = learningHubFieldModel5.getValue()) != null) {
                                                str19 = null;
                                                v.H(h.c(o0.f23642c), null, 0, new LearningHubArticleExperimentActivity.f(value17, null), 3);
                                                str16 = str19;
                                                Bundle bundle3222 = new Bundle();
                                                bundle3222.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                                bundle3222.putString("post_id", this$0.q0().getId());
                                                bundle3222.putString("post_type", this$0.q0().getPost_type());
                                                it7 = values.iterator();
                                                while (it7.hasNext()) {
                                                    LearningHubFieldModel learningHubFieldModel6 = (LearningHubFieldModel) it7.next();
                                                    if (i.b(learningHubFieldModel6.getData_title(), "title")) {
                                                        Object value21 = learningHubFieldModel6.getValue();
                                                        if (value21 instanceof String) {
                                                            str17 = (String) value21;
                                                        } else {
                                                            str17 = str16;
                                                        }
                                                        if (str17 == null) {
                                                            str17 = "";
                                                        }
                                                        bundle3222.putString("post_name", str17);
                                                    } else if (i.b(learningHubFieldModel6.getData_title(), "short_desc")) {
                                                        Object value22 = learningHubFieldModel6.getValue();
                                                        if (value22 instanceof String) {
                                                            str18 = (String) value22;
                                                        } else {
                                                            str18 = str16;
                                                        }
                                                        if (str18 == null) {
                                                            str18 = "";
                                                        }
                                                        bundle3222.putString("post_name", str18);
                                                    }
                                                }
                                                bundle3222.putString("post_course", this$0.q0().getProgramme());
                                                gk.a.b(bundle3222, "cm_post_share");
                                                return;
                                            }
                                        }
                                        break;
                                    case -1692490108:
                                        if (post_type2.equals("Creatives")) {
                                            String str26 = (String) u.j2(this$0.A, this$0.f11244z);
                                            if (str26 != null) {
                                                str19 = null;
                                                v.H(h.c(o0.f23642c), null, 0, new LearningHubArticleExperimentActivity.d(str26, null), 3);
                                                str16 = str19;
                                                Bundle bundle32222 = new Bundle();
                                                bundle32222.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                                bundle32222.putString("post_id", this$0.q0().getId());
                                                bundle32222.putString("post_type", this$0.q0().getPost_type());
                                                it7 = values.iterator();
                                                while (it7.hasNext()) {
                                                }
                                                bundle32222.putString("post_course", this$0.q0().getProgramme());
                                                gk.a.b(bundle32222, "cm_post_share");
                                                return;
                                            }
                                        }
                                        break;
                                    case -1164233123:
                                        if (post_type2.equals("Articles")) {
                                            Iterator it12 = this$0.q0().getFields().iterator();
                                            while (true) {
                                                if (it12.hasNext()) {
                                                    obj2 = it12.next();
                                                    if (i.b(((LearningHubFieldModel) obj2).getData_title(), "cover")) {
                                                    }
                                                } else {
                                                    obj2 = null;
                                                }
                                            }
                                            LearningHubFieldModel learningHubFieldModel7 = (LearningHubFieldModel) obj2;
                                            if (learningHubFieldModel7 != null && (value18 = learningHubFieldModel7.getValue()) != null) {
                                                str19 = null;
                                                v.H(h.c(o0.f23642c), null, 0, new LearningHubArticleExperimentActivity.e(value18, null), 3);
                                                str16 = str19;
                                                Bundle bundle322222 = new Bundle();
                                                bundle322222.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                                bundle322222.putString("post_id", this$0.q0().getId());
                                                bundle322222.putString("post_type", this$0.q0().getPost_type());
                                                it7 = values.iterator();
                                                while (it7.hasNext()) {
                                                }
                                                bundle322222.putString("post_course", this$0.q0().getProgramme());
                                                gk.a.b(bundle322222, "cm_post_share");
                                                return;
                                            }
                                        }
                                        break;
                                    case -312086034:
                                        break;
                                    case 2606936:
                                        break;
                                }
                            }
                            str16 = null;
                            Bundle bundle3222222 = new Bundle();
                            bundle3222222.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                            bundle3222222.putString("post_id", this$0.q0().getId());
                            bundle3222222.putString("post_type", this$0.q0().getPost_type());
                            it7 = values.iterator();
                            while (it7.hasNext()) {
                            }
                            bundle3222222.putString("post_course", this$0.q0().getProgramme());
                            gk.a.b(bundle3222222, "cm_post_share");
                            return;
                    }
                }
            });
            ((AppCompatImageView) n0(R.id.ivClose)).setOnClickListener(new vm.d(this, 0));
            int intValue = this.F.getIntValue(Constants.RESOURCES_FEEDBACK_COUNTER, 0) + 1;
            this.E = intValue;
            this.F.setIntValue(Constants.RESOURCES_FEEDBACK_COUNTER, intValue);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11240v, "exception", e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        if (this.f11242x != null) {
            p0().B.k(this);
            ((androidx.lifecycle.w) p0().G.getValue()).k(this);
        }
        super.onDestroy();
    }

    public final w p0() {
        w wVar = this.f11242x;
        if (wVar != null) {
            return wVar;
        }
        kotlin.jvm.internal.i.q("libraryResourcesViewModel");
        throw null;
    }

    public final LearningHubModel q0() {
        LearningHubModel learningHubModel = this.f11241w;
        if (learningHubModel != null) {
            return learningHubModel;
        }
        kotlin.jvm.internal.i.q("model");
        throw null;
    }

    public final void r0(String str) {
        ((RobertoTextView) n0(R.id.learningHubDescription)).setVisibility(8);
        ((WebView) n0(R.id.webview)).setVisibility(0);
        ((RobertoTextView) n0(R.id.learningHubDescription)).setVisibility(8);
        WebSettings settings = ((WebView) n0(R.id.webview)).getSettings();
        kotlin.jvm.internal.i.f(settings, "webview.settings");
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setCacheMode(2);
        settings.setBlockNetworkImage(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setGeolocationEnabled(false);
        settings.setNeedInitialFocus(false);
        settings.setSaveFormData(false);
        settings.setAllowFileAccessFromFileURLs(true);
        ((WebView) n0(R.id.webview)).loadDataWithBaseURL("file:///android_asset/", defpackage.b.m("<html><head><style type=\"text/css\">@font-face {font-family: MyFont;src: url(\"file:///android_asset/fonts/Lato-Medium.ttf\")}body {overflow-wrap: break-word;; font-family: MyFont;font-size: 16;color:#465A62; letter-spacing: 0.22;}p{line-height:1.3em; color: #465A62;}h2{padding: 0; margin: 0;line-height:30px;}h3{padding: 0; margin: 0;line-height:30px;}ul li{line-height:1.3em;}</style></head><body style='padding:20 16 70 16;'>", str, "</body></html>"), "text/html", "UTF-8", null);
        if (FirebasePersistence.getInstance().getUser() == null) {
            finish();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void s0(Bitmap bitmap) {
        String str;
        String format = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss", Locale.ENGLISH).format(new Date());
        File file = new File(getFilesDir(), "images");
        if (!file.exists()) {
            file.mkdirs();
        }
        File createTempFile = File.createTempFile("share_image_" + format, ".png", file);
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        Uri b10 = FileProvider.b(this, "com.theinnerhour.b2b.provider", createTempFile);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setFlags(268435456);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", b10);
        String post_type = q0().getPost_type();
        if (post_type != null) {
            switch (post_type.hashCode()) {
                case -1864532585:
                    if (post_type.equals("Quotes")) {
                        str = getString(R.string.resourceShareQuotes);
                        break;
                    }
                    break;
                case -1732810888:
                    if (post_type.equals("Videos")) {
                        str = getString(R.string.resourceShareQuotes);
                        break;
                    }
                    break;
                case -1692490108:
                    if (post_type.equals("Creatives")) {
                        str = getString(R.string.resourceShareCreatives);
                        break;
                    }
                    break;
                case -1164233123:
                    if (post_type.equals("Articles")) {
                        str = getString(R.string.resourceShareArticles, q0().getId());
                        break;
                    }
                    break;
                case -312086034:
                    if (post_type.equals("Therapist says")) {
                        str = getString(R.string.resourceShareTherapistSays);
                        break;
                    }
                    break;
                case 2606936:
                    if (post_type.equals("Tips")) {
                        str = getString(R.string.resourceShareTips);
                        break;
                    }
                    break;
            }
            kotlin.jvm.internal.i.f(str, "when (model.post_type) {…w.theinnerhour.com\"\n    }");
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setType("image/jpg");
            startActivity(Intent.createChooser(intent, "Share using"));
        }
        str = "https://www.theinnerhour.com";
        kotlin.jvm.internal.i.f(str, "when (model.post_type) {…w.theinnerhour.com\"\n    }");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("image/jpg");
        startActivity(Intent.createChooser(intent, "Share using"));
    }

    public final void t0(w wVar) {
        kotlin.jvm.internal.i.g(wVar, "<set-?>");
        this.f11242x = wVar;
    }

    public final void u0(LearningHubModel learningHubModel) {
        this.f11241w = learningHubModel;
    }

    public final void v0() {
        ConstraintLayout constraintLayout = this.f11243y;
        if (constraintLayout != null) {
            ArrayList<String> arrayList = this.f11244z;
            ((CustomViewPager) constraintLayout.findViewById(R.id.creativeCarouselViewPager)).setAdapter(new a(this, this, arrayList));
            ConstraintLayout constraintLayout2 = this.f11243y;
            if (constraintLayout2 != null) {
                ((CustomViewPager) constraintLayout2.findViewById(R.id.creativeCarouselViewPager)).b(new b(arrayList.size()));
                if (arrayList.size() > 1) {
                    o0(0, arrayList.size());
                    ConstraintLayout constraintLayout3 = this.f11243y;
                    if (constraintLayout3 != null) {
                        ((RobertoTextView) constraintLayout3.findViewById(R.id.tvSelectPosition)).setText(getString(R.string.carouselPositionSelection, Integer.valueOf(this.A + 1), Integer.valueOf(arrayList.size())));
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("heading");
                        throw null;
                    }
                }
                return;
            }
            kotlin.jvm.internal.i.q("heading");
            throw null;
        }
        kotlin.jvm.internal.i.q("heading");
        throw null;
    }

    /* compiled from: LearningHubArticleExperimentActivity.kt */
    /* loaded from: classes2.dex */
    public final class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f11248a;

        public b(int i6) {
            this.f11248a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = LearningHubArticleExperimentActivity.I;
            LearningHubArticleExperimentActivity learningHubArticleExperimentActivity = LearningHubArticleExperimentActivity.this;
            int i11 = this.f11248a;
            learningHubArticleExperimentActivity.o0(i6, i11);
            ConstraintLayout constraintLayout = learningHubArticleExperimentActivity.f11243y;
            if (constraintLayout != null) {
                ((RobertoTextView) constraintLayout.findViewById(R.id.tvSelectPosition)).setText(learningHubArticleExperimentActivity.getString(R.string.carouselPositionSelection, Integer.valueOf(i6 + 1), Integer.valueOf(i11)));
                learningHubArticleExperimentActivity.A = i6;
                return;
            }
            kotlin.jvm.internal.i.q("heading");
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
