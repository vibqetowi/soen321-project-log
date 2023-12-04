package androidx.compose.material3;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowLeftKt;
import androidx.compose.material.icons.filled.KeyboardArrowRightKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$MonthsNavigation$1$2$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ boolean $rtl;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$MonthsNavigation$1$2$1(boolean z) {
        super(2);
        this.$rtl = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ImageVector keyboardArrowLeft;
        ComposerKt.sourceInformation(composer, "C1810@74394L50,1804@74129L337:DatePicker.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1143715416, i, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1803)");
            }
            if (this.$rtl) {
                keyboardArrowLeft = KeyboardArrowRightKt.getKeyboardArrowRight(Icons.Filled.INSTANCE);
            } else {
                keyboardArrowLeft = KeyboardArrowLeftKt.getKeyboardArrowLeft(Icons.Filled.INSTANCE);
            }
            IconKt.m1829Iconww6aTOc(keyboardArrowLeft, Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2020getDatePickerSwitchToPreviousMonthadMyvUU(), composer, 6), (Modifier) null, 0L, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
