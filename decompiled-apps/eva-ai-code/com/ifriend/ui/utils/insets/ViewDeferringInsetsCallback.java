package com.ifriend.ui.utils.insets;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewDeferringInsetsCallback.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00126\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001dH\u0016R>\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ifriend/ui/utils/insets/ViewDeferringInsetsCallback;", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", "Landroidx/core/view/OnApplyWindowInsetsListener;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "persistentInsetTypes", "", "deferredInsetTypes", "applyWindowInsets", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Landroidx/core/graphics/Insets;", "insets", "", "(Landroid/view/View;IILkotlin/jvm/functions/Function2;)V", "deferredInsets", "", "lastWindowInsets", "Landroidx/core/view/WindowInsetsCompat;", "onApplyWindowInsets", "v", "windowInsets", "onEnd", "animation", "Landroidx/core/view/WindowInsetsAnimationCompat;", "onPrepare", "onProgress", "runningAnims", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ViewDeferringInsetsCallback extends WindowInsetsAnimationCompat.Callback implements OnApplyWindowInsetsListener {
    public static final int $stable = 8;
    private final Function2<View, Insets, Unit> applyWindowInsets;
    private final int deferredInsetTypes;
    private boolean deferredInsets;
    private WindowInsetsCompat lastWindowInsets;
    private final int persistentInsetTypes;
    private final View view;

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsCompat onProgress(WindowInsetsCompat insets, List<WindowInsetsAnimationCompat> runningAnims) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnims, "runningAnims");
        return insets;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewDeferringInsetsCallback(View view, int i, int i2, Function2<? super View, ? super Insets, Unit> applyWindowInsets) {
        super(1);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(applyWindowInsets, "applyWindowInsets");
        this.view = view;
        this.persistentInsetTypes = i;
        this.deferredInsetTypes = i2;
        this.applyWindowInsets = applyWindowInsets;
        if (!((i & i2) == 0)) {
            throw new IllegalArgumentException("persistentInsetTypes and deferredInsetTypes can not contain any of  same WindowInsetsCompat.Type values".toString());
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        this.lastWindowInsets = windowInsets;
        Insets insets = windowInsets.getInsets(this.deferredInsets ? this.persistentInsetTypes : this.persistentInsetTypes | this.deferredInsetTypes);
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        this.applyWindowInsets.invoke(v, insets);
        WindowInsetsCompat CONSUMED = WindowInsetsCompat.CONSUMED;
        Intrinsics.checkNotNullExpressionValue(CONSUMED, "CONSUMED");
        return CONSUMED;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onPrepare(WindowInsetsAnimationCompat animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if ((animation.getTypeMask() & this.deferredInsetTypes) != 0) {
            this.deferredInsets = true;
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(WindowInsetsAnimationCompat animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (!this.deferredInsets || (animation.getTypeMask() & this.deferredInsetTypes) == 0) {
            return;
        }
        this.deferredInsets = false;
        WindowInsetsCompat windowInsetsCompat = this.lastWindowInsets;
        if (windowInsetsCompat != null) {
            View view = this.view;
            Intrinsics.checkNotNull(windowInsetsCompat);
            ViewCompat.dispatchApplyWindowInsets(view, windowInsetsCompat);
        }
    }
}
