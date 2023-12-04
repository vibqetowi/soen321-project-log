package com.ifriend.chat.presentation.ui;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ClickShrinkEffect.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"DURATION_ANIMATION", "", "SHRINK_VALUE", "", "applyClickShrink", "Landroid/view/View;", "removeClickShrinkEffect", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClickShrinkEffectKt {
    private static final long DURATION_ANIMATION = 100;
    private static final float SHRINK_VALUE = 0.93f;

    public static final View applyClickShrink(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        new ClickShrinkEffect(view);
        return view;
    }

    public static final View removeClickShrinkEffect(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnTouchListener(null);
        return view;
    }
}
