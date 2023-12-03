package h5;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import w5.i;
/* compiled from: FacebookRequestError.kt */
/* loaded from: classes.dex */
public final class n implements Parcelable {
    public final Object A;
    public final String B;
    public final FacebookException C;

    /* renamed from: u  reason: collision with root package name */
    public final int f17259u;

    /* renamed from: v  reason: collision with root package name */
    public final int f17260v;

    /* renamed from: w  reason: collision with root package name */
    public final int f17261w;

    /* renamed from: x  reason: collision with root package name */
    public final String f17262x;

    /* renamed from: y  reason: collision with root package name */
    public final String f17263y;

    /* renamed from: z  reason: collision with root package name */
    public final String f17264z;
    public static final c D = new c();
    public static final Parcelable.Creator<n> CREATOR = new b();

    /* compiled from: FacebookRequestError.kt */
    /* loaded from: classes.dex */
    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            return (a[]) Arrays.copyOf(values(), 3);
        }
    }

    /* compiled from: FacebookRequestError.kt */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.i.g(parcel, "parcel");
            return new n(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, false);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i6) {
            return new n[i6];
        }
    }

    /* compiled from: FacebookRequestError.kt */
    /* loaded from: classes.dex */
    public static final class c {
        public final synchronized w5.i a() {
            w5.p pVar = w5.p.f36526a;
            w5.o b10 = w5.p.b(p.b());
            if (b10 == null) {
                return w5.i.f36468d.a();
            }
            return b10.f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
        if (r1.contains(java.lang.Integer.valueOf(r3)) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(int i6, int i10, int i11, String str, String str2, String str3, String str4, Object obj, FacebookException facebookException, boolean z10) {
        boolean z11;
        w5.i iVar;
        Set<Integer> set;
        Set<Integer> set2;
        this.f17259u = i6;
        this.f17260v = i10;
        this.f17261w = i11;
        this.f17262x = str;
        this.f17263y = str3;
        this.f17264z = str4;
        this.A = obj;
        this.B = str2;
        if (facebookException != null) {
            this.C = facebookException;
            z11 = true;
        } else {
            this.C = new FacebookServiceException(this, a());
            z11 = false;
        }
        a aVar = a.OTHER;
        c cVar = D;
        if (!z11) {
            synchronized (cVar) {
                w5.p pVar = w5.p.f36526a;
                w5.o b10 = w5.p.b(p.b());
                if (b10 == null) {
                    iVar = w5.i.f36468d.a();
                } else {
                    iVar = b10.f;
                }
            }
            a aVar2 = a.TRANSIENT;
            if (z10) {
                iVar.getClass();
            } else {
                Map<Integer, Set<Integer>> map = iVar.f36470a;
                if (map == null || !map.containsKey(Integer.valueOf(i10)) || ((set2 = map.get(Integer.valueOf(i10))) != null && !set2.contains(Integer.valueOf(i11)))) {
                    Map<Integer, Set<Integer>> map2 = iVar.f36472c;
                    if (map2 != null && map2.containsKey(Integer.valueOf(i10)) && ((set = map2.get(Integer.valueOf(i10))) == null || set.contains(Integer.valueOf(i11)))) {
                        aVar = a.LOGIN_RECOVERABLE;
                    } else {
                        Map<Integer, Set<Integer>> map3 = iVar.f36471b;
                        if (map3 != null) {
                            if (map3.containsKey(Integer.valueOf(i10))) {
                                Set<Integer> set3 = map3.get(Integer.valueOf(i10));
                                if (set3 != null) {
                                }
                            }
                        }
                    }
                }
            }
            aVar = aVar2;
        }
        cVar.a().getClass();
        int i12 = i.b.f36473a[aVar.ordinal()];
    }

    public final String a() {
        String str = this.B;
        if (str == null) {
            FacebookException facebookException = this.C;
            if (facebookException == null) {
                return null;
            }
            return facebookException.getLocalizedMessage();
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = "{HttpStatus: " + this.f17259u + ", errorCode: " + this.f17260v + ", subErrorCode: " + this.f17261w + ", errorType: " + this.f17262x + ", errorMessage: " + a() + "}";
        kotlin.jvm.internal.i.f(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i6) {
        kotlin.jvm.internal.i.g(out, "out");
        out.writeInt(this.f17259u);
        out.writeInt(this.f17260v);
        out.writeInt(this.f17261w);
        out.writeString(this.f17262x);
        out.writeString(a());
        out.writeString(this.f17263y);
        out.writeString(this.f17264z);
    }

    public n(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public n(int i6, String str, String str2) {
        this(-1, i6, -1, str, str2, null, null, null, null, false);
    }
}
