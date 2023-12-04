package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.AsyncImagePainter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SingletonSubcomposeAsyncImage.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SingletonSubcomposeAsyncImageKt$SubcomposeAsyncImage$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ float $alpha;
    final /* synthetic */ ColorFilter $colorFilter;
    final /* synthetic */ Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> $content;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ ContentScale $contentScale;
    final /* synthetic */ int $filterQuality;
    final /* synthetic */ Object $model;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<AsyncImagePainter.State, Unit> $onState;
    final /* synthetic */ Function1<AsyncImagePainter.State, AsyncImagePainter.State> $transform;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SingletonSubcomposeAsyncImageKt$SubcomposeAsyncImage$2(Object obj, String str, Modifier modifier, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, Function1<? super AsyncImagePainter.State, Unit> function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Function3<? super SubcomposeAsyncImageScope, ? super Composer, ? super Integer, Unit> function3, int i2, int i3, int i4) {
        super(2);
        this.$model = obj;
        this.$contentDescription = str;
        this.$modifier = modifier;
        this.$transform = function1;
        this.$onState = function12;
        this.$alignment = alignment;
        this.$contentScale = contentScale;
        this.$alpha = f;
        this.$colorFilter = colorFilter;
        this.$filterQuality = i;
        this.$content = function3;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        SingletonSubcomposeAsyncImageKt.m6183SubcomposeAsyncImage10Xjiaw(this.$model, this.$contentDescription, this.$modifier, this.$transform, this.$onState, this.$alignment, this.$contentScale, this.$alpha, this.$colorFilter, this.$filterQuality, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
