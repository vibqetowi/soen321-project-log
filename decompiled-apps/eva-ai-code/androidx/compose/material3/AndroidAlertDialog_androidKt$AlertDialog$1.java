package androidx.compose.material3;

import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidAlertDialog.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt$AlertDialog$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ Function2<Composer, Integer, Unit> $confirmButton;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $dismissButton;
    final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ Function2<Composer, Integer, Unit> $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $title;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidAlertDialog_androidKt$AlertDialog$1(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, long j, float f, long j2, long j3, long j4, int i, int i2, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25) {
        super(2);
        this.$icon = function2;
        this.$title = function22;
        this.$text = function23;
        this.$shape = shape;
        this.$containerColor = j;
        this.$tonalElevation = f;
        this.$iconContentColor = j2;
        this.$titleContentColor = j3;
        this.$textContentColor = j4;
        this.$$dirty = i;
        this.$$dirty1 = i2;
        this.$dismissButton = function24;
        this.$confirmButton = function25;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidAlertDialog.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function2<Composer, Integer, Unit> $confirmButton;
        final /* synthetic */ Function2<Composer, Integer, Unit> $dismissButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function2, int i, Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            this.$dismissButton = function2;
            this.$$dirty = i;
            this.$confirmButton = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            float f;
            float f2;
            ComposerKt.sourceInformation(composer, "C94@4763L238:AndroidAlertDialog.android.kt#uh7d8r");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1873210524, i, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:93)");
                }
                f = AndroidAlertDialog_androidKt.ButtonsMainAxisSpacing;
                f2 = AndroidAlertDialog_androidKt.ButtonsCrossAxisSpacing;
                AlertDialogKt.m1567AlertDialogFlowRowixp7dh8(f, f2, ComposableLambdaKt.composableLambda(composer, 628285581, true, new C00461(this.$dismissButton, this.$$dirty, this.$confirmButton)), composer, 438);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AndroidAlertDialog.android.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00461 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ Function2<Composer, Integer, Unit> $confirmButton;
            final /* synthetic */ Function2<Composer, Integer, Unit> $dismissButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00461(Function2<? super Composer, ? super Integer, Unit> function2, int i, Function2<? super Composer, ? super Integer, Unit> function22) {
                super(2);
                this.$dismissButton = function2;
                this.$$dirty = i;
                this.$confirmButton = function22;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C99@4972L15:AndroidAlertDialog.android.kt#uh7d8r");
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(628285581, i, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:97)");
                    }
                    Function2<Composer, Integer, Unit> function2 = this.$dismissButton;
                    composer.startReplaceableGroup(-1969500715);
                    ComposerKt.sourceInformation(composer, "98@4947L8");
                    if (function2 != null) {
                        function2.invoke(composer, Integer.valueOf((this.$$dirty >> 9) & 14));
                        Unit unit = Unit.INSTANCE;
                    }
                    composer.endReplaceableGroup();
                    this.$confirmButton.invoke(composer, Integer.valueOf((this.$$dirty >> 3) & 14));
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

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C112@5559L9,92@4711L1001:AndroidAlertDialog.android.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(741647174, i, -1, "androidx.compose.material3.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:91)");
            }
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -1873210524, true, new AnonymousClass1(this.$dismissButton, this.$$dirty, this.$confirmButton));
            Function2<Composer, Integer, Unit> function2 = this.$icon;
            Function2<Composer, Integer, Unit> function22 = this.$title;
            Function2<Composer, Integer, Unit> function23 = this.$text;
            Shape shape = this.$shape;
            long j = this.$containerColor;
            float f = this.$tonalElevation;
            long color = ColorSchemeKt.toColor(DialogTokens.INSTANCE.getActionLabelTextColor(), composer, 6);
            long j2 = this.$iconContentColor;
            long j3 = this.$titleContentColor;
            long j4 = this.$textContentColor;
            int i2 = this.$$dirty;
            int i3 = this.$$dirty1;
            AlertDialogKt.m1566AlertDialogContent4hvqGtA(composableLambda, null, function2, function22, function23, shape, j, f, color, j2, j3, j4, composer, ((i2 >> 6) & 7168) | ((i2 >> 6) & 896) | 6 | ((i2 >> 6) & 57344) | ((i2 >> 6) & 458752) | ((i2 >> 6) & 3670016) | ((i3 << 15) & 29360128) | (i2 & 1879048192), (i3 & 14) | (i3 & 112), 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
