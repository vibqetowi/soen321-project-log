package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: FacebookSignatureValidator.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/FacebookSignatureValidator;", "", "()V", "FBF_HASH", "", "FBI_HASH", "FBL_HASH", "FBR2_HASH", "FBR_HASH", "IGR_HASH", "MSR_HASH", "validAppSignatureHashes", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "validateSignature", "", "context", "Landroid/content/Context;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FacebookSignatureValidator {
    public static final FacebookSignatureValidator INSTANCE = new FacebookSignatureValidator();
    private static final String FBR_HASH = "8a3c4b262d721acd49a4bf97d5213199c86fa2b9";
    private static final String FBR2_HASH = "cc2751449a350f668590264ed76692694a80308a";
    private static final String FBI_HASH = "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc";
    private static final String FBL_HASH = "df6b721c8b4d3b6eb44c861d4415007e5a35fc95";
    private static final String MSR_HASH = "9b8f518b086098de3d77736f9458a3d2f6f95a37";
    private static final String FBF_HASH = "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3";
    private static final String IGR_HASH = "c56fb7d591ba6704df047fd98f535372fea00211";
    private static final HashSet<String> validAppSignatureHashes = SetsKt.hashSetOf(FBR_HASH, FBR2_HASH, FBI_HASH, FBL_HASH, MSR_HASH, FBF_HASH, IGR_HASH);

    private FacebookSignatureValidator() {
    }

    @JvmStatic
    public static final boolean validateSignature(Context context, String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String brand = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        Intrinsics.checkNotNullExpressionValue(brand, "brand");
        if (!StringsKt.startsWith$default(brand, "generic", false, 2, (Object) null) || (i & 2) == 0) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
                if (packageInfo.signatures != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    Intrinsics.checkNotNullExpressionValue(signatureArr, "packageInfo.signatures");
                    if (signatureArr.length == 0) {
                        return false;
                    }
                    Signature[] signatureArr2 = packageInfo.signatures;
                    Intrinsics.checkNotNullExpressionValue(signatureArr2, "packageInfo.signatures");
                    for (Signature signature : signatureArr2) {
                        Utility utility = Utility.INSTANCE;
                        byte[] byteArray = signature.toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray, "it.toByteArray()");
                        if (!CollectionsKt.contains(validAppSignatureHashes, Utility.sha1hash(byteArray))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        return true;
    }
}
