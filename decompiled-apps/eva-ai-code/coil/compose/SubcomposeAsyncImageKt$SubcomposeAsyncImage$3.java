package coil.compose;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import coil.size.SizeResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubcomposeAsyncImage.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubcomposeAsyncImageKt$SubcomposeAsyncImage$3 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ float $alpha;
    final /* synthetic */ ColorFilter $colorFilter;
    final /* synthetic */ Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> $content;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ ContentScale $contentScale;
    final /* synthetic */ AsyncImagePainter $painter;
    final /* synthetic */ SizeResolver $sizeResolver;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubcomposeAsyncImageKt$SubcomposeAsyncImage$3(SizeResolver sizeResolver, Function3<? super SubcomposeAsyncImageScope, ? super Composer, ? super Integer, Unit> function3, AsyncImagePainter asyncImagePainter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i) {
        super(3);
        this.$sizeResolver = sizeResolver;
        this.$content = function3;
        this.$painter = asyncImagePainter;
        this.$contentDescription = str;
        this.$alignment = alignment;
        this.$contentScale = contentScale;
        this.$alpha = f;
        this.$colorFilter = colorFilter;
        this.$$dirty1 = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i) {
        int i2;
        if ((i & 14) == 0) {
            i2 = (composer.changed(boxWithConstraintsScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1964284792, i, -1, "coil.compose.SubcomposeAsyncImage.<anonymous> (SubcomposeAsyncImage.kt:150)");
            }
            ((ConstraintsSizeResolver) this.$sizeResolver).m6165setConstraintsBRTryo0(boxWithConstraintsScope.mo685getConstraintsmsEJaDk());
            this.$content.invoke(new RealSubcomposeAsyncImageScope(boxWithConstraintsScope, this.$painter, this.$contentDescription, this.$alignment, this.$contentScale, this.$alpha, this.$colorFilter), composer, Integer.valueOf(this.$$dirty1 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
