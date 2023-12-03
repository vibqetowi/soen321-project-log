package zo;

import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: RecommendedActivityAudioFragment.kt */
/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f39687u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar) {
        super(1);
        this.f39687u = eVar;
    }

    @Override // ss.l
    public final hs.k invoke(Integer num) {
        Float f;
        Integer it = num;
        e eVar = this.f39687u;
        if (eVar.isAdded()) {
            kotlin.jvm.internal.i.f(it, "it");
            if (it.intValue() > 0) {
                CircularProgressBar circularProgressBar = (CircularProgressBar) eVar._$_findCachedViewById(R.id.pbRADownloadProgress);
                if (circularProgressBar != null) {
                    f = Float.valueOf(circularProgressBar.getProgress());
                } else {
                    f = null;
                }
                if (kotlin.jvm.internal.i.a(f, 0.0f)) {
                    CircularProgressBar circularProgressBar2 = (CircularProgressBar) eVar._$_findCachedViewById(R.id.pbRADownloadProgress);
                    if (circularProgressBar2 != null) {
                        circularProgressBar2.setVisibility(0);
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) eVar._$_findCachedViewById(R.id.tvRADownloadProgress);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(0);
                    }
                    AppCompatImageView appCompatImageView = (AppCompatImageView) eVar._$_findCachedViewById(R.id.ivRADownloadCta);
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(8);
                    }
                }
            }
            CircularProgressBar circularProgressBar3 = (CircularProgressBar) eVar._$_findCachedViewById(R.id.pbRADownloadProgress);
            if (circularProgressBar3 != null) {
                circularProgressBar3.setProgress(it.intValue());
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) eVar._$_findCachedViewById(R.id.tvRADownloadProgress);
            if (robertoTextView2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(it);
                sb2.append('%');
                robertoTextView2.setText(sb2.toString());
            }
            if (it.intValue() >= 100) {
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) eVar._$_findCachedViewById(R.id.ivRADownloadCta);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setImageResource(R.drawable.ic_ra_downloaded);
                }
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) eVar._$_findCachedViewById(R.id.ivRADownloadCta);
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setOnClickListener(null);
                }
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) eVar._$_findCachedViewById(R.id.ivRADownloadCta);
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setVisibility(0);
                }
                ((CircularProgressBar) eVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setProgress(0.0f);
                ((CircularProgressBar) eVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setVisibility(8);
                ((RobertoTextView) eVar._$_findCachedViewById(R.id.tvRADownloadProgress)).setVisibility(8);
                eVar.N = true;
            }
        }
        return hs.k.f19476a;
    }
}
