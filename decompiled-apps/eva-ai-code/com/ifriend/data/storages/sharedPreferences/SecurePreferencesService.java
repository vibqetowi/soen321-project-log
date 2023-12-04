package com.ifriend.data.storages.sharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SecurePreferencesService.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/ifriend/data/storages/sharedPreferences/SecurePreferencesService;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "masterKey", "Landroidx/security/crypto/MasterKey;", "getMasterKey", "()Landroidx/security/crypto/MasterKey;", "setMasterKey", "(Landroidx/security/crypto/MasterKey;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "getStringWithKey", "", "key", "saveStringWithKey", "", "value", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SecurePreferencesService {
    private MasterKey masterKey;
    private SharedPreferences sharedPreferences;

    public SecurePreferencesService(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MasterKey build = new MasterKey.Builder(context, MasterKey.DEFAULT_MASTER_KEY_ALIAS).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.masterKey = build;
        SharedPreferences create = EncryptedSharedPreferences.create(context, "secure_shared_prefs", build, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        this.sharedPreferences = create;
    }

    public final MasterKey getMasterKey() {
        return this.masterKey;
    }

    public final void setMasterKey(MasterKey masterKey) {
        Intrinsics.checkNotNullParameter(masterKey, "<set-?>");
        this.masterKey = masterKey;
    }

    public final SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void saveStringWithKey(String str, String str2) {
        this.sharedPreferences.edit().putString(str, str2).apply();
    }

    public final String getStringWithKey(String str) {
        return this.sharedPreferences.getString(str, null);
    }
}
