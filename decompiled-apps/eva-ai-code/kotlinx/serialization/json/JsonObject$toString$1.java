package kotlinx.serialization.json;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kotlinx.serialization.json.internal.StringOpsKt;
/* compiled from: JsonElement.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "Lkotlinx/serialization/json/JsonElement;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class JsonObject$toString$1 extends Lambda implements Function1<Map.Entry<? extends String, ? extends JsonElement>, CharSequence> {
    public static final JsonObject$toString$1 INSTANCE = new JsonObject$toString$1();

    JsonObject$toString$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends JsonElement> entry) {
        return invoke2((Map.Entry<String, ? extends JsonElement>) entry);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(Map.Entry<String, ? extends JsonElement> entry) {
        Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
        StringBuilder sb = new StringBuilder();
        StringOpsKt.printQuoted(sb, entry.getKey());
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append(entry.getValue());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
