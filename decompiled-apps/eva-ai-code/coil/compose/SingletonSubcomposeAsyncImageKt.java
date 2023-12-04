package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.AsyncImagePainter;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
/* compiled from: SingletonSubcomposeAsyncImage.kt */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a³\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a§\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072&\b\u0002\u0010\u001c\u001a \u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u00192&\b\u0002\u0010\u001f\u001a \u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u00192&\b\u0002\u0010!\u001a \u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u00192\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"SubcomposeAsyncImage", "", DeviceRequestsHelper.DEVICE_INFO_MODEL, "", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", FirebaseAnalytics.Param.CONTENT, "Lcoil/compose/SubcomposeAsyncImageScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "SubcomposeAsyncImage-10Xjiaw", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "loading", "Lkotlin/Function2;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "success", "Lcoil/compose/AsyncImagePainter$State$Success;", "error", "Lcoil/compose/AsyncImagePainter$State$Error;", "onLoading", "onSuccess", "onError", "SubcomposeAsyncImage-ylYTKUw", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "coil-compose-singleton_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SingletonSubcomposeAsyncImageKt {
    /* renamed from: SubcomposeAsyncImage-ylYTKUw  reason: not valid java name */
    public static final void m6184SubcomposeAsyncImageylYTKUw(Object obj, String str, Modifier modifier, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Loading, ? super Composer, ? super Integer, Unit> function4, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Success, ? super Composer, ? super Integer, Unit> function42, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Error, ? super Composer, ? super Integer, Unit> function43, Function1<? super AsyncImagePainter.State.Loading, Unit> function1, Function1<? super AsyncImagePainter.State.Success, Unit> function12, Function1<? super AsyncImagePainter.State.Error, Unit> function13, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(1047090393);
        ComposerKt.sourceInformation(startRestartGroup, "C(SubcomposeAsyncImage)P(8,3,9,7,13,5,11,12,10!1,4!,6:c#ui.graphics.FilterQuality)");
        Modifier.Companion companion = (i4 & 4) != 0 ? Modifier.Companion : modifier;
        Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Loading, ? super Composer, ? super Integer, Unit> function44 = (i4 & 8) != 0 ? null : function4;
        Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Success, ? super Composer, ? super Integer, Unit> function45 = (i4 & 16) != 0 ? null : function42;
        Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Error, ? super Composer, ? super Integer, Unit> function46 = (i4 & 32) != 0 ? null : function43;
        Function1<? super AsyncImagePainter.State.Loading, Unit> function14 = (i4 & 64) != 0 ? null : function1;
        Function1<? super AsyncImagePainter.State.Success, Unit> function15 = (i4 & 128) != 0 ? null : function12;
        Function1<? super AsyncImagePainter.State.Error, Unit> function16 = (i4 & 256) != 0 ? null : function13;
        Alignment center = (i4 & 512) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i4 & 1024) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f2 = (i4 & 2048) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 4096) != 0 ? null : colorFilter;
        if ((i4 & 8192) != 0) {
            i6 = i3 & (-7169);
            i5 = DrawScope.Companion.m3846getDefaultFilterQualityfv9h1I();
        } else {
            i5 = i;
            i6 = i3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1047090393, i2, i6, "coil.compose.SubcomposeAsyncImage (SingletonSubcomposeAsyncImage.kt:43)");
        }
        int i7 = i2 << 3;
        int i8 = i6 << 3;
        SubcomposeAsyncImageKt.m6185SubcomposeAsyncImageQ4Kwu38(obj, str, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), startRestartGroup, 6), companion, function44, function45, function46, function14, function15, function16, center, fit, f2, colorFilter2, i5, startRestartGroup, (i2 & 112) | 520 | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), ((i2 >> 27) & 14) | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (i8 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new SingletonSubcomposeAsyncImageKt$SubcomposeAsyncImage$1(obj, str, companion, function44, function45, function46, function14, function15, function16, center, fit, f2, colorFilter2, i5, i2, i3, i4));
    }

    /* renamed from: SubcomposeAsyncImage-10Xjiaw  reason: not valid java name */
    public static final void m6183SubcomposeAsyncImage10Xjiaw(Object obj, String str, Modifier modifier, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, Function1<? super AsyncImagePainter.State, Unit> function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Function3<? super SubcomposeAsyncImageScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3, int i4) {
        Function1<AsyncImagePainter.State, AsyncImagePainter.State> function13;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(1571662781);
        ComposerKt.sourceInformation(startRestartGroup, "C(SubcomposeAsyncImage)P(7,4,8,10,9!1,5!2,6:c#ui.graphics.FilterQuality)");
        Modifier.Companion companion = (i4 & 4) != 0 ? Modifier.Companion : modifier;
        if ((i4 & 8) != 0) {
            i5 = i2 & (-7169);
            function13 = AsyncImagePainter.Companion.getDefaultTransform();
        } else {
            function13 = function1;
            i5 = i2;
        }
        Function1<? super AsyncImagePainter.State, Unit> function14 = (i4 & 16) != 0 ? null : function12;
        Alignment center = (i4 & 32) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i4 & 64) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f2 = (i4 & 128) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 256) != 0 ? null : colorFilter;
        if ((i4 & 512) != 0) {
            i5 &= -1879048193;
            i6 = DrawScope.Companion.m3846getDefaultFilterQualityfv9h1I();
        } else {
            i6 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1571662781, i5, i3, "coil.compose.SubcomposeAsyncImage (SingletonSubcomposeAsyncImage.kt:100)");
        }
        int i7 = i5 << 3;
        SubcomposeAsyncImageKt.m6186SubcomposeAsyncImagesKDTAoQ(obj, str, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), startRestartGroup, 6), companion, function13, function14, center, fit, f2, colorFilter2, i6, function3, startRestartGroup, (i5 & 112) | 520 | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192), ((i5 >> 27) & 14) | ((i3 << 3) & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new SingletonSubcomposeAsyncImageKt$SubcomposeAsyncImage$2(obj, str, companion, function13, function14, center, fit, f2, colorFilter2, i6, function3, i2, i3, i4));
    }
}
