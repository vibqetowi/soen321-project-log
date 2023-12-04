package com.ifriend.presentation.features.profile.menu.view;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.VerticalAnchorable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ProfileMenuContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/constraintlayout/compose/ConstrainScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ProfileMenuContentKt$ProfileMenuContent$1$2$5$1$1 extends Lambda implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstrainedLayoutReference $textRef;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileMenuContentKt$ProfileMenuContent$1$2$5$1$1(ConstrainedLayoutReference constrainedLayoutReference) {
        super(1);
        this.$textRef = constrainedLayoutReference;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        HorizontalAnchorable.DefaultImpls.m5910linkToVpY3zN4$default(constrainAs.getTop(), this.$textRef.getTop(), 0.0f, 0.0f, 6, null);
        HorizontalAnchorable.DefaultImpls.m5910linkToVpY3zN4$default(constrainAs.getBottom(), this.$textRef.getBottom(), 0.0f, 0.0f, 6, null);
        VerticalAnchorable.DefaultImpls.m5949linkToVpY3zN4$default(constrainAs.getAbsoluteLeft(), this.$textRef.getAbsoluteRight(), Dp.m5607constructorimpl(10), 0.0f, 4, null);
        VerticalAnchorable.DefaultImpls.m5949linkToVpY3zN4$default(constrainAs.getAbsoluteRight(), constrainAs.getParent().getAbsoluteRight(), Dp.m5607constructorimpl(16), 0.0f, 4, null);
        constrainAs.setWidth(Dimension.Companion.getFillToConstraints());
    }
}
