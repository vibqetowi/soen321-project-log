package androidx.compose.foundation;

import android.widget.EdgeEffect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidOverscroll.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "size", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect$onNewSize$1 extends Lambda implements Function1<IntSize, Unit> {
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$onNewSize$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        super(1);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
        m417invokeozmzZPI(intSize.m5771unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m417invokeozmzZPI(long j) {
        long j2;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        EdgeEffect edgeEffect3;
        EdgeEffect edgeEffect4;
        EdgeEffect edgeEffect5;
        EdgeEffect edgeEffect6;
        EdgeEffect edgeEffect7;
        EdgeEffect edgeEffect8;
        long m5777toSizeozmzZPI = IntSizeKt.m5777toSizeozmzZPI(j);
        j2 = this.this$0.containerSize;
        boolean z = !Size.m3083equalsimpl0(m5777toSizeozmzZPI, j2);
        this.this$0.containerSize = IntSizeKt.m5777toSizeozmzZPI(j);
        if (z) {
            edgeEffect = this.this$0.topEffect;
            edgeEffect.setSize(IntSize.m5767getWidthimpl(j), IntSize.m5766getHeightimpl(j));
            edgeEffect2 = this.this$0.bottomEffect;
            edgeEffect2.setSize(IntSize.m5767getWidthimpl(j), IntSize.m5766getHeightimpl(j));
            edgeEffect3 = this.this$0.leftEffect;
            edgeEffect3.setSize(IntSize.m5766getHeightimpl(j), IntSize.m5767getWidthimpl(j));
            edgeEffect4 = this.this$0.rightEffect;
            edgeEffect4.setSize(IntSize.m5766getHeightimpl(j), IntSize.m5767getWidthimpl(j));
            edgeEffect5 = this.this$0.topEffectNegation;
            edgeEffect5.setSize(IntSize.m5767getWidthimpl(j), IntSize.m5766getHeightimpl(j));
            edgeEffect6 = this.this$0.bottomEffectNegation;
            edgeEffect6.setSize(IntSize.m5767getWidthimpl(j), IntSize.m5766getHeightimpl(j));
            edgeEffect7 = this.this$0.leftEffectNegation;
            edgeEffect7.setSize(IntSize.m5766getHeightimpl(j), IntSize.m5767getWidthimpl(j));
            edgeEffect8 = this.this$0.rightEffectNegation;
            edgeEffect8.setSize(IntSize.m5766getHeightimpl(j), IntSize.m5767getWidthimpl(j));
        }
        if (z) {
            this.this$0.invalidateOverscroll();
            this.this$0.animateToRelease();
        }
    }
}
