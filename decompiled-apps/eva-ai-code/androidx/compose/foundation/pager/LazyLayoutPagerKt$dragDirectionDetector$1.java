package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyLayoutPager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1", f = "LazyLayoutPager.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LazyLayoutPagerKt$dragDirectionDetector$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PagerState $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$dragDirectionDetector$1(PagerState pagerState, Continuation<? super LazyLayoutPagerKt$dragDirectionDetector$1> continuation) {
        super(2, continuation);
        this.$state = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LazyLayoutPagerKt$dragDirectionDetector$1 lazyLayoutPagerKt$dragDirectionDetector$1 = new LazyLayoutPagerKt$dragDirectionDetector$1(this.$state, continuation);
        lazyLayoutPagerKt$dragDirectionDetector$1.L$0 = obj;
        return lazyLayoutPagerKt$dragDirectionDetector$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((LazyLayoutPagerKt$dragDirectionDetector$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyLayoutPager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", i = {}, l = {266}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ PagerState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, PagerState pagerState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$this$pointerInput = pointerInputScope;
            this.$state = pagerState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$$this$pointerInput, this.$state, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazyLayoutPager.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", i = {0, 1, 1, 1}, l = {268, 271}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "downEvent", "upEventOrCancellation"}, s = {"L$0", "L$0", "L$1", "L$2"})
        /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00191 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PagerState $state;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00191(PagerState pagerState, Continuation<? super C00191> continuation) {
                super(2, continuation);
                this.$state = pagerState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00191 c00191 = new C00191(this.$state, continuation);
                c00191.L$0 = obj;
                return c00191;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C00191) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006a -> B:19:0x0071). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                AwaitPointerEventScope awaitPointerEventScope2;
                PointerInputChange pointerInputChange;
                PointerInputChange pointerInputChange2;
                C00191 c00191;
                boolean z;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    this.L$0 = awaitPointerEventScope;
                    this.label = 1;
                    obj = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, PointerEventPass.Initial, this);
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
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                    PointerInputChange pointerInputChange3 = (PointerInputChange) this.L$1;
                    PointerInputChange pointerInputChange4 = (PointerInputChange) this.L$2;
                    Object obj2 = coroutine_suspended;
                    C00191 c001912 = this;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            z = true;
                            break;
                        } else if (!PointerEventKt.changedToUp(changes.get(i2))) {
                            z = false;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (z) {
                        c00191 = c001912;
                        coroutine_suspended = obj2;
                        pointerInputChange = pointerInputChange4;
                        pointerInputChange2 = pointerInputChange3;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                    } else {
                        pointerInputChange2 = pointerInputChange3;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        Object obj3 = obj2;
                        pointerInputChange = pointerEvent.getChanges().get(0);
                        c00191 = c001912;
                        coroutine_suspended = obj3;
                    }
                    if (pointerInputChange == null) {
                        c00191.L$0 = awaitPointerEventScope2;
                        c00191.L$1 = pointerInputChange2;
                        c00191.L$2 = pointerInputChange;
                        c00191.label = 2;
                        Object awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(PointerEventPass.Initial, c00191);
                        if (awaitPointerEvent == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Object obj4 = coroutine_suspended;
                        c001912 = c00191;
                        obj = awaitPointerEvent;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        pointerInputChange3 = pointerInputChange2;
                        pointerInputChange4 = pointerInputChange;
                        obj2 = obj4;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                        int size2 = changes2.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 >= size2) {
                            }
                            i22++;
                        }
                        if (z) {
                        }
                        if (pointerInputChange == null) {
                            c00191.$state.m979setUpDownDifferencek4lQ0M$foundation_release(Offset.m3022minusMKHz9U(pointerInputChange.m4426getPositionF1C5BW0(), pointerInputChange2.m4426getPositionF1C5BW0()));
                            return Unit.INSTANCE;
                        }
                    }
                }
                awaitPointerEventScope2 = awaitPointerEventScope;
                pointerInputChange = null;
                pointerInputChange2 = (PointerInputChange) obj;
                c00191 = this;
                if (pointerInputChange == null) {
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
                if (ForEachGestureKt.awaitEachGesture(this.$$this$pointerInput, new C00191(this.$state, null), this) == coroutine_suspended) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(new AnonymousClass1((PointerInputScope) this.L$0, this.$state, null), this) == coroutine_suspended) {
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
