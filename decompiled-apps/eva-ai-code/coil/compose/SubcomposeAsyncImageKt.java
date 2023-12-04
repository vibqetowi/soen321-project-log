package coil.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.SizeResolver;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
/* compiled from: SubcomposeAsyncImage.kt */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a»\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a¯\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2&\b\u0002\u0010\u001e\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2&\b\u0002\u0010!\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2&\b\u0002\u0010#\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a\u0095\u0001\u0010*\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2$\u0010\u001e\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2$\u0010!\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2$\u0010#\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0003¢\u0006\u0002\u0010+\u001a[\u0010,\u001a\u00020\u0001*\u00020\u00192\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010-\u001a\u00020.2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"SubcomposeAsyncImage", "", DeviceRequestsHelper.DEVICE_INFO_MODEL, "", "contentDescription", "", "imageLoader", "Lcoil/ImageLoader;", "modifier", "Landroidx/compose/ui/Modifier;", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", FirebaseAnalytics.Param.CONTENT, "Lcoil/compose/SubcomposeAsyncImageScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "SubcomposeAsyncImage-sKDTAoQ", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "loading", "Lkotlin/Function2;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "success", "Lcoil/compose/AsyncImagePainter$State$Success;", "error", "Lcoil/compose/AsyncImagePainter$State$Error;", "onLoading", "onSuccess", "onError", "SubcomposeAsyncImage-Q4Kwu38", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "contentOf", "(Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;)Lkotlin/jvm/functions/Function3;", "SubcomposeAsyncImageContent", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Lcoil/compose/SubcomposeAsyncImageScope;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "coil-compose-base_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubcomposeAsyncImageKt {
    /* renamed from: SubcomposeAsyncImage-Q4Kwu38  reason: not valid java name */
    public static final void m6185SubcomposeAsyncImageQ4Kwu38(Object obj, String str, ImageLoader imageLoader, Modifier modifier, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Loading, ? super Composer, ? super Integer, Unit> function4, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Success, ? super Composer, ? super Integer, Unit> function42, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Error, ? super Composer, ? super Integer, Unit> function43, Function1<? super AsyncImagePainter.State.Loading, Unit> function1, Function1<? super AsyncImagePainter.State.Success, Unit> function12, Function1<? super AsyncImagePainter.State.Error, Unit> function13, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(934816934);
        ComposerKt.sourceInformation(startRestartGroup, "C(SubcomposeAsyncImage)P(9,3,7,10,8,14,5,12,13,11!1,4!,6:c#ui.graphics.FilterQuality)");
        Modifier.Companion companion = (i4 & 8) != 0 ? Modifier.Companion : modifier;
        Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Loading, ? super Composer, ? super Integer, Unit> function44 = (i4 & 16) != 0 ? null : function4;
        Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Success, ? super Composer, ? super Integer, Unit> function45 = (i4 & 32) != 0 ? null : function42;
        Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Error, ? super Composer, ? super Integer, Unit> function46 = (i4 & 64) != 0 ? null : function43;
        Function1<? super AsyncImagePainter.State.Loading, Unit> function14 = (i4 & 128) != 0 ? null : function1;
        Function1<? super AsyncImagePainter.State.Success, Unit> function15 = (i4 & 256) != 0 ? null : function12;
        Function1<? super AsyncImagePainter.State.Error, Unit> function16 = (i4 & 512) != 0 ? null : function13;
        Alignment center = (i4 & 1024) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i4 & 2048) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f2 = (i4 & 4096) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 8192) != 0 ? null : colorFilter;
        if ((i4 & 16384) != 0) {
            i6 = i3 & (-57345);
            i5 = DrawScope.Companion.m3846getDefaultFilterQualityfv9h1I();
        } else {
            i5 = i;
            i6 = i3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(934816934, i2, i6, "coil.compose.SubcomposeAsyncImage (SubcomposeAsyncImage.kt:49)");
        }
        int i7 = i6 << 18;
        m6186SubcomposeAsyncImagesKDTAoQ(obj, str, imageLoader, companion, null, UtilsKt.onStateOf(function14, function15, function16), center, fit, f2, colorFilter2, i5, contentOf(function44, function45, function46), startRestartGroup, (i2 & 112) | 520 | (i2 & 7168) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), (i6 >> 12) & 14, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new SubcomposeAsyncImageKt$SubcomposeAsyncImage$1(obj, str, imageLoader, companion, function44, function45, function46, function14, function15, function16, center, fit, f2, colorFilter2, i5, i2, i3, i4));
    }

    /* renamed from: SubcomposeAsyncImage-sKDTAoQ  reason: not valid java name */
    public static final void m6186SubcomposeAsyncImagesKDTAoQ(Object obj, String str, ImageLoader imageLoader, Modifier modifier, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, Function1<? super AsyncImagePainter.State, Unit> function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Function3<? super SubcomposeAsyncImageScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(10937794);
        ComposerKt.sourceInformation(startRestartGroup, "C(SubcomposeAsyncImage)P(8,4,7,9,11,10!1,5!2,6:c#ui.graphics.FilterQuality)");
        Modifier.Companion companion = (i4 & 8) != 0 ? Modifier.Companion : modifier;
        Function1<AsyncImagePainter.State, AsyncImagePainter.State> defaultTransform = (i4 & 16) != 0 ? AsyncImagePainter.Companion.getDefaultTransform() : function1;
        Function1<? super AsyncImagePainter.State, Unit> function13 = (i4 & 32) != 0 ? null : function12;
        Alignment center = (i4 & 64) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i4 & 128) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f2 = (i4 & 256) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 512) != 0 ? null : colorFilter;
        if ((i4 & 1024) != 0) {
            i5 = DrawScope.Companion.m3846getDefaultFilterQualityfv9h1I();
            i6 = i3 & (-15);
        } else {
            i5 = i;
            i6 = i3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10937794, i2, i6, "coil.compose.SubcomposeAsyncImage (SubcomposeAsyncImage.kt:104)");
        }
        ImageRequest updateRequest = AsyncImageKt.updateRequest(UtilsKt.requestOf(obj, startRestartGroup, 8), fit, startRestartGroup, 8 | ((i2 >> 18) & 112));
        int i7 = i2 >> 6;
        int i8 = i2 >> 9;
        int i9 = i6;
        ContentScale contentScale2 = fit;
        Alignment alignment2 = center;
        AsyncImagePainter m6162rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m6162rememberAsyncImagePainter5jETZwI(updateRequest, imageLoader, defaultTransform, function13, fit, i5, startRestartGroup, (i7 & 7168) | (i7 & 896) | 72 | (i8 & 57344) | ((i6 << 15) & 458752), 0);
        SizeResolver sizeResolver = updateRequest.getSizeResolver();
        if (!(sizeResolver instanceof ConstraintsSizeResolver)) {
            startRestartGroup.startReplaceableGroup(-247979203);
            int i10 = (i8 & 14) | 384 | ((i2 >> 15) & 112);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            int i11 = i10 >> 3;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignment2, true, startRestartGroup, (i11 & 112) | (i11 & 14));
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
            int i12 = ((((i10 << 3) & 112) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i12 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            function3.invoke(new RealSubcomposeAsyncImageScope(BoxScopeInstance.INSTANCE, m6162rememberAsyncImagePainter5jETZwI, str, alignment2, contentScale2, f2, colorFilter2), startRestartGroup, Integer.valueOf(i9 & 112));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-247978567);
            BoxWithConstraintsKt.BoxWithConstraints(companion, alignment2, true, ComposableLambdaKt.composableLambda(startRestartGroup, -1964284792, true, new SubcomposeAsyncImageKt$SubcomposeAsyncImage$3(sizeResolver, function3, m6162rememberAsyncImagePainter5jETZwI, str, alignment2, contentScale2, f2, colorFilter2, i9)), startRestartGroup, (i8 & 14) | 3456 | ((i2 >> 15) & 112), 0);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new SubcomposeAsyncImageKt$SubcomposeAsyncImage$4(obj, str, imageLoader, companion, defaultTransform, function13, alignment2, contentScale2, f2, colorFilter2, i5, function3, i2, i3, i4));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SubcomposeAsyncImageContent(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, int i, int i2) {
        int i3;
        Modifier.Companion companion;
        int i4;
        Object obj;
        Object obj2;
        Object obj3;
        float f2;
        Object obj4;
        AsyncImagePainter asyncImagePainter;
        String str2;
        Alignment alignment2;
        ContentScale contentScale2;
        float f3;
        ColorFilter colorFilter2;
        int i5;
        float f4;
        float f5;
        String str3;
        Alignment alignment3;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-263982313);
        ComposerKt.sourceInformation(startRestartGroup, "C(SubcomposeAsyncImageContent)P(5,6,3!1,4)");
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(subcomposeAsyncImageScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            companion = modifier;
            i3 |= startRestartGroup.changed(companion) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 != 0) {
                i3 |= 128;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 4) == 0) {
                    obj = str;
                    if (startRestartGroup.changed(obj)) {
                        i9 = 2048;
                        i3 |= i9;
                    }
                } else {
                    obj = str;
                }
                i9 = 1024;
                i3 |= i9;
            } else {
                obj = str;
            }
            if ((i & 57344) != 0) {
                if ((i2 & 8) == 0) {
                    obj2 = alignment;
                    if (startRestartGroup.changed(obj2)) {
                        i8 = 16384;
                        i3 |= i8;
                    }
                } else {
                    obj2 = alignment;
                }
                i8 = 8192;
                i3 |= i8;
            } else {
                obj2 = alignment;
            }
            if ((i & 458752) != 0) {
                if ((i2 & 16) == 0) {
                    obj3 = contentScale;
                    if (startRestartGroup.changed(obj3)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    obj3 = contentScale;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                obj3 = contentScale;
            }
            if ((i & 3670016) != 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    if (startRestartGroup.changed(f2)) {
                        i6 = 1048576;
                        i3 |= i6;
                    }
                } else {
                    f2 = f;
                }
                i6 = 524288;
                i3 |= i6;
            } else {
                f2 = f;
            }
            if ((i & 29360128) != 0) {
                obj4 = colorFilter;
                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(obj4)) ? 8388608 : 4194304;
            } else {
                obj4 = colorFilter;
            }
            if (i4 == 2 || (23967451 & i3) != 4793490 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i10 != 0) {
                        companion = Modifier.Companion;
                    }
                    if (i4 == 0) {
                        asyncImagePainter = subcomposeAsyncImageScope.getPainter();
                        i3 &= -897;
                    } else {
                        asyncImagePainter = painter;
                    }
                    if ((i2 & 4) == 0) {
                        str2 = subcomposeAsyncImageScope.getContentDescription();
                        i3 &= -7169;
                    } else {
                        str2 = obj;
                    }
                    if ((i2 & 8) == 0) {
                        alignment2 = subcomposeAsyncImageScope.getAlignment();
                        i3 &= -57345;
                    } else {
                        alignment2 = obj2;
                    }
                    if ((i2 & 16) == 0) {
                        contentScale2 = subcomposeAsyncImageScope.getContentScale();
                        i3 &= -458753;
                    } else {
                        contentScale2 = obj3;
                    }
                    if ((i2 & 32) == 0) {
                        f3 = subcomposeAsyncImageScope.getAlpha();
                        i3 &= -3670017;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) == 0) {
                        i3 &= -29360129;
                        colorFilter2 = subcomposeAsyncImageScope.getColorFilter();
                    } else {
                        colorFilter2 = obj4;
                    }
                    float f6 = f3;
                    i5 = i3;
                    f4 = f6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if (i4 != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -29360129;
                    }
                    asyncImagePainter = painter;
                    str2 = obj;
                    alignment2 = obj2;
                    contentScale2 = obj3;
                    colorFilter2 = obj4;
                    i5 = i3;
                    f4 = f2;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-263982313, i5, -1, "coil.compose.SubcomposeAsyncImageContent (SubcomposeAsyncImage.kt:202)");
                }
                int i11 = i5 >> 3;
                AsyncImageKt.Content(companion, asyncImagePainter, str2, alignment2, contentScale2, f4, colorFilter2, startRestartGroup, (57344 & i11) | (i11 & 14) | 64 | (i11 & 896) | (i11 & 7168) | (458752 & i11) | (i11 & 3670016));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                obj4 = colorFilter2;
                Alignment alignment4 = alignment2;
                f5 = f4;
                str3 = str2;
                alignment3 = alignment4;
            } else {
                startRestartGroup.skipToGroupEnd();
                asyncImagePainter = painter;
                str3 = obj;
                alignment3 = obj2;
                contentScale2 = obj3;
                f5 = f2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$1(subcomposeAsyncImageScope, companion, asyncImagePainter, str3, alignment3, contentScale2, f5, obj4, i, i2));
            return;
        }
        companion = modifier;
        i4 = i2 & 2;
        if (i4 != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i & 57344) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        if ((i & 3670016) != 0) {
        }
        if ((i & 29360128) != 0) {
        }
        if (i4 == 2) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        float f62 = f3;
        i5 = i3;
        f4 = f62;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i112 = i5 >> 3;
        AsyncImageKt.Content(companion, asyncImagePainter, str2, alignment2, contentScale2, f4, colorFilter2, startRestartGroup, (57344 & i112) | (i112 & 14) | 64 | (i112 & 896) | (i112 & 7168) | (458752 & i112) | (i112 & 3670016));
        if (ComposerKt.isTraceInProgress()) {
        }
        obj4 = colorFilter2;
        Alignment alignment42 = alignment2;
        f5 = f4;
        str3 = str2;
        alignment3 = alignment42;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> contentOf(Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Loading, ? super Composer, ? super Integer, Unit> function4, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Success, ? super Composer, ? super Integer, Unit> function42, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Error, ? super Composer, ? super Integer, Unit> function43) {
        return (function4 == null && function42 == null && function43 == null) ? ComposableSingletons$SubcomposeAsyncImageKt.INSTANCE.m6164getLambda1$coil_compose_base_release() : ComposableLambdaKt.composableLambdaInstance(-1302781228, true, new SubcomposeAsyncImageKt$contentOf$1(function4, function42, function43));
    }
}
