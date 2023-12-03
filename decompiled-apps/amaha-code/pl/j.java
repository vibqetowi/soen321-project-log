package pl;

import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14AScreenFragment;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
/* compiled from: N14AScreenFragment.kt */
/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N14AScreenFragment f28608u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(N14AScreenFragment n14AScreenFragment) {
        super(1);
        this.f28608u = n14AScreenFragment;
    }

    @Override // ss.l
    public final hs.k invoke(Integer num) {
        Float f;
        Integer it = num;
        N14AScreenFragment n14AScreenFragment = this.f28608u;
        if (n14AScreenFragment.isAdded()) {
            kotlin.jvm.internal.i.f(it, "it");
            if (it.intValue() > 0) {
                CircularProgressBar circularProgressBar = (CircularProgressBar) n14AScreenFragment._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress);
                if (circularProgressBar != null) {
                    f = Float.valueOf(circularProgressBar.getProgress());
                } else {
                    f = null;
                }
                if (kotlin.jvm.internal.i.a(f, 0.0f)) {
                    CircularProgressBar circularProgressBar2 = (CircularProgressBar) n14AScreenFragment._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress);
                    if (circularProgressBar2 != null) {
                        circularProgressBar2.setVisibility(0);
                    }
                    AppCompatImageView appCompatImageView = (AppCompatImageView) n14AScreenFragment._$_findCachedViewById(R.id.ivN14AScreenDownloadButton);
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(4);
                    }
                }
            }
            CircularProgressBar circularProgressBar3 = (CircularProgressBar) n14AScreenFragment._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress);
            if (circularProgressBar3 != null) {
                circularProgressBar3.setProgress(it.intValue());
            }
            if (it.intValue() >= 100) {
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
            }
        }
        return hs.k.f19476a;
    }
}
