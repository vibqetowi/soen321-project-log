package hq;

import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: DepressionPleasurableAudioFragment.kt */
/* loaded from: classes2.dex */
public final class d extends k implements l<Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f18103u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(1);
        this.f18103u = eVar;
    }

    @Override // ss.l
    public final hs.k invoke(Integer num) {
        boolean z10;
        Integer it = num;
        e eVar = this.f18103u;
        if (eVar.isAdded()) {
            i.f(it, "it");
            if (it.intValue() > 0) {
                ProgressBar progressBar = (ProgressBar) eVar._$_findCachedViewById(R.id.downloadBtnProgress);
                if (progressBar != null && progressBar.getProgress() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ProgressBar progressBar2 = (ProgressBar) eVar._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(0);
                    }
                    AppCompatImageView appCompatImageView = (AppCompatImageView) eVar._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(8);
                    }
                }
            }
            ProgressBar progressBar3 = (ProgressBar) eVar._$_findCachedViewById(R.id.downloadBtnProgress);
            if (progressBar3 != null) {
                progressBar3.setProgress(it.intValue());
            }
            if (it.intValue() >= 100) {
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) eVar._$_findCachedViewById(R.id.downloadBtn);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setImageResource(R.drawable.ic_cloud_download_done);
                }
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) eVar._$_findCachedViewById(R.id.downloadBtn);
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setOnClickListener(null);
                }
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) eVar._$_findCachedViewById(R.id.downloadBtn);
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setVisibility(0);
                }
                RobertoTextView robertoTextView = (RobertoTextView) eVar._$_findCachedViewById(R.id.downloadSize);
                if (robertoTextView != null) {
                    robertoTextView.setVisibility(8);
                }
                ProgressBar progressBar4 = (ProgressBar) eVar._$_findCachedViewById(R.id.downloadBtnProgress);
                if (progressBar4 != null) {
                    progressBar4.setVisibility(8);
                }
                eVar.J = true;
                eVar.Q(true);
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                String str = eVar.f18105v;
                i.d(str);
                analyticsBundle.putString(Constants.NOTIFICATION_URL, str);
                gk.a.b(analyticsBundle, "activity_audio_download_finish");
            }
        }
        return hs.k.f19476a;
    }
}
