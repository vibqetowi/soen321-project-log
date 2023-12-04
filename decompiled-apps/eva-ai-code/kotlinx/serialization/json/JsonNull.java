package kotlinx.serialization.json;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* compiled from: JsonElement.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bHÆ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\f"}, d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "()V", FirebaseAnalytics.Param.CONTENT, "", "getContent", "()Ljava/lang/String;", "isString", "", "()Z", "serializer", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0}, xi = 48)
@Serializable(with = JsonNullSerializer.class)
/* loaded from: classes5.dex */
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull INSTANCE = new JsonNull();
    private static final String content = AbstractJsonLexerKt.NULL;
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) JsonNull$$cachedSerializer$delegate$1.INSTANCE);

    @Override // kotlinx.serialization.json.JsonPrimitive
    public boolean isString() {
        return false;
    }

    private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
        return $cachedSerializer$delegate;
    }

    public final KSerializer<JsonNull> serializer() {
        return (KSerializer) get$cachedSerializer$delegate().getValue();
    }

    private JsonNull() {
        super(null);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String getContent() {
        return content;
    }
}
