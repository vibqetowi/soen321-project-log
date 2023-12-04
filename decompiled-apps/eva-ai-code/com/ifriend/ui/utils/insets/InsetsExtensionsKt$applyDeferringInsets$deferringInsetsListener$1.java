package com.ifriend.ui.utils.insets;

import android.view.View;
import androidx.core.graphics.Insets;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: InsetsExtensions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "insets", "Landroidx/core/graphics/Insets;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class InsetsExtensionsKt$applyDeferringInsets$deferringInsetsListener$1 extends Lambda implements Function2<View, Insets, Unit> {
    final /* synthetic */ Function3<View, Insets, InitialPadding, Unit> $applyWindowInsets;
    final /* synthetic */ InitialPadding $initialPadding;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InsetsExtensionsKt$applyDeferringInsets$deferringInsetsListener$1(Function3<? super View, ? super Insets, ? super InitialPadding, Unit> function3, InitialPadding initialPadding) {
        super(2);
        this.$applyWindowInsets = function3;
        this.$initialPadding = initialPadding;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(View view, Insets insets) {
        invoke2(view, insets);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view, Insets insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        this.$applyWindowInsets.invoke(view, insets, this.$initialPadding);
    }
}
