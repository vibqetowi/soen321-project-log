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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SingletonSubcomposeAsyncImage.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SingletonSubcomposeAsyncImageKt$SubcomposeAsyncImage$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ float $alpha;
    final /* synthetic */ ColorFilter $colorFilter;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ ContentScale $contentScale;
    final /* synthetic */ Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Error, Composer, Integer, Unit> $error;
    final /* synthetic */ int $filterQuality;
    final /* synthetic */ Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Loading, Composer, Integer, Unit> $loading;
    final /* synthetic */ Object $model;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<AsyncImagePainter.State.Error, Unit> $onError;
    final /* synthetic */ Function1<AsyncImagePainter.State.Loading, Unit> $onLoading;
    final /* synthetic */ Function1<AsyncImagePainter.State.Success, Unit> $onSuccess;
    final /* synthetic */ Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Success, Composer, Integer, Unit> $success;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SingletonSubcomposeAsyncImageKt$SubcomposeAsyncImage$1(Object obj, String str, Modifier modifier, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Loading, ? super Composer, ? super Integer, Unit> function4, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Success, ? super Composer, ? super Integer, Unit> function42, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Error, ? super Composer, ? super Integer, Unit> function43, Function1<? super AsyncImagePainter.State.Loading, Unit> function1, Function1<? super AsyncImagePainter.State.Success, Unit> function12, Function1<? super AsyncImagePainter.State.Error, Unit> function13, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, int i2, int i3, int i4) {
        super(2);
        this.$model = obj;
        this.$contentDescription = str;
        this.$modifier = modifier;
        this.$loading = function4;
        this.$success = function42;
        this.$error = function43;
        this.$onLoading = function1;
        this.$onSuccess = function12;
        this.$onError = function13;
        this.$alignment = alignment;
        this.$contentScale = contentScale;
        this.$alpha = f;
        this.$colorFilter = colorFilter;
        this.$filterQuality = i;
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
        SingletonSubcomposeAsyncImageKt.m6184SubcomposeAsyncImageylYTKUw(this.$model, this.$contentDescription, this.$modifier, this.$loading, this.$success, this.$error, this.$onLoading, this.$onSuccess, this.$onError, this.$alignment, this.$contentScale, this.$alpha, this.$colorFilter, this.$filterQuality, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
