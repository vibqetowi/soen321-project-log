package com.ifriend.domain.config;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConfigsKey.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/config/ConfigsKey;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "GENDER", "ETHNICITY", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfigsKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConfigsKey[] $VALUES;
    private final String key;
    public static final ConfigsKey GENDER = new ConfigsKey("GENDER", 0, HintConstants.AUTOFILL_HINT_GENDER);
    public static final ConfigsKey ETHNICITY = new ConfigsKey("ETHNICITY", 1, "ethnicity");

    private static final /* synthetic */ ConfigsKey[] $values() {
        return new ConfigsKey[]{GENDER, ETHNICITY};
    }

    public static EnumEntries<ConfigsKey> getEntries() {
        return $ENTRIES;
    }

    public static ConfigsKey valueOf(String str) {
        return (ConfigsKey) Enum.valueOf(ConfigsKey.class, str);
    }

    public static ConfigsKey[] values() {
        return (ConfigsKey[]) $VALUES.clone();
    }

    private ConfigsKey(String str, int i, String str2) {
        this.key = str2;
    }

    public final String getKey() {
        return this.key;
    }

    static {
        ConfigsKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
