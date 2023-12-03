package com.theinnerhour.b2b.utils;

import android.os.Build;
import android.os.Bundle;
import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: SerializableHelper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"serializable", "T", "Ljava/io/Serializable;", "Landroid/os/Bundle;", "key", "", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "app_productionRelease"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class SerializableHelperKt {
    public static final /* synthetic */ <T extends Serializable> T serializable(Bundle bundle, String key) {
        kotlin.jvm.internal.i.g(bundle, "<this>");
        kotlin.jvm.internal.i.g(key, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            kotlin.jvm.internal.i.l();
            throw null;
        }
        bundle.getSerializable(key);
        kotlin.jvm.internal.i.l();
        throw null;
    }
}
