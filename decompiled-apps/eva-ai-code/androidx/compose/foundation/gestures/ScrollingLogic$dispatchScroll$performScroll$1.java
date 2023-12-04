package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "delta", "invoke-MK-Hz9U", "(J)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollingLogic$dispatchScroll$performScroll$1 extends Lambda implements Function1<Offset, Offset> {
    final /* synthetic */ int $source;
    final /* synthetic */ ScrollScope $this_dispatchScroll;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$dispatchScroll$performScroll$1(ScrollingLogic scrollingLogic, int i, ScrollScope scrollScope) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$source = i;
        this.$this_dispatchScroll = scrollScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
        return Offset.m3007boximpl(m610invokeMKHz9U(offset.m3028unboximpl()));
    }

    /* renamed from: invoke-MK-Hz9U  reason: not valid java name */
    public final long m610invokeMKHz9U(long j) {
        NestedScrollDispatcher value = this.this$0.getNestedScrollDispatcher().getValue();
        long m4313dispatchPreScrollOzD1aCk = value.m4313dispatchPreScrollOzD1aCk(j, this.$source);
        long m3022minusMKHz9U = Offset.m3022minusMKHz9U(j, m4313dispatchPreScrollOzD1aCk);
        ScrollingLogic scrollingLogic = this.this$0;
        long m603reverseIfNeededMKHz9U = scrollingLogic.m603reverseIfNeededMKHz9U(scrollingLogic.m608toOffsettuRUvjQ(this.$this_dispatchScroll.scrollBy(scrollingLogic.m607toFloatk4lQ0M(scrollingLogic.m603reverseIfNeededMKHz9U(m3022minusMKHz9U)))));
        return Offset.m3023plusMKHz9U(Offset.m3023plusMKHz9U(m4313dispatchPreScrollOzD1aCk, m603reverseIfNeededMKHz9U), value.m4311dispatchPostScrollDzOQY0M(m603reverseIfNeededMKHz9U, Offset.m3022minusMKHz9U(m3022minusMKHz9U, m603reverseIfNeededMKHz9U), this.$source));
    }
}
