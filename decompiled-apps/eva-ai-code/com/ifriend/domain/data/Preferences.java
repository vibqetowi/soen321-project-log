package com.ifriend.domain.data;

import java.util.Set;
import kotlin.Metadata;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.cookie.ClientCookie;
/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\bf\u0018\u0000 \"2\u00020\u0001:\u0001\"J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\fH&J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J!\u0010\u0019\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\fH&¢\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0002\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0002\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0002\u0010 J\u001c\u0010!\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¨\u0006#"}, d2 = {"Lcom/ifriend/domain/data/Preferences;", "", "addValueToStringSetWithKey", "", "key", "", "value", "addValuesToStringSetWithKey", "values", "", "clear", "clearValue", "", "getBooleanOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getBooleanWithKey", CookieSpecs.DEFAULT, "getFloatWithKey", "", "getIntWithKey", "", "getLongWithKey", "", "getStringSetWithKey", "getStringWithKey", "saveBooleanWithKey", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "saveFloatWithKey", "(Ljava/lang/String;Ljava/lang/Float;)V", "saveIntWithKey", "(Ljava/lang/String;Ljava/lang/Integer;)V", "saveLongWithKey", "(Ljava/lang/String;Ljava/lang/Long;)V", "saveStringWithKey", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Preferences {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String PASSED_INFO_ONBOARDING_USER_IDS = "passed_info_onboarding_user_ids";

    void addValueToStringSetWithKey(String str, String str2);

    void addValuesToStringSetWithKey(String str, Set<String> set);

    void clear();

    boolean clearValue(String str);

    Boolean getBooleanOrNull(String str);

    boolean getBooleanWithKey(String str, boolean z);

    float getFloatWithKey(String str);

    int getIntWithKey(String str);

    long getLongWithKey(String str);

    Set<String> getStringSetWithKey(String str);

    String getStringWithKey(String str);

    void saveBooleanWithKey(String str, Boolean bool);

    void saveFloatWithKey(String str, Float f);

    void saveIntWithKey(String str, Integer num);

    void saveLongWithKey(String str, Long l);

    void saveStringWithKey(String str, String str2);

    /* compiled from: Preferences.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean getBooleanWithKey$default(Preferences preferences, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                return preferences.getBooleanWithKey(str, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBooleanWithKey");
        }
    }

    /* compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/domain/data/Preferences$Companion;", "", "()V", "PASSED_INFO_ONBOARDING_USER_IDS", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String PASSED_INFO_ONBOARDING_USER_IDS = "passed_info_onboarding_user_ids";

        private Companion() {
        }
    }
}
