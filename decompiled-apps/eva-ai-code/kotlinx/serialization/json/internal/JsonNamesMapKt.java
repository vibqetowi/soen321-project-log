package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
/* compiled from: JsonNamesMap.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u0018\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u00020\nH\u0000\u001a\u001c\u0010\u000b\u001a\u00020\u0004*\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0000\u001a&\u0010\u000f\u001a\u00020\u0004*\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u0000\u001aF\u0010\u0011\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u0013\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00152\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00152\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u0080\bø\u0001\u0000\".\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"JsonAlternativeNamesKey", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "", "", "", "getJsonAlternativeNamesKey$annotations", "()V", "getJsonAlternativeNamesKey", "()Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "buildAlternativeNamesMap", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getJsonNameIndex", "json", "Lkotlinx/serialization/json/Json;", "name", "getJsonNameIndexOrThrow", "suffix", "tryCoerceValue", "", "elementDescriptor", "peekNull", "Lkotlin/Function0;", "peekString", "onEnumCoercing", "", "kotlinx-serialization-json"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonNamesMapKt {
    private static final DescriptorSchemaCache.Key<Map<String, Integer>> JsonAlternativeNamesKey = new DescriptorSchemaCache.Key<>();

    public static /* synthetic */ void getJsonAlternativeNamesKey$annotations() {
    }

    public static final DescriptorSchemaCache.Key<Map<String, Integer>> getJsonAlternativeNamesKey() {
        return JsonAlternativeNamesKey;
    }

    private static final void buildAlternativeNamesMap$putOrThrow(Map<String, Integer> map, SerialDescriptor serialDescriptor, String str, int i) {
        if (map.containsKey(str)) {
            throw new JsonException("The suggested name '" + str + "' for property " + serialDescriptor.getElementName(i) + " is already one of the names for property " + serialDescriptor.getElementName(((Number) MapsKt.getValue(map, str)).intValue()) + " in " + serialDescriptor);
        }
        map.put(str, Integer.valueOf(i));
    }

    public static final Map<String, Integer> buildAlternativeNamesMap(SerialDescriptor serialDescriptor) {
        String[] names;
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        int elementsCount = serialDescriptor.getElementsCount();
        Map<String, Integer> map = null;
        for (int i = 0; i < elementsCount; i++) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : serialDescriptor.getElementAnnotations(i)) {
                if (obj instanceof JsonNames) {
                    arrayList.add(obj);
                }
            }
            JsonNames jsonNames = (JsonNames) CollectionsKt.singleOrNull((List<? extends Object>) arrayList);
            if (jsonNames != null && (names = jsonNames.names()) != null) {
                for (String str : names) {
                    if (map == null) {
                        map = CreateMapForCacheKt.createMapForCache(serialDescriptor.getElementsCount());
                    }
                    Intrinsics.checkNotNull(map);
                    buildAlternativeNamesMap$putOrThrow(map, serialDescriptor, str, i);
                }
            }
        }
        return map == null ? MapsKt.emptyMap() : map;
    }

    public static final int getJsonNameIndex(SerialDescriptor serialDescriptor, Json json, String name) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        int elementIndex = serialDescriptor.getElementIndex(name);
        if (elementIndex == -3 && json.getConfiguration().getUseAlternativeNames()) {
            Integer num = (Integer) ((Map) JsonSchemaCacheKt.getSchemaCache(json).getOrPut(serialDescriptor, JsonAlternativeNamesKey, new JsonNamesMapKt$getJsonNameIndex$alternativeNamesMap$1(serialDescriptor))).get(name);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        return elementIndex;
    }

    public static /* synthetic */ int getJsonNameIndexOrThrow$default(SerialDescriptor serialDescriptor, Json json, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return getJsonNameIndexOrThrow(serialDescriptor, json, str, str2);
    }

    public static final int getJsonNameIndexOrThrow(SerialDescriptor serialDescriptor, Json json, String name, String suffix) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int jsonNameIndex = getJsonNameIndex(serialDescriptor, json, name);
        if (jsonNameIndex != -3) {
            return jsonNameIndex;
        }
        throw new SerializationException(serialDescriptor.getSerialName() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ boolean tryCoerceValue$default(Json json, SerialDescriptor elementDescriptor, Function0 peekNull, Function0 peekString, Function0 onEnumCoercing, int i, Object obj) {
        String str;
        if ((i & 8) != 0) {
            onEnumCoercing = JsonNamesMapKt$tryCoerceValue$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(elementDescriptor, "elementDescriptor");
        Intrinsics.checkNotNullParameter(peekNull, "peekNull");
        Intrinsics.checkNotNullParameter(peekString, "peekString");
        Intrinsics.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
        if (elementDescriptor.isNullable() || !((Boolean) peekNull.invoke()).booleanValue()) {
            if (Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) && (str = (String) peekString.invoke()) != null && getJsonNameIndex(elementDescriptor, json, str) == -3) {
                onEnumCoercing.invoke();
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean tryCoerceValue(Json json, SerialDescriptor elementDescriptor, Function0<Boolean> peekNull, Function0<String> peekString, Function0<Unit> onEnumCoercing) {
        String invoke;
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(elementDescriptor, "elementDescriptor");
        Intrinsics.checkNotNullParameter(peekNull, "peekNull");
        Intrinsics.checkNotNullParameter(peekString, "peekString");
        Intrinsics.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
        if (elementDescriptor.isNullable() || !peekNull.invoke().booleanValue()) {
            if (Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) && (invoke = peekString.invoke()) != null && getJsonNameIndex(elementDescriptor, json, invoke) == -3) {
                onEnumCoercing.invoke();
                return true;
            }
            return false;
        }
        return true;
    }
}
