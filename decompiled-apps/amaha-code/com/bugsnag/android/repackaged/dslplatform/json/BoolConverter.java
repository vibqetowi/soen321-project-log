package com.bugsnag.android.repackaged.dslplatform.json;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
/* loaded from: classes.dex */
public abstract class BoolConverter {
    public static final boolean[] EMPTY_ARRAY = new boolean[0];
    public static final JsonReader.ReadObject<Boolean> READER = new JsonReader.ReadObject<Boolean>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.BoolConverter.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Boolean read(JsonReader jsonReader) {
            return Boolean.valueOf(BoolConverter.deserialize(jsonReader));
        }
    };
    public static final JsonReader.ReadObject<Boolean> NULLABLE_READER = new JsonReader.ReadObject<Boolean>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.BoolConverter.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Boolean read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            return Boolean.valueOf(BoolConverter.deserialize(jsonReader));
        }
    };
    public static final JsonWriter.WriteObject<Boolean> WRITER = new JsonWriter.WriteObject<Boolean>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.BoolConverter.3
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, Boolean bool) {
            BoolConverter.serializeNullable(bool, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<boolean[]> ARRAY_READER = new JsonReader.ReadObject<boolean[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.BoolConverter.4
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public boolean[] read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() == 91) {
                jsonReader.getNextToken();
                return BoolConverter.deserializeBoolArray(jsonReader);
            }
            throw jsonReader.newParseError("Expecting '[' for boolean array start");
        }
    };
    public static final JsonWriter.WriteObject<boolean[]> ARRAY_WRITER = new JsonWriter.WriteObject<boolean[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.BoolConverter.5
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, boolean[] zArr) {
            BoolConverter.serialize(zArr, jsonWriter);
        }
    };

    public static boolean deserialize(JsonReader jsonReader) {
        if (jsonReader.wasTrue()) {
            return true;
        }
        if (jsonReader.wasFalse()) {
            return false;
        }
        throw jsonReader.newParseErrorAt("Found invalid boolean value", 0);
    }

    public static boolean[] deserializeBoolArray(JsonReader jsonReader) {
        if (jsonReader.last() == 93) {
            return EMPTY_ARRAY;
        }
        boolean[] zArr = new boolean[4];
        zArr[0] = deserialize(jsonReader);
        int i6 = 1;
        while (jsonReader.getNextToken() == 44) {
            jsonReader.getNextToken();
            if (i6 == zArr.length) {
                zArr = Arrays.copyOf(zArr, zArr.length << 1);
            }
            zArr[i6] = deserialize(jsonReader);
            i6++;
        }
        jsonReader.checkArrayEnd();
        return Arrays.copyOf(zArr, i6);
    }

    public static ArrayList<Boolean> deserializeCollection(JsonReader jsonReader) {
        return jsonReader.deserializeCollection(READER);
    }

    public static ArrayList<Boolean> deserializeNullableCollection(JsonReader jsonReader) {
        return jsonReader.deserializeNullableCollection(READER);
    }

    public static void serialize(boolean z10, JsonWriter jsonWriter) {
        if (z10) {
            jsonWriter.writeAscii("true");
        } else {
            jsonWriter.writeAscii("false");
        }
    }

    public static void serializeNullable(Boolean bool, JsonWriter jsonWriter) {
        if (bool == null) {
            jsonWriter.writeNull();
        } else if (bool.booleanValue()) {
            jsonWriter.writeAscii("true");
        } else {
            jsonWriter.writeAscii("false");
        }
    }

    public static void deserializeCollection(JsonReader jsonReader, Collection<Boolean> collection) {
        jsonReader.deserializeCollection(READER, collection);
    }

    public static void deserializeNullableCollection(JsonReader jsonReader, Collection<Boolean> collection) {
        jsonReader.deserializeNullableCollection(READER, collection);
    }

    public static void serialize(boolean[] zArr, JsonWriter jsonWriter) {
        if (zArr == null) {
            jsonWriter.writeNull();
        } else if (zArr.length == 0) {
            jsonWriter.writeAscii("[]");
        } else {
            jsonWriter.writeByte(JsonWriter.ARRAY_START);
            jsonWriter.writeAscii(zArr[0] ? "true" : "false");
            for (int i6 = 1; i6 < zArr.length; i6++) {
                jsonWriter.writeAscii(zArr[i6] ? ",true" : ",false");
            }
            jsonWriter.writeByte(JsonWriter.ARRAY_END);
        }
    }
}
