package com.theinnerhour.b2b.utils;

import android.animation.Animator;
import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import hr.e8;
import kotlin.Metadata;
/* compiled from: NotificationPermissionBottomSheet.kt */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/theinnerhour/b2b/utils/NotificationPermissionBottomSheet$onViewCreated$3", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "p0", "Lhs/k;", "onAnimationStart", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NotificationPermissionBottomSheet$onViewCreated$3 implements Animator.AnimatorListener {
    final /* synthetic */ NotificationPermissionBottomSheet this$0;

    public NotificationPermissionBottomSheet$onViewCreated$3(NotificationPermissionBottomSheet notificationPermissionBottomSheet) {
        this.this$0 = notificationPermissionBottomSheet;
    }

    public static final void onAnimationEnd$lambda$0(NotificationPermissionBottomSheet this$0) {
        String str;
        LottieAnimationView lottieAnimationView;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        try {
            if (this$0.isAdded() && (lottieAnimationView = (LottieAnimationView) this$0._$_findCachedViewById(R.id.lavPostDenialGif)) != null) {
                lottieAnimationView.h();
            }
        } catch (Exception e10) {
            LogHelper logHelper = LogHelper.INSTANCE;
            str = this$0.TAG;
            logHelper.e(str, e10);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
        new Handler(Looper.getMainLooper()).postDelayed(new e8(5, this.this$0), 2000L);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
    }
}
