package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass().isInstance(obj)) {
            FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
            for (FastJsonResponse.Field<?, ?> field : getFieldMappings().values()) {
                if (isFieldSet(field)) {
                    if (!fastJsonResponse.isFieldSet(field) || !Objects.equal(getFieldValue(field), fastJsonResponse.getFieldValue(field))) {
                        return false;
                    }
                } else if (fastJsonResponse.isFieldSet(field)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field<?, ?> field : getFieldMappings().values()) {
            if (isFieldSet(field)) {
                i = (i * 31) + Preconditions.checkNotNull(getFieldValue(field)).hashCode();
            }
        }
        return i;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }

    public byte[] toByteArray() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
