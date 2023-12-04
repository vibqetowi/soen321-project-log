package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0013H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014JH\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u00020\u00182'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\u0002\b\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJJ\u0010\u001f\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u00020\u00182'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\u0002\b\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000bX¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006 À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeout", ExifInterface.GPS_DIRECTION_TRUE, "timeMillis", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeoutOrNull", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AwaitPointerEventScope extends Density {
    Object awaitPointerEvent(PointerEventPass pointerEventPass, Continuation<? super PointerEvent> continuation);

    PointerEvent getCurrentEvent();

    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    long mo4325getExtendedTouchPaddingNHjbRc();

    /* renamed from: getSize-YbymL2g */
    long mo4326getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    <T> Object withTimeout(long j, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation);

    <T> Object withTimeoutOrNull(long j, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation);

    /* compiled from: SuspendingPointerInputFilter.kt */
    /* renamed from: androidx.compose.ui.input.pointer.AwaitPointerEventScope$-CC */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        /* renamed from: $default$getExtendedTouchPadding-NH-jbRc */
        public static long m4327$default$getExtendedTouchPaddingNHjbRc(AwaitPointerEventScope _this) {
            return Size.Companion.m3096getZeroNHjbRc();
        }

        public static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    pointerEventPass = PointerEventPass.Main;
                }
                return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: roundToPx--R2X_6o */
        public static int m4342roundToPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return Density.CC.m5569$default$roundToPxR2X_6o(awaitPointerEventScope, j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4 */
        public static int m4343roundToPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return Density.CC.m5570$default$roundToPx0680j_4(awaitPointerEventScope, f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA */
        public static float m4344toDpGaN1DYA(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return Density.CC.m5571$default$toDpGaN1DYA(awaitPointerEventScope, j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM */
        public static float m4345toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return Density.CC.m5572$default$toDpu2uoSUM(awaitPointerEventScope, f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM */
        public static float m4346toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, int i) {
            return Density.CC.m5573$default$toDpu2uoSUM((Density) awaitPointerEventScope, i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM */
        public static long m4347toDpSizekrfVVM(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return Density.CC.m5574$default$toDpSizekrfVVM(awaitPointerEventScope, j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o */
        public static float m4348toPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return Density.CC.m5575$default$toPxR2X_6o(awaitPointerEventScope, j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4 */
        public static float m4349toPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return Density.CC.m5576$default$toPx0680j_4(awaitPointerEventScope, f);
        }

        @Deprecated
        public static Rect toRect(AwaitPointerEventScope awaitPointerEventScope, DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return Density.CC.$default$toRect(awaitPointerEventScope, receiver);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ */
        public static long m4350toSizeXkaWNTQ(AwaitPointerEventScope awaitPointerEventScope, long j) {
            return Density.CC.m5577$default$toSizeXkaWNTQ(awaitPointerEventScope, j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do */
        public static long m4351toSp0xMU5do(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return Density.CC.m5578$default$toSp0xMU5do(awaitPointerEventScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4 */
        public static long m4352toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, float f) {
            return Density.CC.m5579$default$toSpkPz2Gy4(awaitPointerEventScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4 */
        public static long m4353toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, int i) {
            return Density.CC.m5580$default$toSpkPz2Gy4((Density) awaitPointerEventScope, i);
        }

        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc */
        public static long m4341getExtendedTouchPaddingNHjbRc(AwaitPointerEventScope awaitPointerEventScope) {
            return CC.m4327$default$getExtendedTouchPaddingNHjbRc(awaitPointerEventScope);
        }

        @Deprecated
        public static <T> Object withTimeoutOrNull(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
            return function2.invoke(awaitPointerEventScope, continuation);
        }

        @Deprecated
        public static <T> Object withTimeout(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
            return function2.invoke(awaitPointerEventScope, continuation);
        }
    }
}
