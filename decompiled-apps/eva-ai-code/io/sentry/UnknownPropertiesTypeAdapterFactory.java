package io.sentry;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class UnknownPropertiesTypeAdapterFactory implements TypeAdapterFactory {
    private static final TypeAdapterFactory instance = new UnknownPropertiesTypeAdapterFactory();

    private UnknownPropertiesTypeAdapterFactory() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TypeAdapterFactory get() {
        return instance;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (IUnknownPropertiesConsumer.class.isAssignableFrom(typeToken.getRawType())) {
            return UnknownPropertiesTypeAdapter.create(typeToken.getRawType(), gson.getDelegateAdapter(this, typeToken), gson.excluder(), gson.fieldNamingStrategy());
        }
        return null;
    }

    /* loaded from: classes4.dex */
    private static final class UnknownPropertiesTypeAdapter<T extends IUnknownPropertiesConsumer> extends TypeAdapter<T> {
        private final Collection<String> propertyNames;
        private final TypeAdapter<T> typeAdapter;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
            write(jsonWriter, (JsonWriter) ((IUnknownPropertiesConsumer) obj));
        }

        private UnknownPropertiesTypeAdapter(TypeAdapter<T> typeAdapter, Collection<String> collection) {
            this.typeAdapter = typeAdapter;
            this.propertyNames = collection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends IUnknownPropertiesConsumer> TypeAdapter<T> create(Class<? super T> cls, TypeAdapter<T> typeAdapter, Excluder excluder, FieldNamingStrategy fieldNamingStrategy) {
            return new UnknownPropertiesTypeAdapter(typeAdapter, getPropertyNames(cls, excluder, fieldNamingStrategy));
        }

        private static Collection<String> getPropertyNames(Class<?> cls, Excluder excluder, FieldNamingStrategy fieldNamingStrategy) {
            Field[] declaredFields;
            ArrayList arrayList = new ArrayList();
            while (cls.getSuperclass() != null && cls != Object.class) {
                for (Field field : cls.getDeclaredFields()) {
                    if (!excluder.excludeField(field, false)) {
                        arrayList.add(fieldNamingStrategy.translateName(field));
                    }
                }
                cls = cls.getSuperclass();
            }
            return arrayList;
        }

        public void write(JsonWriter jsonWriter, T t) throws IOException {
            this.typeAdapter.write(jsonWriter, t);
        }

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) {
            JsonElement parse = new JsonParser().parse(jsonReader);
            if (parse == null || parse.isJsonNull()) {
                return null;
            }
            JsonObject asJsonObject = parse.getAsJsonObject();
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                String key = entry.getKey();
                if (!this.propertyNames.contains(key)) {
                    hashMap.put(key, entry.getValue());
                }
            }
            T fromJsonTree = this.typeAdapter.fromJsonTree(asJsonObject);
            if (!hashMap.isEmpty()) {
                fromJsonTree.acceptUnknownProperties(hashMap);
            }
            return fromJsonTree;
        }
    }
}
