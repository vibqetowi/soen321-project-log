package kotlinx.serialization;

import androidx.exifinterface.media.ExifInterface;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
/* compiled from: SealedSerializer.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003BW\b\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00070\t\u0012\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0002\u0010\u000eBG\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00070\t\u0012\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b0\t¢\u0006\u0002\u0010\u000fJ$\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0016J%\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010&R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R*\u0010\u0014\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlinx/serialization/SealedClassSerializer;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "serialName", "", "baseClass", "Lkotlin/reflect/KClass;", "subclasses", "", "subclassSerializers", "Lkotlinx/serialization/KSerializer;", "classAnnotations", "", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;[Ljava/lang/annotation/Annotation;)V", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)V", "_annotations", "", "getBaseClass", "()Lkotlin/reflect/KClass;", "class2Serializer", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lkotlin/Lazy;", "serialName2Serializer", "findPolymorphicSerializerOrNull", "Lkotlinx/serialization/DeserializationStrategy;", "decoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "klassName", "Lkotlinx/serialization/SerializationStrategy;", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@InternalSerializationApi
/* loaded from: classes5.dex */
public final class SealedClassSerializer<T> extends AbstractPolymorphicSerializer<T> {
    private List<? extends Annotation> _annotations;
    private final KClass<T> baseClass;
    private final Map<KClass<? extends T>, KSerializer<? extends T>> class2Serializer;
    private final Lazy descriptor$delegate;
    private final Map<String, KSerializer<? extends T>> serialName2Serializer;

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public KClass<T> getBaseClass() {
        return this.baseClass;
    }

    public SealedClassSerializer(String serialName, KClass<T> baseClass, KClass<? extends T>[] subclasses, KSerializer<? extends T>[] subclassSerializers) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        this.baseClass = baseClass;
        this._annotations = CollectionsKt.emptyList();
        this.descriptor$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new SealedClassSerializer$descriptor$2(serialName, this, subclassSerializers));
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + getBaseClass().getSimpleName() + " should be marked @Serializable");
        }
        Map<KClass<? extends T>, KSerializer<? extends T>> map = MapsKt.toMap(ArraysKt.zip(subclasses, subclassSerializers));
        this.class2Serializer = map;
        final Set<Map.Entry<KClass<? extends T>, KSerializer<? extends T>>> entrySet = map.entrySet();
        Grouping<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>, String> grouping = new Grouping<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>, String>() { // from class: kotlinx.serialization.SealedClassSerializer$special$$inlined$groupingBy$1
            @Override // kotlin.collections.Grouping
            public Iterator<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>> sourceIterator() {
                return entrySet.iterator();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.Grouping
            public String keyOf(Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> entry) {
                return ((KSerializer) entry.getValue()).getDescriptor().getSerialName();
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>> sourceIterator = grouping.sourceIterator();
        while (sourceIterator.hasNext()) {
            Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> next = sourceIterator.next();
            String keyOf = grouping.keyOf(next);
            Object obj = linkedHashMap.get(keyOf);
            if (obj == null) {
                linkedHashMap.containsKey(keyOf);
            }
            Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> entry = next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str = keyOf;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + getBaseClass() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(keyOf, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.serialName2Serializer = linkedHashMap2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SealedClassSerializer(String serialName, KClass<T> baseClass, KClass<? extends T>[] subclasses, KSerializer<? extends T>[] subclassSerializers, Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this._annotations = ArraysKt.asList(classAnnotations);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public DeserializationStrategy<? extends T> findPolymorphicSerializerOrNull(CompositeDecoder decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        KSerializer<? extends T> kSerializer = this.serialName2Serializer.get(str);
        return kSerializer != null ? kSerializer : super.findPolymorphicSerializerOrNull(decoder, str);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public SerializationStrategy<T> findPolymorphicSerializerOrNull(Encoder encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        KSerializer<? extends T> kSerializer = this.class2Serializer.get(Reflection.getOrCreateKotlinClass(value.getClass()));
        KSerializer<? extends T> findPolymorphicSerializerOrNull = kSerializer != null ? kSerializer : super.findPolymorphicSerializerOrNull(encoder, (Encoder) value);
        if (findPolymorphicSerializerOrNull != null) {
            return findPolymorphicSerializerOrNull;
        }
        return null;
    }
}
