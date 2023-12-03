package mk;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.bookmarking.activities.BookmarkingActivity;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: BookmarkingActivity.kt */
/* loaded from: classes2.dex */
public final class h implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ BookmarkingActivity f25333u;

    public h(BookmarkingActivity bookmarkingActivity) {
        this.f25333u = bookmarkingActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        BookmarkingActivity bookmarkingActivity = this.f25333u;
        ((ConstraintLayout) bookmarkingActivity.n0(R.id.clBookmarkBottomSheetContainer1)).setVisibility(4);
        bookmarkingActivity.getClass();
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(bookmarkingActivity, R.anim.slide_fade_in_right);
            loadAnimation.setAnimationListener(new c(bookmarkingActivity));
            ConstraintLayout constraintLayout = (ConstraintLayout) bookmarkingActivity.n0(R.id.clBookmarkBottomSheetContainer2);
            if (constraintLayout != null) {
                constraintLayout.startAnimation(loadAnimation);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(bookmarkingActivity.f10620w, e10);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
