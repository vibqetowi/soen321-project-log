package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.AsyncImagePainter;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: SingletonAsyncImagePainter.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u009f\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"rememberAsyncImagePainter", "Lcoil/compose/AsyncImagePainter;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "rememberAsyncImagePainter-19ie5dc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "placeholder", "Landroidx/compose/ui/graphics/painter/Painter;", "error", "fallback", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Loading;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Success;", "onError", "Lcoil/compose/AsyncImagePainter$State$Error;", "rememberAsyncImagePainter-MqR-F_0", "(Ljava/lang/Object;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "coil-compose-singleton_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SingletonAsyncImagePainterKt {
    /* renamed from: rememberAsyncImagePainter-MqR-F_0  reason: not valid java name */
    public static final AsyncImagePainter m6182rememberAsyncImagePainterMqRF_0(Object obj, Painter painter, Painter painter2, Painter painter3, Function1<? super AsyncImagePainter.State.Loading, Unit> function1, Function1<? super AsyncImagePainter.State.Success, Unit> function12, Function1<? super AsyncImagePainter.State.Error, Unit> function13, ContentScale contentScale, int i, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(533921043);
        ComposerKt.sourceInformation(composer, "C(rememberAsyncImagePainter)P(4,8,1,2,6,7,5!,3:c#ui.graphics.FilterQuality)");
        Painter painter4 = (i3 & 2) != 0 ? null : painter;
        Painter painter5 = (i3 & 4) != 0 ? null : painter2;
        Painter painter6 = (i3 & 8) != 0 ? painter5 : painter3;
        Function1<? super AsyncImagePainter.State.Loading, Unit> function14 = (i3 & 16) != 0 ? null : function1;
        Function1<? super AsyncImagePainter.State.Success, Unit> function15 = (i3 & 32) != 0 ? null : function12;
        Function1<? super AsyncImagePainter.State.Error, Unit> function16 = (i3 & 64) != 0 ? null : function13;
        ContentScale fit = (i3 & 128) != 0 ? ContentScale.Companion.getFit() : contentScale;
        int m3846getDefaultFilterQualityfv9h1I = (i3 & 256) != 0 ? DrawScope.Companion.m3846getDefaultFilterQualityfv9h1I() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(533921043, i2, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:44)");
        }
        int i4 = i2 << 3;
        AsyncImagePainter m6161rememberAsyncImagePainter3HmZ8SU = AsyncImagePainterKt.m6161rememberAsyncImagePainter3HmZ8SU(obj, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer, 6), painter4, painter5, painter6, function14, function15, function16, fit, m3846getDefaultFilterQualityfv9h1I, composer, (458752 & i4) | 37448 | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m6161rememberAsyncImagePainter3HmZ8SU;
    }

    /* renamed from: rememberAsyncImagePainter-19ie5dc  reason: not valid java name */
    public static final AsyncImagePainter m6181rememberAsyncImagePainter19ie5dc(Object obj, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, Function1<? super AsyncImagePainter.State, Unit> function12, ContentScale contentScale, int i, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1494234083);
        ComposerKt.sourceInformation(composer, "C(rememberAsyncImagePainter)P(2,4,3!,1:c#ui.graphics.FilterQuality)");
        Function1<AsyncImagePainter.State, AsyncImagePainter.State> defaultTransform = (i3 & 2) != 0 ? AsyncImagePainter.Companion.getDefaultTransform() : function1;
        Function1<? super AsyncImagePainter.State, Unit> function13 = (i3 & 4) != 0 ? null : function12;
        ContentScale fit = (i3 & 8) != 0 ? ContentScale.Companion.getFit() : contentScale;
        int m3846getDefaultFilterQualityfv9h1I = (i3 & 16) != 0 ? DrawScope.Companion.m3846getDefaultFilterQualityfv9h1I() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1494234083, i2, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:91)");
        }
        int i4 = i2 << 3;
        AsyncImagePainter m6162rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m6162rememberAsyncImagePainter5jETZwI(obj, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer, 6), defaultTransform, function13, fit, m3846getDefaultFilterQualityfv9h1I, composer, (i4 & 896) | 72 | (i4 & 7168) | (57344 & i4) | (i4 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m6162rememberAsyncImagePainter5jETZwI;
    }
}
