package com.theinnerhour.b2b.components.expertCare.activity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import d9.q;
import hs.k;
import java.util.List;
import kotlin.jvm.internal.i;
import o8.p;
import q7.d;
import z8.h;
/* compiled from: ExpertStoriesActivity.kt */
/* loaded from: classes2.dex */
public final class a implements w.d {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExpertStoriesActivity f11148u;

    public a(ExpertStoriesActivity expertStoriesActivity) {
        this.f11148u = expertStoriesActivity;
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void q(ExoPlaybackException error) {
        ExpertStoriesActivity expertStoriesActivity = this.f11148u;
        i.g(error, "error");
        try {
            Toast.makeText(expertStoriesActivity, expertStoriesActivity.getString(R.string.something_went_wrong), 0).show();
            expertStoriesActivity.finish();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(expertStoriesActivity.A, e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void x(int i6) {
        w player;
        w player2;
        w player3;
        w player4;
        String str;
        String str2;
        int i10 = 0;
        ExpertStoriesActivity expertStoriesActivity = this.f11148u;
        try {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        String str3 = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        if (expertStoriesActivity.F) {
                            str = "app_expert_care";
                        } else {
                            str = "app_km_video";
                        }
                        bundle.putString("source", str);
                        if (expertStoriesActivity.E) {
                            str2 = "therapy";
                        } else {
                            str2 = "psychiatry";
                        }
                        bundle.putString("flow", str2);
                        bundle.putInt("step_num", expertStoriesActivity.f11144x + 1);
                        k kVar = k.f19476a;
                        gk.a.b(bundle, "therapy_psychiatry_km_step_completed");
                        int i11 = expertStoriesActivity.f11144x;
                        if (i11 < 3) {
                            expertStoriesActivity.F = false;
                            expertStoriesActivity.f11144x = i11 + 1;
                            expertStoriesActivity.q0();
                            return;
                        }
                        expertStoriesActivity.finish();
                        return;
                    }
                    return;
                }
                Group group = (Group) expertStoriesActivity.n0(R.id.loaderGroup);
                if (group != null) {
                    group.setVisibility(8);
                }
                ((LottieAnimationView) expertStoriesActivity.n0(R.id.lvExpertStoriesLoader)).d();
                int i12 = expertStoriesActivity.f11144x;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            ProgressBar progressBar = (ProgressBar) expertStoriesActivity.n0(R.id.pbExpertStoriesOne);
                            PlayerView playerView = (PlayerView) expertStoriesActivity.n0(R.id.pvExpertStories);
                            if (playerView != null && (player4 = playerView.getPlayer()) != null) {
                                i10 = (int) player4.getDuration();
                            }
                            progressBar.setMax(i10);
                            return;
                        }
                        ProgressBar progressBar2 = (ProgressBar) expertStoriesActivity.n0(R.id.pbExpertStoriesFour);
                        PlayerView playerView2 = (PlayerView) expertStoriesActivity.n0(R.id.pvExpertStories);
                        if (playerView2 != null && (player3 = playerView2.getPlayer()) != null) {
                            i10 = (int) player3.getDuration();
                        }
                        progressBar2.setMax(i10);
                        return;
                    }
                    ProgressBar progressBar3 = (ProgressBar) expertStoriesActivity.n0(R.id.pbExpertStoriesThree);
                    PlayerView playerView3 = (PlayerView) expertStoriesActivity.n0(R.id.pvExpertStories);
                    if (playerView3 != null && (player2 = playerView3.getPlayer()) != null) {
                        i10 = (int) player2.getDuration();
                    }
                    progressBar3.setMax(i10);
                    return;
                }
                ProgressBar progressBar4 = (ProgressBar) expertStoriesActivity.n0(R.id.pbExpertStoriesTwo);
                PlayerView playerView4 = (PlayerView) expertStoriesActivity.n0(R.id.pvExpertStories);
                if (playerView4 != null && (player = playerView4.getPlayer()) != null) {
                    i10 = (int) player.getDuration();
                }
                progressBar4.setMax(i10);
                return;
            }
            ((Group) expertStoriesActivity.n0(R.id.loaderGroup)).setVisibility(0);
            ((LottieAnimationView) expertStoriesActivity.n0(R.id.lvExpertStoriesLoader)).h();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(expertStoriesActivity.A, e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void z(int i6, w.e oldPosition, w.e newPosition) {
        i.g(oldPosition, "oldPosition");
        i.g(newPosition, "newPosition");
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void N() {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void T() {
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

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void f() {
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

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void a(g8.a aVar) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void c(q qVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void f0(v vVar) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void g(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void h(List list) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void i0(d dVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void l(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void l0(boolean z10) {
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

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void w(float f) {
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
    public final /* synthetic */ void R(com.google.android.exoplayer2.q qVar, int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void V(int i6, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void e0(int i6, int i10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void v(int i6, boolean z10) {
    }
}
