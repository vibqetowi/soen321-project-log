package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
/* compiled from: JsonElement.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class JsonNull$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> {
    public static final JsonNull$$cachedSerializer$delegate$1 INSTANCE = new JsonNull$$cachedSerializer$delegate$1();

    JsonNull$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return JsonNullSerializer.INSTANCE;
    }
}
