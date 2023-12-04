package androidx.compose.ui.platform;

import androidx.compose.ui.text.font.FontFamily;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: CompositionLocals.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CompositionLocalsKt$LocalFontFamilyResolver$1 extends Lambda implements Function0<FontFamily.Resolver> {
    public static final CompositionLocalsKt$LocalFontFamilyResolver$1 INSTANCE = new CompositionLocalsKt$LocalFontFamilyResolver$1();

    CompositionLocalsKt$LocalFontFamilyResolver$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final FontFamily.Resolver invoke() {
        CompositionLocalsKt.noLocalProvidedFor("LocalFontFamilyResolver");
        throw new KotlinNothingValueException();
    }
}
