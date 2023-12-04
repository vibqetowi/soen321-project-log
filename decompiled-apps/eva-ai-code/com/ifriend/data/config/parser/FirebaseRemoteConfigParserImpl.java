package com.ifriend.data.config.parser;

import com.facebook.internal.NativeProtocol;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.ifriend.domain.config.ConfigEntity;
import com.ifriend.domain.config.PrimitiveValue;
import com.ifriend.domain.config.StringPrimitiveValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: FirebaseRemoteConfigParserImpl.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002#$B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J*\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00110\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0019\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J)\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u000f2\u0019\u0010 \u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\r0!¢\u0006\u0002\b\"H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/ifriend/data/config/parser/FirebaseRemoteConfigParserImpl;", "Lcom/ifriend/data/config/parser/FirebaseRemoteConfigParser;", "parsers", "", "Lcom/ifriend/data/config/parser/FirebaseConfigValueParser;", "(Ljava/util/List;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "asString", "Lcom/ifriend/domain/config/PrimitiveValue;", "value", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "mapConditions", "Lkotlin/Pair;", "", "mapPayload", "mapValue", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parse", "Lcom/ifriend/domain/config/ConfigEntity;", "config", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryBoolean", "tryDouble", "tryLong", "tryParse", "safe", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ConditionsRemoteConfig", "PayloadRemoteConfig", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseRemoteConfigParserImpl implements FirebaseRemoteConfigParser {
    private final Lazy gson$delegate;
    private final List<FirebaseConfigValueParser> parsers;

    /* JADX WARN: Multi-variable type inference failed */
    public FirebaseRemoteConfigParserImpl(List<? extends FirebaseConfigValueParser> parsers) {
        Intrinsics.checkNotNullParameter(parsers, "parsers");
        this.parsers = parsers;
        this.gson$delegate = LazyKt.lazy(FirebaseRemoteConfigParserImpl$gson$2.INSTANCE);
    }

    public final Gson getGson() {
        return (Gson) this.gson$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:21:0x0093). Please submit an issue!!! */
    @Override // com.ifriend.data.config.parser.FirebaseRemoteConfigParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object parse(Map<String, ? extends FirebaseRemoteConfigValue> map, Continuation<? super List<ConfigEntity>> continuation) {
        FirebaseRemoteConfigParserImpl$parse$1 firebaseRemoteConfigParserImpl$parse$1;
        int i;
        FirebaseRemoteConfigParserImpl firebaseRemoteConfigParserImpl;
        Iterator<Map.Entry<String, ? extends FirebaseRemoteConfigValue>> it;
        ArrayList arrayList;
        if (continuation instanceof FirebaseRemoteConfigParserImpl$parse$1) {
            firebaseRemoteConfigParserImpl$parse$1 = (FirebaseRemoteConfigParserImpl$parse$1) continuation;
            if ((firebaseRemoteConfigParserImpl$parse$1.label & Integer.MIN_VALUE) != 0) {
                firebaseRemoteConfigParserImpl$parse$1.label -= Integer.MIN_VALUE;
                Object obj = firebaseRemoteConfigParserImpl$parse$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = firebaseRemoteConfigParserImpl$parse$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    firebaseRemoteConfigParserImpl = this;
                    it = map.entrySet().iterator();
                    arrayList = new ArrayList(map.size());
                    if (it.hasNext()) {
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    String key = (String) firebaseRemoteConfigParserImpl$parse$1.L$4;
                    Map.Entry<String, ? extends FirebaseRemoteConfigValue> next = (Map.Entry) firebaseRemoteConfigParserImpl$parse$1.L$3;
                    it = (Iterator) firebaseRemoteConfigParserImpl$parse$1.L$2;
                    ?? r6 = (Collection) firebaseRemoteConfigParserImpl$parse$1.L$1;
                    firebaseRemoteConfigParserImpl = (FirebaseRemoteConfigParserImpl) firebaseRemoteConfigParserImpl$parse$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList2 = (Collection) firebaseRemoteConfigParserImpl$parse$1.L$5;
                    arrayList2.add(new ConfigEntity(key, (PrimitiveValue) obj, firebaseRemoteConfigParserImpl.mapConditions(next.getValue(), firebaseRemoteConfigParserImpl.getGson()), firebaseRemoteConfigParserImpl.mapPayload(next.getValue(), firebaseRemoteConfigParserImpl.getGson())));
                    arrayList = r6;
                    if (it.hasNext()) {
                        next = it.next();
                        key = next.getKey();
                        firebaseRemoteConfigParserImpl$parse$1.L$0 = firebaseRemoteConfigParserImpl;
                        firebaseRemoteConfigParserImpl$parse$1.L$1 = arrayList;
                        firebaseRemoteConfigParserImpl$parse$1.L$2 = it;
                        firebaseRemoteConfigParserImpl$parse$1.L$3 = next;
                        firebaseRemoteConfigParserImpl$parse$1.L$4 = key;
                        firebaseRemoteConfigParserImpl$parse$1.L$5 = arrayList;
                        firebaseRemoteConfigParserImpl$parse$1.label = 1;
                        obj = firebaseRemoteConfigParserImpl.mapValue(next.getValue(), firebaseRemoteConfigParserImpl$parse$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r6 = arrayList;
                        arrayList2 = arrayList;
                        arrayList2.add(new ConfigEntity(key, (PrimitiveValue) obj, firebaseRemoteConfigParserImpl.mapConditions(next.getValue(), firebaseRemoteConfigParserImpl.getGson()), firebaseRemoteConfigParserImpl.mapPayload(next.getValue(), firebaseRemoteConfigParserImpl.getGson())));
                        arrayList = r6;
                        if (it.hasNext()) {
                            return arrayList;
                        }
                    }
                }
            }
        }
        firebaseRemoteConfigParserImpl$parse$1 = new FirebaseRemoteConfigParserImpl$parse$1(this, continuation);
        Object obj2 = firebaseRemoteConfigParserImpl$parse$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = firebaseRemoteConfigParserImpl$parse$1.label;
        if (i != 0) {
        }
    }

    /* compiled from: FirebaseRemoteConfigParserImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/config/parser/FirebaseRemoteConfigParserImpl$ConditionsRemoteConfig;", "", "conditions", "", "(Ljava/lang/String;)V", "getConditions", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ConditionsRemoteConfig {
        @SerializedName("@conditions")
        private final String conditions;

        public ConditionsRemoteConfig() {
            this(null, 1, null);
        }

        public static /* synthetic */ ConditionsRemoteConfig copy$default(ConditionsRemoteConfig conditionsRemoteConfig, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = conditionsRemoteConfig.conditions;
            }
            return conditionsRemoteConfig.copy(str);
        }

        public final String component1() {
            return this.conditions;
        }

        public final ConditionsRemoteConfig copy(String str) {
            return new ConditionsRemoteConfig(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConditionsRemoteConfig) && Intrinsics.areEqual(this.conditions, ((ConditionsRemoteConfig) obj).conditions);
        }

        public int hashCode() {
            String str = this.conditions;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.conditions;
            return "ConditionsRemoteConfig(conditions=" + str + ")";
        }

        public ConditionsRemoteConfig(String str) {
            this.conditions = str;
        }

        public /* synthetic */ ConditionsRemoteConfig(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final String getConditions() {
            return this.conditions;
        }
    }

    private final List<Pair<String, String>> mapConditions(FirebaseRemoteConfigValue firebaseRemoteConfigValue, Gson gson) {
        try {
            String asString = firebaseRemoteConfigValue.asString();
            Intrinsics.checkNotNullExpressionValue(asString, "asString(...)");
            String conditions = ((ConditionsRemoteConfig) gson.fromJson(asString, (Class<Object>) ConditionsRemoteConfig.class)).getConditions();
            if (conditions == null) {
                conditions = "";
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : StringsKt.split$default((CharSequence) conditions, new String[]{";"}, false, 0, 6, (Object) null)) {
                if (!StringsKt.isBlank((String) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList<String> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (String str : arrayList2) {
                List split$default = StringsKt.split$default((CharSequence) str, new String[]{"="}, false, 0, 6, (Object) null);
                Object first = CollectionsKt.first((List<? extends Object>) split$default);
                String str2 = (String) CollectionsKt.getOrNull(split$default, 1);
                if (str2 == null) {
                    str2 = "";
                }
                arrayList3.add(new Pair(first, str2));
            }
            return arrayList3;
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }

    /* compiled from: FirebaseRemoteConfigParserImpl.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/data/config/parser/FirebaseRemoteConfigParserImpl$PayloadRemoteConfig;", "", "payload", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;)V", "getPayload", "()Lcom/google/gson/JsonObject;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class PayloadRemoteConfig {
        @SerializedName("payload")
        private final JsonObject payload;

        public PayloadRemoteConfig() {
            this(null, 1, null);
        }

        public static /* synthetic */ PayloadRemoteConfig copy$default(PayloadRemoteConfig payloadRemoteConfig, JsonObject jsonObject, int i, Object obj) {
            if ((i & 1) != 0) {
                jsonObject = payloadRemoteConfig.payload;
            }
            return payloadRemoteConfig.copy(jsonObject);
        }

        public final JsonObject component1() {
            return this.payload;
        }

        public final PayloadRemoteConfig copy(JsonObject jsonObject) {
            return new PayloadRemoteConfig(jsonObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PayloadRemoteConfig) && Intrinsics.areEqual(this.payload, ((PayloadRemoteConfig) obj).payload);
        }

        public int hashCode() {
            JsonObject jsonObject = this.payload;
            if (jsonObject == null) {
                return 0;
            }
            return jsonObject.hashCode();
        }

        public String toString() {
            JsonObject jsonObject = this.payload;
            return "PayloadRemoteConfig(payload=" + jsonObject + ")";
        }

        public PayloadRemoteConfig(JsonObject jsonObject) {
            this.payload = jsonObject;
        }

        public /* synthetic */ PayloadRemoteConfig(JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : jsonObject);
        }

        public final JsonObject getPayload() {
            return this.payload;
        }
    }

    private final String mapPayload(FirebaseRemoteConfigValue firebaseRemoteConfigValue, Gson gson) {
        try {
            String asString = firebaseRemoteConfigValue.asString();
            Intrinsics.checkNotNullExpressionValue(asString, "asString(...)");
            return gson.toJson(new PayloadRemoteConfig(((PayloadRemoteConfig) gson.fromJson(asString, (Class<Object>) PayloadRemoteConfig.class)).getPayload()));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mapValue(FirebaseRemoteConfigValue firebaseRemoteConfigValue, Continuation<? super PrimitiveValue> continuation) {
        FirebaseRemoteConfigParserImpl$mapValue$1 firebaseRemoteConfigParserImpl$mapValue$1;
        int i;
        FirebaseRemoteConfigParserImpl firebaseRemoteConfigParserImpl;
        if (continuation instanceof FirebaseRemoteConfigParserImpl$mapValue$1) {
            firebaseRemoteConfigParserImpl$mapValue$1 = (FirebaseRemoteConfigParserImpl$mapValue$1) continuation;
            if ((firebaseRemoteConfigParserImpl$mapValue$1.label & Integer.MIN_VALUE) != 0) {
                firebaseRemoteConfigParserImpl$mapValue$1.label -= Integer.MIN_VALUE;
                Object obj = firebaseRemoteConfigParserImpl$mapValue$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = firebaseRemoteConfigParserImpl$mapValue$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    PrimitiveValue tryLong = tryLong(firebaseRemoteConfigValue);
                    if (tryLong != null) {
                        return tryLong;
                    }
                    PrimitiveValue tryDouble = tryDouble(firebaseRemoteConfigValue);
                    if (tryDouble != null) {
                        return tryDouble;
                    }
                    PrimitiveValue tryBoolean = tryBoolean(firebaseRemoteConfigValue);
                    if (tryBoolean != null) {
                        return tryBoolean;
                    }
                    firebaseRemoteConfigParserImpl$mapValue$1.L$0 = this;
                    firebaseRemoteConfigParserImpl$mapValue$1.L$1 = firebaseRemoteConfigValue;
                    firebaseRemoteConfigParserImpl$mapValue$1.label = 1;
                    obj = tryParse(firebaseRemoteConfigValue, firebaseRemoteConfigParserImpl$mapValue$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    firebaseRemoteConfigParserImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    firebaseRemoteConfigValue = (FirebaseRemoteConfigValue) firebaseRemoteConfigParserImpl$mapValue$1.L$1;
                    firebaseRemoteConfigParserImpl = (FirebaseRemoteConfigParserImpl) firebaseRemoteConfigParserImpl$mapValue$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                PrimitiveValue primitiveValue = (PrimitiveValue) obj;
                return primitiveValue != null ? firebaseRemoteConfigParserImpl.asString(firebaseRemoteConfigValue) : primitiveValue;
            }
        }
        firebaseRemoteConfigParserImpl$mapValue$1 = new FirebaseRemoteConfigParserImpl$mapValue$1(this, continuation);
        Object obj2 = firebaseRemoteConfigParserImpl$mapValue$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = firebaseRemoteConfigParserImpl$mapValue$1.label;
        if (i != 0) {
        }
        PrimitiveValue primitiveValue2 = (PrimitiveValue) obj2;
        if (primitiveValue2 != null) {
        }
    }

    private final PrimitiveValue tryBoolean(FirebaseRemoteConfigValue firebaseRemoteConfigValue) {
        return safe(firebaseRemoteConfigValue, new FirebaseRemoteConfigParserImpl$tryBoolean$1(firebaseRemoteConfigValue));
    }

    private final PrimitiveValue tryDouble(FirebaseRemoteConfigValue firebaseRemoteConfigValue) {
        return safe(firebaseRemoteConfigValue, new FirebaseRemoteConfigParserImpl$tryDouble$1(firebaseRemoteConfigValue));
    }

    private final PrimitiveValue tryLong(FirebaseRemoteConfigValue firebaseRemoteConfigValue) {
        return safe(firebaseRemoteConfigValue, new FirebaseRemoteConfigParserImpl$tryLong$1(firebaseRemoteConfigValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006a -> B:21:0x006d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryParse(FirebaseRemoteConfigValue firebaseRemoteConfigValue, Continuation<? super PrimitiveValue> continuation) {
        FirebaseRemoteConfigParserImpl$tryParse$1 firebaseRemoteConfigParserImpl$tryParse$1;
        int i;
        FirebaseRemoteConfigValue firebaseRemoteConfigValue2;
        Iterator it;
        if (continuation instanceof FirebaseRemoteConfigParserImpl$tryParse$1) {
            firebaseRemoteConfigParserImpl$tryParse$1 = (FirebaseRemoteConfigParserImpl$tryParse$1) continuation;
            if ((firebaseRemoteConfigParserImpl$tryParse$1.label & Integer.MIN_VALUE) != 0) {
                firebaseRemoteConfigParserImpl$tryParse$1.label -= Integer.MIN_VALUE;
                Object obj = firebaseRemoteConfigParserImpl$tryParse$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = firebaseRemoteConfigParserImpl$tryParse$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    firebaseRemoteConfigValue2 = firebaseRemoteConfigValue;
                    it = this.parsers.iterator();
                    if (it.hasNext()) {
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    it = (Iterator) firebaseRemoteConfigParserImpl$tryParse$1.L$1;
                    FirebaseRemoteConfigValue firebaseRemoteConfigValue3 = (FirebaseRemoteConfigValue) firebaseRemoteConfigParserImpl$tryParse$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    PrimitiveValue primitiveValue = (PrimitiveValue) obj;
                    if (primitiveValue == null) {
                        return primitiveValue;
                    }
                    firebaseRemoteConfigValue2 = firebaseRemoteConfigValue3;
                    if (it.hasNext()) {
                        return null;
                    }
                    String asString = firebaseRemoteConfigValue2.asString();
                    Intrinsics.checkNotNullExpressionValue(asString, "asString(...)");
                    firebaseRemoteConfigParserImpl$tryParse$1.L$0 = firebaseRemoteConfigValue2;
                    firebaseRemoteConfigParserImpl$tryParse$1.L$1 = it;
                    firebaseRemoteConfigParserImpl$tryParse$1.label = 1;
                    Object parse = ((FirebaseConfigValueParser) it.next()).parse(asString, firebaseRemoteConfigParserImpl$tryParse$1);
                    if (parse == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    firebaseRemoteConfigValue3 = firebaseRemoteConfigValue2;
                    obj = parse;
                    PrimitiveValue primitiveValue2 = (PrimitiveValue) obj;
                    if (primitiveValue2 == null) {
                    }
                }
            }
        }
        firebaseRemoteConfigParserImpl$tryParse$1 = new FirebaseRemoteConfigParserImpl$tryParse$1(this, continuation);
        Object obj2 = firebaseRemoteConfigParserImpl$tryParse$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = firebaseRemoteConfigParserImpl$tryParse$1.label;
        if (i != 0) {
        }
    }

    private final PrimitiveValue asString(FirebaseRemoteConfigValue firebaseRemoteConfigValue) {
        String asString = firebaseRemoteConfigValue.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "asString(...)");
        return new StringPrimitiveValue(asString);
    }

    private final PrimitiveValue safe(FirebaseRemoteConfigValue firebaseRemoteConfigValue, Function1<? super FirebaseRemoteConfigValue, ? extends PrimitiveValue> function1) {
        try {
            return function1.invoke(firebaseRemoteConfigValue);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
