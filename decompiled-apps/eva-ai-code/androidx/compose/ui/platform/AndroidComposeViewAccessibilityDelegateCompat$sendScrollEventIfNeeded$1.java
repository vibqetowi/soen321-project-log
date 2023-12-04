package androidx.compose.ui.platform;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.ScrollAxisRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ScrollObservationScope $scrollObservationScope;
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1(ScrollObservationScope scrollObservationScope, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(0);
        this.$scrollObservationScope = scrollObservationScope;
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        if ((r2 == 0.0f) == false) goto L23;
     */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2() {
        int semanticsNodeIdToAccessibilityVirtualNodeId;
        ScrollAxisRange horizontalScrollAxisRange = this.$scrollObservationScope.getHorizontalScrollAxisRange();
        ScrollAxisRange verticalScrollAxisRange = this.$scrollObservationScope.getVerticalScrollAxisRange();
        Float oldXValue = this.$scrollObservationScope.getOldXValue();
        Float oldYValue = this.$scrollObservationScope.getOldYValue();
        float floatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
        float floatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
        if (floatValue == 0.0f) {
        }
        semanticsNodeIdToAccessibilityVirtualNodeId = this.this$0.semanticsNodeIdToAccessibilityVirtualNodeId(this.$scrollObservationScope.getSemanticsNodeId());
        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this.this$0, semanticsNodeIdToAccessibilityVirtualNodeId, 2048, 1, null, 8, null);
        AccessibilityEvent createEvent$ui_release = this.this$0.createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId, 4096);
        if (horizontalScrollAxisRange != null) {
            createEvent$ui_release.setScrollX((int) horizontalScrollAxisRange.getValue().invoke().floatValue());
            createEvent$ui_release.setMaxScrollX((int) horizontalScrollAxisRange.getMaxValue().invoke().floatValue());
        }
        if (verticalScrollAxisRange != null) {
            createEvent$ui_release.setScrollY((int) verticalScrollAxisRange.getValue().invoke().floatValue());
            createEvent$ui_release.setMaxScrollY((int) verticalScrollAxisRange.getMaxValue().invoke().floatValue());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AndroidComposeViewAccessibilityDelegateCompat.Api28Impl.setScrollEventDelta(createEvent$ui_release, (int) floatValue, (int) floatValue2);
        }
        this.this$0.sendEvent(createEvent$ui_release);
        if (horizontalScrollAxisRange != null) {
            this.$scrollObservationScope.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
        }
        if (verticalScrollAxisRange != null) {
            this.$scrollObservationScope.setOldYValue(verticalScrollAxisRange.getValue().invoke());
        }
    }
}
