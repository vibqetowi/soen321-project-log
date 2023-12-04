package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/unit/IntSize;", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke-TemP2vQ", "(JJ)Landroidx/compose/animation/core/SpringSpec;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentKt$SizeTransform$1 extends Lambda implements Function2<IntSize, IntSize, SpringSpec<IntSize>> {
    public static final AnimatedContentKt$SizeTransform$1 INSTANCE = new AnimatedContentKt$SizeTransform$1();

    AnimatedContentKt$SizeTransform$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
        return m271invokeTemP2vQ(intSize.m5771unboximpl(), intSize2.m5771unboximpl());
    }

    /* renamed from: invoke-TemP2vQ  reason: not valid java name */
    public final SpringSpec<IntSize> m271invokeTemP2vQ(long j, long j2) {
        return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5759boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
    }
}
