package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatInputContentKt$AttachmentsButtons$2$1$1 extends Lambda implements Function1<Modifier, Modifier> {
    final /* synthetic */ Function1<Integer, Unit> $onDragVoice;
    final /* synthetic */ Function0<Unit> $onRecordAudioEnd;
    final /* synthetic */ Function0<Unit> $onRecordAudioStart;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatInputContentKt$AttachmentsButtons$2$1$1(Function0<Unit> function0, Function0<Unit> function02, Function1<? super Integer, Unit> function1) {
        super(1);
        this.$onRecordAudioEnd = function0;
        this.$onRecordAudioStart = function02;
        this.$onDragVoice = function1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatInputContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chat.input.view.ChatInputContentKt$AttachmentsButtons$2$1$1$1", f = "ChatInputContent.kt", i = {}, l = {658}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.chat.input.view.ChatInputContentKt$AttachmentsButtons$2$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Integer, Unit> $onDragVoice;
        final /* synthetic */ Function0<Unit> $onRecordAudioEnd;
        final /* synthetic */ Function0<Unit> $onRecordAudioStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function0<Unit> function0, Function0<Unit> function02, Function1<? super Integer, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$onRecordAudioEnd = function0;
            this.$onRecordAudioStart = function02;
            this.$onDragVoice = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onRecordAudioEnd, this.$onRecordAudioStart, this.$onDragVoice, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatInputContent.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.chat.input.view.ChatInputContentKt$AttachmentsButtons$2$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01501 extends Lambda implements Function1<Offset, Unit> {
            final /* synthetic */ Function0<Unit> $onRecordAudioStart;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01501(Function0<Unit> function0) {
                super(1);
                this.$onRecordAudioStart = function0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m6900invokek4lQ0M(offset.m3028unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
            public final void m6900invokek4lQ0M(long j) {
                this.$onRecordAudioStart.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatInputContent.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "change", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "dragAmount", "Landroidx/compose/ui/geometry/Offset;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.chat.input.view.ChatInputContentKt$AttachmentsButtons$2$1$1$1$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass2 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {
            final /* synthetic */ Function1<Integer, Unit> $onDragVoice;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function1<? super Integer, Unit> function1) {
                super(2);
                this.$onDragVoice = function1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                m6901invokeUv8p0NA(pointerInputChange, offset.m3028unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-Uv8p0NA  reason: not valid java name */
            public final void m6901invokeUv8p0NA(PointerInputChange change, long j) {
                Intrinsics.checkNotNullParameter(change, "change");
                change.consume();
                this.$onDragVoice.invoke(Integer.valueOf((int) Offset.m3018getXimpl(j)));
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function0<Unit> function0 = this.$onRecordAudioEnd;
                this.label = 1;
                if (DragGestureDetectorKt.detectDragGesturesAfterLongPress((PointerInputScope) this.L$0, new C01501(this.$onRecordAudioStart), function0, function0, new AnonymousClass2(this.$onDragVoice), this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function1
    public final Modifier invoke(Modifier conditional) {
        Intrinsics.checkNotNullParameter(conditional, "$this$conditional");
        return SuspendingPointerInputFilterKt.pointerInput(conditional, Unit.INSTANCE, new AnonymousClass1(this.$onRecordAudioEnd, this.$onRecordAudioStart, this.$onDragVoice, null));
    }
}
