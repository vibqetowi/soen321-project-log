package androidx.compose.material3;

import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Snackbar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarKt$Snackbar$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $action;
    final /* synthetic */ long $actionContentColor;
    final /* synthetic */ boolean $actionOnNewLine;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ Function2<Composer, Integer, Unit> $dismissAction;
    final /* synthetic */ long $dismissActionContentColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnackbarKt$Snackbar$1(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, long j, long j2, int i, boolean z) {
        super(2);
        this.$action = function2;
        this.$content = function22;
        this.$dismissAction = function23;
        this.$actionContentColor = j;
        this.$dismissActionContentColor = j2;
        this.$$dirty = i;
        this.$actionOnNewLine = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C113@5390L10,114@5490L10,115@5555L1013:Snackbar.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1829663446, i, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:112)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), SnackbarTokens.INSTANCE.getSupportingTextFont()))}, ComposableLambdaKt.composableLambda(composer, 835891690, true, new AnonymousClass1(this.$action, this.$content, this.$dismissAction, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont()), this.$actionContentColor, this.$dismissActionContentColor, this.$$dirty, this.$actionOnNewLine)), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.SnackbarKt$Snackbar$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function2<Composer, Integer, Unit> $action;
        final /* synthetic */ long $actionContentColor;
        final /* synthetic */ boolean $actionOnNewLine;
        final /* synthetic */ TextStyle $actionTextStyle;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ Function2<Composer, Integer, Unit> $dismissAction;
        final /* synthetic */ long $dismissActionContentColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, TextStyle textStyle, long j, long j2, int i, boolean z) {
            super(2);
            this.$action = function2;
            this.$content = function22;
            this.$dismissAction = function23;
            this.$actionTextStyle = textStyle;
            this.$actionContentColor = j;
            this.$dismissActionContentColor = j2;
            this.$$dirty = i;
            this.$actionOnNewLine = z;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C:Snackbar.kt#uh7d8r");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(835891690, i, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:115)");
                }
                if (this.$action == null) {
                    composer.startReplaceableGroup(-2104362496);
                    ComposerKt.sourceInformation(composer, "117@5670L278");
                    Function2<Composer, Integer, Unit> function2 = this.$content;
                    Function2<Composer, Integer, Unit> function22 = this.$dismissAction;
                    TextStyle textStyle = this.$actionTextStyle;
                    long j = this.$actionContentColor;
                    long j2 = this.$dismissActionContentColor;
                    int i2 = this.$$dirty;
                    SnackbarKt.m1981OneRowSnackbarkKq0p4A(function2, null, function22, textStyle, j, j2, composer, (57344 & (i2 >> 9)) | ((i2 >> 27) & 14) | 48 | (i2 & 896) | ((i2 >> 9) & 458752));
                    composer.endReplaceableGroup();
                } else if (this.$actionOnNewLine) {
                    composer.startReplaceableGroup(-2104362182);
                    ComposerKt.sourceInformation(composer, "125@5984L255");
                    Function2<Composer, Integer, Unit> function23 = this.$content;
                    Function2<Composer, Integer, Unit> function24 = this.$action;
                    Function2<Composer, Integer, Unit> function25 = this.$dismissAction;
                    TextStyle textStyle2 = this.$actionTextStyle;
                    long j3 = this.$actionContentColor;
                    long j4 = this.$dismissActionContentColor;
                    int i3 = this.$$dirty;
                    SnackbarKt.m1980NewLineButtonSnackbarkKq0p4A(function23, function24, function25, textStyle2, j3, j4, composer, (57344 & (i3 >> 9)) | ((i3 >> 27) & 14) | (i3 & 112) | (i3 & 896) | ((i3 >> 9) & 458752));
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-2104361902);
                    ComposerKt.sourceInformation(composer, "133@6264L280");
                    Function2<Composer, Integer, Unit> function26 = this.$content;
                    Function2<Composer, Integer, Unit> function27 = this.$action;
                    Function2<Composer, Integer, Unit> function28 = this.$dismissAction;
                    TextStyle textStyle3 = this.$actionTextStyle;
                    long j5 = this.$actionContentColor;
                    long j6 = this.$dismissActionContentColor;
                    int i4 = this.$$dirty;
                    SnackbarKt.m1981OneRowSnackbarkKq0p4A(function26, function27, function28, textStyle3, j5, j6, composer, (57344 & (i4 >> 9)) | ((i4 >> 27) & 14) | (i4 & 112) | (i4 & 896) | ((i4 >> 9) & 458752));
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
}
