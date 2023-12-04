package androidx.compose.ui.tooling;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewRootForTest;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ComposeViewAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposeViewAdapter$init$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ long $animationClockStartTime;
    final /* synthetic */ String $className;
    final /* synthetic */ String $methodName;
    final /* synthetic */ Function0<Unit> $onCommit;
    final /* synthetic */ Class<? extends PreviewParameterProvider<?>> $parameterProvider;
    final /* synthetic */ int $parameterProviderIndex;
    final /* synthetic */ ComposeViewAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewAdapter$init$3(Function0<Unit> function0, ComposeViewAdapter composeViewAdapter, long j, String str, String str2, Class<? extends PreviewParameterProvider<?>> cls, int i) {
        super(2);
        this.$onCommit = function0;
        this.this$0 = composeViewAdapter;
        this.$animationClockStartTime = j;
        this.$className = str;
        this.$methodName = str2;
        this.$parameterProvider = cls;
        this.$parameterProviderIndex = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C499@19077L20,501@19111L2532:ComposeViewAdapter.kt#hevd2p");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1704541905, i, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous> (ComposeViewAdapter.kt:498)");
            }
            EffectsKt.SideEffect(this.$onCommit, composer, 0);
            this.this$0.WrapPreview(ComposableLambdaKt.composableLambda(composer, 1938351266, true, new AnonymousClass1(this.$animationClockStartTime, this.this$0, this.$className, this.$methodName, this.$parameterProvider, this.$parameterProviderIndex)), composer, 70);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposeViewAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ long $animationClockStartTime;
        final /* synthetic */ String $className;
        final /* synthetic */ String $methodName;
        final /* synthetic */ Class<? extends PreviewParameterProvider<?>> $parameterProvider;
        final /* synthetic */ int $parameterProviderIndex;
        final /* synthetic */ ComposeViewAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j, ComposeViewAdapter composeViewAdapter, String str, String str2, Class<? extends PreviewParameterProvider<?>> cls, int i) {
            super(2);
            this.$animationClockStartTime = j;
            this.this$0 = composeViewAdapter;
            this.$className = str;
            this.$methodName = str2;
            this.$parameterProvider = cls;
            this.$parameterProviderIndex = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C:ComposeViewAdapter.kt#hevd2p");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1938351266, i, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous>.<anonymous> (ComposeViewAdapter.kt:501)");
                }
                ComposeViewAdapter$init$3$1$composable$1 composeViewAdapter$init$3$1$composable$1 = new ComposeViewAdapter$init$3$1$composable$1(this.$className, this.$methodName, composer, this.$parameterProvider, this.$parameterProviderIndex, this.this$0);
                if (this.$animationClockStartTime >= 0) {
                    this.this$0.setClock$ui_tooling_release(new PreviewAnimationClock(new C00691(this.this$0)));
                }
                composeViewAdapter$init$3$1$composable$1.invoke();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ComposeViewAdapter.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C00691 extends Lambda implements Function0<Unit> {
            final /* synthetic */ ComposeViewAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00691(ComposeViewAdapter composeViewAdapter) {
                super(0);
                this.this$0 = composeViewAdapter;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                View childAt = this.this$0.getChildAt(0);
                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
                View childAt2 = ((ComposeView) childAt).getChildAt(0);
                ViewRootForTest viewRootForTest = childAt2 instanceof ViewRootForTest ? (ViewRootForTest) childAt2 : null;
                if (viewRootForTest != null) {
                    viewRootForTest.invalidateDescendants();
                }
                Snapshot.Companion.sendApplyNotifications();
            }
        }
    }
}
