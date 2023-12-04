package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: EncryptedSharedPreferences.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"EncryptedSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "fileName", "", "masterKey", "Landroidx/security/crypto/MasterKey;", "prefKeyEncryptionScheme", "Landroidx/security/crypto/EncryptedSharedPreferences$PrefKeyEncryptionScheme;", "prefValueEncryptionScheme", "Landroidx/security/crypto/EncryptedSharedPreferences$PrefValueEncryptionScheme;", "security-crypto-ktx_release"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class EncryptedSharedPreferencesKt {
    public static /* synthetic */ SharedPreferences EncryptedSharedPreferences$default(Context context, String str, MasterKey masterKey, EncryptedSharedPreferences.PrefKeyEncryptionScheme prefKeyEncryptionScheme, EncryptedSharedPreferences.PrefValueEncryptionScheme prefValueEncryptionScheme, int i, Object obj) {
        if ((i & 8) != 0) {
            prefKeyEncryptionScheme = EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV;
        }
        if ((i & 16) != 0) {
            prefValueEncryptionScheme = EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM;
        }
        return EncryptedSharedPreferences(context, str, masterKey, prefKeyEncryptionScheme, prefValueEncryptionScheme);
    }

    public static final SharedPreferences EncryptedSharedPreferences(Context context, String fileName, MasterKey masterKey, EncryptedSharedPreferences.PrefKeyEncryptionScheme prefKeyEncryptionScheme, EncryptedSharedPreferences.PrefValueEncryptionScheme prefValueEncryptionScheme) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(masterKey, "masterKey");
        Intrinsics.checkNotNullParameter(prefKeyEncryptionScheme, "prefKeyEncryptionScheme");
        Intrinsics.checkNotNullParameter(prefValueEncryptionScheme, "prefValueEncryptionScheme");
        SharedPreferences create = EncryptedSharedPreferences.create(context, fileName, masterKey, prefKeyEncryptionScheme, prefValueEncryptionScheme);
        Intrinsics.checkNotNullExpressionValue(create, "EncryptedSharedPreferenc…efValueEncryptionScheme\n)");
        return create;
    }
}
