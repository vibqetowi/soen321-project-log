package coil.compose;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.Dimension;
import coil.size.Dimensions;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.size.SizeResolvers;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AsyncImage.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009d\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001aÛ\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001aI\u0010&\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u001b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0002\u0010(\u001a\u001d\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010,\u001a\u0016\u0010\u0004\u001a\u00020\t*\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0003\u001a\u001b\u0010-\u001a\u0004\u0018\u00010.*\u00020/H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00062"}, d2 = {"AsyncImage", "", DeviceRequestsHelper.DEVICE_INFO_MODEL, "", "contentDescription", "", "imageLoader", "Lcoil/ImageLoader;", "modifier", "Landroidx/compose/ui/Modifier;", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "AsyncImage-MvsnxeU", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "placeholder", "Landroidx/compose/ui/graphics/painter/Painter;", "error", "fallback", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Loading;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Success;", "onError", "Lcoil/compose/AsyncImagePainter$State$Error;", "AsyncImage-Q4Kwu38", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "Content", "painter", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;I)V", "updateRequest", "Lcoil/request/ImageRequest;", "request", "(Lcoil/request/ImageRequest;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)Lcoil/request/ImageRequest;", "toSizeOrNull", "Lcoil/size/Size;", "Landroidx/compose/ui/unit/Constraints;", "toSizeOrNull-BRTryo0", "(J)Lcoil/size/Size;", "coil-compose-base_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AsyncImageKt {
    /* renamed from: AsyncImage-Q4Kwu38  reason: not valid java name */
    public static final void m6154AsyncImageQ4Kwu38(Object obj, String str, ImageLoader imageLoader, Modifier modifier, Painter painter, Painter painter2, Painter painter3, Function1<? super AsyncImagePainter.State.Loading, Unit> function1, Function1<? super AsyncImagePainter.State.Success, Unit> function12, Function1<? super AsyncImagePainter.State.Error, Unit> function13, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(-245964807);
        ComposerKt.sourceInformation(composer, "C(AsyncImage)P(9,3,8,10,14,5,6,12,13,11!1,4!,7:c#ui.graphics.FilterQuality)");
        Modifier.Companion companion = (i4 & 8) != 0 ? Modifier.Companion : modifier;
        Painter painter4 = (i4 & 16) != 0 ? null : painter;
        Painter painter5 = (i4 & 32) != 0 ? null : painter2;
        Painter painter6 = (i4 & 64) != 0 ? painter5 : painter3;
        Function1<? super AsyncImagePainter.State.Loading, Unit> function14 = (i4 & 128) != 0 ? null : function1;
        Function1<? super AsyncImagePainter.State.Success, Unit> function15 = (i4 & 256) != 0 ? null : function12;
        Function1<? super AsyncImagePainter.State.Error, Unit> function16 = (i4 & 512) != 0 ? null : function13;
        Alignment center = (i4 & 1024) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i4 & 2048) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f2 = (i4 & 4096) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 8192) != 0 ? null : colorFilter;
        int m3846getDefaultFilterQualityfv9h1I = (i4 & 16384) != 0 ? DrawScope.Companion.m3846getDefaultFilterQualityfv9h1I() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-245964807, i2, i3, "coil.compose.AsyncImage (AsyncImage.kt:64)");
        }
        int i5 = i3 << 18;
        m6153AsyncImageMvsnxeU(obj, str, imageLoader, companion, UtilsKt.transformOf(painter4, painter5, painter6), UtilsKt.onStateOf(function14, function15, function16), center, fit, f2, colorFilter2, m3846getDefaultFilterQualityfv9h1I, composer, (i2 & 7168) | (i2 & 112) | 520 | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i3 >> 12) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* renamed from: AsyncImage-MvsnxeU  reason: not valid java name */
    public static final void m6153AsyncImageMvsnxeU(Object obj, String str, ImageLoader imageLoader, Modifier modifier, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, Function1<? super AsyncImagePainter.State, Unit> function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-2030202961);
        ComposerKt.sourceInformation(startRestartGroup, "C(AsyncImage)P(7,3,6,8,10,9!1,4!,5:c#ui.graphics.FilterQuality)");
        Modifier.Companion companion = (i4 & 8) != 0 ? Modifier.Companion : modifier;
        Function1<AsyncImagePainter.State, AsyncImagePainter.State> defaultTransform = (i4 & 16) != 0 ? AsyncImagePainter.Companion.getDefaultTransform() : function1;
        Function1<? super AsyncImagePainter.State, Unit> function13 = (i4 & 32) != 0 ? null : function12;
        Alignment center = (i4 & 64) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i4 & 128) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f2 = (i4 & 256) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 512) != 0 ? null : colorFilter;
        if ((i4 & 1024) != 0) {
            i6 = i3 & (-15);
            i5 = DrawScope.Companion.m3846getDefaultFilterQualityfv9h1I();
        } else {
            i5 = i;
            i6 = i3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2030202961, i2, i6, "coil.compose.AsyncImage (AsyncImage.kt:118)");
        }
        ImageRequest updateRequest = updateRequest(UtilsKt.requestOf(obj, startRestartGroup, 8), fit, startRestartGroup, 8 | ((i2 >> 18) & 112));
        int i7 = i2 >> 6;
        int i8 = i2 >> 9;
        int i9 = i8 & 57344;
        Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function14 = defaultTransform;
        Function1<? super AsyncImagePainter.State, Unit> function15 = function13;
        ContentScale contentScale2 = fit;
        int i10 = i5;
        AsyncImagePainter m6162rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m6162rememberAsyncImagePainter5jETZwI(updateRequest, imageLoader, function14, function15, contentScale2, i10, startRestartGroup, ((i6 << 15) & 458752) | (i7 & 7168) | (i7 & 896) | 72 | i9, 0);
        SizeResolver sizeResolver = updateRequest.getSizeResolver();
        Content(sizeResolver instanceof ConstraintsSizeResolver ? companion.then((Modifier) sizeResolver) : companion, m6162rememberAsyncImagePainter5jETZwI, str, center, fit, f2, colorFilter2, startRestartGroup, (i8 & 7168) | ((i2 << 3) & 896) | i9 | (i8 & 458752) | (3670016 & i8));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new AsyncImageKt$AsyncImage$1(obj, str, imageLoader, companion, defaultTransform, function13, center, fit, f2, colorFilter2, i5, i2, i3, i4));
    }

    public static final void Content(Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(10290533);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10290533, i, -1, "coil.compose.Content (AsyncImage.kt:156)");
        }
        Modifier then = ClipKt.clipToBounds(contentDescription(modifier, str)).then(new ContentPainterModifier(painter, alignment, contentScale, f, colorFilter));
        AsyncImageKt$Content$1 asyncImageKt$Content$1 = AsyncImageKt$Content$1.INSTANCE;
        startRestartGroup.startReplaceableGroup(544976794);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)119@4537L7,120@4592L7,121@4651L7,123@4724L439:Layout.kt#80mrfh");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density = (Density) consume;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection = (LayoutDirection) consume2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
        Modifier materialize = ComposedModifierKt.materialize(startRestartGroup, then);
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        startRestartGroup.startReplaceableGroup(1405779621);
        ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new AsyncImageKt$Content$$inlined$Layout$1(constructor));
        } else {
            startRestartGroup.useNode();
        }
        Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, asyncImageKt$Content$1, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
        Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
        Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
        Updater.m2900setimpl(m2893constructorimpl, materialize, ComposeUiNode.Companion.getSetModifier());
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new AsyncImageKt$Content$2(modifier, painter, str, alignment, contentScale, f, colorFilter, i));
    }

    public static final ImageRequest updateRequest(ImageRequest imageRequest, ContentScale contentScale, Composer composer, int i) {
        SizeResolver sizeResolver;
        composer.startReplaceableGroup(402368983);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(402368983, i, -1, "coil.compose.updateRequest (AsyncImage.kt:183)");
        }
        if (imageRequest.getDefined().getSizeResolver() == null) {
            if (Intrinsics.areEqual(contentScale, ContentScale.Companion.getNone())) {
                sizeResolver = SizeResolvers.create(Size.ORIGINAL);
            } else {
                composer.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new ConstraintsSizeResolver();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                sizeResolver = (SizeResolver) rememberedValue;
            }
            imageRequest = ImageRequest.newBuilder$default(imageRequest, null, 1, null).size(sizeResolver).build();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageRequest;
    }

    private static final Modifier contentDescription(Modifier modifier, String str) {
        return str != null ? SemanticsModifierKt.semantics$default(modifier, false, new AsyncImageKt$contentDescription$1(str), 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toSizeOrNull-BRTryo0  reason: not valid java name */
    public static final Size m6156toSizeOrNullBRTryo0(long j) {
        if (Constraints.m5555isZeroimpl(j)) {
            return null;
        }
        return new Size(Constraints.m5547getHasBoundedWidthimpl(j) ? Dimensions.Dimension(Constraints.m5551getMaxWidthimpl(j)) : Dimension.Undefined.INSTANCE, Constraints.m5546getHasBoundedHeightimpl(j) ? Dimensions.Dimension(Constraints.m5550getMaxHeightimpl(j)) : Dimension.Undefined.INSTANCE);
    }
}
