package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewModifier;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.ui.geometry.Rect;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContentInViewModifier.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", f = "ContentInViewModifier.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ContentInViewModifier$launchAnimation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewModifier$launchAnimation$1(ContentInViewModifier contentInViewModifier, Continuation<? super ContentInViewModifier$launchAnimation$1> continuation) {
        super(2, continuation);
        this.this$0 = contentInViewModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContentInViewModifier$launchAnimation$1 contentInViewModifier$launchAnimation$1 = new ContentInViewModifier$launchAnimation$1(this.this$0, continuation);
        contentInViewModifier$launchAnimation$1.L$0 = obj;
        return contentInViewModifier$launchAnimation$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContentInViewModifier$launchAnimation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScrollableState scrollableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        CancellationException cancellationException = null;
        try {
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Job job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
                    this.this$0.isAnimationRunning = true;
                    scrollableState = this.this$0.scrollState;
                    this.label = 1;
                    if (ScrollableState.CC.scroll$default(scrollableState, null, new AnonymousClass1(this.this$0, job, null), this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.bringIntoViewRequests.resumeAndRemoveAll();
                this.this$0.isAnimationRunning = false;
                this.this$0.bringIntoViewRequests.cancelAndRemoveAll(null);
                this.this$0.trackingFocusedChild = false;
                return Unit.INSTANCE;
            } catch (CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            }
        } catch (Throwable th) {
            this.this$0.isAnimationRunning = false;
            this.this$0.bringIntoViewRequests.cancelAndRemoveAll(cancellationException);
            this.this$0.trackingFocusedChild = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContentInViewModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", f = "ContentInViewModifier.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Job $animationJob;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ContentInViewModifier this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ContentInViewModifier contentInViewModifier, Job job, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = contentInViewModifier;
            this.$animationJob = job;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$animationJob, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UpdatableAnimationState updatableAnimationState;
            float calculateScrollDelta;
            UpdatableAnimationState updatableAnimationState2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                updatableAnimationState = this.this$0.animationState;
                calculateScrollDelta = this.this$0.calculateScrollDelta();
                updatableAnimationState.setValue(calculateScrollDelta);
                updatableAnimationState2 = this.this$0.animationState;
                ContentInViewModifier contentInViewModifier = this.this$0;
                this.label = 1;
                if (updatableAnimationState2.animateToZero(new C00091(contentInViewModifier, (ScrollScope) this.L$0, this.$animationJob), new AnonymousClass2(this.this$0), this) == coroutine_suspended) {
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
        /* compiled from: ContentInViewModifier.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "delta", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00091 extends Lambda implements Function1<Float, Unit> {
            final /* synthetic */ ScrollScope $$this$scroll;
            final /* synthetic */ Job $animationJob;
            final /* synthetic */ ContentInViewModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00091(ContentInViewModifier contentInViewModifier, ScrollScope scrollScope, Job job) {
                super(1);
                this.this$0 = contentInViewModifier;
                this.$$this$scroll = scrollScope;
                this.$animationJob = job;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke(f.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f) {
                boolean z;
                z = this.this$0.reverseDirection;
                float f2 = z ? 1.0f : -1.0f;
                float scrollBy = f2 * this.$$this$scroll.scrollBy(f2 * f);
                if (scrollBy < f) {
                    Job job = this.$animationJob;
                    JobKt__JobKt.cancel$default(job, "Scroll animation cancelled because scroll was not consumed (" + scrollBy + " < " + f + ')', null, 2, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ContentInViewModifier.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
            final /* synthetic */ ContentInViewModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ContentInViewModifier contentInViewModifier) {
                super(0);
                this.this$0 = contentInViewModifier;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean z;
                boolean z2;
                UpdatableAnimationState updatableAnimationState;
                float calculateScrollDelta;
                Rect focusedChildBounds;
                BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = this.this$0.bringIntoViewRequests;
                ContentInViewModifier contentInViewModifier = this.this$0;
                while (true) {
                    z = true;
                    if (!bringIntoViewRequestPriorityQueue.requests.isNotEmpty()) {
                        break;
                    }
                    Rect invoke = ((ContentInViewModifier.Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke();
                    if (!(invoke == null ? true : ContentInViewModifier.m511isMaxVisibleO0kMr_c$default(contentInViewModifier, invoke, 0L, 1, null))) {
                        break;
                    }
                    Unit unit = Unit.INSTANCE;
                    Result.Companion companion = Result.Companion;
                    ((ContentInViewModifier.Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation().resumeWith(Result.m7271constructorimpl(unit));
                }
                z2 = this.this$0.trackingFocusedChild;
                if (z2) {
                    focusedChildBounds = this.this$0.getFocusedChildBounds();
                    if (focusedChildBounds == null || !ContentInViewModifier.m511isMaxVisibleO0kMr_c$default(this.this$0, focusedChildBounds, 0L, 1, null)) {
                        z = false;
                    }
                    if (z) {
                        this.this$0.trackingFocusedChild = false;
                    }
                }
                updatableAnimationState = this.this$0.animationState;
                calculateScrollDelta = this.this$0.calculateScrollDelta();
                updatableAnimationState.setValue(calculateScrollDelta);
            }
        }
    }
}
