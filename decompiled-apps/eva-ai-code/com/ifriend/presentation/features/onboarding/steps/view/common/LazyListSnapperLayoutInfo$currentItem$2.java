package com.ifriend.presentation.features.onboarding.steps.view.common;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutItemInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyListSnapperLayoutInfo$currentItem$2 extends Lambda implements Function0<SnapperLayoutItemInfo> {
    final /* synthetic */ LazyListSnapperLayoutInfo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListSnapperLayoutInfo$currentItem$2(LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo) {
        super(0);
        this.this$0 = lazyListSnapperLayoutInfo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SnapperLayoutItemInfo invoke() {
        Function2 function2;
        Sequence<SnapperLayoutItemInfo> visibleItems = this.this$0.getVisibleItems();
        LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo = this.this$0;
        SnapperLayoutItemInfo snapperLayoutItemInfo = null;
        for (SnapperLayoutItemInfo snapperLayoutItemInfo2 : visibleItems) {
            SnapperLayoutItemInfo snapperLayoutItemInfo3 = snapperLayoutItemInfo2;
            int offset = snapperLayoutItemInfo3.getOffset();
            function2 = lazyListSnapperLayoutInfo.snapOffsetForItem;
            if (offset <= ((Number) function2.invoke(lazyListSnapperLayoutInfo, snapperLayoutItemInfo3)).intValue()) {
                snapperLayoutItemInfo = snapperLayoutItemInfo2;
            }
        }
        return snapperLayoutItemInfo;
    }
}
