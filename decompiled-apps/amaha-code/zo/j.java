package zo;

import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
/* compiled from: RecommendedActivityGifFragment.kt */
/* loaded from: classes2.dex */
public final class j implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ i f39744u;

    public j(i iVar) {
        this.f39744u = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f39744u;
        int currentItem = ((ViewPager) iVar._$_findCachedViewById(R.id.viewpager)).getCurrentItem();
        k2.a adapter = ((ViewPager) iVar._$_findCachedViewById(R.id.viewpager)).getAdapter();
        kotlin.jvm.internal.i.d(adapter);
        if (currentItem == adapter.g() - 1) {
            ((ViewPager) iVar._$_findCachedViewById(R.id.viewpager)).v(0);
        } else {
            ((ViewPager) iVar._$_findCachedViewById(R.id.viewpager)).v(((ViewPager) iVar._$_findCachedViewById(R.id.viewpager)).getCurrentItem() + 1);
        }
        iVar.f39717b0.postDelayed(this, iVar.f39716a0);
    }
}
