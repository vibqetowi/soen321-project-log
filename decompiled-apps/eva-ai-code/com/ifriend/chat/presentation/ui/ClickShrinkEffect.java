package com.ifriend.chat.presentation.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ClickShrinkEffect.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ifriend/chat/presentation/ui/ClickShrinkEffect;", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "(Landroid/view/View;)V", "weakRefView", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "buildGrowAnimator", "Landroid/animation/Animator;", "buildShrinkAnimator", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClickShrinkEffect {
    public static final int $stable = 8;
    private final WeakReference<View> weakRefView;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(View view) {
    }

    public ClickShrinkEffect(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.weakRefView = new WeakReference<>(view);
        if (!view.hasOnClickListeners()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.ClickShrinkEffect$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ClickShrinkEffect._init_$lambda$0(view2);
                }
            });
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.ifriend.chat.presentation.ui.ClickShrinkEffect$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean _init_$lambda$1;
                _init_$lambda$1 = ClickShrinkEffect._init_$lambda$1(ClickShrinkEffect.this, view2, motionEvent);
                return _init_$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(ClickShrinkEffect this$0, View view, MotionEvent motionEvent) {
        Animator buildGrowAnimator;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int action = motionEvent.getAction();
        if (action == 0) {
            Animator buildShrinkAnimator = this$0.buildShrinkAnimator();
            if (buildShrinkAnimator != null) {
                buildShrinkAnimator.start();
                return false;
            }
            return false;
        } else if ((action == 1 || action == 3) && (buildGrowAnimator = this$0.buildGrowAnimator()) != null) {
            buildGrowAnimator.start();
            return false;
        } else {
            return false;
        }
    }

    private final Animator buildShrinkAnimator() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.SCALE_X, 1.0f, 0.93f);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.SCALE_Y, 1.0f, 0.93f);
        View view = this.weakRefView.get();
        if (view != null) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, ofFloat, ofFloat2);
            Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(...)");
            ofPropertyValuesHolder.setDuration(100L);
            return ofPropertyValuesHolder;
        }
        return null;
    }

    private final Animator buildGrowAnimator() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.SCALE_X, 0.93f, 1.0f);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.93f, 1.0f);
        View view = this.weakRefView.get();
        if (view != null) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, ofFloat, ofFloat2);
            Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(...)");
            ofPropertyValuesHolder.setDuration(100L);
            return ofPropertyValuesHolder;
        }
        return null;
    }
}
