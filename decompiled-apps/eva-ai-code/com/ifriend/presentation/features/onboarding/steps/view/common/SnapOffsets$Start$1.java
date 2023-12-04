package com.ifriend.presentation.features.onboarding.steps.view.common;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SnapperFlingBehavior.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", TtmlNode.TAG_LAYOUT, "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;", "<anonymous parameter 1>", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutItemInfo;", "invoke", "(Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutItemInfo;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SnapOffsets$Start$1 extends Lambda implements Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> {
    public static final SnapOffsets$Start$1 INSTANCE = new SnapOffsets$Start$1();

    SnapOffsets$Start$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(SnapperLayoutInfo layout, SnapperLayoutItemInfo snapperLayoutItemInfo) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(snapperLayoutItemInfo, "<anonymous parameter 1>");
        return Integer.valueOf(layout.getStartScrollOffset());
    }
}
