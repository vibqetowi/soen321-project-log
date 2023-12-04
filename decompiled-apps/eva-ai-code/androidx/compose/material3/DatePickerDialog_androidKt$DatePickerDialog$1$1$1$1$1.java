package androidx.compose.material3;

import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: DatePickerDialog.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DatePickerDialog_androidKt$DatePickerDialog$1$1$1$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $confirmButton;
    final /* synthetic */ Function2<Composer, Integer, Unit> $dismissButton;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerDialog_androidKt$DatePickerDialog$1$1$1$1$1(Function2<? super Composer, ? super Integer, Unit> function2, int i, Function2<? super Composer, ? super Integer, Unit> function22) {
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
        ComposerKt.sourceInformation(composer, "C100@4769L10,101@4848L438:DatePickerDialog.android.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-926980325, i, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:98)");
            }
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), DialogTokens.INSTANCE.getActionLabelTextFont()), ComposableLambdaKt.composableLambda(composer, -2020639284, true, new AnonymousClass1(this.$dismissButton, this.$$dirty, this.$confirmButton)), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DatePickerDialog.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$1$1$1  reason: invalid class name */
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
            ComposerKt.sourceInformation(composer, "C102@4914L346:DatePickerDialog.android.kt#uh7d8r");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2020639284, i, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:101)");
                }
                f = DatePickerDialog_androidKt.DialogButtonsMainAxisSpacing;
                f2 = DatePickerDialog_androidKt.DialogButtonsCrossAxisSpacing;
                AlertDialogKt.m1567AlertDialogFlowRowixp7dh8(f, f2, ComposableLambdaKt.composableLambda(composer, -1863712509, true, new C00481(this.$dismissButton, this.$$dirty, this.$confirmButton)), composer, 438);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DatePickerDialog.android.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00481 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ Function2<Composer, Integer, Unit> $confirmButton;
            final /* synthetic */ Function2<Composer, Integer, Unit> $dismissButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00481(Function2<? super Composer, ? super Integer, Unit> function2, int i, Function2<? super Composer, ? super Integer, Unit> function22) {
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
                ComposerKt.sourceInformation(composer, "C107@5215L15:DatePickerDialog.android.kt#uh7d8r");
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1863712509, i, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:105)");
                    }
                    Function2<Composer, Integer, Unit> function2 = this.$dismissButton;
                    composer.startReplaceableGroup(1710961622);
                    ComposerKt.sourceInformation(composer, "106@5174L8");
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
}
