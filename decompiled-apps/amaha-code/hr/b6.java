package hr;

import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ScreenS15Fragment.kt */
/* loaded from: classes2.dex */
public final class b6 extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c6 f18204u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(c6 c6Var) {
        super(1);
        this.f18204u = c6Var;
    }

    @Override // ss.l
    public final hs.k invoke(Integer num) {
        boolean z10;
        Integer it = num;
        c6 c6Var = this.f18204u;
        if (c6Var.isAdded()) {
            kotlin.jvm.internal.i.f(it, "it");
            if (it.intValue() > 0) {
                ProgressBar progressBar = (ProgressBar) c6Var._$_findCachedViewById(R.id.downloadBtnProgress);
                if (progressBar != null && progressBar.getProgress() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ProgressBar progressBar2 = (ProgressBar) c6Var._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(0);
                    }
                    AppCompatImageView appCompatImageView = (AppCompatImageView) c6Var._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(8);
                    }
                }
            }
            ProgressBar progressBar3 = (ProgressBar) c6Var._$_findCachedViewById(R.id.downloadBtnProgress);
            if (progressBar3 != null) {
                progressBar3.setProgress(it.intValue());
            }
            if (it.intValue() >= 100) {
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) c6Var._$_findCachedViewById(R.id.downloadBtn);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setImageResource(R.drawable.ic_cloud_download_done);
                }
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) c6Var._$_findCachedViewById(R.id.downloadBtn);
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setOnClickListener(null);
                }
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) c6Var._$_findCachedViewById(R.id.downloadBtn);
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setVisibility(0);
                }
                RobertoTextView robertoTextView = (RobertoTextView) c6Var._$_findCachedViewById(R.id.downloadSize);
                if (robertoTextView != null) {
                    robertoTextView.setVisibility(8);
                }
                ProgressBar progressBar4 = (ProgressBar) c6Var._$_findCachedViewById(R.id.downloadBtnProgress);
                if (progressBar4 != null) {
                    progressBar4.setVisibility(8);
                }
                c6Var.A = true;
                com.google.android.exoplayer2.a0 a0Var = c6Var.P;
                if (a0Var != null && a0Var.isPlaying()) {
                    c6Var.K = true;
                }
                c6Var.O(true);
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                String str = c6Var.f18244w;
                kotlin.jvm.internal.i.d(str);
                analyticsBundle.putString(Constants.NOTIFICATION_URL, str);
                gk.a.b(analyticsBundle, "activity_audio_download_finish");
            }
        }
        return hs.k.f19476a;
    }
}
