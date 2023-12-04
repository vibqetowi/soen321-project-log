package com.ifriend.presentation.extensions;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: parcelable.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a&\u0010\u0007\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a&\u0010\u0007\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"getParcelableSafe", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "Landroid/os/Bundle;", "key", "", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;", "getParcelableSafeNotNull", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroid/os/Parcelable;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ParcelableKt {
    public static final /* synthetic */ <T extends Parcelable> T getParcelableSafe(Bundle bundle, String key) {
        Object parcelable;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            parcelable = bundle.getParcelable(key, Parcelable.class);
            return (T) parcelable;
        }
        return (T) bundle.getParcelable(key);
    }

    public static final /* synthetic */ <T extends Parcelable> T getParcelableSafeNotNull(Bundle bundle, String key) {
        Object parcelable;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            parcelable = bundle.getParcelable(key, Parcelable.class);
            if (parcelable != null) {
                Intrinsics.checkNotNull(parcelable);
                return (T) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        T t = (T) bundle.getParcelable(key);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final /* synthetic */ <T extends Parcelable> T getParcelableSafeNotNull(Fragment fragment, String key) {
        T t;
        Object parcelable;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle requireArguments = fragment.requireArguments();
        Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            parcelable = requireArguments.getParcelable(key, Parcelable.class);
            t = (T) parcelable;
        } else {
            t = (T) requireArguments.getParcelable(key);
        }
        if (t != null) {
            T t2 = t;
            return t;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
