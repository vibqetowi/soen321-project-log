package kotlinx.serialization.json;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: JsonElementBuilders.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0001J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/serialization/json/JsonObjectBuilder;", "", "()V", FirebaseAnalytics.Param.CONTENT, "", "", "Lkotlinx/serialization/json/JsonElement;", "build", "Lkotlinx/serialization/json/JsonObject;", "put", "key", "element", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0}, xi = 48)
@JsonDslMarker
/* loaded from: classes5.dex */
public final class JsonObjectBuilder {
    private final Map<String, JsonElement> content = new LinkedHashMap();

    public final JsonElement put(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        return this.content.put(key, element);
    }

    public final JsonObject build() {
        return new JsonObject(this.content);
    }
}
