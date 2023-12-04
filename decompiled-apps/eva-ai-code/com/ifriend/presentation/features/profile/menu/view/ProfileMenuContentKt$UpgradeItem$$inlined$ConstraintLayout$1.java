package com.ifriend.presentation.features.profile.menu.view;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstraintLayout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileMenuContentKt$UpgradeItem$$inlined$ConstraintLayout$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ Measurer $measurer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileMenuContentKt$UpgradeItem$$inlined$ConstraintLayout$1(Measurer measurer) {
        super(1);
        this.$measurer = measurer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        ToolingUtilsKt.setDesignInfoProvider(semantics, this.$measurer);
    }
}
