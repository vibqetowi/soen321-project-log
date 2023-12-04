package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* compiled from: TransformableState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "z", "", TtmlNode.TAG_P, "Landroidx/compose/ui/geometry/Offset;", "r", "invoke-d-4ec7I", "(FJF)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TransformableStateKt$rememberTransformableState$1$1 extends Lambda implements Function3<Float, Offset, Float, Unit> {
    final /* synthetic */ State<Function3<Float, Offset, Float, Unit>> $lambdaState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransformableStateKt$rememberTransformableState$1$1(State<? extends Function3<? super Float, ? super Offset, ? super Float, Unit>> state) {
        super(3);
        this.$lambdaState = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Float f, Offset offset, Float f2) {
        m621invoked4ec7I(f.floatValue(), offset.m3028unboximpl(), f2.floatValue());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
    public final void m621invoked4ec7I(float f, long j, float f2) {
        this.$lambdaState.getValue().invoke(Float.valueOf(f), Offset.m3007boximpl(j), Float.valueOf(f2));
    }
}
