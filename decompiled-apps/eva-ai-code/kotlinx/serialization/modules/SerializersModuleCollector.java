package kotlinx.serialization.modules;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
/* compiled from: SerializersModuleCollector.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JQ\u0010\u0002\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062/\u0010\u0007\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\bH&J.\u0010\u0002\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00040\nH\u0016JF\u0010\u000f\u001a\u00020\u0003\"\b\b\u0000\u0010\u0010*\u00020\u0001\"\b\b\u0001\u0010\u0011*\u0002H\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00110\nH&JO\u0010\u0015\u001a\u00020\u0003\"\b\b\u0000\u0010\u0010*\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00062-\u0010\u0016\u001a)\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0018\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u0002H\u0010\u0018\u00010\u00190\bH\u0016JO\u0010\u001a\u001a\u00020\u0003\"\b\b\u0000\u0010\u0010*\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00062-\u0010\u0016\u001a)\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0018\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u0002H\u0010\u0018\u00010\u00190\bH'JK\u0010\u001b\u001a\u00020\u0003\"\b\b\u0000\u0010\u0010*\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00062)\u0010\u001c\u001a%\u0012\u0013\u0012\u0011H\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001d\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0010\u0018\u00010\u001e0\bH'¨\u0006\u001f"}, d2 = {"Lkotlinx/serialization/modules/SerializersModuleCollector;", "", "contextual", "", ExifInterface.GPS_DIRECTION_TRUE, "kClass", "Lkotlin/reflect/KClass;", "provider", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "serializer", "polymorphic", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "polymorphicDefault", "defaultDeserializerProvider", "", "className", "Lkotlinx/serialization/DeserializationStrategy;", "polymorphicDefaultDeserializer", "polymorphicDefaultSerializer", "defaultSerializerProvider", "value", "Lkotlinx/serialization/SerializationStrategy;", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalSerializationApi
/* loaded from: classes5.dex */
public interface SerializersModuleCollector {
    <T> void contextual(KClass<T> kClass, Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> function1);

    <T> void contextual(KClass<T> kClass, KSerializer<T> kSerializer);

    <Base, Sub extends Base> void polymorphic(KClass<Base> kClass, KClass<Sub> kClass2, KSerializer<Sub> kSerializer);

    <Base> void polymorphicDefault(KClass<Base> kClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> function1);

    @ExperimentalSerializationApi
    <Base> void polymorphicDefaultDeserializer(KClass<Base> kClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> function1);

    @ExperimentalSerializationApi
    <Base> void polymorphicDefaultSerializer(KClass<Base> kClass, Function1<? super Base, ? extends SerializationStrategy<? super Base>> function1);

    /* compiled from: SerializersModuleCollector.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static <T> void contextual(SerializersModuleCollector serializersModuleCollector, KClass<T> kClass, KSerializer<T> serializer) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            serializersModuleCollector.contextual(kClass, new SerializersModuleCollector$contextual$1(serializer));
        }

        public static <Base> void polymorphicDefault(SerializersModuleCollector serializersModuleCollector, KClass<Base> baseClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
            Intrinsics.checkNotNullParameter(baseClass, "baseClass");
            Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
            serializersModuleCollector.polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider);
        }
    }
}
