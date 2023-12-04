package kotlinx.serialization.json;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.modules.SerializersModule;
/* compiled from: Json.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n\u001a\"\u0010\u000b\u001a\u0002H\f\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0086\b¢\u0006\u0002\u0010\u000f\u001a\"\u0010\u0010\u001a\u00020\u000e\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00042\u0006\u0010\u0011\u001a\u0002H\fH\u0086\b¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"defaultDiscriminator", "", "defaultIndent", "Json", "Lkotlinx/serialization/json/Json;", "from", "builderAction", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonBuilder;", "", "Lkotlin/ExtensionFunctionType;", "decodeFromJsonElement", ExifInterface.GPS_DIRECTION_TRUE, "json", "Lkotlinx/serialization/json/JsonElement;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "encodeToJsonElement", "value", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonKt {
    private static final String defaultDiscriminator = "type";
    private static final String defaultIndent = "    ";

    public static /* synthetic */ Json Json$default(Json json, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            json = Json.Default;
        }
        return Json(json, function1);
    }

    public static final Json Json(Json from, Function1<? super JsonBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        JsonBuilder jsonBuilder = new JsonBuilder(from);
        builderAction.invoke(jsonBuilder);
        return new JsonImpl(jsonBuilder.build$kotlinx_serialization_json(), jsonBuilder.getSerializersModule());
    }

    public static final /* synthetic */ <T> JsonElement encodeToJsonElement(Json json, T t) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return json.encodeToJsonElement(SerializersKt.serializer(serializersModule, (KType) null), t);
    }

    public static final /* synthetic */ <T> T decodeFromJsonElement(Json json, JsonElement json2) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(json2, "json");
        SerializersModule serializersModule = json.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) json.decodeFromJsonElement(SerializersKt.serializer(serializersModule, (KType) null), json2);
    }
}
