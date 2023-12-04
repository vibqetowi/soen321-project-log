package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: ModalBottomSheet.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1", f = "ModalBottomSheet.android.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onDismissRequest;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1(Function0<Unit> function0, Continuation<? super ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1> continuation) {
        super(2, continuation);
        this.$onDismissRequest = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1 modalBottomSheet_androidKt$Scrim$dismissSheet$1$1 = new ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1(this.$onDismissRequest, continuation);
        modalBottomSheet_androidKt$Scrim$dismissSheet$1$1.L$0 = obj;
        return modalBottomSheet_androidKt$Scrim$dismissSheet$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Offset, Unit> {
        final /* synthetic */ Function0<Unit> $onDismissRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0<Unit> function0) {
            super(1);
            this.$onDismissRequest = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m1878invokek4lQ0M(offset.m3028unboximpl());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
        public final void m1878invokek4lQ0M(long j) {
            this.$onDismissRequest.invoke();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default((PointerInputScope) this.L$0, null, null, null, new AnonymousClass1(this.$onDismissRequest), this, 7, null) == coroutine_suspended) {
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
