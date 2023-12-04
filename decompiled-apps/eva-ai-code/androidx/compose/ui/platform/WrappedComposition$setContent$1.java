package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.Lifecycle;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wrapper.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WrappedComposition$setContent$1 extends Lambda implements Function1<AndroidComposeView.ViewTreeOwners, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ WrappedComposition this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WrappedComposition$setContent$1(WrappedComposition wrappedComposition, Function2<? super Composer, ? super Integer, Unit> function2) {
        super(1);
        this.this$0 = wrappedComposition;
        this.$content = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
        invoke2(viewTreeOwners);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AndroidComposeView.ViewTreeOwners it) {
        boolean z;
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(it, "it");
        z = this.this$0.disposed;
        if (z) {
            return;
        }
        Lifecycle lifecycle2 = it.getLifecycleOwner().getLifecycle();
        this.this$0.lastContent = this.$content;
        lifecycle = this.this$0.addedToLifecycle;
        if (lifecycle == null) {
            this.this$0.addedToLifecycle = lifecycle2;
            lifecycle2.addObserver(this.this$0);
        } else if (lifecycle2.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            this.this$0.getOriginal().setContent(ComposableLambdaKt.composableLambdaInstance(-2000640158, true, new AnonymousClass1(this.this$0, this.$content)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wrapper.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ WrappedComposition this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(WrappedComposition wrappedComposition, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.this$0 = wrappedComposition;
            this.$content = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C154@6099L56,156@6181L176:Wrapper.android.kt#itgzvw");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2000640158, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:141)");
                }
                Object tag = this.this$0.getOwner().getTag(R.id.inspection_slot_table_set);
                Set<CompositionData> set = TypeIntrinsics.isMutableSet(tag) ? (Set) tag : null;
                if (set == null) {
                    ViewParent parent = this.this$0.getOwner().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                    set = TypeIntrinsics.isMutableSet(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(composer.getCompositionData());
                    composer.collectParameterInformation();
                }
                EffectsKt.LaunchedEffect(this.this$0.getOwner(), new C00671(this.this$0, null), composer, 72);
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{InspectionTablesKt.getLocalInspectionTables().provides(set)}, ComposableLambdaKt.composableLambda(composer, -1193460702, true, new AnonymousClass2(this.this$0, this.$content)), composer, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Wrapper.android.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ Function2<Composer, Integer, Unit> $content;
            final /* synthetic */ WrappedComposition this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(WrappedComposition wrappedComposition, Function2<? super Composer, ? super Integer, Unit> function2) {
                super(2);
                this.this$0 = wrappedComposition;
                this.$content = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C157@6284L47:Wrapper.android.kt#itgzvw");
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1193460702, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:156)");
                }
                AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(this.this$0.getOwner(), this.$content, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Wrapper.android.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C00671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ WrappedComposition this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00671(WrappedComposition wrappedComposition, Continuation<? super C00671> continuation) {
                super(2, continuation);
                this.this$0 = wrappedComposition;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00671(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.getOwner().boundsUpdatesEventLoop(this) == coroutine_suspended) {
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
    }
}
