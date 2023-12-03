package com.bugsnag.android.repackaged.dslplatform.json;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
/* loaded from: classes.dex */
public abstract class UUIDConverter {
    public static final UUID MIN_UUID = new UUID(0, 0);
    public static final JsonReader.ReadObject<UUID> READER = new JsonReader.ReadObject<UUID>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.UUIDConverter.1
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public UUID read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            return UUIDConverter.deserialize(jsonReader);
        }
    };
    public static final JsonWriter.WriteObject<UUID> WRITER = new JsonWriter.WriteObject<UUID>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.UUIDConverter.2
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, UUID uuid) {
            UUIDConverter.serializeNullable(uuid, jsonWriter);
        }
    };
    private static final char[] Lookup = new char[256];
    private static final byte[] Values = new byte[55];

    static {
        int i6;
        int i10;
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = (i11 >> 4) & 15;
            int i13 = i11 & 15;
            char[] cArr = Lookup;
            if (i12 < 10) {
                i6 = i12 + 48;
            } else {
                i6 = (i12 + 97) - 10;
            }
            int i14 = i6 << 8;
            if (i13 < 10) {
                i10 = i13 + 48;
            } else {
                i10 = (i13 + 97) - 10;
            }
            cArr[i11] = (char) (i14 + i10);
        }
        for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
            int i15 = c10 - '0';
            Values[i15] = (byte) i15;
        }
        for (char c11 = 'a'; c11 <= 'f'; c11 = (char) (c11 + 1)) {
            Values[c11 - '0'] = (byte) ((c11 - 'a') + 10);
        }
        for (char c12 = 'A'; c12 <= 'F'; c12 = (char) (c12 + 1)) {
            Values[c12 - '0'] = (byte) ((c12 - 'A') + 10);
        }
    }

    public static UUID deserialize(JsonReader jsonReader) {
        int i6;
        char[] readSimpleQuote = jsonReader.readSimpleQuote();
        int currentIndex = jsonReader.getCurrentIndex() - jsonReader.getTokenStart();
        long j10 = 0;
        if (currentIndex == 37 && readSimpleQuote[8] == '-' && readSimpleQuote[13] == '-' && readSimpleQuote[18] == '-' && readSimpleQuote[23] == '-') {
            long j11 = 0;
            for (int i10 = 0; i10 < 8; i10++) {
                try {
                    j11 = (j11 << 4) + Values[readSimpleQuote[i10] - '0'];
                } catch (ArrayIndexOutOfBoundsException unused) {
                    return UUID.fromString(new String(readSimpleQuote, 0, 36));
                }
            }
            for (int i11 = 9; i11 < 13; i11++) {
                j11 = (j11 << 4) + Values[readSimpleQuote[i11] - '0'];
            }
            for (int i12 = 14; i12 < 18; i12++) {
                j11 = (j11 << 4) + Values[readSimpleQuote[i12] - '0'];
            }
            for (int i13 = 19; i13 < 23; i13++) {
                j10 = (j10 << 4) + Values[readSimpleQuote[i13] - '0'];
            }
            for (int i14 = 24; i14 < 36; i14++) {
                j10 = (j10 << 4) + Values[readSimpleQuote[i14] - '0'];
            }
            return new UUID(j11, j10);
        } else if (currentIndex == 33) {
            long j12 = 0;
            int i15 = 0;
            while (true) {
                if (i15 >= 16) {
                    break;
                }
                try {
                    j12 = (j12 << 4) + Values[readSimpleQuote[i15] - '0'];
                    i15++;
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    return UUID.fromString(new String(readSimpleQuote, 0, 32));
                }
                return UUID.fromString(new String(readSimpleQuote, 0, 32));
            }
            for (i6 = 16; i6 < 32; i6++) {
                j10 = (j10 << 4) + Values[readSimpleQuote[i6] - '0'];
            }
            return new UUID(j12, j10);
        } else {
            return UUID.fromString(new String(readSimpleQuote, 0, currentIndex - 1));
        }
    }

    public static ArrayList<UUID> deserializeCollection(JsonReader jsonReader) {
        return jsonReader.deserializeCollection(READER);
    }

    public static ArrayList<UUID> deserializeNullableCollection(JsonReader jsonReader) {
        return jsonReader.deserializeNullableCollection(READER);
    }

    public static void serialize(UUID uuid, JsonWriter jsonWriter) {
        serialize(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits(), jsonWriter);
    }

    public static void serializeNullable(UUID uuid, JsonWriter jsonWriter) {
        if (uuid == null) {
            jsonWriter.writeNull();
        } else {
            serialize(uuid, jsonWriter);
        }
    }

    public static void deserializeCollection(JsonReader jsonReader, Collection<UUID> collection) {
        jsonReader.deserializeCollection(READER, collection);
    }

    public static void deserializeNullableCollection(JsonReader jsonReader, Collection<UUID> collection) {
        jsonReader.deserializeNullableCollection(READER, collection);
    }

    public static void serialize(long j10, long j11, JsonWriter jsonWriter) {
        int i6 = (int) (j10 >> 32);
        int i10 = (int) j10;
        int i11 = (int) (j11 >> 32);
        int i12 = (int) j11;
        byte[] ensureCapacity = jsonWriter.ensureCapacity(38);
        int size = jsonWriter.size();
        ensureCapacity[size] = JsonWriter.QUOTE;
        char[] cArr = Lookup;
        char c10 = cArr[(i6 >> 24) & 255];
        ensureCapacity[size + 1] = (byte) (c10 >> '\b');
        ensureCapacity[size + 2] = (byte) c10;
        char c11 = cArr[(i6 >> 16) & 255];
        ensureCapacity[size + 3] = (byte) (c11 >> '\b');
        ensureCapacity[size + 4] = (byte) c11;
        char c12 = cArr[(i6 >> 8) & 255];
        ensureCapacity[size + 5] = (byte) (c12 >> '\b');
        ensureCapacity[size + 6] = (byte) c12;
        char c13 = cArr[i6 & 255];
        ensureCapacity[size + 7] = (byte) (c13 >> '\b');
        ensureCapacity[size + 8] = (byte) c13;
        ensureCapacity[size + 9] = 45;
        char c14 = cArr[(i10 >> 24) & 255];
        ensureCapacity[size + 10] = (byte) (c14 >> '\b');
        ensureCapacity[size + 11] = (byte) c14;
        char c15 = cArr[(i10 >> 16) & 255];
        ensureCapacity[size + 12] = (byte) (c15 >> '\b');
        ensureCapacity[size + 13] = (byte) c15;
        ensureCapacity[size + 14] = 45;
        char c16 = cArr[(i10 >> 8) & 255];
        ensureCapacity[size + 15] = (byte) (c16 >> '\b');
        ensureCapacity[size + 16] = (byte) c16;
        char c17 = cArr[i10 & 255];
        ensureCapacity[size + 17] = (byte) (c17 >> '\b');
        ensureCapacity[size + 18] = (byte) c17;
        ensureCapacity[size + 19] = 45;
        char c18 = cArr[(i11 >> 24) & 255];
        ensureCapacity[size + 20] = (byte) (c18 >> '\b');
        ensureCapacity[size + 21] = (byte) c18;
        char c19 = cArr[(i11 >> 16) & 255];
        ensureCapacity[size + 22] = (byte) (c19 >> '\b');
        ensureCapacity[size + 23] = (byte) c19;
        ensureCapacity[size + 24] = 45;
        char c20 = cArr[(i11 >> 8) & 255];
        ensureCapacity[size + 25] = (byte) (c20 >> '\b');
        ensureCapacity[size + 26] = (byte) c20;
        char c21 = cArr[i11 & 255];
        ensureCapacity[size + 27] = (byte) (c21 >> '\b');
        ensureCapacity[size + 28] = (byte) c21;
        char c22 = cArr[(i12 >> 24) & 255];
        ensureCapacity[size + 29] = (byte) (c22 >> '\b');
        ensureCapacity[size + 30] = (byte) c22;
        char c23 = cArr[(i12 >> 16) & 255];
        ensureCapacity[size + 31] = (byte) (c23 >> '\b');
        ensureCapacity[size + 32] = (byte) c23;
        char c24 = cArr[(i12 >> 8) & 255];
        ensureCapacity[size + 33] = (byte) (c24 >> '\b');
        ensureCapacity[size + 34] = (byte) c24;
        char c25 = cArr[i12 & 255];
        ensureCapacity[size + 35] = (byte) (c25 >> '\b');
        ensureCapacity[size + 36] = (byte) c25;
        ensureCapacity[size + 37] = JsonWriter.QUOTE;
        jsonWriter.advance(38);
    }
}
