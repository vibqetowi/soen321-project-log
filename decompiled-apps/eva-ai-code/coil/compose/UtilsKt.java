package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.Scale;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aX\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0001\u001a\u0017\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001a2\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0001\u001a!\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001e\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u001aH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u001d\u001a\u001b\u0010!\u001a\u00020\u001a*\u00020\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0#H\u0080\b\u001a\u0019\u0010$\u001a\u00020%*\u00020&H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\f\u0010)\u001a\u00020**\u00020+H\u0001\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "onStateOf", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Loading;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Success;", "onError", "Lcoil/compose/AsyncImagePainter$State$Error;", "requestOf", "Lcoil/request/ImageRequest;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Lcoil/request/ImageRequest;", "transformOf", "placeholder", "Landroidx/compose/ui/graphics/painter/Painter;", "error", "fallback", "constrainHeight", "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "constrainHeight-K40F9xA", "(JF)F", "constrainWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "constrainWidth-K40F9xA", "takeOrElse", "block", "Lkotlin/Function0;", "toIntSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/geometry/Size;", "toIntSize-uvyYCjk", "(J)J", "toScale", "Lcoil/size/Scale;", "Landroidx/compose/ui/layout/ContentScale;", "coil-compose-base_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt {
    private static final long ZeroConstraints = Constraints.Companion.m5559fixedJhjzzOo(0, 0);

    public static final ImageRequest requestOf(Object obj, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1151830858, i, -1, "coil.compose.requestOf (Utils.kt:21)");
        }
        if (obj instanceof ImageRequest) {
            return (ImageRequest) obj;
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer);
        return new ImageRequest.Builder((Context) consume).data(obj).build();
    }

    public static final Function1<AsyncImagePainter.State, AsyncImagePainter.State> transformOf(Painter painter, Painter painter2, Painter painter3) {
        if (painter != null || painter2 != null || painter3 != null) {
            return new UtilsKt$transformOf$1(painter, painter3, painter2);
        }
        return AsyncImagePainter.Companion.getDefaultTransform();
    }

    public static final Function1<AsyncImagePainter.State, Unit> onStateOf(Function1<? super AsyncImagePainter.State.Loading, Unit> function1, Function1<? super AsyncImagePainter.State.Success, Unit> function12, Function1<? super AsyncImagePainter.State.Error, Unit> function13) {
        if (function1 == null && function12 == null && function13 == null) {
            return null;
        }
        return new UtilsKt$onStateOf$1(function1, function12, function13);
    }

    public static final Scale toScale(ContentScale contentScale) {
        return Intrinsics.areEqual(contentScale, ContentScale.Companion.getFit()) ? true : Intrinsics.areEqual(contentScale, ContentScale.Companion.getInside()) ? Scale.FIT : Scale.FILL;
    }

    /* renamed from: constrainWidth-K40F9xA  reason: not valid java name */
    public static final float m6188constrainWidthK40F9xA(long j, float f) {
        return RangesKt.coerceIn(f, Constraints.m5553getMinWidthimpl(j), Constraints.m5551getMaxWidthimpl(j));
    }

    /* renamed from: constrainHeight-K40F9xA  reason: not valid java name */
    public static final float m6187constrainHeightK40F9xA(long j, float f) {
        return RangesKt.coerceIn(f, Constraints.m5552getMinHeightimpl(j), Constraints.m5550getMaxHeightimpl(j));
    }

    public static final float takeOrElse(float f, Function0<Float> function0) {
        return !Float.isInfinite(f) && !Float.isNaN(f) ? f : function0.invoke().floatValue();
    }

    /* renamed from: toIntSize-uvyYCjk  reason: not valid java name */
    public static final long m6189toIntSizeuvyYCjk(long j) {
        return IntSizeKt.IntSize(MathKt.roundToInt(Size.m3087getWidthimpl(j)), MathKt.roundToInt(Size.m3084getHeightimpl(j)));
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }
}
