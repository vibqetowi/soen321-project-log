package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.unit.Velocity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.Channel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1", f = "Draggable.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DraggableNode$pointerInputNode$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$pointerInputNode$1(DraggableNode draggableNode, Continuation<? super DraggableNode$pointerInputNode$1> continuation) {
        super(2, continuation);
        this.this$0 = draggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DraggableNode$pointerInputNode$1 draggableNode$pointerInputNode$1 = new DraggableNode$pointerInputNode$1(this.this$0, continuation);
        draggableNode$pointerInputNode$1.L$0 = obj;
        return draggableNode$pointerInputNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((DraggableNode$pointerInputNode$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            z = this.this$0.enabled;
            if (!z) {
                return Unit.INSTANCE;
            }
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(new AnonymousClass1(pointerInputScope, this.this$0, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {326}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PointerInputScope $$this$SuspendingPointerInputModifierNode;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DraggableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, DraggableNode draggableNode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$this$SuspendingPointerInputModifierNode = pointerInputScope;
            this.this$0 = draggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$SuspendingPointerInputModifierNode, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Draggable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {305, 307, 309, TypedValues.AttributesType.TYPE_PATH_ROTATE, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 321}, m = "invokeSuspend", n = {"$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
        /* renamed from: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ DraggableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00101(DraggableNode draggableNode, Continuation<? super C00101> continuation) {
                super(2, continuation);
                this.this$0 = draggableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00101 c00101 = new C00101(this.this$0, continuation);
                c00101.L$0 = obj;
                return c00101;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00d3 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00db A[Catch: CancellationException -> 0x0114, TryCatch #2 {CancellationException -> 0x0114, blocks: (B:37:0x00d5, B:39:0x00db, B:42:0x00f8, B:44:0x00fe), top: B:62:0x00d5 }] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00f8 A[Catch: CancellationException -> 0x0114, TryCatch #2 {CancellationException -> 0x0114, blocks: (B:37:0x00d5, B:39:0x00db, B:42:0x00f8, B:44:0x00fe), top: B:62:0x00d5 }] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0129 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0111 -> B:21:0x0066). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x012c -> B:21:0x0066). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                CoroutineScope coroutineScope;
                Ref.ObjectRef objectRef;
                CoroutineScope coroutineScope2;
                Ref.ObjectRef objectRef2;
                C00101 c00101;
                Ref.ObjectRef objectRef3;
                CoroutineScope coroutineScope3;
                Object processDragCancel;
                C00101 c001012;
                Object processDragCancel2;
                Object processDragStop;
                DraggableState draggableState;
                T t;
                Object processDragStart;
                Channel channel;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        coroutineScope = (CoroutineScope) this.L$0;
                        c001012 = this;
                        if (!CoroutineScopeKt.isActive(coroutineScope)) {
                            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                            channel = c001012.this$0.channel;
                            c001012.L$0 = coroutineScope;
                            c001012.L$1 = objectRef4;
                            c001012.L$2 = objectRef4;
                            c001012.label = 1;
                            Object receive = channel.receive(c001012);
                            if (receive == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectRef2 = objectRef4;
                            c00101 = c001012;
                            objectRef = objectRef2;
                            coroutineScope2 = coroutineScope;
                            t = receive;
                            objectRef.element = t;
                            if (!(objectRef2.element instanceof DragEvent.DragStarted)) {
                                c00101.L$0 = coroutineScope2;
                                c00101.L$1 = objectRef2;
                                c00101.L$2 = null;
                                c00101.label = 2;
                                processDragStart = c00101.this$0.processDragStart(coroutineScope2, (DragEvent.DragStarted) objectRef2.element, c00101);
                                if (processDragStart == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                objectRef3 = objectRef2;
                                try {
                                } catch (CancellationException unused) {
                                    coroutineScope3 = coroutineScope2;
                                    c00101.L$0 = coroutineScope3;
                                    c00101.L$1 = null;
                                    c00101.label = 6;
                                    processDragCancel = c00101.this$0.processDragCancel(coroutineScope3, c00101);
                                    if (processDragCancel != coroutine_suspended) {
                                    }
                                }
                                draggableState = c00101.this$0.state;
                                c00101.L$0 = coroutineScope2;
                                c00101.L$1 = objectRef3;
                                c00101.label = 3;
                                if (draggableState.drag(MutatePriority.UserInput, new C00111(objectRef3, c00101.this$0, null), c00101) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                coroutineScope = coroutineScope2;
                                try {
                                } catch (CancellationException unused2) {
                                    coroutineScope3 = coroutineScope;
                                    c00101.L$0 = coroutineScope3;
                                    c00101.L$1 = null;
                                    c00101.label = 6;
                                    processDragCancel = c00101.this$0.processDragCancel(coroutineScope3, c00101);
                                    if (processDragCancel != coroutine_suspended) {
                                    }
                                }
                                if (objectRef3.element instanceof DragEvent.DragStopped) {
                                    DraggableNode draggableNode = c00101.this$0;
                                    T t2 = objectRef3.element;
                                    Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                                    c00101.L$0 = coroutineScope;
                                    c00101.L$1 = null;
                                    c00101.label = 4;
                                    processDragStop = draggableNode.processDragStop(coroutineScope, (DragEvent.DragStopped) t2, c00101);
                                    if (processDragStop == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else if (objectRef3.element instanceof DragEvent.DragCancelled) {
                                    c00101.L$0 = coroutineScope;
                                    c00101.L$1 = null;
                                    c00101.label = 5;
                                    processDragCancel2 = c00101.this$0.processDragCancel(coroutineScope, c00101);
                                    if (processDragCancel2 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                c001012 = c00101;
                                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                                    return Unit.INSTANCE;
                                }
                            } else {
                                c001012 = c00101;
                                coroutineScope = coroutineScope2;
                                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                                }
                            }
                        }
                        break;
                    case 1:
                        objectRef = (Ref.ObjectRef) this.L$2;
                        coroutineScope2 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objectRef2 = (Ref.ObjectRef) this.L$1;
                        c00101 = this;
                        t = obj;
                        objectRef.element = t;
                        if (!(objectRef2.element instanceof DragEvent.DragStarted)) {
                        }
                        break;
                    case 2:
                        objectRef3 = (Ref.ObjectRef) this.L$1;
                        ResultKt.throwOnFailure(obj);
                        coroutineScope2 = (CoroutineScope) this.L$0;
                        c00101 = this;
                        draggableState = c00101.this$0.state;
                        c00101.L$0 = coroutineScope2;
                        c00101.L$1 = objectRef3;
                        c00101.label = 3;
                        if (draggableState.drag(MutatePriority.UserInput, new C00111(objectRef3, c00101.this$0, null), c00101) != coroutine_suspended) {
                        }
                        break;
                    case 3:
                        objectRef3 = (Ref.ObjectRef) this.L$1;
                        CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            coroutineScope = coroutineScope4;
                            c00101 = this;
                        } catch (CancellationException unused3) {
                            coroutineScope3 = coroutineScope4;
                            c00101 = this;
                            c00101.L$0 = coroutineScope3;
                            c00101.L$1 = null;
                            c00101.label = 6;
                            processDragCancel = c00101.this$0.processDragCancel(coroutineScope3, c00101);
                            if (processDragCancel != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            coroutineScope = coroutineScope3;
                            c001012 = c00101;
                            if (!CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                        }
                        if (objectRef3.element instanceof DragEvent.DragStopped) {
                        }
                        c001012 = c00101;
                        if (!CoroutineScopeKt.isActive(coroutineScope)) {
                        }
                        break;
                    case 4:
                        coroutineScope3 = (CoroutineScope) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            coroutineScope = coroutineScope3;
                            c001012 = this;
                        } catch (CancellationException unused4) {
                            c00101 = this;
                            c00101.L$0 = coroutineScope3;
                            c00101.L$1 = null;
                            c00101.label = 6;
                            processDragCancel = c00101.this$0.processDragCancel(coroutineScope3, c00101);
                            if (processDragCancel != coroutine_suspended) {
                            }
                        }
                        if (!CoroutineScopeKt.isActive(coroutineScope)) {
                        }
                        break;
                    case 5:
                        coroutineScope3 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        coroutineScope = coroutineScope3;
                        c001012 = this;
                        if (!CoroutineScopeKt.isActive(coroutineScope)) {
                        }
                        break;
                    case 6:
                        coroutineScope3 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        coroutineScope = coroutineScope3;
                        c001012 = this;
                        if (!CoroutineScopeKt.isActive(coroutineScope)) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Draggable.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/DragScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1$1", f = "Draggable.kt", i = {0}, l = {312}, m = "invokeSuspend", n = {"$this$drag"}, s = {"L$0"})
            /* renamed from: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00111 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;
                final /* synthetic */ DraggableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00111(Ref.ObjectRef<DragEvent> objectRef, DraggableNode draggableNode, Continuation<? super C00111> continuation) {
                    super(2, continuation);
                    this.$event = objectRef;
                    this.this$0 = draggableNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C00111 c00111 = new C00111(this.$event, this.this$0, continuation);
                    c00111.L$0 = obj;
                    return c00111;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
                    return ((C00111) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0074 -> B:23:0x007a). Please submit an issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    DragScope dragScope;
                    C00111 c00111;
                    Channel channel;
                    Orientation orientation;
                    float m552toFloat3MmeM6k;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        dragScope = (DragScope) this.L$0;
                        c00111 = this;
                        if (c00111.$event.element instanceof DragEvent.DragStopped) {
                        }
                        return Unit.INSTANCE;
                    } else if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        DragScope dragScope2 = (DragScope) this.L$0;
                        Ref.ObjectRef<DragEvent> objectRef = (Ref.ObjectRef) this.L$1;
                        Object obj2 = coroutine_suspended;
                        C00111 c001112 = this;
                        T t = obj;
                        objectRef.element = t;
                        c00111 = c001112;
                        coroutine_suspended = obj2;
                        dragScope = dragScope2;
                        if ((c00111.$event.element instanceof DragEvent.DragStopped) && !(c00111.$event.element instanceof DragEvent.DragCancelled)) {
                            DragEvent dragEvent = c00111.$event.element;
                            DragEvent.DragDelta dragDelta = dragEvent instanceof DragEvent.DragDelta ? (DragEvent.DragDelta) dragEvent : null;
                            if (dragDelta != null) {
                                DraggableNode draggableNode = c00111.this$0;
                                long m515getDeltaF1C5BW0 = dragDelta.m515getDeltaF1C5BW0();
                                orientation = draggableNode.orientation;
                                m552toFloat3MmeM6k = DraggableKt.m552toFloat3MmeM6k(m515getDeltaF1C5BW0, orientation);
                                dragScope.dragBy(m552toFloat3MmeM6k);
                            }
                            Ref.ObjectRef<DragEvent> objectRef2 = c00111.$event;
                            channel = c00111.this$0.channel;
                            c00111.L$0 = dragScope;
                            c00111.L$1 = objectRef2;
                            c00111.label = 1;
                            Object receive = channel.receive(c00111);
                            if (receive == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Object obj3 = coroutine_suspended;
                            c001112 = c00111;
                            t = receive;
                            dragScope2 = dragScope;
                            objectRef = objectRef2;
                            obj2 = obj3;
                            objectRef.element = t;
                            c00111 = c001112;
                            coroutine_suspended = obj2;
                            dragScope = dragScope2;
                            if (c00111.$event.element instanceof DragEvent.DragStopped) {
                            }
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CancellationException e;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, CoroutineStart.UNDISPATCHED, new C00101(this.this$0, null), 1, null);
                try {
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    if (this.$$this$SuspendingPointerInputModifierNode.awaitPointerEventScope(new AnonymousClass2(coroutineScope2, this.this$0, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (CancellationException e2) {
                    coroutineScope = coroutineScope2;
                    e = e2;
                    if (!CoroutineScopeKt.isActive(coroutineScope)) {
                        throw e;
                    }
                    return Unit.INSTANCE;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException e3) {
                    e = e3;
                    if (!CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Draggable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$2", f = "Draggable.kt", i = {0, 1, 1}, l = {328, 336}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "isDragSuccessful"}, s = {"L$0", "L$0", "I$0"})
        /* renamed from: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ DraggableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CoroutineScope coroutineScope, DraggableNode draggableNode, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$$this$coroutineScope = coroutineScope;
                this.this$0 = draggableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$$this$coroutineScope, this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(7:27|(1:28)|29|30|31|32|(1:34)(4:35|9|10|(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x010e, code lost:
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0110, code lost:
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x0111, code lost:
                r12 = r2;
                r2 = r15;
                r11 = r20;
                r10 = r13;
                r14 = r22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
                r11 = r20;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0143 A[Catch: all -> 0x0144, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0144, blocks: (B:51:0x012e, B:55:0x0143), top: B:70:0x012e }] */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0177  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0180  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d6 -> B:72:0x00df). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0134 -> B:54:0x0138). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0177 -> B:18:0x0053). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                AnonymousClass2 anonymousClass2;
                AnonymousClass2 anonymousClass22;
                DragEvent dragEvent;
                DragEvent dragEvent2;
                Channel channel;
                VelocityTracker velocityTracker;
                VelocityTracker velocityTracker2;
                boolean z;
                CancellationException e;
                Object obj2;
                Pair pair;
                DraggableNode draggableNode;
                VelocityTracker velocityTracker3;
                Channel channel2;
                boolean z2;
                Orientation orientation;
                Object m550awaitDragSu4bsnU;
                Function1 function1;
                Function0 function0;
                VelocityTracker velocityTracker4;
                Orientation orientation2;
                Channel channel3;
                VelocityTracker velocityTracker5;
                VelocityTracker velocityTracker6;
                boolean z3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                int i2 = 0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    anonymousClass2 = this;
                    if (CoroutineScopeKt.isActive(anonymousClass2.$$this$coroutineScope)) {
                    }
                } else if (i == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    anonymousClass22 = this;
                    Object obj3 = coroutine_suspended;
                    AwaitPointerEventScope awaitPointerEventScope2 = awaitPointerEventScope;
                    pair = (Pair) obj2;
                    if (pair != null) {
                    }
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    int i3 = this.I$0;
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$2;
                    DraggableNode draggableNode2 = (DraggableNode) this.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                    try {
                        try {
                            ResultKt.throwOnFailure(obj);
                            m550awaitDragSu4bsnU = obj;
                            anonymousClass22 = this;
                        } catch (CancellationException e2) {
                            e = e2;
                            anonymousClass22 = this;
                            try {
                                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                                    throw e;
                                }
                                dragEvent = DragEvent.DragCancelled.INSTANCE;
                                channel3 = draggableNode2.channel;
                                channel3.mo8817trySendJP2dKIU(dragEvent);
                                awaitPointerEventScope = awaitPointerEventScope3;
                                anonymousClass2 = anonymousClass22;
                                if (CoroutineScopeKt.isActive(anonymousClass2.$$this$coroutineScope)) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (i2 != 0) {
                                    velocityTracker = draggableNode2.velocityTracker;
                                    long m4519calculateVelocity9UxMQ8M = velocityTracker.m4519calculateVelocity9UxMQ8M();
                                    velocityTracker2 = draggableNode2.velocityTracker;
                                    velocityTracker2.resetTracking();
                                    z = draggableNode2.reverseDirection;
                                    dragEvent2 = new DragEvent.DragStopped(Velocity.m5838timesadjELrA(m4519calculateVelocity9UxMQ8M, z ? -1.0f : 1.0f), null);
                                } else {
                                    dragEvent2 = DragEvent.DragCancelled.INSTANCE;
                                }
                                channel = draggableNode2.channel;
                                channel.mo8817trySendJP2dKIU(dragEvent2);
                                throw th;
                            }
                        }
                        try {
                        } catch (CancellationException e3) {
                            e = e3;
                            if (!CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                            dragEvent = DragEvent.DragCancelled.INSTANCE;
                            channel3 = draggableNode2.channel;
                            channel3.mo8817trySendJP2dKIU(dragEvent);
                            awaitPointerEventScope = awaitPointerEventScope3;
                            anonymousClass2 = anonymousClass22;
                            if (CoroutineScopeKt.isActive(anonymousClass2.$$this$coroutineScope)) {
                            }
                        }
                        if (((Boolean) m550awaitDragSu4bsnU).booleanValue()) {
                            velocityTracker5 = draggableNode2.velocityTracker;
                            long m4519calculateVelocity9UxMQ8M2 = velocityTracker5.m4519calculateVelocity9UxMQ8M();
                            velocityTracker6 = draggableNode2.velocityTracker;
                            velocityTracker6.resetTracking();
                            z3 = draggableNode2.reverseDirection;
                            dragEvent = new DragEvent.DragStopped(Velocity.m5838timesadjELrA(m4519calculateVelocity9UxMQ8M2, z3 ? -1.0f : 1.0f), null);
                            channel3 = draggableNode2.channel;
                            channel3.mo8817trySendJP2dKIU(dragEvent);
                            awaitPointerEventScope = awaitPointerEventScope3;
                            anonymousClass2 = anonymousClass22;
                            if (CoroutineScopeKt.isActive(anonymousClass2.$$this$coroutineScope)) {
                                function1 = anonymousClass2.this$0._canDrag;
                                function0 = anonymousClass2.this$0._startDragImmediately;
                                velocityTracker4 = anonymousClass2.this$0.velocityTracker;
                                orientation2 = anonymousClass2.this$0.orientation;
                                anonymousClass2.L$0 = awaitPointerEventScope;
                                anonymousClass2.L$1 = null;
                                anonymousClass2.L$2 = null;
                                anonymousClass2.label = 1;
                                obj2 = DraggableKt.awaitDownAndSlop(awaitPointerEventScope, function1, function0, velocityTracker4, orientation2, anonymousClass2);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                anonymousClass22 = anonymousClass2;
                                Object obj32 = coroutine_suspended;
                                AwaitPointerEventScope awaitPointerEventScope22 = awaitPointerEventScope;
                                pair = (Pair) obj2;
                                if (pair != null) {
                                    awaitPointerEventScope = awaitPointerEventScope22;
                                    coroutine_suspended = obj32;
                                    anonymousClass2 = anonymousClass22;
                                    if (CoroutineScopeKt.isActive(anonymousClass2.$$this$coroutineScope)) {
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    DraggableNode draggableNode3 = anonymousClass22.this$0;
                                    CoroutineScope coroutineScope2 = anonymousClass22.$$this$coroutineScope;
                                    try {
                                    } catch (CancellationException e4) {
                                        e = e4;
                                        awaitPointerEventScope3 = awaitPointerEventScope22;
                                        coroutine_suspended = obj32;
                                        draggableNode2 = draggableNode3;
                                        coroutineScope = coroutineScope2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        draggableNode = draggableNode3;
                                    }
                                    PointerInputChange pointerInputChange = (PointerInputChange) pair.getFirst();
                                    long m3028unboximpl = ((Offset) pair.getSecond()).m3028unboximpl();
                                    velocityTracker3 = draggableNode3.velocityTracker;
                                    channel2 = draggableNode3.channel;
                                    Channel channel4 = channel2;
                                    z2 = draggableNode3.reverseDirection;
                                    orientation = draggableNode3.orientation;
                                    anonymousClass22.L$0 = awaitPointerEventScope22;
                                    anonymousClass22.L$1 = draggableNode3;
                                    anonymousClass22.L$2 = coroutineScope2;
                                    anonymousClass22.I$0 = 0;
                                    anonymousClass22.label = 2;
                                    draggableNode = draggableNode3;
                                    AnonymousClass2 anonymousClass23 = anonymousClass22;
                                    m550awaitDragSu4bsnU = DraggableKt.m550awaitDragSu4bsnU(awaitPointerEventScope22, pointerInputChange, m3028unboximpl, velocityTracker3, channel4, z2, orientation, anonymousClass23);
                                    if (m550awaitDragSu4bsnU == obj32) {
                                        return obj32;
                                    }
                                    awaitPointerEventScope3 = awaitPointerEventScope22;
                                    coroutine_suspended = obj32;
                                    i3 = 0;
                                    draggableNode2 = draggableNode;
                                    coroutineScope = coroutineScope2;
                                    anonymousClass22 = anonymousClass23;
                                    if (((Boolean) m550awaitDragSu4bsnU).booleanValue()) {
                                    }
                                }
                            }
                        }
                        dragEvent = DragEvent.DragCancelled.INSTANCE;
                        channel3 = draggableNode2.channel;
                        channel3.mo8817trySendJP2dKIU(dragEvent);
                        awaitPointerEventScope = awaitPointerEventScope3;
                        anonymousClass2 = anonymousClass22;
                        if (CoroutineScopeKt.isActive(anonymousClass2.$$this$coroutineScope)) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i2 = i3;
                        if (i2 != 0) {
                        }
                        channel = draggableNode2.channel;
                        channel.mo8817trySendJP2dKIU(dragEvent2);
                        throw th;
                    }
                }
            }
        }
    }
}
