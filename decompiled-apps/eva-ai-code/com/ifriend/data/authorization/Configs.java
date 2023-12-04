package com.ifriend.data.authorization;

import com.ifriend.domain.config.ConfigKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Configs.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/data/authorization/Configs;", "", "dbId", "", ConfigKeys.CLIENT_ID, "(Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getDbId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Configs {
    private final String clientId;
    private final String dbId;

    public static /* synthetic */ Configs copy$default(Configs configs, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = configs.dbId;
        }
        if ((i & 2) != 0) {
            str2 = configs.clientId;
        }
        return configs.copy(str, str2);
    }

    public final String component1() {
        return this.dbId;
    }

    public final String component2() {
        return this.clientId;
    }

    public final Configs copy(String dbId, String clientId) {
        Intrinsics.checkNotNullParameter(dbId, "dbId");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        return new Configs(dbId, clientId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Configs) {
            Configs configs = (Configs) obj;
            return Intrinsics.areEqual(this.dbId, configs.dbId) && Intrinsics.areEqual(this.clientId, configs.clientId);
        }
        return false;
    }

    public int hashCode() {
        return (this.dbId.hashCode() * 31) + this.clientId.hashCode();
    }

    public String toString() {
        String str = this.dbId;
        String str2 = this.clientId;
        return "Configs(dbId=" + str + ", clientId=" + str2 + ")";
    }

    public Configs(String dbId, String clientId) {
        Intrinsics.checkNotNullParameter(dbId, "dbId");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        this.dbId = dbId;
        this.clientId = clientId;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getDbId() {
        return this.dbId;
    }
}
