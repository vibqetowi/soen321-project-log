package com.ifriend.presentation.features.onboarding.steps.view.common;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SnapperFlingBehavior.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;", "<anonymous parameter 1>", "targetIndex", "invoke", "(Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SnapperFlingBehaviorDefaults$SnapIndex$1 extends Lambda implements Function3<SnapperLayoutInfo, Integer, Integer, Integer> {
    public static final SnapperFlingBehaviorDefaults$SnapIndex$1 INSTANCE = new SnapperFlingBehaviorDefaults$SnapIndex$1();

    SnapperFlingBehaviorDefaults$SnapIndex$1() {
        super(3);
    }

    public final Integer invoke(SnapperLayoutInfo snapperLayoutInfo, int i, int i2) {
        Intrinsics.checkNotNullParameter(snapperLayoutInfo, "<anonymous parameter 0>");
        return Integer.valueOf(i2);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Integer invoke(SnapperLayoutInfo snapperLayoutInfo, Integer num, Integer num2) {
        return invoke(snapperLayoutInfo, num.intValue(), num2.intValue());
    }
}
