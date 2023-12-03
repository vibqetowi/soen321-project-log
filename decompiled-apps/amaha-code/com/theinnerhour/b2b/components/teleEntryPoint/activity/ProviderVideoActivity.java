package com.theinnerhour.b2b.components.teleEntryPoint.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b9.m;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.teleEntryPoint.activity.ProviderVideoActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import f0.b;
import gv.n;
import hs.k;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import o7.e;
import o7.g;
import o8.p;
import q7.d;
import u7.f;
import z8.h;
/* compiled from: ProviderVideoActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/teleEntryPoint/activity/ProviderVideoActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProviderVideoActivity extends c {
    public static final /* synthetic */ int G = 0;
    public boolean A;
    public boolean B;
    public boolean E;

    /* renamed from: w  reason: collision with root package name */
    public float f11643w;

    /* renamed from: x  reason: collision with root package name */
    public a0 f11644x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f11645y;
    public final LinkedHashMap F = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11642v = LogHelper.INSTANCE.makeLogTag("ProviderVideoActivity");

    /* renamed from: z  reason: collision with root package name */
    public boolean f11646z = true;
    public String C = "";
    public String D = "";

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.F;
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        try {
            if (this.A) {
                if (this.B) {
                    String str = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "app_expert_care");
                    bundle.putString("flow", "therapy");
                    bundle.putString("therapist_name", this.C);
                    bundle.putString("therapist_uuid", this.D);
                    bundle.putString("platform", "android_app");
                    k kVar = k.f19476a;
                    gk.a.b(bundle, "therapy_psychiatry_video_exit");
                } else {
                    String str2 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "app_expert_care");
                    bundle2.putString("flow", "psychiatry");
                    bundle2.putString("psychiatrist_name", this.C);
                    bundle2.putString("psychiatrist_uuid", this.D);
                    bundle2.putString("platform", "android_app");
                    k kVar2 = k.f19476a;
                    gk.a.b(bundle2, "therapy_psychiatry_video_exit");
                }
            } else if (!this.E) {
                Bundle bundle3 = new Bundle();
                bundle3.putString("source", "regular_quit");
                gk.a.b(bundle3, "pro_assessment_video_quit");
            }
            ApplicationPersistence.getInstance().setBooleanValue("pro_show_video", true);
            finish();
            super.onBackPressed();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11642v, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:3:0x0009, B:5:0x0019, B:7:0x0021, B:9:0x0029, B:13:0x0034, B:15:0x003c, B:19:0x0047, B:21:0x004d, B:23:0x0053, B:27:0x005e, B:29:0x0066, B:31:0x006e, B:33:0x007a, B:34:0x0080, B:36:0x0088, B:42:0x0094, B:43:0x0097, B:45:0x00c5, B:47:0x010d, B:48:0x0115, B:52:0x0126, B:56:0x0134, B:58:0x0138, B:59:0x0142, B:61:0x014d, B:62:0x0155, B:64:0x015b, B:55:0x012f, B:51:0x0123), top: B:69:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:3:0x0009, B:5:0x0019, B:7:0x0021, B:9:0x0029, B:13:0x0034, B:15:0x003c, B:19:0x0047, B:21:0x004d, B:23:0x0053, B:27:0x005e, B:29:0x0066, B:31:0x006e, B:33:0x007a, B:34:0x0080, B:36:0x0088, B:42:0x0094, B:43:0x0097, B:45:0x00c5, B:47:0x010d, B:48:0x0115, B:52:0x0126, B:56:0x0134, B:58:0x0138, B:59:0x0142, B:61:0x014d, B:62:0x0155, B:64:0x015b, B:55:0x012f, B:51:0x0123), top: B:69:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123 A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:3:0x0009, B:5:0x0019, B:7:0x0021, B:9:0x0029, B:13:0x0034, B:15:0x003c, B:19:0x0047, B:21:0x004d, B:23:0x0053, B:27:0x005e, B:29:0x0066, B:31:0x006e, B:33:0x007a, B:34:0x0080, B:36:0x0088, B:42:0x0094, B:43:0x0097, B:45:0x00c5, B:47:0x010d, B:48:0x0115, B:52:0x0126, B:56:0x0134, B:58:0x0138, B:59:0x0142, B:61:0x014d, B:62:0x0155, B:64:0x015b, B:55:0x012f, B:51:0x0123), top: B:69:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:3:0x0009, B:5:0x0019, B:7:0x0021, B:9:0x0029, B:13:0x0034, B:15:0x003c, B:19:0x0047, B:21:0x004d, B:23:0x0053, B:27:0x005e, B:29:0x0066, B:31:0x006e, B:33:0x007a, B:34:0x0080, B:36:0x0088, B:42:0x0094, B:43:0x0097, B:45:0x00c5, B:47:0x010d, B:48:0x0115, B:52:0x0126, B:56:0x0134, B:58:0x0138, B:59:0x0142, B:61:0x014d, B:62:0x0155, B:64:0x015b, B:55:0x012f, B:51:0x0123), top: B:69:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138 A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:3:0x0009, B:5:0x0019, B:7:0x0021, B:9:0x0029, B:13:0x0034, B:15:0x003c, B:19:0x0047, B:21:0x004d, B:23:0x0053, B:27:0x005e, B:29:0x0066, B:31:0x006e, B:33:0x007a, B:34:0x0080, B:36:0x0088, B:42:0x0094, B:43:0x0097, B:45:0x00c5, B:47:0x010d, B:48:0x0115, B:52:0x0126, B:56:0x0134, B:58:0x0138, B:59:0x0142, B:61:0x014d, B:62:0x0155, B:64:0x015b, B:55:0x012f, B:51:0x0123), top: B:69:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:3:0x0009, B:5:0x0019, B:7:0x0021, B:9:0x0029, B:13:0x0034, B:15:0x003c, B:19:0x0047, B:21:0x004d, B:23:0x0053, B:27:0x005e, B:29:0x0066, B:31:0x006e, B:33:0x007a, B:34:0x0080, B:36:0x0088, B:42:0x0094, B:43:0x0097, B:45:0x00c5, B:47:0x010d, B:48:0x0115, B:52:0x0126, B:56:0x0134, B:58:0x0138, B:59:0x0142, B:61:0x014d, B:62:0x0155, B:64:0x015b, B:55:0x012f, B:51:0x0123), top: B:69:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015b A[Catch: Exception -> 0x0161, TRY_LEAVE, TryCatch #0 {Exception -> 0x0161, blocks: (B:3:0x0009, B:5:0x0019, B:7:0x0021, B:9:0x0029, B:13:0x0034, B:15:0x003c, B:19:0x0047, B:21:0x004d, B:23:0x0053, B:27:0x005e, B:29:0x0066, B:31:0x006e, B:33:0x007a, B:34:0x0080, B:36:0x0088, B:42:0x0094, B:43:0x0097, B:45:0x00c5, B:47:0x010d, B:48:0x0115, B:52:0x0126, B:56:0x0134, B:58:0x0138, B:59:0x0142, B:61:0x014d, B:62:0x0155, B:64:0x015b, B:55:0x012f, B:51:0x0123), top: B:69:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        AppCompatImageView appCompatImageView;
        PlayerView playerView;
        PlayerView playerView2;
        a0 a0Var;
        ConstraintLayout constraintLayout;
        Window window;
        boolean z13;
        String str2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_provider_video);
        try {
            ApplicationPersistence.getInstance().containsKey("pro_show_video");
            Intent intent = getIntent();
            String str3 = null;
            if (intent != null) {
                str = intent.getStringExtra("pro_video_url");
            } else {
                str = null;
            }
            Intent intent2 = getIntent();
            if (intent2 != null && intent2.getBooleanExtra("isExpertCare", false)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.A = z10;
            Intent intent3 = getIntent();
            if (intent3 != null && intent3.getBooleanExtra("isInAppProfileDropOffPrompt", false)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E = z11;
            if (this.A) {
                Intent intent4 = getIntent();
                if (intent4 != null && intent4.getBooleanExtra("isTherapy", false)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.B = z13;
                Intent intent5 = getIntent();
                if (intent5 != null) {
                    str2 = intent5.getStringExtra("provider_name");
                } else {
                    str2 = null;
                }
                this.C = String.valueOf(str2);
                Intent intent6 = getIntent();
                if (intent6 != null) {
                    str3 = intent6.getStringExtra("provider_uuid");
                }
                this.D = String.valueOf(str3);
            }
            if (str != null && !n.B0(str)) {
                z12 = false;
                if (z12) {
                    finish();
                }
                Uri parse = Uri.parse(str);
                m mVar = new m(this);
                b bVar = new b(19, new f());
                com.google.android.exoplayer2.drm.a aVar = new com.google.android.exoplayer2.drm.a();
                com.google.android.exoplayer2.upstream.a aVar2 = new com.google.android.exoplayer2.upstream.a();
                q.a aVar3 = new q.a();
                aVar3.f6690b = parse;
                q a10 = aVar3.a();
                a10.f6685v.getClass();
                com.google.android.exoplayer2.source.n nVar = new com.google.android.exoplayer2.source.n(a10, mVar, bVar, aVar.a(a10), aVar2, 1048576);
                d dVar = new d(3, 0, 1, 1);
                a0 a11 = new j.b(this, new g(0, new o7.d(this)), new e(this, 4)).a();
                a11.n0(nVar);
                a11.q0(dVar, true);
                this.f11643w = a11.f6188z;
                a11.t0(0.0f);
                a11.z(true);
                appCompatImageView = (AppCompatImageView) n0(R.id.exitCta);
                if (appCompatImageView != null) {
                    appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: mp.a

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ ProviderVideoActivity f25668v;

                        {
                            this.f25668v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6 = r2;
                            ProviderVideoActivity this$0 = this.f25668v;
                            switch (i6) {
                                case 0:
                                    int i10 = ProviderVideoActivity.G;
                                    i.g(this$0, "this$0");
                                    if (this$0.A) {
                                        if (this$0.B) {
                                            String str4 = gk.a.f16573a;
                                            Bundle f = e.f("source", "app_expert_care", "flow", "therapy");
                                            f.putString("therapist_name", this$0.C);
                                            f.putString("therapist_uuid", this$0.D);
                                            f.putString("platform", "android_app");
                                            k kVar = k.f19476a;
                                            gk.a.b(f, "therapy_psychiatry_video_exit");
                                        } else {
                                            String str5 = gk.a.f16573a;
                                            Bundle f2 = e.f("source", "app_expert_care", "flow", "psychiatry");
                                            f2.putString("psychiatrist_name", this$0.C);
                                            f2.putString("psychiatrist_uuid", this$0.D);
                                            f2.putString("platform", "android_app");
                                            k kVar2 = k.f19476a;
                                            gk.a.b(f2, "therapy_psychiatry_video_exit");
                                        }
                                    } else if (!this$0.E) {
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("source", "regular_quit");
                                        gk.a.b(bundle2, "pro_assessment_video_quit");
                                    }
                                    ApplicationPersistence.getInstance().setBooleanValue("pro_show_video", true);
                                    this$0.finish();
                                    return;
                                default:
                                    int i11 = ProviderVideoActivity.G;
                                    i.g(this$0, "this$0");
                                    if (this$0.f11646z) {
                                        a0 a0Var2 = this$0.f11644x;
                                        if (a0Var2 != null) {
                                            a0Var2.t0(this$0.f11643w);
                                        }
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0.n0(R.id.unmuteImage);
                                        if (appCompatImageView2 != null) {
                                            appCompatImageView2.setImageResource(R.drawable.ic_audio);
                                        }
                                        RobertoTextView robertoTextView = (RobertoTextView) this$0.n0(R.id.unmuteText);
                                        if (robertoTextView != null) {
                                            robertoTextView.setText(this$0.getString(R.string.proVideoMute));
                                        }
                                    } else {
                                        a0 a0Var3 = this$0.f11644x;
                                        if (a0Var3 != null) {
                                            a0Var3.t0(0.0f);
                                        }
                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0.n0(R.id.unmuteImage);
                                        if (appCompatImageView3 != null) {
                                            appCompatImageView3.setImageResource(R.drawable.ic_mute);
                                        }
                                        RobertoTextView robertoTextView2 = (RobertoTextView) this$0.n0(R.id.unmuteText);
                                        if (robertoTextView2 != null) {
                                            robertoTextView2.setText(this$0.getString(R.string.proVideoUnmute));
                                        }
                                    }
                                    this$0.f11646z = !this$0.f11646z;
                                    return;
                            }
                        }
                    });
                }
                this.f11644x = a11;
                playerView = (PlayerView) n0(R.id.paVideoPlayer);
                if (playerView == null) {
                    playerView.setResizeMode(0);
                }
                playerView2 = (PlayerView) n0(R.id.paVideoPlayer);
                if (playerView2 == null) {
                    playerView2.setPlayer(this.f11644x);
                }
                a0Var = this.f11644x;
                if (a0Var != null) {
                    a0Var.f6168d.i0(new a());
                }
                constraintLayout = (ConstraintLayout) n0(R.id.unmuteLayout);
                if (constraintLayout != null) {
                    constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: mp.a

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ ProviderVideoActivity f25668v;

                        {
                            this.f25668v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6 = r2;
                            ProviderVideoActivity this$0 = this.f25668v;
                            switch (i6) {
                                case 0:
                                    int i10 = ProviderVideoActivity.G;
                                    i.g(this$0, "this$0");
                                    if (this$0.A) {
                                        if (this$0.B) {
                                            String str4 = gk.a.f16573a;
                                            Bundle f = e.f("source", "app_expert_care", "flow", "therapy");
                                            f.putString("therapist_name", this$0.C);
                                            f.putString("therapist_uuid", this$0.D);
                                            f.putString("platform", "android_app");
                                            k kVar = k.f19476a;
                                            gk.a.b(f, "therapy_psychiatry_video_exit");
                                        } else {
                                            String str5 = gk.a.f16573a;
                                            Bundle f2 = e.f("source", "app_expert_care", "flow", "psychiatry");
                                            f2.putString("psychiatrist_name", this$0.C);
                                            f2.putString("psychiatrist_uuid", this$0.D);
                                            f2.putString("platform", "android_app");
                                            k kVar2 = k.f19476a;
                                            gk.a.b(f2, "therapy_psychiatry_video_exit");
                                        }
                                    } else if (!this$0.E) {
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("source", "regular_quit");
                                        gk.a.b(bundle2, "pro_assessment_video_quit");
                                    }
                                    ApplicationPersistence.getInstance().setBooleanValue("pro_show_video", true);
                                    this$0.finish();
                                    return;
                                default:
                                    int i11 = ProviderVideoActivity.G;
                                    i.g(this$0, "this$0");
                                    if (this$0.f11646z) {
                                        a0 a0Var2 = this$0.f11644x;
                                        if (a0Var2 != null) {
                                            a0Var2.t0(this$0.f11643w);
                                        }
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0.n0(R.id.unmuteImage);
                                        if (appCompatImageView2 != null) {
                                            appCompatImageView2.setImageResource(R.drawable.ic_audio);
                                        }
                                        RobertoTextView robertoTextView = (RobertoTextView) this$0.n0(R.id.unmuteText);
                                        if (robertoTextView != null) {
                                            robertoTextView.setText(this$0.getString(R.string.proVideoMute));
                                        }
                                    } else {
                                        a0 a0Var3 = this$0.f11644x;
                                        if (a0Var3 != null) {
                                            a0Var3.t0(0.0f);
                                        }
                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0.n0(R.id.unmuteImage);
                                        if (appCompatImageView3 != null) {
                                            appCompatImageView3.setImageResource(R.drawable.ic_mute);
                                        }
                                        RobertoTextView robertoTextView2 = (RobertoTextView) this$0.n0(R.id.unmuteText);
                                        if (robertoTextView2 != null) {
                                            robertoTextView2.setText(this$0.getString(R.string.proVideoUnmute));
                                        }
                                    }
                                    this$0.f11646z = !this$0.f11646z;
                                    return;
                            }
                        }
                    });
                }
                window = getWindow();
                if (window == null) {
                    window.addFlags(128);
                    return;
                }
                return;
            }
            z12 = true;
            if (z12) {
            }
            Uri parse2 = Uri.parse(str);
            m mVar2 = new m(this);
            b bVar2 = new b(19, new f());
            com.google.android.exoplayer2.drm.a aVar4 = new com.google.android.exoplayer2.drm.a();
            com.google.android.exoplayer2.upstream.a aVar22 = new com.google.android.exoplayer2.upstream.a();
            q.a aVar32 = new q.a();
            aVar32.f6690b = parse2;
            q a102 = aVar32.a();
            a102.f6685v.getClass();
            com.google.android.exoplayer2.source.n nVar2 = new com.google.android.exoplayer2.source.n(a102, mVar2, bVar2, aVar4.a(a102), aVar22, 1048576);
            d dVar2 = new d(3, 0, 1, 1);
            a0 a112 = new j.b(this, new g(0, new o7.d(this)), new e(this, 4)).a();
            a112.n0(nVar2);
            a112.q0(dVar2, true);
            this.f11643w = a112.f6188z;
            a112.t0(0.0f);
            a112.z(true);
            appCompatImageView = (AppCompatImageView) n0(R.id.exitCta);
            if (appCompatImageView != null) {
            }
            this.f11644x = a112;
            playerView = (PlayerView) n0(R.id.paVideoPlayer);
            if (playerView == null) {
            }
            playerView2 = (PlayerView) n0(R.id.paVideoPlayer);
            if (playerView2 == null) {
            }
            a0Var = this.f11644x;
            if (a0Var != null) {
            }
            constraintLayout = (ConstraintLayout) n0(R.id.unmuteLayout);
            if (constraintLayout != null) {
            }
            window = getWindow();
            if (window == null) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11642v, e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(128);
        }
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
            a0Var = this.f11644x;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11642v, e10);
        }
        if (a0Var != null) {
            z10 = true;
            if (a0Var.isPlaying()) {
                this.f11645y = z10;
                a0Var2 = this.f11644x;
                if (a0Var2 == null) {
                    a0Var2.z(false);
                }
                super.onPause();
            }
        }
        z10 = false;
        this.f11645y = z10;
        a0Var2 = this.f11644x;
        if (a0Var2 == null) {
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        try {
            if (this.f11645y) {
                a0 a0Var = this.f11644x;
                if (a0Var != null) {
                    a0Var.z(true);
                }
                this.f11645y = false;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11642v, e10);
        }
        super.onResume();
    }

    /* compiled from: ProviderVideoActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements w.b {
        public a() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final void V(int i6, boolean z10) {
            int i10;
            ProviderVideoActivity providerVideoActivity = ProviderVideoActivity.this;
            ProgressBar progressBar = (ProgressBar) providerVideoActivity.n0(R.id.progressBar);
            if (progressBar != null) {
                if (i6 == 2) {
                    i10 = 0;
                } else {
                    PlayerView playerView = (PlayerView) providerVideoActivity.n0(R.id.paVideoPlayer);
                    if (playerView != null) {
                        playerView.f(playerView.e());
                    }
                    i10 = 8;
                }
                progressBar.setVisibility(i10);
            }
            if (i6 == 4) {
                if (providerVideoActivity.A) {
                    if (providerVideoActivity.B) {
                        String str = gk.a.f16573a;
                        Bundle f = e.f("source", "app_expert_care", "flow", "therapy");
                        f.putString("therapist_name", providerVideoActivity.C);
                        f.putString("therapist_uuid", providerVideoActivity.D);
                        f.putString("platform", "android_app");
                        k kVar = k.f19476a;
                        gk.a.b(f, "therapy_psychiatry_video_exit");
                    } else {
                        String str2 = gk.a.f16573a;
                        Bundle f2 = e.f("source", "app_expert_care", "flow", "psychiatry");
                        f2.putString("psychiatrist_name", providerVideoActivity.C);
                        f2.putString("psychiatrist_uuid", providerVideoActivity.D);
                        f2.putString("platform", "android_app");
                        k kVar2 = k.f19476a;
                        gk.a.b(f2, "therapy_psychiatry_video_exit");
                    }
                } else if (!providerVideoActivity.E) {
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "video_complete");
                    gk.a.b(bundle, "pro_assessment_video_quit");
                }
                ApplicationPersistence.getInstance().deleteKey("pro_show_video");
                providerVideoActivity.finish();
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
        public final /* synthetic */ void f0(v vVar) {
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
        public final /* synthetic */ void G(p pVar, h hVar) {
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
