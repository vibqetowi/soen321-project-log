package kotlinx.serialization;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;
/* compiled from: Serializers.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001a\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b\u001a\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0018\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a?\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¢\u0006\u0002\b\u000f\u001a1\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0002\b\u0012\u001aB\u0010\u0013\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\u0014\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\nH\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\fH\u0007\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\bH\u0086\b\u001a\u001a\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005\u001a+\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002¢\u0006\u0002\b\u0017\u001a$\u0010\u0006\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\fH\u0007\u001a\u001c\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0018"}, d2 = {"serializer", "Lkotlinx/serialization/KSerializer;", ExifInterface.GPS_DIRECTION_TRUE, "", "type", "Lkotlin/reflect/KType;", "serializerOrNull", "builtinSerializer", "Lkotlinx/serialization/modules/SerializersModule;", "typeArguments", "", "rootClass", "Lkotlin/reflect/KClass;", "failOnMissingTypeArgSerializer", "", "builtinSerializer$SerializersKt__SerializersKt", "nullable", "shouldBeNullable", "nullable$SerializersKt__SerializersKt", "reflectiveOrContextual", "kClass", "typeArgumentsSerializers", "serializerByKTypeImpl", "serializerByKTypeImpl$SerializersKt__SerializersKt", "kotlinx-serialization-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
/* loaded from: classes5.dex */
public final /* synthetic */ class SerializersKt__SerializersKt {
    public static final /* synthetic */ <T> KSerializer<T> serializer(SerializersModule serializersModule) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        return SerializersKt.serializer(serializersModule, (KType) null);
    }

    public static final KSerializer<Object> serializer(KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(SerializersModuleKt.getEmptySerializersModule(), type);
    }

    public static final KSerializer<Object> serializerOrNull(KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializerOrNull(SerializersModuleKt.getEmptySerializersModule(), type);
    }

    public static final KSerializer<Object> serializer(SerializersModule serializersModule, KType type) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer<Object> serializerByKTypeImpl$SerializersKt__SerializersKt = serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, type, true);
        if (serializerByKTypeImpl$SerializersKt__SerializersKt != null) {
            return serializerByKTypeImpl$SerializersKt__SerializersKt;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(type));
        throw new KotlinNothingValueException();
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule serializersModule, KType type) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, type, false);
    }

    private static final KSerializer<Object> serializerByKTypeImpl$SerializersKt__SerializersKt(SerializersModule serializersModule, KType kType, boolean z) {
        KSerializer<? extends Object> builtinSerializer$SerializersKt__SerializersKt;
        KClass<Object> kclass = Platform_commonKt.kclass(kType);
        boolean isMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
        for (KTypeProjection kTypeProjection : arguments) {
            KType type = kTypeProjection.getType();
            if (type == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kType).toString());
            }
            arrayList.add(type);
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            builtinSerializer$SerializersKt__SerializersKt = SerializersKt.serializerOrNull(kclass);
            if (builtinSerializer$SerializersKt__SerializersKt == null) {
                builtinSerializer$SerializersKt__SerializersKt = SerializersModule.getContextual$default(serializersModule, kclass, null, 2, null);
            }
        } else {
            builtinSerializer$SerializersKt__SerializersKt = builtinSerializer$SerializersKt__SerializersKt(serializersModule, arrayList2, kclass, z);
        }
        if (builtinSerializer$SerializersKt__SerializersKt == null) {
            builtinSerializer$SerializersKt__SerializersKt = null;
        }
        if (builtinSerializer$SerializersKt__SerializersKt != null) {
            return nullable$SerializersKt__SerializersKt(builtinSerializer$SerializersKt__SerializersKt, isMarkedNullable);
        }
        return null;
    }

    private static final KSerializer<? extends Object> builtinSerializer$SerializersKt__SerializersKt(SerializersModule serializersModule, List<? extends KType> list, KClass<Object> kClass, boolean z) {
        ArrayList arrayList;
        if (z) {
            List<? extends KType> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (KType kType : list2) {
                arrayList2.add(SerializersKt.serializer(serializersModule, kType));
            }
            arrayList = arrayList2;
        } else {
            List<? extends KType> list3 = list;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (KType kType2 : list3) {
                KSerializer<Object> serializerOrNull = SerializersKt.serializerOrNull(serializersModule, kType2);
                if (serializerOrNull == null) {
                    return null;
                }
                arrayList3.add(serializerOrNull);
            }
            arrayList = arrayList3;
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Collection.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            return new ArrayListSerializer((KSerializer) arrayList.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            return new HashSetSerializer((KSerializer) arrayList.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            return new LinkedHashSetSerializer((KSerializer) arrayList.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            return new HashMapSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) ? true : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            return new LinkedHashMapSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
            return BuiltinSerializersKt.MapEntrySerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
            return BuiltinSerializersKt.PairSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Triple.class))) {
            return BuiltinSerializersKt.TripleSerializer((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
        }
        if (PlatformKt.isReferenceArray(kClass)) {
            KClassifier classifier = list.get(0).getClassifier();
            if (classifier != null) {
                return BuiltinSerializersKt.ArraySerializer((KClass) classifier, (KSerializer) arrayList.get(0));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        }
        Object[] array = arrayList.toArray(new KSerializer[0]);
        if (array != null) {
            KSerializer[] kSerializerArr = (KSerializer[]) array;
            KSerializer<? extends Object> constructSerializerForGivenTypeArgs = PlatformKt.constructSerializerForGivenTypeArgs(kClass, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            return constructSerializerForGivenTypeArgs == null ? SerializersKt.reflectiveOrContextual(serializersModule, kClass, arrayList) : constructSerializerForGivenTypeArgs;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final <T> KSerializer<T> reflectiveOrContextual(SerializersModule serializersModule, KClass<T> kClass, List<? extends KSerializer<Object>> typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        KSerializer<T> serializerOrNull = SerializersKt.serializerOrNull(kClass);
        return serializerOrNull == null ? serializersModule.getContextual(kClass, typeArgumentsSerializers) : serializerOrNull;
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializer(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        KSerializer<T> serializerOrNull = SerializersKt.serializerOrNull(kClass);
        if (serializerOrNull != null) {
            return serializerOrNull;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializerOrNull(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        KSerializer<T> compiledSerializerImpl = PlatformKt.compiledSerializerImpl(kClass);
        return compiledSerializerImpl == null ? PrimitivesKt.builtinSerializerOrNull(kClass) : compiledSerializerImpl;
    }

    private static final <T> KSerializer<T> nullable$SerializersKt__SerializersKt(KSerializer<T> kSerializer, boolean z) {
        return z ? BuiltinSerializersKt.getNullable(kSerializer) : kSerializer;
    }
}
