package com.ifriend.presentation.features.onboarding.steps.view.common;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SnapperFlingBehavior.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;", "invoke", "(Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SnapperFlingBehaviorDefaults$MaximumFlingDistance$1 extends Lambda implements Function1<SnapperLayoutInfo, Float> {
    public static final SnapperFlingBehaviorDefaults$MaximumFlingDistance$1 INSTANCE = new SnapperFlingBehaviorDefaults$MaximumFlingDistance$1();

    SnapperFlingBehaviorDefaults$MaximumFlingDistance$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(SnapperLayoutInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Float.valueOf(Float.MAX_VALUE);
    }
}
