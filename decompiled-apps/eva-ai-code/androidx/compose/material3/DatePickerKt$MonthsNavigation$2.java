package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$MonthsNavigation$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $nextAvailable;
    final /* synthetic */ Function0<Unit> $onNextClicked;
    final /* synthetic */ Function0<Unit> $onPreviousClicked;
    final /* synthetic */ Function0<Unit> $onYearPickerButtonClicked;
    final /* synthetic */ boolean $previousAvailable;
    final /* synthetic */ String $yearPickerText;
    final /* synthetic */ boolean $yearPickerVisible;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$MonthsNavigation$2(Modifier modifier, boolean z, boolean z2, boolean z3, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
        super(2);
        this.$modifier = modifier;
        this.$nextAvailable = z;
        this.$previousAvailable = z2;
        this.$yearPickerVisible = z3;
        this.$yearPickerText = str;
        this.$onNextClicked = function0;
        this.$onPreviousClicked = function02;
        this.$onYearPickerButtonClicked = function03;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        DatePickerKt.MonthsNavigation(this.$modifier, this.$nextAvailable, this.$previousAvailable, this.$yearPickerVisible, this.$yearPickerText, this.$onNextClicked, this.$onPreviousClicked, this.$onYearPickerButtonClicked, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
