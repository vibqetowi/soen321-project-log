package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.modules.SerializersModule;
/* compiled from: StreamingJsonEncoder.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0002\u0010\u000bB/\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0012H\u0016J\u0010\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020(H\u0016J\u0018\u0010)\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010.\u001a\u00020!2\u0006\u0010\"\u001a\u00020/H\u0016J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001fH\u0016J\u0010\u00103\u001a\u00020!2\u0006\u0010\"\u001a\u00020+H\u0016J\u0010\u00104\u001a\u00020!2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020!2\u0006\u0010\"\u001a\u000208H\u0016J\b\u00109\u001a\u00020!H\u0016J?\u0010:\u001a\u00020!\"\b\b\u0000\u0010;*\u00020<2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002H;0>2\b\u0010\"\u001a\u0004\u0018\u0001H;H\u0016¢\u0006\u0002\u0010?J)\u0010@\u001a\u00020!\"\u0004\b\u0000\u0010;2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002H;0>2\u0006\u0010\"\u001a\u0002H;H\u0016¢\u0006\u0002\u0010AJ\u0010\u0010B\u001a\u00020!2\u0006\u0010\"\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0016J\u0010\u0010E\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010F\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010G\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006H"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/AbstractEncoder;", "output", "Lkotlinx/serialization/json/internal/JsonStringBuilder;", "json", "Lkotlinx/serialization/json/Json;", RtspHeaders.Values.MODE, "Lkotlinx/serialization/json/internal/WriteMode;", "modeReuseCache", "", "(Lkotlinx/serialization/json/internal/JsonStringBuilder;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/JsonEncoder;)V", "composer", "Lkotlinx/serialization/json/internal/Composer;", "(Lkotlinx/serialization/json/internal/Composer;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/JsonEncoder;)V", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "forceQuoting", "", "getJson", "()Lkotlinx/serialization/json/Json;", "[Lkotlinx/serialization/json/JsonEncoder;", "polymorphicDiscriminator", "", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeEncoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "encodeBoolean", "", "value", "encodeByte", "", "encodeChar", "", "encodeDouble", "", "encodeElement", FirebaseAnalytics.Param.INDEX, "", "encodeEnum", "enumDescriptor", "encodeFloat", "", "encodeInline", "Lkotlinx/serialization/encoding/Encoder;", "inlineDescriptor", "encodeInt", "encodeJsonElement", "element", "Lkotlinx/serialization/json/JsonElement;", "encodeLong", "", "encodeNull", "encodeNullableSerializableElement", ExifInterface.GPS_DIRECTION_TRUE, "", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeSerializableValue", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeShort", "", "encodeString", "encodeTypeInfo", "endStructure", "shouldEncodeElementDefault", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StreamingJsonEncoder extends AbstractEncoder implements JsonEncoder {
    private final Composer composer;
    private final JsonConfiguration configuration;
    private boolean forceQuoting;
    private final Json json;
    private final WriteMode mode;
    private final JsonEncoder[] modeReuseCache;
    private String polymorphicDiscriminator;
    private final SerializersModule serializersModule;

    /* compiled from: StreamingJsonEncoder.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            iArr[WriteMode.LIST.ordinal()] = 1;
            iArr[WriteMode.MAP.ordinal()] = 2;
            iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public Json getJson() {
        return this.json;
    }

    public StreamingJsonEncoder(Composer composer, Json json, WriteMode mode, JsonEncoder[] jsonEncoderArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.composer = composer;
        this.json = json;
        this.mode = mode;
        this.modeReuseCache = jsonEncoderArr;
        this.serializersModule = getJson().getSerializersModule();
        this.configuration = getJson().getConfiguration();
        int ordinal = mode.ordinal();
        if (jsonEncoderArr != null) {
            JsonEncoder jsonEncoder = jsonEncoderArr[ordinal];
            if (jsonEncoder == null && jsonEncoder == this) {
                return;
            }
            jsonEncoderArr[ordinal] = this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamingJsonEncoder(JsonStringBuilder output, Json json, WriteMode mode, JsonEncoder[] modeReuseCache) {
        this(ComposersKt.Composer(output, json), json, mode, modeReuseCache);
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        encodeSerializableValue(JsonElementSerializer.INSTANCE, element);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(SerializationStrategy<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        StreamingJsonEncoder streamingJsonEncoder = this;
        if (!(serializer instanceof AbstractPolymorphicSerializer) || streamingJsonEncoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(streamingJsonEncoder, t);
            return;
        }
        AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) serializer;
        String classDiscriminator = PolymorphicKt.classDiscriminator(serializer.getDescriptor(), streamingJsonEncoder.getJson());
        StreamingJsonEncoder streamingJsonEncoder2 = streamingJsonEncoder;
        if (t == 0) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        SerializationStrategy findPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, streamingJsonEncoder2, t);
        PolymorphicKt.access$validateIfSealed(abstractPolymorphicSerializer, findPolymorphicSerializer, classDiscriminator);
        PolymorphicKt.checkKind(findPolymorphicSerializer.getDescriptor().getKind());
        this.polymorphicDiscriminator = classDiscriminator;
        findPolymorphicSerializer.serialize(streamingJsonEncoder2, t);
    }

    private final void encodeTypeInfo(SerialDescriptor serialDescriptor) {
        this.composer.nextItem();
        String str = this.polymorphicDiscriminator;
        Intrinsics.checkNotNull(str);
        encodeString(str);
        this.composer.print(AbstractJsonLexerKt.COLON);
        this.composer.space();
        encodeString(serialDescriptor.getSerialName());
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        JsonEncoder streamingJsonEncoder;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        WriteMode switchMode = WriteModeKt.switchMode(getJson(), descriptor);
        if (switchMode.begin != 0) {
            this.composer.print(switchMode.begin);
            this.composer.indent();
        }
        if (this.polymorphicDiscriminator != null) {
            encodeTypeInfo(descriptor);
            this.polymorphicDiscriminator = null;
        }
        if (this.mode == switchMode) {
            return this;
        }
        JsonEncoder[] jsonEncoderArr = this.modeReuseCache;
        if (jsonEncoderArr == null || (streamingJsonEncoder = jsonEncoderArr[switchMode.ordinal()]) == null) {
            streamingJsonEncoder = new StreamingJsonEncoder(this.composer, getJson(), switchMode, this.modeReuseCache);
        }
        return streamingJsonEncoder;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.mode.end != 0) {
            this.composer.unIndent();
            this.composer.nextItem();
            this.composer.print(this.mode.end);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    public boolean encodeElement(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i2 != 1) {
            boolean z = false;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (!this.composer.getWritingFirst()) {
                        this.composer.print(',');
                    }
                    this.composer.nextItem();
                    encodeString(descriptor.getElementName(i));
                    this.composer.print(AbstractJsonLexerKt.COLON);
                    this.composer.space();
                } else {
                    if (i == 0) {
                        this.forceQuoting = true;
                    }
                    if (i == 1) {
                        this.composer.print(',');
                        this.composer.space();
                        this.forceQuoting = false;
                    }
                }
            } else if (!this.composer.getWritingFirst()) {
                if (i % 2 == 0) {
                    this.composer.print(',');
                    this.composer.nextItem();
                    z = true;
                } else {
                    this.composer.print(AbstractJsonLexerKt.COLON);
                    this.composer.space();
                }
                this.forceQuoting = z;
            } else {
                this.forceQuoting = true;
                this.composer.nextItem();
            }
        } else {
            if (!this.composer.getWritingFirst()) {
                this.composer.print(',');
            }
            this.composer.nextItem();
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeNullableSerializableElement(SerialDescriptor descriptor, int i, SerializationStrategy<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (t != null || this.configuration.getExplicitNulls()) {
            super.encodeNullableSerializableElement(descriptor, i, serializer, t);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public Encoder encodeInline(SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor)) {
            return new StreamingJsonEncoder(new ComposerForUnsignedNumbers(this.composer.sb), getJson(), this.mode, (JsonEncoder[]) null);
        }
        return super.encodeInline(inlineDescriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        this.composer.print(AbstractJsonLexerKt.NULL);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean z) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(z));
        } else {
            this.composer.print(z);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte b) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) b));
        } else {
            this.composer.print(b);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeShort(short s) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) s));
        } else {
            this.composer.print(s);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeInt(int i) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(i));
        } else {
            this.composer.print(i);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeLong(long j) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(j));
        } else {
            this.composer.print(j);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float f) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(f));
        } else {
            this.composer.print(f);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (!((Float.isInfinite(f) || Float.isNaN(f)) ? false : true)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(f), this.composer.sb.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double d) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(d));
        } else {
            this.composer.print(d);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (!((Double.isInfinite(d) || Double.isNaN(d)) ? false : true)) {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(d), this.composer.sb.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeChar(char c) {
        encodeString(String.valueOf(c));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.composer.printQuoted(value);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeEnum(SerialDescriptor enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeString(enumDescriptor.getElementName(i));
    }
}
