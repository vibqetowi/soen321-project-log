package com.ifriend.ui.utils.insets;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TranslateDeferringInsetsAnimationCallback.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ifriend/ui/utils/insets/TranslateDeferringInsetsAnimationCallback;", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "persistentInsetTypes", "", "deferredInsetTypes", "dispatchMode", "(Landroid/view/View;III)V", "onEnd", "", "animation", "Landroidx/core/view/WindowInsetsAnimationCompat;", "onProgress", "Landroidx/core/view/WindowInsetsCompat;", "insets", "runningAnimations", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TranslateDeferringInsetsAnimationCallback extends WindowInsetsAnimationCompat.Callback {
    public static final int $stable = 8;
    private final int deferredInsetTypes;
    private final int persistentInsetTypes;
    private final View view;

    public /* synthetic */ TranslateDeferringInsetsAnimationCallback(View view, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, i, i2, (i4 & 8) != 0 ? 0 : i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslateDeferringInsetsAnimationCallback(View view, int i, int i2, int i3) {
        super(i3);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.persistentInsetTypes = i;
        this.deferredInsetTypes = i2;
        if (!((i & i2) == 0)) {
            throw new IllegalArgumentException("persistentInsetTypes and deferredInsetTypes can not contain any of  same WindowInsetsCompat.Type values".toString());
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsCompat onProgress(WindowInsetsCompat insets, List<WindowInsetsAnimationCompat> runningAnimations) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        Insets insets2 = insets.getInsets(this.deferredInsetTypes);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        Insets insets3 = insets.getInsets(this.persistentInsetTypes);
        Intrinsics.checkNotNullExpressionValue(insets3, "getInsets(...)");
        Insets max = Insets.max(Insets.subtract(insets2, insets3), Insets.NONE);
        Intrinsics.checkNotNullExpressionValue(max, "let(...)");
        this.view.setTranslationX(max.left - max.right);
        this.view.setTranslationY(max.top - max.bottom);
        return insets;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(WindowInsetsAnimationCompat animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.view.setTranslationX(0.0f);
        this.view.setTranslationY(0.0f);
    }
}
