package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidOverscroll.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.kt", i = {}, l = {TypedValues.AttributesType.TYPE_PATH_ROTATE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect$effectModifier$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$effectModifier$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Continuation<? super AndroidEdgeEffectOverscrollEffect$effectModifier$1> continuation) {
        super(2, continuation);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AndroidEdgeEffectOverscrollEffect$effectModifier$1 androidEdgeEffectOverscrollEffect$effectModifier$1 = new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this.this$0, continuation);
        androidEdgeEffectOverscrollEffect$effectModifier$1.L$0 = obj;
        return androidEdgeEffectOverscrollEffect$effectModifier$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((AndroidEdgeEffectOverscrollEffect$effectModifier$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidOverscroll.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.kt", i = {0, 1}, l = {TypedValues.AttributesType.TYPE_EASING, 321}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0"})
    /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = androidEdgeEffectOverscrollEffect;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0070 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00c6 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0071 -> B:18:0x0076). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            AnonymousClass1 anonymousClass1;
            Object awaitPointerEvent$default;
            Object obj2;
            PointerId pointerId;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                Object obj3 = coroutine_suspended;
                AnonymousClass1 anonymousClass12 = this;
                List<PointerInputChange> changes = ((PointerEvent) obj).getChanges();
                ArrayList arrayList = new ArrayList(changes.size());
                int size = changes.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    PointerInputChange pointerInputChange = changes.get(i3);
                    if (pointerInputChange.getPressed()) {
                        arrayList.add(pointerInputChange);
                    }
                }
                ArrayList arrayList2 = arrayList;
                AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = anonymousClass12.this$0;
                int size2 = arrayList2.size();
                while (true) {
                    if (i2 < size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList2.get(i2);
                    long m4425getIdJ3iCeTQ = ((PointerInputChange) obj2).m4425getIdJ3iCeTQ();
                    pointerId = androidEdgeEffectOverscrollEffect.pointerId;
                    if (PointerId.m4408equalsimpl(m4425getIdJ3iCeTQ, pointerId)) {
                        break;
                    }
                    i2++;
                }
                PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                if (pointerInputChange2 == null) {
                    pointerInputChange2 = (PointerInputChange) CollectionsKt.firstOrNull((List<? extends Object>) arrayList2);
                }
                if (pointerInputChange2 != null) {
                    anonymousClass12.this$0.pointerId = PointerId.m4406boximpl(pointerInputChange2.m4425getIdJ3iCeTQ());
                    anonymousClass12.this$0.pointerPosition = Offset.m3007boximpl(pointerInputChange2.m4426getPositionF1C5BW0());
                }
                if (!arrayList2.isEmpty()) {
                    anonymousClass12.this$0.pointerId = null;
                    return Unit.INSTANCE;
                }
                anonymousClass1 = anonymousClass12;
                coroutine_suspended = obj3;
                awaitPointerEventScope = awaitPointerEventScope2;
                anonymousClass1.L$0 = awaitPointerEventScope;
                anonymousClass1.label = 2;
                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, anonymousClass1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    return coroutine_suspended;
                }
                Object obj4 = coroutine_suspended;
                anonymousClass12 = anonymousClass1;
                obj = awaitPointerEvent$default;
                awaitPointerEventScope2 = awaitPointerEventScope;
                obj3 = obj4;
                List<PointerInputChange> changes2 = ((PointerEvent) obj).getChanges();
                ArrayList arrayList3 = new ArrayList(changes2.size());
                int size3 = changes2.size();
                int i22 = 0;
                while (i3 < size3) {
                }
                ArrayList arrayList22 = arrayList3;
                AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect2 = anonymousClass12.this$0;
                int size22 = arrayList22.size();
                while (true) {
                    if (i22 < size22) {
                    }
                    i22++;
                }
                PointerInputChange pointerInputChange22 = (PointerInputChange) obj2;
                if (pointerInputChange22 == null) {
                }
                if (pointerInputChange22 != null) {
                }
                if (!arrayList22.isEmpty()) {
                }
            }
            PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
            this.this$0.pointerId = PointerId.m4406boximpl(pointerInputChange3.m4425getIdJ3iCeTQ());
            this.this$0.pointerPosition = Offset.m3007boximpl(pointerInputChange3.m4426getPositionF1C5BW0());
            anonymousClass1 = this;
            anonymousClass1.L$0 = awaitPointerEventScope;
            anonymousClass1.label = 2;
            awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, anonymousClass1, 1, null);
            if (awaitPointerEvent$default != coroutine_suspended) {
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture((PointerInputScope) this.L$0, new AnonymousClass1(this.this$0, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
