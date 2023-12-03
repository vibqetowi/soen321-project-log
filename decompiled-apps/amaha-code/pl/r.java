package pl;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.work.u;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14AScreenFragment;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import com.theinnerhour.b2b.utils.Utils;
import ql.i;
/* compiled from: N14AScreenFragment.kt */
/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.k implements ss.l<u.a, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N14AScreenFragment f28628u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(N14AScreenFragment n14AScreenFragment) {
        super(1);
        this.f28628u = n14AScreenFragment;
    }

    @Override // ss.l
    public final hs.k invoke(u.a aVar) {
        boolean z10;
        u.a status = aVar;
        kotlin.jvm.internal.i.g(status, "status");
        if (status == u.a.RUNNING) {
            z10 = true;
        } else {
            z10 = false;
        }
        N14AScreenFragment n14AScreenFragment = this.f28628u;
        n14AScreenFragment.O = z10;
        int ordinal = status.ordinal();
        if (ordinal != 0 && ordinal != 2) {
            if (ordinal == 3) {
                if (n14AScreenFragment.isAdded()) {
                    N14AScreenFragment.a aVar2 = n14AScreenFragment.T;
                    if (aVar2 != null) {
                        Utils.INSTANCE.showCustomToast(n14AScreenFragment.requireContext(), aVar2.f10959h);
                    }
                    ((CircularProgressBar) n14AScreenFragment._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                    ((CircularProgressBar) n14AScreenFragment._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setVisibility(8);
                    AppCompatImageView appCompatImageView = (AppCompatImageView) n14AScreenFragment._$_findCachedViewById(R.id.ivN14AScreenDownloadButton);
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(0);
                    }
                    n14AScreenFragment.O = false;
                }
                Bundle bundle = new Bundle();
                defpackage.d.m(bundle, "course");
                bundle.putString("activity_name", n14AScreenFragment.f10952z);
                bundle.putBoolean("main_activity", n14AScreenFragment.X().K);
                bundle.putBoolean("is_revamped", true);
                bundle.putString("source", "template_activity");
                gk.a.b(bundle, "activity_download_fail");
            }
        } else if (n14AScreenFragment.isAdded()) {
            Utils utils = Utils.INSTANCE;
            String U = n14AScreenFragment.U();
            Context requireContext = n14AScreenFragment.requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            if (utils.getAudioFilePath(U, requireContext) != null) {
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) n14AScreenFragment._$_findCachedViewById(R.id.ivN14AScreenDownloadButton);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setImageResource(R.drawable.ic_nda_downloaded);
                }
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) n14AScreenFragment._$_findCachedViewById(R.id.ivN14AScreenDownloadButton);
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setOnClickListener(null);
                }
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) n14AScreenFragment._$_findCachedViewById(R.id.ivN14AScreenDownloadButton);
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setVisibility(0);
                }
                ((CircularProgressBar) n14AScreenFragment._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                ((CircularProgressBar) n14AScreenFragment._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setVisibility(8);
                n14AScreenFragment.I = true;
                String U2 = n14AScreenFragment.U();
                Context requireContext2 = n14AScreenFragment.requireContext();
                kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
                String audioFilePath = utils.getAudioFilePath(U2, requireContext2);
                if (audioFilePath != null) {
                    n14AScreenFragment.g0(audioFilePath);
                }
                ql.i S = n14AScreenFragment.S();
                i.a aVar3 = n14AScreenFragment.F;
                kotlin.jvm.internal.i.d(aVar3);
                long j10 = n14AScreenFragment.C;
                boolean Q1 = is.k.Q1(n14AScreenFragment.S().E.d(), new Integer[]{0, 2, 1});
                S.getClass();
                ta.v.H(kc.f.H(S), null, 0, new ql.l(S, aVar3, j10, Q1, null), 3);
                Bundle bundle2 = new Bundle();
                defpackage.d.m(bundle2, "course");
                bundle2.putString("activity_name", n14AScreenFragment.f10952z);
                bundle2.putBoolean("main_activity", n14AScreenFragment.X().K);
                bundle2.putBoolean("is_revamped", true);
                bundle2.putString("source", "template_activity");
                gk.a.b(bundle2, "activity_audio_download_finish");
            } else {
                ((CircularProgressBar) n14AScreenFragment._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                ((CircularProgressBar) n14AScreenFragment._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setVisibility(0);
                AppCompatImageView appCompatImageView5 = (AppCompatImageView) n14AScreenFragment._$_findCachedViewById(R.id.ivN14AScreenDownloadButton);
                if (appCompatImageView5 != null) {
                    appCompatImageView5.setVisibility(4);
                }
            }
        }
        return hs.k.f19476a;
    }
}
