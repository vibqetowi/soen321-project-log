package com.ifriend.domain.data.install;

import com.ifriend.domain.data.Preferences;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: PreferencesAppInstallStorage.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/data/install/PreferencesAppInstallStorage;", "Lcom/ifriend/domain/data/install/AppInstallStorage;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "(Lcom/ifriend/domain/data/Preferences;)V", "getUUID", "", "isUserHasBeenAuthorized", "", "saveUserHasBeenAuthorized", "", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreferencesAppInstallStorage implements AppInstallStorage {
    public static final Companion Companion = new Companion(null);
    private static final String USER_HAS_BEEN_AUTHORIZED_KEY = "user_has_been_authorized";
    private static final String UUID_KEY = "install_uuid";
    private final Preferences preferences;

    public PreferencesAppInstallStorage(Preferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // com.ifriend.domain.data.install.AppInstallStorage
    public String getUUID() {
        String stringWithKey = this.preferences.getStringWithKey(UUID_KEY);
        if (stringWithKey == null) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            this.preferences.saveStringWithKey(UUID_KEY, uuid);
            return uuid;
        }
        return stringWithKey;
    }

    @Override // com.ifriend.domain.data.install.AppInstallStorage
    public boolean isUserHasBeenAuthorized() {
        return this.preferences.getBooleanWithKey(USER_HAS_BEEN_AUTHORIZED_KEY, false);
    }

    @Override // com.ifriend.domain.data.install.AppInstallStorage
    public void saveUserHasBeenAuthorized() {
        this.preferences.saveBooleanWithKey(USER_HAS_BEEN_AUTHORIZED_KEY, true);
    }

    /* compiled from: PreferencesAppInstallStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/data/install/PreferencesAppInstallStorage$Companion;", "", "()V", "USER_HAS_BEEN_AUTHORIZED_KEY", "", "UUID_KEY", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
