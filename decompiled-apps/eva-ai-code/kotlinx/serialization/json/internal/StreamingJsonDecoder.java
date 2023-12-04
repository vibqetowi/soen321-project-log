package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.modules.SerializersModule;
/* compiled from: StreamingJsonDecoder.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\nH\u0016J\b\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\nH\u0016J\b\u0010.\u001a\u00020\u000fH\u0016J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u000fH\u0002J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u000fH\u0002J\b\u00105\u001a\u00020\u001dH\u0016J\n\u00106\u001a\u0004\u0018\u000107H\u0016J\u0010\u00108\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0002J;\u00109\u001a\u0002H:\"\u0004\b\u0000\u0010:2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000f2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002H:0<2\b\u0010=\u001a\u0004\u0018\u0001H:H\u0016¢\u0006\u0002\u0010>J!\u0010?\u001a\u0002H:\"\u0004\b\u0000\u0010:2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002H:0<H\u0016¢\u0006\u0002\u0010@J\b\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020DH\u0002J\u0010\u0010F\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010G\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020DH\u0002J\u0010\u0010I\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006J"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "json", "Lkotlinx/serialization/json/Json;", RtspHeaders.Values.MODE, "Lkotlinx/serialization/json/internal/WriteMode;", "lexer", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/AbstractJsonLexer;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "currentIndex", "", "elementMarker", "Lkotlinx/serialization/json/internal/JsonElementMarker;", "getJson", "()Lkotlinx/serialization/json/Json;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "checkLeadingComma", "", "coerceInputValue", "", FirebaseAnalytics.Param.INDEX, "decodeBoolean", "decodeByte", "", "decodeChar", "", "decodeDouble", "", "decodeElementIndex", "decodeEnum", "enumDescriptor", "decodeFloat", "", "decodeInline", "Lkotlinx/serialization/encoding/Decoder;", "inlineDescriptor", "decodeInt", "decodeJsonElement", "Lkotlinx/serialization/json/JsonElement;", "decodeListIndex", "decodeLong", "", "decodeMapIndex", "decodeNotNullMark", "decodeNull", "", "decodeObjectIndex", "decodeSerializableElement", ExifInterface.GPS_DIRECTION_TRUE, "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "previousValue", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "decodeShort", "", "decodeString", "", "decodeStringKey", "endStructure", "handleUnknown", "key", "skipLeftoverElements", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public class StreamingJsonDecoder extends AbstractDecoder implements JsonDecoder {
    private final JsonConfiguration configuration;
    private int currentIndex;
    private final JsonElementMarker elementMarker;
    private final Json json;
    public final AbstractJsonLexer lexer;
    private final WriteMode mode;
    private final SerializersModule serializersModule;

    /* compiled from: StreamingJsonDecoder.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            iArr[WriteMode.LIST.ordinal()] = 1;
            iArr[WriteMode.MAP.ordinal()] = 2;
            iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            iArr[WriteMode.OBJ.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public final Json getJson() {
        return this.json;
    }

    public StreamingJsonDecoder(Json json, WriteMode mode, AbstractJsonLexer lexer, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.json = json;
        this.mode = mode;
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
        this.currentIndex = -1;
        JsonConfiguration configuration = json.getConfiguration();
        this.configuration = configuration;
        this.elementMarker = configuration.getExplicitNulls() ? null : new JsonElementMarker(descriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public JsonElement decodeJsonElement() {
        return new JsonTreeReader(this.json.getConfiguration(), this.lexer).read();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(DeserializationStrategy<T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            return (T) PolymorphicKt.decodeSerializableValuePolymorphic(this, deserializer);
        } catch (MissingFieldException e) {
            throw new MissingFieldException(e.getMessage() + " at path: " + this.lexer.path.getPath(), e);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        WriteMode switchMode = WriteModeKt.switchMode(this.json, descriptor);
        this.lexer.path.pushDescriptor(descriptor);
        this.lexer.consumeNextToken(switchMode.begin);
        checkLeadingComma();
        int i = WhenMappings.$EnumSwitchMapping$0[switchMode.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new StreamingJsonDecoder(this.json, switchMode, this.lexer, descriptor);
        }
        return (this.mode == switchMode && this.json.getConfiguration().getExplicitNulls()) ? this : new StreamingJsonDecoder(this.json, switchMode, this.lexer, descriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.json.getConfiguration().getIgnoreUnknownKeys() && descriptor.getElementsCount() == 0) {
            skipLeftoverElements(descriptor);
        }
        this.lexer.consumeNextToken(this.mode.end);
        this.lexer.path.popDescriptor();
    }

    private final void skipLeftoverElements(SerialDescriptor serialDescriptor) {
        do {
        } while (decodeElementIndex(serialDescriptor) != -1);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        JsonElementMarker jsonElementMarker = this.elementMarker;
        return !(jsonElementMarker != null ? jsonElementMarker.isUnmarkedNull$kotlinx_serialization_json() : false) && this.lexer.tryConsumeNotNull();
    }

    private final void checkLeadingComma() {
        if (this.lexer.peekNextToken() != 4) {
            return;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public <T> T decodeSerializableElement(SerialDescriptor descriptor, int i, DeserializationStrategy<T> deserializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z = this.mode == WriteMode.MAP && (i & 1) == 0;
        if (z) {
            this.lexer.path.resetCurrentMapKey();
        }
        T t2 = (T) super.decodeSerializableElement(descriptor, i, deserializer, t);
        if (z) {
            this.lexer.path.updateCurrentMapKey(t2);
        }
        return t2;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        int decodeMapIndex;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i == 2) {
            decodeMapIndex = decodeMapIndex();
        } else if (i == 4) {
            decodeMapIndex = decodeObjectIndex(descriptor);
        } else {
            decodeMapIndex = decodeListIndex();
        }
        if (this.mode != WriteMode.MAP) {
            this.lexer.path.updateDescriptorIndex(decodeMapIndex);
        }
        return decodeMapIndex;
    }

    private final int decodeMapIndex() {
        int i = this.currentIndex;
        boolean z = false;
        boolean z2 = i % 2 != 0;
        if (!z2) {
            this.lexer.consumeNextToken(AbstractJsonLexerKt.COLON);
        } else if (i != -1) {
            z = this.lexer.tryConsumeComma();
        }
        if (!this.lexer.canConsumeValue()) {
            if (z) {
                AbstractJsonLexer.fail$default(this.lexer, "Expected '}', but had ',' instead", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return -1;
        }
        if (z2) {
            if (this.currentIndex == -1) {
                AbstractJsonLexer abstractJsonLexer = this.lexer;
                boolean z3 = !z;
                int i2 = abstractJsonLexer.currentPosition;
                if (!z3) {
                    AbstractJsonLexer.fail$default(abstractJsonLexer, "Unexpected trailing comma", i2, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                AbstractJsonLexer abstractJsonLexer2 = this.lexer;
                int i3 = abstractJsonLexer2.currentPosition;
                if (!z) {
                    AbstractJsonLexer.fail$default(abstractJsonLexer2, "Expected comma after the key-value pair", i3, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i4 = this.currentIndex + 1;
        this.currentIndex = i4;
        return i4;
    }

    private final boolean coerceInputValue(SerialDescriptor serialDescriptor, int i) {
        String peekString;
        Json json = this.json;
        SerialDescriptor elementDescriptor = serialDescriptor.getElementDescriptor(i);
        if (elementDescriptor.isNullable() || !(!this.lexer.tryConsumeNotNull())) {
            if (Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) && (peekString = this.lexer.peekString(this.configuration.isLenient())) != null && JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, peekString) == -3) {
                this.lexer.consumeString();
                return true;
            }
            return false;
        }
        return true;
    }

    private final int decodeObjectIndex(SerialDescriptor serialDescriptor) {
        boolean z;
        boolean tryConsumeComma = this.lexer.tryConsumeComma();
        while (this.lexer.canConsumeValue()) {
            String decodeStringKey = decodeStringKey();
            this.lexer.consumeNextToken(AbstractJsonLexerKt.COLON);
            int jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(serialDescriptor, this.json, decodeStringKey);
            boolean z2 = false;
            if (jsonNameIndex == -3) {
                z2 = true;
                z = false;
            } else if (this.configuration.getCoerceInputValues() && coerceInputValue(serialDescriptor, jsonNameIndex)) {
                z = this.lexer.tryConsumeComma();
            } else {
                JsonElementMarker jsonElementMarker = this.elementMarker;
                if (jsonElementMarker != null) {
                    jsonElementMarker.mark$kotlinx_serialization_json(jsonNameIndex);
                }
                return jsonNameIndex;
            }
            tryConsumeComma = z2 ? handleUnknown(decodeStringKey) : z;
        }
        if (tryConsumeComma) {
            AbstractJsonLexer.fail$default(this.lexer, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        JsonElementMarker jsonElementMarker2 = this.elementMarker;
        if (jsonElementMarker2 != null) {
            return jsonElementMarker2.nextUnmarkedIndex$kotlinx_serialization_json();
        }
        return -1;
    }

    private final boolean handleUnknown(String str) {
        if (this.configuration.getIgnoreUnknownKeys()) {
            this.lexer.skipElement(this.configuration.isLenient());
        } else {
            this.lexer.failOnUnknownKey(str);
        }
        return this.lexer.tryConsumeComma();
    }

    private final int decodeListIndex() {
        boolean tryConsumeComma = this.lexer.tryConsumeComma();
        if (!this.lexer.canConsumeValue()) {
            if (tryConsumeComma) {
                AbstractJsonLexer.fail$default(this.lexer, "Unexpected trailing comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return -1;
        }
        int i = this.currentIndex;
        if (i != -1 && !tryConsumeComma) {
            AbstractJsonLexer.fail$default(this.lexer, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i2 = i + 1;
        this.currentIndex = i2;
        return i2;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        if (this.configuration.isLenient()) {
            return this.lexer.consumeBooleanLenient();
        }
        return this.lexer.consumeBoolean();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        byte b = (byte) consumeNumericLiteral;
        if (consumeNumericLiteral == b) {
            return b;
        }
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse byte for input '" + consumeNumericLiteral + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        short s = (short) consumeNumericLiteral;
        if (consumeNumericLiteral == s) {
            return s;
        }
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse short for input '" + consumeNumericLiteral + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        int i = (int) consumeNumericLiteral;
        if (consumeNumericLiteral == i) {
            return i;
        }
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse int for input '" + consumeNumericLiteral + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        return this.lexer.consumeNumericLiteral();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            float parseFloat = Float.parseFloat(consumeStringLenient);
            if (!this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                if (!((Float.isInfinite(parseFloat) || Float.isNaN(parseFloat)) ? false : true)) {
                    JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Float.valueOf(parseFloat));
                    throw new KotlinNothingValueException();
                }
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'float' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            double parseDouble = Double.parseDouble(consumeStringLenient);
            if (!this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                if (!((Double.isInfinite(parseDouble) || Double.isNaN(parseDouble)) ? false : true)) {
                    JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Double.valueOf(parseDouble));
                    throw new KotlinNothingValueException();
                }
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'double' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        String consumeStringLenient = this.lexer.consumeStringLenient();
        if (consumeStringLenient.length() != 1) {
            AbstractJsonLexer abstractJsonLexer = this.lexer;
            AbstractJsonLexer.fail$default(abstractJsonLexer, "Expected single char, but got '" + consumeStringLenient + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return consumeStringLenient.charAt(0);
    }

    private final String decodeStringKey() {
        if (this.configuration.isLenient()) {
            return this.lexer.consumeStringLenientNotNull();
        }
        return this.lexer.consumeKeyString();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public String decodeString() {
        if (this.configuration.isLenient()) {
            return this.lexer.consumeStringLenientNotNull();
        }
        return this.lexer.consumeString();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        return StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor) ? new JsonDecoderForUnsignedTypes(this.lexer, this.json) : super.decodeInline(inlineDescriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeEnum(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Json json = this.json;
        String decodeString = decodeString();
        return JsonNamesMapKt.getJsonNameIndexOrThrow(enumDescriptor, json, decodeString, " at path " + this.lexer.path.getPath());
    }
}
