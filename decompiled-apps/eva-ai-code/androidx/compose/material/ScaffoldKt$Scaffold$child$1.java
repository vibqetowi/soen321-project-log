package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "childModifier", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt$Scaffold$child$1 extends Lambda implements Function3<Modifier, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ boolean $isFloatingActionButtonDocked;
    final /* synthetic */ ScaffoldState $scaffoldState;
    final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
    final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$Scaffold$child$1(long j, long j2, int i, boolean z, int i2, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i3, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32, ScaffoldState scaffoldState) {
        super(3);
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$$dirty1 = i;
        this.$isFloatingActionButtonDocked = z;
        this.$floatingActionButtonPosition = i2;
        this.$topBar = function2;
        this.$content = function3;
        this.$floatingActionButton = function22;
        this.$bottomBar = function23;
        this.$$dirty = i3;
        this.$snackbarHost = function32;
        this.$scaffoldState = scaffoldState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
        final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
        final /* synthetic */ Function2<Composer, Integer, Unit> $floatingActionButton;
        final /* synthetic */ int $floatingActionButtonPosition;
        final /* synthetic */ boolean $isFloatingActionButtonDocked;
        final /* synthetic */ ScaffoldState $scaffoldState;
        final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
        final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(boolean z, int i, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i2, int i3, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32, ScaffoldState scaffoldState) {
            super(2);
            this.$isFloatingActionButtonDocked = z;
            this.$floatingActionButtonPosition = i;
            this.$topBar = function2;
            this.$content = function3;
            this.$floatingActionButton = function22;
            this.$bottomBar = function23;
            this.$$dirty = i2;
            this.$$dirty1 = i3;
            this.$snackbarHost = function32;
            this.$scaffoldState = scaffoldState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C180@8164L413:Scaffold.kt#jmzs0o");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1128984656, i, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                }
                boolean z = this.$isFloatingActionButtonDocked;
                int i2 = this.$floatingActionButtonPosition;
                Function2<Composer, Integer, Unit> function2 = this.$topBar;
                Function3<PaddingValues, Composer, Integer, Unit> function3 = this.$content;
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 533782017, true, new C00371(this.$snackbarHost, this.$scaffoldState, this.$$dirty));
                Function2<Composer, Integer, Unit> function22 = this.$floatingActionButton;
                Function2<Composer, Integer, Unit> function23 = this.$bottomBar;
                int i3 = this.$$dirty;
                ScaffoldKt.m1443ScaffoldLayoutMDYNRJg(z, i2, function2, function3, composableLambda, function22, function23, composer, ((i3 >> 21) & 14) | 24576 | ((i3 >> 15) & 112) | (i3 & 896) | ((this.$$dirty1 >> 12) & 7168) | (458752 & i3) | ((i3 << 9) & 3670016));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Scaffold.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00371 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ ScaffoldState $scaffoldState;
            final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00371(Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, ScaffoldState scaffoldState, int i) {
                super(2);
                this.$snackbarHost = function3;
                this.$scaffoldState = scaffoldState;
                this.$$dirty = i;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C186@8417L45:Scaffold.kt#jmzs0o");
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(533782017, i, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                }
                this.$snackbarHost.invoke(this.$scaffoldState.getSnackbarHostState(), composer, Integer.valueOf((this.$$dirty >> 9) & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
        invoke(modifier, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Modifier childModifier, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(childModifier, "childModifier");
        ComposerKt.sourceInformation(composer, "C179@8062L525:Scaffold.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(childModifier) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1823402604, i2, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
            }
            long j = this.$backgroundColor;
            long j2 = this.$contentColor;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1128984656, true, new AnonymousClass1(this.$isFloatingActionButtonDocked, this.$floatingActionButtonPosition, this.$topBar, this.$content, this.$floatingActionButton, this.$bottomBar, this.$$dirty, this.$$dirty1, this.$snackbarHost, this.$scaffoldState));
            int i3 = 1572864 | (i2 & 14);
            int i4 = this.$$dirty1;
            SurfaceKt.m1471SurfaceFjzlyU(childModifier, null, j, j2, null, 0.0f, composableLambda, composer, i3 | ((i4 >> 9) & 896) | ((i4 >> 9) & 7168), 50);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
