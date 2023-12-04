package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.LocaleList;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnnotatedString.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "str", TtmlNode.START, "", TtmlNode.END, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnnotatedStringKt$toUpperCase$1 extends Lambda implements Function3<String, Integer, Integer, String> {
    final /* synthetic */ LocaleList $localeList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotatedStringKt$toUpperCase$1(LocaleList localeList) {
        super(3);
        this.$localeList = localeList;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
        return invoke(str, num.intValue(), num2.intValue());
    }

    public final String invoke(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "str");
        String substring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return StringKt.toUpperCase(substring, this.$localeList);
    }
}
