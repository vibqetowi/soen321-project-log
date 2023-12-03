package com.bugsnag.android.repackaged.dslplatform.json;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class MapConverter {
    private static final JsonReader.ReadObject<Map<String, String>> TypedMapReader = new JsonReader.ReadObject<Map<String, String>>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.MapConverter.1
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Map<String, String> read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            return MapConverter.deserialize(jsonReader);
        }
    };

    public static Map<String, String> deserialize(JsonReader jsonReader) {
        if (jsonReader.last() == 123) {
            if (jsonReader.getNextToken() == 125) {
                return new LinkedHashMap(0);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String deserialize = StringConverter.deserialize(jsonReader);
            if (jsonReader.getNextToken() == 58) {
                jsonReader.getNextToken();
                linkedHashMap.put(deserialize, StringConverter.deserializeNullable(jsonReader));
                while (true) {
                    byte nextToken = jsonReader.getNextToken();
                    if (nextToken == 44) {
                        jsonReader.getNextToken();
                        String deserialize2 = StringConverter.deserialize(jsonReader);
                        if (jsonReader.getNextToken() == 58) {
                            jsonReader.getNextToken();
                            linkedHashMap.put(deserialize2, StringConverter.deserializeNullable(jsonReader));
                        } else {
                            throw jsonReader.newParseError("Expecting ':' after attribute name");
                        }
                    } else if (nextToken == 125) {
                        return linkedHashMap;
                    } else {
                        throw jsonReader.newParseError("Expecting '}' for map end");
                    }
                }
            } else {
                throw jsonReader.newParseError("Expecting ':' after attribute name");
            }
        } else {
            throw jsonReader.newParseError("Expecting '{' for map start");
        }
    }

    public static ArrayList<Map<String, String>> deserializeCollection(JsonReader jsonReader) {
        return jsonReader.deserializeCollection(TypedMapReader);
    }

    public static ArrayList<Map<String, String>> deserializeNullableCollection(JsonReader jsonReader) {
        return jsonReader.deserializeNullableCollection(TypedMapReader);
    }

    public static void serialize(Map<String, String> map, JsonWriter jsonWriter) {
        jsonWriter.writeByte(JsonWriter.OBJECT_START);
        int size = map.size();
        if (size > 0) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            Map.Entry<String, String> next = it.next();
            StringConverter.serializeShort(next.getKey(), jsonWriter);
            jsonWriter.writeByte(JsonWriter.SEMI);
            StringConverter.serializeNullable(next.getValue(), jsonWriter);
            for (int i6 = 1; i6 < size; i6++) {
                jsonWriter.writeByte(JsonWriter.COMMA);
                Map.Entry<String, String> next2 = it.next();
                StringConverter.serializeShort(next2.getKey(), jsonWriter);
                jsonWriter.writeByte(JsonWriter.SEMI);
                StringConverter.serializeNullable(next2.getValue(), jsonWriter);
            }
        }
        jsonWriter.writeByte(JsonWriter.OBJECT_END);
    }

    public static void serializeNullable(Map<String, String> map, JsonWriter jsonWriter) {
        if (map == null) {
            jsonWriter.writeNull();
        } else {
            serialize(map, jsonWriter);
        }
    }

    public static void deserializeCollection(JsonReader jsonReader, Collection<Map<String, String>> collection) {
        jsonReader.deserializeCollection(TypedMapReader, collection);
    }

    public static void deserializeNullableCollection(JsonReader jsonReader, Collection<Map<String, String>> collection) {
        jsonReader.deserializeNullableCollection(TypedMapReader, collection);
    }
}
