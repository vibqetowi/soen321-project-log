package com.theinnerhour.b2b.components.learningHub.experiment.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.FileProvider;
import b9.m;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentVideoActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import gv.n;
import hs.k;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ls.d;
import ns.e;
import ns.i;
import o7.g;
import ss.p;
import t0.r0;
import t0.u0;
import ta.v;
import u7.f;
/* compiled from: LearningHubExperimentVideoActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/learningHub/experiment/activities/LearningHubExperimentVideoActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LearningHubExperimentVideoActivity extends c {
    public static final /* synthetic */ int C = 0;
    public long A;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11278v = LogHelper.INSTANCE.makeLogTag("LearningHubExperimentVideoActivity");

    /* renamed from: w  reason: collision with root package name */
    public a0 f11279w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11280x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f11281y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f11282z;

    /* compiled from: LearningHubExperimentVideoActivity.kt */
    @e(c = "com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentVideoActivity$onCreate$shareOnClick$1$1$1", f = "LearningHubExperimentVideoActivity.kt", l = {149}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<d0, d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f11284u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f11286w;

        /* compiled from: LearningHubExperimentVideoActivity.kt */
        @e(c = "com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentVideoActivity$onCreate$shareOnClick$1$1$1$1$1", f = "LearningHubExperimentVideoActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<d0, d<? super k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ LearningHubExperimentVideoActivity f11287u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ Bitmap f11288v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LearningHubExperimentVideoActivity learningHubExperimentVideoActivity, Bitmap bitmap, d<? super a> dVar) {
                super(2, dVar);
                this.f11287u = learningHubExperimentVideoActivity;
                this.f11288v = bitmap;
            }

            @Override // ns.a
            public final d<k> create(Object obj, d<?> dVar) {
                return new a(this.f11287u, this.f11288v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, d<? super k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                sp.b.d0(obj);
                Bitmap bitmap = this.f11288v;
                kotlin.jvm.internal.i.f(bitmap, "bitmap");
                int i6 = LearningHubExperimentVideoActivity.C;
                LearningHubExperimentVideoActivity learningHubExperimentVideoActivity = this.f11287u;
                learningHubExperimentVideoActivity.getClass();
                String format = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss", Locale.ENGLISH).format(new Date());
                File file = new File(learningHubExperimentVideoActivity.getFilesDir(), "images");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File createTempFile = File.createTempFile("share_image_" + format, ".png", file);
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri b10 = FileProvider.b(learningHubExperimentVideoActivity, "com.theinnerhour.b2b.provider", createTempFile);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setFlags(268435456);
                intent.addFlags(1);
                intent.putExtra("android.intent.extra.STREAM", b10);
                intent.putExtra("android.intent.extra.TEXT", learningHubExperimentVideoActivity.getString(R.string.resourceShareQuotes));
                intent.setType("image/jpg");
                learningHubExperimentVideoActivity.startActivity(Intent.createChooser(intent, "Share using"));
                return k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, d<? super b> dVar) {
            super(2, dVar);
            this.f11286w = str;
        }

        @Override // ns.a
        public final d<k> create(Object obj, d<?> dVar) {
            return new b(this.f11286w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, d<? super k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f11284u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                LearningHubExperimentVideoActivity learningHubExperimentVideoActivity = LearningHubExperimentVideoActivity.this;
                com.bumptech.glide.e<Bitmap> a10 = Glide.i(learningHubExperimentVideoActivity).a();
                a10.Z = this.f11286w;
                a10.f5953b0 = true;
                kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                a aVar2 = new a(learningHubExperimentVideoActivity, (Bitmap) a10.E().get(), null);
                this.f11284u = 1;
                if (v.S(k1Var, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return k.f19476a;
        }
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.B;
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

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        long j10;
        String str;
        boolean z11;
        u0.e aVar;
        u0.e aVar2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_learning_hub_experiment_video);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.colorBlack));
        if (bundle != null) {
            z10 = bundle.getBoolean("isLandscape", false);
        } else {
            z10 = false;
        }
        this.f11282z = z10;
        if (bundle != null) {
            j10 = bundle.getLong("contentPosition", 0L);
        } else {
            j10 = 0;
        }
        this.A = j10;
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra(Constants.NOTIFICATION_URL);
        } else {
            str = null;
        }
        if (str != null && !n.B0(str)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            Toast.makeText(this, getString(R.string.telecommunicationsError), 1).show();
            finish();
            return;
        }
        Uri parse = Uri.parse(str);
        m mVar = new m(this);
        f0.b bVar = new f0.b(19, new f());
        com.google.android.exoplayer2.drm.a aVar3 = new com.google.android.exoplayer2.drm.a();
        com.google.android.exoplayer2.upstream.a aVar4 = new com.google.android.exoplayer2.upstream.a();
        q.a aVar5 = new q.a();
        aVar5.f6690b = parse;
        q a10 = aVar5.a();
        a10.f6685v.getClass();
        com.google.android.exoplayer2.source.n nVar = new com.google.android.exoplayer2.source.n(a10, mVar, bVar, aVar3.a(a10), aVar4, 1048576);
        q7.d dVar = new q7.d(3, 0, 1, 1);
        a0 a11 = new j.b(this, new g(0, new o7.d(this)), new o7.e(this, 4)).a();
        a11.n0(nVar);
        a11.q0(dVar, true);
        long j11 = this.A;
        if (j11 != 0) {
            a11.f0(j11);
        }
        a11.z(true);
        this.f11279w = a11;
        if (this.f11282z) {
            PlayerView playerView = (PlayerView) n0(R.id.paVideoPlayerLandscape);
            if (playerView != null) {
                playerView.setVisibility(0);
            }
            PlayerView playerView2 = (PlayerView) n0(R.id.paVideoPlayer);
            if (playerView2 != null) {
                playerView2.setVisibility(8);
            }
            PlayerView playerView3 = (PlayerView) n0(R.id.paVideoPlayerLandscape);
            if (playerView3 != null) {
                playerView3.setResizeMode(0);
            }
            PlayerView playerView4 = (PlayerView) n0(R.id.paVideoPlayerLandscape);
            if (playerView4 != null) {
                playerView4.setPlayer(this.f11279w);
            }
            r0.a(getWindow(), false);
            Window window = getWindow();
            View decorView = getWindow().getDecorView();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                aVar2 = new u0.d(window);
            } else if (i6 >= 26) {
                aVar2 = new u0.c(decorView, window);
            } else if (i6 >= 23) {
                aVar2 = new u0.b(decorView, window);
            } else {
                aVar2 = new u0.a(decorView, window);
            }
            aVar2.a();
            aVar2.e();
        } else {
            PlayerView playerView5 = (PlayerView) n0(R.id.paVideoPlayerLandscape);
            if (playerView5 != null) {
                playerView5.setVisibility(8);
            }
            PlayerView playerView6 = (PlayerView) n0(R.id.paVideoPlayer);
            if (playerView6 != null) {
                playerView6.setVisibility(0);
            }
            PlayerView playerView7 = (PlayerView) n0(R.id.paVideoPlayer);
            if (playerView7 != null) {
                playerView7.setResizeMode(0);
            }
            PlayerView playerView8 = (PlayerView) n0(R.id.paVideoPlayer);
            if (playerView8 != null) {
                playerView8.setPlayer(this.f11279w);
            }
            r0.a(getWindow(), true);
            Window window2 = getWindow();
            View decorView2 = getWindow().getDecorView();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                aVar = new u0.d(window2);
            } else if (i10 >= 26) {
                aVar = new u0.c(decorView2, window2);
            } else if (i10 >= 23) {
                aVar = new u0.b(decorView2, window2);
            } else {
                aVar = new u0.a(decorView2, window2);
            }
            aVar.f();
        }
        a0 a0Var = this.f11279w;
        if (a0Var != null) {
            a0Var.f6168d.i0(new a());
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: vm.f

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ LearningHubExperimentVideoActivity f35288v;

            {
                this.f35288v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                String str3;
                String stringExtra;
                int i11 = r2;
                LearningHubExperimentVideoActivity this$0 = this.f35288v;
                switch (i11) {
                    case 0:
                        int i12 = LearningHubExperimentVideoActivity.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean z12 = !this$0.f11282z;
                        this$0.f11282z = z12;
                        if (z12) {
                            this$0.setRequestedOrientation(0);
                            return;
                        } else {
                            this$0.setRequestedOrientation(1);
                            return;
                        }
                    case 1:
                        int i13 = LearningHubExperimentVideoActivity.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 2:
                        int i14 = LearningHubExperimentVideoActivity.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    default:
                        int i15 = LearningHubExperimentVideoActivity.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Intent intent2 = this$0.getIntent();
                        String str4 = null;
                        if (intent2 != null && (stringExtra = intent2.getStringExtra("thumbnail")) != null) {
                            v.H(h.c(o0.f23642c), null, 0, new LearningHubExperimentVideoActivity.b(stringExtra, null), 3);
                        }
                        String str5 = gk.a.f16573a;
                        Bundle bundle2 = new Bundle();
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null) {
                            str2 = user.getCurrentCourseName();
                        } else {
                            str2 = null;
                        }
                        bundle2.putString("course", str2);
                        Intent intent3 = this$0.getIntent();
                        if (intent3 != null) {
                            str3 = intent3.getStringExtra("post_id");
                        } else {
                            str3 = null;
                        }
                        bundle2.putString("post_id", str3);
                        Intent intent4 = this$0.getIntent();
                        if (intent4 != null) {
                            str4 = intent4.getStringExtra("post_name");
                        }
                        bundle2.putString("post_name", str4);
                        bundle2.putString("post_type", "Video");
                        k kVar = k.f19476a;
                        gk.a.b(bundle2, "cm_post_share");
                        return;
                }
            }
        };
        AppCompatImageView appCompatImageView = (AppCompatImageView) n0(R.id.screen_toggle_landscape);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(onClickListener);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) n0(R.id.screen_toggle);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setOnClickListener(onClickListener);
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) n0(R.id.ivClose);
        if (appCompatImageView3 != null) {
            appCompatImageView3.setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: vm.f

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ LearningHubExperimentVideoActivity f35288v;

                {
                    this.f35288v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str2;
                    String str3;
                    String stringExtra;
                    int i11 = r2;
                    LearningHubExperimentVideoActivity this$0 = this.f35288v;
                    switch (i11) {
                        case 0:
                            int i12 = LearningHubExperimentVideoActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            boolean z12 = !this$0.f11282z;
                            this$0.f11282z = z12;
                            if (z12) {
                                this$0.setRequestedOrientation(0);
                                return;
                            } else {
                                this$0.setRequestedOrientation(1);
                                return;
                            }
                        case 1:
                            int i13 = LearningHubExperimentVideoActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 2:
                            int i14 = LearningHubExperimentVideoActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        default:
                            int i15 = LearningHubExperimentVideoActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Intent intent2 = this$0.getIntent();
                            String str4 = null;
                            if (intent2 != null && (stringExtra = intent2.getStringExtra("thumbnail")) != null) {
                                v.H(h.c(o0.f23642c), null, 0, new LearningHubExperimentVideoActivity.b(stringExtra, null), 3);
                            }
                            String str5 = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str2 = user.getCurrentCourseName();
                            } else {
                                str2 = null;
                            }
                            bundle2.putString("course", str2);
                            Intent intent3 = this$0.getIntent();
                            if (intent3 != null) {
                                str3 = intent3.getStringExtra("post_id");
                            } else {
                                str3 = null;
                            }
                            bundle2.putString("post_id", str3);
                            Intent intent4 = this$0.getIntent();
                            if (intent4 != null) {
                                str4 = intent4.getStringExtra("post_name");
                            }
                            bundle2.putString("post_name", str4);
                            bundle2.putString("post_type", "Video");
                            k kVar = k.f19476a;
                            gk.a.b(bundle2, "cm_post_share");
                            return;
                    }
                }
            }));
        }
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) n0(R.id.ivCloseLandscape);
        if (appCompatImageView4 != null) {
            appCompatImageView4.setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: vm.f

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ LearningHubExperimentVideoActivity f35288v;

                {
                    this.f35288v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str2;
                    String str3;
                    String stringExtra;
                    int i11 = r2;
                    LearningHubExperimentVideoActivity this$0 = this.f35288v;
                    switch (i11) {
                        case 0:
                            int i12 = LearningHubExperimentVideoActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            boolean z12 = !this$0.f11282z;
                            this$0.f11282z = z12;
                            if (z12) {
                                this$0.setRequestedOrientation(0);
                                return;
                            } else {
                                this$0.setRequestedOrientation(1);
                                return;
                            }
                        case 1:
                            int i13 = LearningHubExperimentVideoActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 2:
                            int i14 = LearningHubExperimentVideoActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        default:
                            int i15 = LearningHubExperimentVideoActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Intent intent2 = this$0.getIntent();
                            String str4 = null;
                            if (intent2 != null && (stringExtra = intent2.getStringExtra("thumbnail")) != null) {
                                v.H(h.c(o0.f23642c), null, 0, new LearningHubExperimentVideoActivity.b(stringExtra, null), 3);
                            }
                            String str5 = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str2 = user.getCurrentCourseName();
                            } else {
                                str2 = null;
                            }
                            bundle2.putString("course", str2);
                            Intent intent3 = this$0.getIntent();
                            if (intent3 != null) {
                                str3 = intent3.getStringExtra("post_id");
                            } else {
                                str3 = null;
                            }
                            bundle2.putString("post_id", str3);
                            Intent intent4 = this$0.getIntent();
                            if (intent4 != null) {
                                str4 = intent4.getStringExtra("post_name");
                            }
                            bundle2.putString("post_name", str4);
                            bundle2.putString("post_type", "Video");
                            k kVar = k.f19476a;
                            gk.a.b(bundle2, "cm_post_share");
                            return;
                    }
                }
            }));
        }
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: vm.f

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ LearningHubExperimentVideoActivity f35288v;

            {
                this.f35288v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                String str3;
                String stringExtra;
                int i11 = r2;
                LearningHubExperimentVideoActivity this$0 = this.f35288v;
                switch (i11) {
                    case 0:
                        int i12 = LearningHubExperimentVideoActivity.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean z12 = !this$0.f11282z;
                        this$0.f11282z = z12;
                        if (z12) {
                            this$0.setRequestedOrientation(0);
                            return;
                        } else {
                            this$0.setRequestedOrientation(1);
                            return;
                        }
                    case 1:
                        int i13 = LearningHubExperimentVideoActivity.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 2:
                        int i14 = LearningHubExperimentVideoActivity.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    default:
                        int i15 = LearningHubExperimentVideoActivity.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Intent intent2 = this$0.getIntent();
                        String str4 = null;
                        if (intent2 != null && (stringExtra = intent2.getStringExtra("thumbnail")) != null) {
                            v.H(h.c(o0.f23642c), null, 0, new LearningHubExperimentVideoActivity.b(stringExtra, null), 3);
                        }
                        String str5 = gk.a.f16573a;
                        Bundle bundle2 = new Bundle();
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null) {
                            str2 = user.getCurrentCourseName();
                        } else {
                            str2 = null;
                        }
                        bundle2.putString("course", str2);
                        Intent intent3 = this$0.getIntent();
                        if (intent3 != null) {
                            str3 = intent3.getStringExtra("post_id");
                        } else {
                            str3 = null;
                        }
                        bundle2.putString("post_id", str3);
                        Intent intent4 = this$0.getIntent();
                        if (intent4 != null) {
                            str4 = intent4.getStringExtra("post_name");
                        }
                        bundle2.putString("post_name", str4);
                        bundle2.putString("post_type", "Video");
                        k kVar = k.f19476a;
                        gk.a.b(bundle2, "cm_post_share");
                        return;
                }
            }
        };
        AppCompatImageView appCompatImageView5 = (AppCompatImageView) n0(R.id.ivShare);
        if (appCompatImageView5 != null) {
            appCompatImageView5.setOnClickListener(onClickListener2);
        }
        AppCompatImageView appCompatImageView6 = (AppCompatImageView) n0(R.id.ivShareLandscape);
        if (appCompatImageView6 != null) {
            appCompatImageView6.setOnClickListener(onClickListener2);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        a0 a0Var = this.f11279w;
        if (a0Var != null) {
            a0Var.a();
        }
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0015 A[Catch: Exception -> 0x0019, TRY_LEAVE, TryCatch #0 {Exception -> 0x0019, blocks: (B:2:0x0000, B:4:0x0005, B:8:0x000e, B:11:0x0015), top: B:17:0x0000 }] */
    @Override // androidx.fragment.app.p, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPause() {
        a0 a0Var;
        boolean z10;
        a0 a0Var2;
        try {
            a0Var = this.f11279w;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11278v, e10);
        }
        if (a0Var != null) {
            z10 = true;
            if (a0Var.isPlaying()) {
                this.f11281y = z10;
                a0Var2 = this.f11279w;
                if (a0Var2 == null) {
                    a0Var2.z(false);
                }
                super.onPause();
            }
        }
        z10 = false;
        this.f11281y = z10;
        a0Var2 = this.f11279w;
        if (a0Var2 == null) {
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        try {
            if (this.f11281y) {
                a0 a0Var = this.f11279w;
                if (a0Var != null) {
                    a0Var.z(true);
                }
                this.f11281y = false;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11278v, e10);
        }
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        long j10;
        kotlin.jvm.internal.i.g(outState, "outState");
        super.onSaveInstanceState(outState);
        a0 a0Var = this.f11279w;
        if (a0Var != null) {
            j10 = a0Var.D();
        } else {
            j10 = 0;
        }
        outState.putLong("contentPosition", j10);
        outState.putBoolean("isLandscape", this.f11282z);
    }

    /* compiled from: LearningHubExperimentVideoActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements w.b {
        public a() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final void V(int i6, boolean z10) {
            int i10;
            LearningHubExperimentVideoActivity learningHubExperimentVideoActivity = LearningHubExperimentVideoActivity.this;
            ProgressBar progressBar = (ProgressBar) learningHubExperimentVideoActivity.n0(R.id.progressBar);
            if (progressBar != null) {
                if (i6 == 2) {
                    i10 = 0;
                } else {
                    if (learningHubExperimentVideoActivity.f11282z) {
                        PlayerView playerView = (PlayerView) learningHubExperimentVideoActivity.n0(R.id.paVideoPlayerLandscape);
                        if (playerView != null) {
                            playerView.f(playerView.e());
                        }
                    } else {
                        PlayerView playerView2 = (PlayerView) learningHubExperimentVideoActivity.n0(R.id.paVideoPlayer);
                        if (playerView2 != null) {
                            playerView2.f(playerView2.e());
                        }
                    }
                    i10 = 8;
                }
                progressBar.setVisibility(i10);
            }
            if (i6 == 4 && !learningHubExperimentVideoActivity.f11280x) {
                learningHubExperimentVideoActivity.finish();
                learningHubExperimentVideoActivity.f11280x = true;
            }
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void b() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void d0() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void e() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void i() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void A(r rVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void C(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void L(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void f0(com.google.android.exoplayer2.v vVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void l(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void l0(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void q(ExoPlaybackException exoPlaybackException) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void r(f0 f0Var) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void s(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void t(w.a aVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void x(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void y(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void D(w wVar, w.c cVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void G(o8.p pVar, z8.h hVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void R(q qVar, int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void v(int i6, boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void z(int i6, w.e eVar, w.e eVar2) {
        }
    }
}
