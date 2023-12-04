package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class LazyListSnapperLayoutInfo$visibleItems$1 extends FunctionReferenceImpl implements Function1<LazyListItemInfo, LazyListSnapperLayoutItemInfo> {
    public static final LazyListSnapperLayoutInfo$visibleItems$1 INSTANCE = new LazyListSnapperLayoutInfo$visibleItems$1();

    LazyListSnapperLayoutInfo$visibleItems$1() {
        super(1, LazyListSnapperLayoutItemInfo.class, "<init>", "<init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final LazyListSnapperLayoutItemInfo invoke(LazyListItemInfo p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new LazyListSnapperLayoutItemInfo(p0);
    }
}
