package com.ifriend.presentation.extensions;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
/* compiled from: serializeobject.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001e\u0010\b\u001a\u0002H\t\"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0086\b¢\u0006\u0002\u0010\f\u001a\u001e\u0010\r\u001a\u00020\u000b\"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\u000e\u001a\u0002H\tH\u0086\b¢\u0006\u0002\u0010\u000f\"!\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"provideJson", "Lkotlinx/serialization/json/Json;", "getProvideJson$annotations", "()V", "getProvideJson", "()Lkotlinx/serialization/json/Json;", "provideJson$delegate", "Lkotlin/Lazy;", "deserializeObject", ExifInterface.GPS_DIRECTION_TRUE, "jsonString", "", "(Ljava/lang/String;)Ljava/lang/Object;", "serializeObject", "obj", "(Ljava/lang/Object;)Ljava/lang/String;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SerializeobjectKt {
    private static final Lazy provideJson$delegate = LazyKt.lazy(SerializeobjectKt$provideJson$2.INSTANCE);

    public static /* synthetic */ void getProvideJson$annotations() {
    }

    public static final Json getProvideJson() {
        return (Json) provideJson$delegate.getValue();
    }

    public static final /* synthetic */ <T> String serializeObject(T t) {
        Json provideJson = getProvideJson();
        SerializersModule serializersModule = provideJson.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return provideJson.encodeToString(SerializersKt.serializer(serializersModule, (KType) null), t);
    }

    public static final /* synthetic */ <T> T deserializeObject(String jsonString) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        Json provideJson = getProvideJson();
        SerializersModule serializersModule = provideJson.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) provideJson.decodeFromString(SerializersKt.serializer(serializersModule, (KType) null), jsonString);
    }
}
