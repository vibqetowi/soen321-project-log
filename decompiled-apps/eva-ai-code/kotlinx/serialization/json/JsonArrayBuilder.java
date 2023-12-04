package kotlinx.serialization.json;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: JsonElementBuilders.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\nH\u0001R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/serialization/json/JsonArrayBuilder;", "", "()V", FirebaseAnalytics.Param.CONTENT, "", "Lkotlinx/serialization/json/JsonElement;", "add", "", "element", "build", "Lkotlinx/serialization/json/JsonArray;", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0}, xi = 48)
@JsonDslMarker
/* loaded from: classes5.dex */
public final class JsonArrayBuilder {
    private final List<JsonElement> content = new ArrayList();

    public final boolean add(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.content.add(element);
        return true;
    }

    public final JsonArray build() {
        return new JsonArray(this.content);
    }
}
