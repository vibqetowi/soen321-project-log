package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: AndroidAlertDialog.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidAlertDialog_androidKt$AlertDialog$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ Function2<Composer, Integer, Unit> $buttons;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ Function2<Composer, Integer, Unit> $text;
    final /* synthetic */ Function2<Composer, Integer, Unit> $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidAlertDialog_androidKt$AlertDialog$3(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, long j, long j2, int i) {
        super(2);
        this.$buttons = function2;
        this.$modifier = modifier;
        this.$title = function22;
        this.$text = function23;
        this.$shape = shape;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C140@6430L259:AndroidAlertDialog.android.kt#jmzs0o");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1787418772, i, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
            }
            Function2<Composer, Integer, Unit> function2 = this.$buttons;
            Modifier modifier = this.$modifier;
            Function2<Composer, Integer, Unit> function22 = this.$title;
            Function2<Composer, Integer, Unit> function23 = this.$text;
            Shape shape = this.$shape;
            long j = this.$backgroundColor;
            long j2 = this.$contentColor;
            int i2 = this.$$dirty;
            AlertDialogKt.m1230AlertDialogContentWMdw5o4(function2, modifier, function22, function23, shape, j, j2, composer, ((i2 >> 3) & 14) | ((i2 >> 3) & 112) | ((i2 >> 3) & 896) | ((i2 >> 3) & 7168) | ((i2 >> 3) & 57344) | ((i2 >> 3) & 458752) | ((i2 >> 3) & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
