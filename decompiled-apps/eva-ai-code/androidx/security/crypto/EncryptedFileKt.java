package androidx.security.crypto;

import android.content.Context;
import androidx.security.crypto.EncryptedFile;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: EncryptedFile.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\r"}, d2 = {"EncryptedFile", "Landroidx/security/crypto/EncryptedFile;", "context", "Landroid/content/Context;", ShareInternalUtility.STAGING_PARAM, "Ljava/io/File;", "masterKey", "Landroidx/security/crypto/MasterKey;", "fileEncryptionScheme", "Landroidx/security/crypto/EncryptedFile$FileEncryptionScheme;", "keysetPrefName", "", "keysetAlias", "security-crypto-ktx_release"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class EncryptedFileKt {
    public static /* synthetic */ EncryptedFile EncryptedFile$default(Context context, File file, MasterKey masterKey, EncryptedFile.FileEncryptionScheme fileEncryptionScheme, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            fileEncryptionScheme = EncryptedFile.FileEncryptionScheme.AES256_GCM_HKDF_4KB;
        }
        return EncryptedFile(context, file, masterKey, fileEncryptionScheme, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2);
    }

    public static final EncryptedFile EncryptedFile(Context context, File file, MasterKey masterKey, EncryptedFile.FileEncryptionScheme fileEncryptionScheme, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(masterKey, "masterKey");
        Intrinsics.checkNotNullParameter(fileEncryptionScheme, "fileEncryptionScheme");
        EncryptedFile.Builder builder = new EncryptedFile.Builder(context, file, masterKey, fileEncryptionScheme);
        if (str != null) {
            builder.setKeysetPrefName(str);
        }
        if (str2 != null) {
            builder.setKeysetAlias(str2);
        }
        EncryptedFile build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "EncryptedFile.Builder(co…as(keysetAlias)\n}.build()");
        return build;
    }
}
