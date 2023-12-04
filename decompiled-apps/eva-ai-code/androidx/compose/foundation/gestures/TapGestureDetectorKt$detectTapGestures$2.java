package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.time.DurationKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
    final /* synthetic */ Function1<Offset, Unit> $onLongPress;
    final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
    final /* synthetic */ Function1<Offset, Unit> $onTap;
    final /* synthetic */ PointerInputScope $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TapGestureDetectorKt$detectTapGestures$2(PointerInputScope pointerInputScope, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Function1<? super Offset, Unit> function13, Continuation<? super TapGestureDetectorKt$detectTapGestures$2> continuation) {
        super(2, continuation);
        this.$this_detectTapGestures = pointerInputScope;
        this.$onPress = function3;
        this.$onLongPress = function1;
        this.$onDoubleTap = function12;
        this.$onTap = function13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, continuation);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(this.$this_detectTapGestures, new AnonymousClass1(coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, pressGestureScopeImpl, null), this) == coroutine_suspended) {
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
    /* compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {100, 114, TsExtractor.TS_STREAM_TYPE_AC3, 141, 156, 178}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "secondDown"}, s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $$this$coroutineScope;
        final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
        final /* synthetic */ Function1<Offset, Unit> $onLongPress;
        final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
        final /* synthetic */ Function1<Offset, Unit> $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(CoroutineScope coroutineScope, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Function1<? super Offset, Unit> function13, PressGestureScopeImpl pressGestureScopeImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$this$coroutineScope = coroutineScope;
            this.$onPress = function3;
            this.$onLongPress = function1;
            this.$onDoubleTap = function12;
            this.$onTap = function13;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$pressScope, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00fd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0107 A[Catch: PointerEventTimeoutCancellationException -> 0x0136, TryCatch #2 {PointerEventTimeoutCancellationException -> 0x0136, blocks: (B:33:0x0101, B:35:0x0107, B:36:0x011b), top: B:88:0x0101 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x011b A[Catch: PointerEventTimeoutCancellationException -> 0x0136, TRY_LEAVE, TryCatch #2 {PointerEventTimeoutCancellationException -> 0x0136, blocks: (B:33:0x0101, B:35:0x0107, B:36:0x011b), top: B:88:0x0101 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x015e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0225  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0238  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0255 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            Object awaitFirstDown$default;
            AwaitPointerEventScope awaitPointerEventScope2;
            PointerInputChange pointerInputChange;
            Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function3;
            Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function32;
            long longPressTimeoutMillis;
            Ref.ObjectRef objectRef;
            Object withTimeout;
            AwaitPointerEventScope awaitPointerEventScope3;
            PointerInputChange pointerInputChange2;
            Ref.ObjectRef objectRef2;
            AwaitPointerEventScope awaitPointerEventScope4;
            Function1<Offset, Unit> function1;
            Object consumeUntilUp;
            T t;
            Object awaitSecondDown;
            Ref.ObjectRef objectRef3;
            AwaitPointerEventScope awaitPointerEventScope5;
            PointerInputChange pointerInputChange3;
            Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function33;
            Ref.ObjectRef objectRef4;
            AwaitPointerEventScope awaitPointerEventScope6;
            Function1<Offset, Unit> function12;
            Function1<Offset, Unit> function13;
            Object consumeUntilUp2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    this.L$0 = awaitPointerEventScope;
                    this.label = 1;
                    awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 3, null);
                    if (awaitFirstDown$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    pointerInputChange = (PointerInputChange) awaitFirstDown$default;
                    pointerInputChange.consume();
                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new C00131(this.$pressScope, null), 3, null);
                    function3 = this.$onPress;
                    function32 = TapGestureDetectorKt.NoPressGesture;
                    if (function3 != function32) {
                        BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$onPress, this.$pressScope, pointerInputChange, null), 3, null);
                    }
                    longPressTimeoutMillis = this.$onLongPress == null ? awaitPointerEventScope2.getViewConfiguration().getLongPressTimeoutMillis() : DurationKt.MAX_MILLIS;
                    objectRef = new Ref.ObjectRef();
                    try {
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = pointerInputChange;
                        this.L$2 = objectRef;
                        this.L$3 = objectRef;
                        this.J$0 = longPressTimeoutMillis;
                        this.label = 2;
                        withTimeout = awaitPointerEventScope2.withTimeout(longPressTimeoutMillis, new AnonymousClass3(null), this);
                    } catch (PointerEventTimeoutCancellationException unused) {
                        awaitPointerEventScope4 = awaitPointerEventScope2;
                        function1 = this.$onLongPress;
                        if (function1 != null) {
                            function1.invoke(Offset.m3007boximpl(pointerInputChange.m4426getPositionF1C5BW0()));
                        }
                        this.L$0 = awaitPointerEventScope4;
                        this.L$1 = objectRef;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.J$0 = longPressTimeoutMillis;
                        this.label = 3;
                        consumeUntilUp = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope4, this);
                        if (consumeUntilUp == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass6(this.$pressScope, null), 3, null);
                        objectRef2 = objectRef;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                        if (objectRef2.element != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (withTimeout != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    pointerInputChange2 = pointerInputChange;
                    objectRef2 = objectRef;
                    t = withTimeout;
                    try {
                        objectRef.element = t;
                        if (objectRef2.element != 0) {
                            BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass4(this.$pressScope, null), 3, null);
                        } else {
                            ((PointerInputChange) objectRef2.element).consume();
                            BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass5(this.$pressScope, null), 3, null);
                        }
                    } catch (PointerEventTimeoutCancellationException unused2) {
                        objectRef = objectRef2;
                        pointerInputChange = pointerInputChange2;
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        function1 = this.$onLongPress;
                        if (function1 != null) {
                        }
                        this.L$0 = awaitPointerEventScope4;
                        this.L$1 = objectRef;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.J$0 = longPressTimeoutMillis;
                        this.label = 3;
                        consumeUntilUp = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope4, this);
                        if (consumeUntilUp == coroutine_suspended) {
                        }
                        BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass6(this.$pressScope, null), 3, null);
                        objectRef2 = objectRef;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                        if (objectRef2.element != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (objectRef2.element != 0) {
                        if (this.$onDoubleTap == null) {
                            Function1<Offset, Unit> function14 = this.$onTap;
                            if (function14 != null) {
                                function14.invoke(Offset.m3007boximpl(((PointerInputChange) objectRef2.element).m4426getPositionF1C5BW0()));
                            }
                        } else {
                            this.L$0 = awaitPointerEventScope3;
                            this.L$1 = objectRef2;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.J$0 = longPressTimeoutMillis;
                            this.label = 4;
                            awaitSecondDown = TapGestureDetectorKt.awaitSecondDown(awaitPointerEventScope3, (PointerInputChange) objectRef2.element, this);
                            if (awaitSecondDown == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectRef3 = objectRef2;
                            awaitPointerEventScope5 = awaitPointerEventScope3;
                            pointerInputChange3 = (PointerInputChange) awaitSecondDown;
                            if (pointerInputChange3 != null) {
                                Function1<Offset, Unit> function15 = this.$onTap;
                                if (function15 != null) {
                                    function15.invoke(Offset.m3007boximpl(((PointerInputChange) objectRef3.element).m4426getPositionF1C5BW0()));
                                }
                            } else {
                                BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass7(this.$pressScope, null), 3, null);
                                Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function34 = this.$onPress;
                                function33 = TapGestureDetectorKt.NoPressGesture;
                                if (function34 != function33) {
                                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass8(this.$onPress, this.$pressScope, pointerInputChange3, null), 3, null);
                                }
                                try {
                                    Ref.ObjectRef objectRef5 = objectRef3;
                                    this.L$0 = awaitPointerEventScope5;
                                    this.L$1 = objectRef3;
                                    this.L$2 = pointerInputChange3;
                                    this.label = 5;
                                    if (awaitPointerEventScope5.withTimeout(longPressTimeoutMillis, new AnonymousClass9(this.$$this$coroutineScope, this.$onDoubleTap, this.$onTap, objectRef5, this.$pressScope, null), this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } catch (PointerEventTimeoutCancellationException unused3) {
                                    objectRef4 = objectRef3;
                                    awaitPointerEventScope6 = awaitPointerEventScope5;
                                    function12 = this.$onTap;
                                    if (function12 != null) {
                                    }
                                    function13 = this.$onLongPress;
                                    if (function13 != null) {
                                    }
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 6;
                                    consumeUntilUp2 = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope6, this);
                                    if (consumeUntilUp2 == coroutine_suspended) {
                                    }
                                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass10(this.$pressScope, null), 3, null);
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 1:
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    awaitFirstDown$default = obj;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    pointerInputChange = (PointerInputChange) awaitFirstDown$default;
                    pointerInputChange.consume();
                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new C00131(this.$pressScope, null), 3, null);
                    function3 = this.$onPress;
                    function32 = TapGestureDetectorKt.NoPressGesture;
                    if (function3 != function32) {
                    }
                    if (this.$onLongPress == null) {
                    }
                    objectRef = new Ref.ObjectRef();
                    this.L$0 = awaitPointerEventScope2;
                    this.L$1 = pointerInputChange;
                    this.L$2 = objectRef;
                    this.L$3 = objectRef;
                    this.J$0 = longPressTimeoutMillis;
                    this.label = 2;
                    withTimeout = awaitPointerEventScope2.withTimeout(longPressTimeoutMillis, new AnonymousClass3(null), this);
                    if (withTimeout != coroutine_suspended) {
                    }
                    break;
                case 2:
                    longPressTimeoutMillis = this.J$0;
                    objectRef = (Ref.ObjectRef) this.L$3;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) this.L$2;
                    pointerInputChange = (PointerInputChange) this.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        pointerInputChange2 = pointerInputChange;
                        objectRef2 = objectRef6;
                        t = obj;
                        objectRef.element = t;
                        if (objectRef2.element != 0) {
                        }
                    } catch (PointerEventTimeoutCancellationException unused4) {
                        objectRef = objectRef6;
                        awaitPointerEventScope4 = awaitPointerEventScope2;
                        function1 = this.$onLongPress;
                        if (function1 != null) {
                        }
                        this.L$0 = awaitPointerEventScope4;
                        this.L$1 = objectRef;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.J$0 = longPressTimeoutMillis;
                        this.label = 3;
                        consumeUntilUp = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope4, this);
                        if (consumeUntilUp == coroutine_suspended) {
                        }
                        BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass6(this.$pressScope, null), 3, null);
                        objectRef2 = objectRef;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                        if (objectRef2.element != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (objectRef2.element != 0) {
                    }
                    return Unit.INSTANCE;
                case 3:
                    longPressTimeoutMillis = this.J$0;
                    objectRef = (Ref.ObjectRef) this.L$1;
                    awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass6(this.$pressScope, null), 3, null);
                    objectRef2 = objectRef;
                    awaitPointerEventScope3 = awaitPointerEventScope4;
                    if (objectRef2.element != 0) {
                    }
                    return Unit.INSTANCE;
                case 4:
                    longPressTimeoutMillis = this.J$0;
                    ResultKt.throwOnFailure(obj);
                    objectRef3 = (Ref.ObjectRef) this.L$1;
                    awaitPointerEventScope5 = (AwaitPointerEventScope) this.L$0;
                    awaitSecondDown = obj;
                    pointerInputChange3 = (PointerInputChange) awaitSecondDown;
                    if (pointerInputChange3 != null) {
                    }
                    return Unit.INSTANCE;
                case 5:
                    pointerInputChange3 = (PointerInputChange) this.L$2;
                    objectRef4 = (Ref.ObjectRef) this.L$1;
                    awaitPointerEventScope6 = (AwaitPointerEventScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (PointerEventTimeoutCancellationException unused5) {
                        function12 = this.$onTap;
                        if (function12 != null) {
                            function12.invoke(Offset.m3007boximpl(((PointerInputChange) objectRef4.element).m4426getPositionF1C5BW0()));
                        }
                        function13 = this.$onLongPress;
                        if (function13 != null) {
                            function13.invoke(Offset.m3007boximpl(pointerInputChange3.m4426getPositionF1C5BW0()));
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 6;
                        consumeUntilUp2 = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope6, this);
                        if (consumeUntilUp2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass10(this.$pressScope, null), 3, null);
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass10(this.$pressScope, null), 3, null);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00131(PressGestureScopeImpl pressGestureScopeImpl, Continuation<? super C00131> continuation) {
                super(2, continuation);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00131(this.$pressScope, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.$pressScope.reset(this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputChange $down;
            final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$onPress = function3;
                this.$pressScope = pressGestureScopeImpl;
                this.$down = pointerInputChange;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$onPress, this.$pressScope, this.$down, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function3 = this.$onPress;
                    PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                    Offset m3007boximpl = Offset.m3007boximpl(this.$down.m4426getPositionF1C5BW0());
                    this.label = 1;
                    if (function3.invoke(pressGestureScopeImpl, m3007boximpl, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super PointerInputChange> continuation) {
                return ((AnonymousClass3) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    obj = TapGestureDetectorKt.waitForUpOrCancellation$default((AwaitPointerEventScope) this.L$0, null, this, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$pressScope, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$pressScope.cancel();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(PressGestureScopeImpl pressGestureScopeImpl, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$pressScope, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$pressScope.release();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(PressGestureScopeImpl pressGestureScopeImpl, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.$pressScope, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$pressScope.release();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(PressGestureScopeImpl pressGestureScopeImpl, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.$pressScope, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.$pressScope.reset(this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            final /* synthetic */ PointerInputChange $secondDown;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass8(Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.$onPress = function3;
                this.$pressScope = pressGestureScopeImpl;
                this.$secondDown = pointerInputChange;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.$onPress, this.$pressScope, this.$secondDown, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function3 = this.$onPress;
                    PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                    Offset m3007boximpl = Offset.m3007boximpl(this.$secondDown.m4426getPositionF1C5BW0());
                    this.label = 1;
                    if (function3.invoke(pressGestureScopeImpl, m3007boximpl, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9", f = "TapGestureDetector.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass9 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
            final /* synthetic */ Function1<Offset, Unit> $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            final /* synthetic */ Ref.ObjectRef<PointerInputChange> $upOrCancel;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass9(CoroutineScope coroutineScope, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Ref.ObjectRef<PointerInputChange> objectRef, PressGestureScopeImpl pressGestureScopeImpl, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.$$this$coroutineScope = coroutineScope;
                this.$onDoubleTap = function1;
                this.$onTap = function12;
                this.$upOrCancel = objectRef;
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.$$this$coroutineScope, this.$onDoubleTap, this.$onTap, this.$upOrCancel, this.$pressScope, continuation);
                anonymousClass9.L$0 = obj;
                return anonymousClass9;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass9) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    obj = TapGestureDetectorKt.waitForUpOrCancellation$default((AwaitPointerEventScope) this.L$0, null, this, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange == null) {
                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$pressScope, null), 3, null);
                    Function1<Offset, Unit> function1 = this.$onTap;
                    if (function1 != null) {
                        function1.invoke(Offset.m3007boximpl(this.$upOrCancel.element.m4426getPositionF1C5BW0()));
                        return Unit.INSTANCE;
                    }
                    return null;
                }
                pointerInputChange.consume();
                BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new C00141(this.$pressScope, null), 3, null);
                this.$onDoubleTap.invoke(Offset.m3007boximpl(pointerInputChange.m4426getPositionF1C5BW0()));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00141(PressGestureScopeImpl pressGestureScopeImpl, Continuation<? super C00141> continuation) {
                    super(2, continuation);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C00141(this.$pressScope, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C00141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$pressScope.release();
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(PressGestureScopeImpl pressGestureScopeImpl, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$pressScope, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$pressScope.cancel();
                    return Unit.INSTANCE;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(PressGestureScopeImpl pressGestureScopeImpl, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass10(this.$pressScope, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$pressScope.release();
                return Unit.INSTANCE;
            }
        }
    }
}
