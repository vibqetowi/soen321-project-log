package j2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;
import r1.b0;
/* compiled from: VersionedParcelParcel.java */
/* loaded from: classes.dex */
public final class b extends VersionedParcel {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f21649d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f21650e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f21651g;

    /* renamed from: h  reason: collision with root package name */
    public final String f21652h;

    /* renamed from: i  reason: collision with root package name */
    public int f21653i;

    /* renamed from: j  reason: collision with root package name */
    public int f21654j;

    /* renamed from: k  reason: collision with root package name */
    public int f21655k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new t.b(), new t.b(), new t.b());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final b a() {
        Parcel parcel = this.f21650e;
        int dataPosition = parcel.dataPosition();
        int i6 = this.f21654j;
        if (i6 == this.f) {
            i6 = this.f21651g;
        }
        return new b(parcel, dataPosition, i6, b0.b(new StringBuilder(), this.f21652h, "  "), this.f3084a, this.f3085b, this.f3086c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean e() {
        if (this.f21650e.readInt() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] f() {
        Parcel parcel = this.f21650e;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f21650e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean h(int i6) {
        while (this.f21654j < this.f21651g) {
            int i10 = this.f21655k;
            if (i10 == i6) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i6)) > 0) {
                return false;
            }
            int i11 = this.f21654j;
            Parcel parcel = this.f21650e;
            parcel.setDataPosition(i11);
            int readInt = parcel.readInt();
            this.f21655k = parcel.readInt();
            this.f21654j += readInt;
        }
        if (this.f21655k == i6) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int i() {
        return this.f21650e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final <T extends Parcelable> T k() {
        return (T) this.f21650e.readParcelable(b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String m() {
        return this.f21650e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void o(int i6) {
        x();
        this.f21653i = i6;
        this.f21649d.put(i6, this.f21650e.dataPosition());
        s(0);
        s(i6);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void p(boolean z10) {
        this.f21650e.writeInt(z10 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void q(byte[] bArr) {
        Parcel parcel = this.f21650e;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            return;
        }
        parcel.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void r(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f21650e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void s(int i6) {
        this.f21650e.writeInt(i6);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void u(Parcelable parcelable) {
        this.f21650e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void v(String str) {
        this.f21650e.writeString(str);
    }

    public final void x() {
        int i6 = this.f21653i;
        if (i6 >= 0) {
            int i10 = this.f21649d.get(i6);
            Parcel parcel = this.f21650e;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i10);
            parcel.writeInt(dataPosition - i10);
            parcel.setDataPosition(dataPosition);
        }
    }

    public b(Parcel parcel, int i6, int i10, String str, t.b<String, Method> bVar, t.b<String, Method> bVar2, t.b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.f21649d = new SparseIntArray();
        this.f21653i = -1;
        this.f21655k = -1;
        this.f21650e = parcel;
        this.f = i6;
        this.f21651g = i10;
        this.f21654j = i6;
        this.f21652h = str;
    }
}
