package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AsyncImage.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AsyncImageKt$Content$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ float $alpha;
    final /* synthetic */ ColorFilter $colorFilter;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ ContentScale $contentScale;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Painter $painter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImageKt$Content$2(Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i) {
        super(2);
        this.$modifier = modifier;
        this.$painter = painter;
        this.$contentDescription = str;
        this.$alignment = alignment;
        this.$contentScale = contentScale;
        this.$alpha = f;
        this.$colorFilter = colorFilter;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        AsyncImageKt.Content(this.$modifier, this.$painter, this.$contentDescription, this.$alignment, this.$contentScale, this.$alpha, this.$colorFilter, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
