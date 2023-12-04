package com.ifriend.domain.config;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ConfigEntity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001b\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b0\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R#\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ifriend/domain/config/ConfigEntity;", "", "key", "", "value", "Lcom/ifriend/domain/config/PrimitiveValue;", "conditions", "", "Lkotlin/Pair;", "payload", "(Ljava/lang/String;Lcom/ifriend/domain/config/PrimitiveValue;Ljava/util/List;Ljava/lang/String;)V", "getConditions", "()Ljava/util/List;", "getKey", "()Ljava/lang/String;", "getPayload", "getValue", "()Lcom/ifriend/domain/config/PrimitiveValue;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfigEntity {
    private final List<Pair<String, String>> conditions;
    private final String key;
    private final String payload;
    private final PrimitiveValue value;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigEntity copy$default(ConfigEntity configEntity, String str, PrimitiveValue primitiveValue, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = configEntity.key;
        }
        if ((i & 2) != 0) {
            primitiveValue = configEntity.value;
        }
        if ((i & 4) != 0) {
            list = configEntity.conditions;
        }
        if ((i & 8) != 0) {
            str2 = configEntity.payload;
        }
        return configEntity.copy(str, primitiveValue, list, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final PrimitiveValue component2() {
        return this.value;
    }

    public final List<Pair<String, String>> component3() {
        return this.conditions;
    }

    public final String component4() {
        return this.payload;
    }

    public final ConfigEntity copy(String key, PrimitiveValue value, List<Pair<String, String>> conditions, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        return new ConfigEntity(key, value, conditions, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfigEntity) {
            ConfigEntity configEntity = (ConfigEntity) obj;
            return Intrinsics.areEqual(this.key, configEntity.key) && Intrinsics.areEqual(this.value, configEntity.value) && Intrinsics.areEqual(this.conditions, configEntity.conditions) && Intrinsics.areEqual(this.payload, configEntity.payload);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.key.hashCode() * 31) + this.value.hashCode()) * 31) + this.conditions.hashCode()) * 31;
        String str = this.payload;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.key;
        PrimitiveValue primitiveValue = this.value;
        List<Pair<String, String>> list = this.conditions;
        String str2 = this.payload;
        return "ConfigEntity(key=" + str + ", value=" + primitiveValue + ", conditions=" + list + ", payload=" + str2 + ")";
    }

    public ConfigEntity(String key, PrimitiveValue value, List<Pair<String, String>> conditions, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        this.key = key;
        this.value = value;
        this.conditions = conditions;
        this.payload = str;
    }

    public final String getKey() {
        return this.key;
    }

    public final PrimitiveValue getValue() {
        return this.value;
    }

    public /* synthetic */ ConfigEntity(String str, PrimitiveValue primitiveValue, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, primitiveValue, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str2);
    }

    public final List<Pair<String, String>> getConditions() {
        return this.conditions;
    }

    public final String getPayload() {
        return this.payload;
    }
}
