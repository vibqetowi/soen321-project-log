package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: PlatformTypefaces.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "setting", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TypefaceCompatApi26$toAndroidString$1 extends Lambda implements Function1<FontVariation.Setting, CharSequence> {
    final /* synthetic */ Density $density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypefaceCompatApi26$toAndroidString$1(Density density) {
        super(1);
        this.$density = density;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(FontVariation.Setting setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        return "'" + setting.getAxisName() + "' " + setting.toVariationValue(this.$density);
    }
}
