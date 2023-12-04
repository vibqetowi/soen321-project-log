package com.ifriend.presentation.features.onboarding.steps.view.common;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* compiled from: SnapperFlingBehavior.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R#\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR#\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR#\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapOffsets;", "", "()V", "Center", "Lkotlin/Function2;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutItemInfo;", "", "getCenter", "()Lkotlin/jvm/functions/Function2;", "End", "getEnd", "Start", "getStart", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnapOffsets {
    public static final int $stable = 0;
    public static final SnapOffsets INSTANCE = new SnapOffsets();
    private static final Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> Start = SnapOffsets$Start$1.INSTANCE;
    private static final Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> Center = SnapOffsets$Center$1.INSTANCE;
    private static final Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> End = SnapOffsets$End$1.INSTANCE;

    private SnapOffsets() {
    }

    public final Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> getStart() {
        return Start;
    }

    public final Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> getCenter() {
        return Center;
    }

    public final Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> getEnd() {
        return End;
    }
}
