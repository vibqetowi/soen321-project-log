package com.ifriend.ui.utils.extensions;

import android.os.Build;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: serializable.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a&\u0010\u0007\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"getSerializableCompat", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/io/Serializable;", "Landroid/os/Bundle;", "key", "", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "getSerializableNonNull", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SerializableKt {
    public static final /* synthetic */ <T extends Serializable> T getSerializableCompat(Bundle bundle, String key) {
        Serializable serializable;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            serializable = bundle.getSerializable(key, Serializable.class);
            return (T) serializable;
        }
        T t = (T) bundle.getSerializable(key);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t;
    }

    public static final /* synthetic */ <T extends Serializable> T getSerializableNonNull(Bundle bundle, String key) {
        Serializable serializable;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT < 33) {
            T t = (T) bundle.getSerializable(key);
            Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
            return t;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        serializable = bundle.getSerializable(key, Serializable.class);
        T t2 = (T) serializable;
        if (t2 != null) {
            Intrinsics.checkNotNullExpressionValue(t2, "requireNotNull(...)");
            return t2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
