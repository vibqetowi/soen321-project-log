package com.ifriend.ui.features.photo;

import androidx.compose.foundation.gestures.TransformGestureDetectorKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PhotoModalPopup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.ui.features.photo.PhotoModalPopupKt$AsyncPhotoContent$1$4$1", f = "PhotoModalPopup.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class PhotoModalPopupKt$AsyncPhotoContent$1$4$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Offset> $offset$delegate;
    final /* synthetic */ MutableFloatState $scale$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoModalPopupKt$AsyncPhotoContent$1$4$1(MutableState<Offset> mutableState, MutableFloatState mutableFloatState, Continuation<? super PhotoModalPopupKt$AsyncPhotoContent$1$4$1> continuation) {
        super(2, continuation);
        this.$offset$delegate = mutableState;
        this.$scale$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PhotoModalPopupKt$AsyncPhotoContent$1$4$1 photoModalPopupKt$AsyncPhotoContent$1$4$1 = new PhotoModalPopupKt$AsyncPhotoContent$1$4$1(this.$offset$delegate, this.$scale$delegate, continuation);
        photoModalPopupKt$AsyncPhotoContent$1$4$1.L$0 = obj;
        return photoModalPopupKt$AsyncPhotoContent$1$4$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((PhotoModalPopupKt$AsyncPhotoContent$1$4$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhotoModalPopup.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/ui/geometry/Offset;", "pan", "zoom", "", "<anonymous parameter 3>", "invoke-jyLRC_s", "(JJFF)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.ui.features.photo.PhotoModalPopupKt$AsyncPhotoContent$1$4$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends Lambda implements Function4<Offset, Offset, Float, Float, Unit> {
        final /* synthetic */ MutableState<Offset> $offset$delegate;
        final /* synthetic */ MutableFloatState $scale$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableState<Offset> mutableState, MutableFloatState mutableFloatState) {
            super(4);
            this.$offset$delegate = mutableState;
            this.$scale$delegate = mutableFloatState;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset, Offset offset2, Float f, Float f2) {
            m7085invokejyLRC_s(offset.m3028unboximpl(), offset2.m3028unboximpl(), f.floatValue(), f2.floatValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-jyLRC_s  reason: not valid java name */
        public final void m7085invokejyLRC_s(long j, long j2, float f, float f2) {
            long AsyncPhotoContent$lambda$9$lambda$4;
            float AsyncPhotoContent$lambda$9$lambda$1;
            MutableState<Offset> mutableState = this.$offset$delegate;
            AsyncPhotoContent$lambda$9$lambda$4 = PhotoModalPopupKt.AsyncPhotoContent$lambda$9$lambda$4(mutableState);
            PhotoModalPopupKt.AsyncPhotoContent$lambda$9$lambda$5(mutableState, Offset.m3023plusMKHz9U(AsyncPhotoContent$lambda$9$lambda$4, j2));
            MutableFloatState mutableFloatState = this.$scale$delegate;
            AsyncPhotoContent$lambda$9$lambda$1 = PhotoModalPopupKt.AsyncPhotoContent$lambda$9$lambda$1(mutableFloatState);
            mutableFloatState.setFloatValue(RangesKt.coerceIn(AsyncPhotoContent$lambda$9$lambda$1 * f, 0.5f, 2.5f));
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (TransformGestureDetectorKt.detectTransformGestures((PointerInputScope) this.L$0, true, new AnonymousClass1(this.$offset$delegate, this.$scale$delegate), this) == coroutine_suspended) {
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
