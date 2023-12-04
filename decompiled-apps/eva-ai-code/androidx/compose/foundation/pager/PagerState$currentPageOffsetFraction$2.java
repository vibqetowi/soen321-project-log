package androidx.compose.foundation.pager;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PagerState.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerState$currentPageOffsetFraction$2 extends Lambda implements Function0<Float> {
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$currentPageOffsetFraction$2(PagerState pagerState) {
        super(0);
        this.this$0 = pagerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        PageInfo pageInfo;
        int pageAvailableSpace;
        float coerceIn;
        List<PageInfo> visiblePagesInfo = this.this$0.getLayoutInfo$foundation_release().getVisiblePagesInfo();
        PagerState pagerState = this.this$0;
        int size = visiblePagesInfo.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                pageInfo = null;
                break;
            }
            pageInfo = visiblePagesInfo.get(i);
            if (pageInfo.getIndex() == pagerState.getCurrentPage()) {
                break;
            }
            i++;
        }
        PageInfo pageInfo2 = pageInfo;
        int offset = pageInfo2 != null ? pageInfo2.getOffset() : 0;
        pageAvailableSpace = this.this$0.getPageAvailableSpace();
        float f = pageAvailableSpace;
        if (f == 0.0f) {
            coerceIn = this.this$0.getInitialPageOffsetFraction();
        } else {
            coerceIn = RangesKt.coerceIn((-offset) / f, -0.5f, 0.5f);
        }
        return Float.valueOf(coerceIn);
    }
}
