package com.ifriend.presentation.features.purchases.common.view;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubscriptionBenefitsList.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/layout/LayoutCoordinates;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubscriptionBenefitsListKt$BenefitsGroup$1$4$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {
    final /* synthetic */ MutableIntState $textWidth$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionBenefitsListKt$BenefitsGroup$1$4$1(MutableIntState mutableIntState) {
        super(1);
        this.$textWidth$delegate = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$textWidth$delegate.setIntValue(IntSize.m5767getWidthimpl(it.mo4552getSizeYbymL2g()));
    }
}
