package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.modules.SerializersModule;
/* compiled from: Json.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u00107\u001a\u000208H\u0000¢\u0006\u0002\b9R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR$\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR\u001a\u0010\u001f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\b\"\u0004\b!\u0010\nR\u001a\u0010\"\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\b\"\u0004\b#\u0010\nR\u001a\u0010$\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\b\"\u0004\b&\u0010\nR$\u0010'\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\b\"\u0004\b3\u0010\nR\u001a\u00104\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\b\"\u0004\b6\u0010\n¨\u0006:"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "json", "Lkotlinx/serialization/json/Json;", "(Lkotlinx/serialization/json/Json;)V", "allowSpecialFloatingPointValues", "", "getAllowSpecialFloatingPointValues", "()Z", "setAllowSpecialFloatingPointValues", "(Z)V", "allowStructuredMapKeys", "getAllowStructuredMapKeys", "setAllowStructuredMapKeys", "classDiscriminator", "", "getClassDiscriminator", "()Ljava/lang/String;", "setClassDiscriminator", "(Ljava/lang/String;)V", "coerceInputValues", "getCoerceInputValues", "setCoerceInputValues", "encodeDefaults", "getEncodeDefaults", "setEncodeDefaults", "explicitNulls", "getExplicitNulls$annotations", "()V", "getExplicitNulls", "setExplicitNulls", "ignoreUnknownKeys", "getIgnoreUnknownKeys", "setIgnoreUnknownKeys", "isLenient", "setLenient", "prettyPrint", "getPrettyPrint", "setPrettyPrint", "prettyPrintIndent", "getPrettyPrintIndent$annotations", "getPrettyPrintIndent", "setPrettyPrintIndent", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "setSerializersModule", "(Lkotlinx/serialization/modules/SerializersModule;)V", "useAlternativeNames", "getUseAlternativeNames", "setUseAlternativeNames", "useArrayPolymorphism", "getUseArrayPolymorphism", "setUseArrayPolymorphism", "build", "Lkotlinx/serialization/json/JsonConfiguration;", "build$kotlinx_serialization_json", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonBuilder {
    private boolean allowSpecialFloatingPointValues;
    private boolean allowStructuredMapKeys;
    private String classDiscriminator;
    private boolean coerceInputValues;
    private boolean encodeDefaults;
    private boolean explicitNulls;
    private boolean ignoreUnknownKeys;
    private boolean isLenient;
    private boolean prettyPrint;
    private String prettyPrintIndent;
    private SerializersModule serializersModule;
    private boolean useAlternativeNames;
    private boolean useArrayPolymorphism;

    @ExperimentalSerializationApi
    public static /* synthetic */ void getExplicitNulls$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getPrettyPrintIndent$annotations() {
    }

    public JsonBuilder(Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.encodeDefaults = json.getConfiguration().getEncodeDefaults();
        this.explicitNulls = json.getConfiguration().getExplicitNulls();
        this.ignoreUnknownKeys = json.getConfiguration().getIgnoreUnknownKeys();
        this.isLenient = json.getConfiguration().isLenient();
        this.allowStructuredMapKeys = json.getConfiguration().getAllowStructuredMapKeys();
        this.prettyPrint = json.getConfiguration().getPrettyPrint();
        this.prettyPrintIndent = json.getConfiguration().getPrettyPrintIndent();
        this.coerceInputValues = json.getConfiguration().getCoerceInputValues();
        this.useArrayPolymorphism = json.getConfiguration().getUseArrayPolymorphism();
        this.classDiscriminator = json.getConfiguration().getClassDiscriminator();
        this.allowSpecialFloatingPointValues = json.getConfiguration().getAllowSpecialFloatingPointValues();
        this.useAlternativeNames = json.getConfiguration().getUseAlternativeNames();
        this.serializersModule = json.getSerializersModule();
    }

    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    public final void setEncodeDefaults(boolean z) {
        this.encodeDefaults = z;
    }

    public final boolean getExplicitNulls() {
        return this.explicitNulls;
    }

    public final void setExplicitNulls(boolean z) {
        this.explicitNulls = z;
    }

    public final boolean getIgnoreUnknownKeys() {
        return this.ignoreUnknownKeys;
    }

    public final void setIgnoreUnknownKeys(boolean z) {
        this.ignoreUnknownKeys = z;
    }

    public final boolean isLenient() {
        return this.isLenient;
    }

    public final void setLenient(boolean z) {
        this.isLenient = z;
    }

    public final boolean getAllowStructuredMapKeys() {
        return this.allowStructuredMapKeys;
    }

    public final void setAllowStructuredMapKeys(boolean z) {
        this.allowStructuredMapKeys = z;
    }

    public final boolean getPrettyPrint() {
        return this.prettyPrint;
    }

    public final void setPrettyPrint(boolean z) {
        this.prettyPrint = z;
    }

    public final String getPrettyPrintIndent() {
        return this.prettyPrintIndent;
    }

    public final void setPrettyPrintIndent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.prettyPrintIndent = str;
    }

    public final boolean getCoerceInputValues() {
        return this.coerceInputValues;
    }

    public final void setCoerceInputValues(boolean z) {
        this.coerceInputValues = z;
    }

    public final boolean getUseArrayPolymorphism() {
        return this.useArrayPolymorphism;
    }

    public final void setUseArrayPolymorphism(boolean z) {
        this.useArrayPolymorphism = z;
    }

    public final String getClassDiscriminator() {
        return this.classDiscriminator;
    }

    public final void setClassDiscriminator(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.classDiscriminator = str;
    }

    public final boolean getAllowSpecialFloatingPointValues() {
        return this.allowSpecialFloatingPointValues;
    }

    public final void setAllowSpecialFloatingPointValues(boolean z) {
        this.allowSpecialFloatingPointValues = z;
    }

    public final boolean getUseAlternativeNames() {
        return this.useAlternativeNames;
    }

    public final void setUseAlternativeNames(boolean z) {
        this.useAlternativeNames = z;
    }

    public final SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    public final void setSerializersModule(SerializersModule serializersModule) {
        Intrinsics.checkNotNullParameter(serializersModule, "<set-?>");
        this.serializersModule = serializersModule;
    }

    public final JsonConfiguration build$kotlinx_serialization_json() {
        if (!this.useArrayPolymorphism || Intrinsics.areEqual(this.classDiscriminator, "type")) {
            if (!this.prettyPrint) {
                if (!Intrinsics.areEqual(this.prettyPrintIndent, "    ")) {
                    throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
                }
            } else if (!Intrinsics.areEqual(this.prettyPrintIndent, "    ")) {
                String str = this.prettyPrintIndent;
                boolean z = false;
                int i = 0;
                while (true) {
                    boolean z2 = true;
                    if (i >= str.length()) {
                        z = true;
                        break;
                    }
                    char charAt = str.charAt(i);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        z2 = false;
                    }
                    if (!z2) {
                        break;
                    }
                    i++;
                }
                if (!z) {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.prettyPrintIndent).toString());
                }
            }
            return new JsonConfiguration(this.encodeDefaults, this.ignoreUnknownKeys, this.isLenient, this.allowStructuredMapKeys, this.prettyPrint, this.explicitNulls, this.prettyPrintIndent, this.coerceInputValues, this.useArrayPolymorphism, this.classDiscriminator, this.allowSpecialFloatingPointValues, this.useAlternativeNames);
        }
        throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
    }
}
