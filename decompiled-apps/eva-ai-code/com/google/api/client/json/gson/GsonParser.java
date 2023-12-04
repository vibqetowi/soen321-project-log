package com.google.api.client.json.gson;

import com.facebook.internal.ServerProtocol;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import com.google.api.client.util.Preconditions;
import com.google.gson.stream.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* loaded from: classes7.dex */
class GsonParser extends JsonParser {
    private List<String> currentNameStack = new ArrayList();
    private String currentText;
    private JsonToken currentToken;
    private final GsonFactory factory;
    private final JsonReader reader;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GsonParser(GsonFactory gsonFactory, JsonReader jsonReader) {
        this.factory = gsonFactory;
        this.reader = jsonReader;
        jsonReader.setLenient(true);
    }

    @Override // com.google.api.client.json.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.reader.close();
    }

    @Override // com.google.api.client.json.JsonParser
    public String getCurrentName() {
        if (this.currentNameStack.isEmpty()) {
            return null;
        }
        List<String> list = this.currentNameStack;
        return list.get(list.size() - 1);
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonToken getCurrentToken() {
        return this.currentToken;
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonFactory getFactory() {
        return this.factory;
    }

    @Override // com.google.api.client.json.JsonParser
    public byte getByteValue() {
        checkNumber();
        return Byte.parseByte(this.currentText);
    }

    @Override // com.google.api.client.json.JsonParser
    public short getShortValue() {
        checkNumber();
        return Short.parseShort(this.currentText);
    }

    @Override // com.google.api.client.json.JsonParser
    public int getIntValue() {
        checkNumber();
        return Integer.parseInt(this.currentText);
    }

    @Override // com.google.api.client.json.JsonParser
    public float getFloatValue() {
        checkNumber();
        return Float.parseFloat(this.currentText);
    }

    @Override // com.google.api.client.json.JsonParser
    public BigInteger getBigIntegerValue() {
        checkNumber();
        return new BigInteger(this.currentText);
    }

    @Override // com.google.api.client.json.JsonParser
    public BigDecimal getDecimalValue() {
        checkNumber();
        return new BigDecimal(this.currentText);
    }

    @Override // com.google.api.client.json.JsonParser
    public double getDoubleValue() {
        checkNumber();
        return Double.parseDouble(this.currentText);
    }

    @Override // com.google.api.client.json.JsonParser
    public long getLongValue() {
        checkNumber();
        return Long.parseLong(this.currentText);
    }

    private void checkNumber() {
        Preconditions.checkArgument(this.currentToken == JsonToken.VALUE_NUMBER_INT || this.currentToken == JsonToken.VALUE_NUMBER_FLOAT);
    }

    @Override // com.google.api.client.json.JsonParser
    public String getText() {
        return this.currentText;
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonToken nextToken() throws IOException {
        com.google.gson.stream.JsonToken jsonToken;
        if (this.currentToken != null) {
            int i = AnonymousClass1.$SwitchMap$com$google$api$client$json$JsonToken[this.currentToken.ordinal()];
            if (i == 1) {
                this.reader.beginArray();
                this.currentNameStack.add(null);
            } else if (i == 2) {
                this.reader.beginObject();
                this.currentNameStack.add(null);
            }
        }
        try {
            jsonToken = this.reader.peek();
        } catch (EOFException unused) {
            jsonToken = com.google.gson.stream.JsonToken.END_DOCUMENT;
        }
        switch (AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()]) {
            case 1:
                this.currentText = "[";
                this.currentToken = JsonToken.START_ARRAY;
                break;
            case 2:
                this.currentText = "]";
                this.currentToken = JsonToken.END_ARRAY;
                List<String> list = this.currentNameStack;
                list.remove(list.size() - 1);
                this.reader.endArray();
                break;
            case 3:
                this.currentText = "{";
                this.currentToken = JsonToken.START_OBJECT;
                break;
            case 4:
                this.currentText = "}";
                this.currentToken = JsonToken.END_OBJECT;
                List<String> list2 = this.currentNameStack;
                list2.remove(list2.size() - 1);
                this.reader.endObject();
                break;
            case 5:
                if (this.reader.nextBoolean()) {
                    this.currentText = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE;
                    this.currentToken = JsonToken.VALUE_TRUE;
                    break;
                } else {
                    this.currentText = "false";
                    this.currentToken = JsonToken.VALUE_FALSE;
                    break;
                }
            case 6:
                this.currentText = AbstractJsonLexerKt.NULL;
                this.currentToken = JsonToken.VALUE_NULL;
                this.reader.nextNull();
                break;
            case 7:
                this.currentText = this.reader.nextString();
                this.currentToken = JsonToken.VALUE_STRING;
                break;
            case 8:
                String nextString = this.reader.nextString();
                this.currentText = nextString;
                this.currentToken = nextString.indexOf(46) == -1 ? JsonToken.VALUE_NUMBER_INT : JsonToken.VALUE_NUMBER_FLOAT;
                break;
            case 9:
                this.currentText = this.reader.nextName();
                this.currentToken = JsonToken.FIELD_NAME;
                List<String> list3 = this.currentNameStack;
                list3.set(list3.size() - 1, this.currentText);
                break;
            default:
                this.currentText = null;
                this.currentToken = null;
                break;
        }
        return this.currentToken;
    }

    /* renamed from: com.google.api.client.json.gson.GsonParser$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$api$client$json$JsonToken;
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[com.google.gson.stream.JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[com.google.gson.stream.JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            $SwitchMap$com$google$api$client$json$JsonToken = iArr2;
            try {
                iArr2[JsonToken.START_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$api$client$json$JsonToken[JsonToken.START_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonParser skipChildren() throws IOException {
        if (this.currentToken != null) {
            int i = AnonymousClass1.$SwitchMap$com$google$api$client$json$JsonToken[this.currentToken.ordinal()];
            if (i == 1) {
                this.reader.skipValue();
                this.currentText = "]";
                this.currentToken = JsonToken.END_ARRAY;
            } else if (i == 2) {
                this.reader.skipValue();
                this.currentText = "}";
                this.currentToken = JsonToken.END_OBJECT;
            }
        }
        return this;
    }
}
