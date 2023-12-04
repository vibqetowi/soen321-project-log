package io.sentry.adapters;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes4.dex */
public final class CollectionAdapter implements JsonSerializer<Collection<?>> {
    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(Collection<?> collection, Type type, JsonSerializationContext jsonSerializationContext) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        JsonArray jsonArray = new JsonArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            jsonArray.add(jsonSerializationContext.serialize(it.next()));
        }
        return jsonArray;
    }
}
