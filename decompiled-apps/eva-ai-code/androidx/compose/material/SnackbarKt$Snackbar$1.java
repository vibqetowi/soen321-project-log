package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Snackbar.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarKt$Snackbar$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $action;
    final /* synthetic */ boolean $actionOnNewLine;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnackbarKt$Snackbar$1(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i, boolean z) {
        super(2);
        this.$action = function2;
        this.$content = function22;
        this.$$dirty = i;
        this.$actionOnNewLine = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SnackbarKt$Snackbar$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function2<Composer, Integer, Unit> $action;
        final /* synthetic */ boolean $actionOnNewLine;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i, boolean z) {
            super(2);
            this.$action = function2;
            this.$content = function22;
            this.$$dirty = i;
            this.$actionOnNewLine = z;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Snackbar.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material.SnackbarKt$Snackbar$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00441 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ Function2<Composer, Integer, Unit> $action;
            final /* synthetic */ boolean $actionOnNewLine;
            final /* synthetic */ Function2<Composer, Integer, Unit> $content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00441(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i, boolean z) {
                super(2);
                this.$action = function2;
                this.$content = function22;
                this.$$dirty = i;
                this.$actionOnNewLine = z;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C:Snackbar.kt#jmzs0o");
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(225114541, i, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                    }
                    if (this.$action == null) {
                        composer.startReplaceableGroup(59708346);
                        ComposerKt.sourceInformation(composer, "101@4578L25");
                        SnackbarKt.TextOnlySnackbar(this.$content, composer, (this.$$dirty >> 21) & 14);
                        composer.endReplaceableGroup();
                    } else if (this.$actionOnNewLine) {
                        composer.startReplaceableGroup(59708411);
                        ComposerKt.sourceInformation(composer, "102@4643L38");
                        Function2<Composer, Integer, Unit> function2 = this.$content;
                        Function2<Composer, Integer, Unit> function22 = this.$action;
                        int i2 = this.$$dirty;
                        SnackbarKt.NewLineButtonSnackbar(function2, function22, composer, (i2 & 112) | ((i2 >> 21) & 14));
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(59708478);
                        ComposerKt.sourceInformation(composer, "103@4710L31");
                        Function2<Composer, Integer, Unit> function23 = this.$content;
                        Function2<Composer, Integer, Unit> function24 = this.$action;
                        int i3 = this.$$dirty;
                        SnackbarKt.OneRowSnackbar(function23, function24, composer, (i3 & 112) | ((i3 >> 21) & 14));
                        composer.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C98@4450L10,99@4479L294:Snackbar.kt#jmzs0o");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1939362236, i, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                }
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2(), ComposableLambdaKt.composableLambda(composer, 225114541, true, new C00441(this.$action, this.$content, this.$$dirty, this.$actionOnNewLine)), composer, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C97@4400L4,97@4335L448:Snackbar.kt#jmzs0o");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2084221700, i, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer, 6)))}, ComposableLambdaKt.composableLambda(composer, 1939362236, true, new AnonymousClass1(this.$action, this.$content, this.$$dirty, this.$actionOnNewLine)), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
