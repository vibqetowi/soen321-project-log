package n8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: SpliceScheduleCommand.java */
/* loaded from: classes.dex */
public final class f extends n8.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final List<c> f25933u;

    /* compiled from: SpliceScheduleCommand.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i6) {
            return new f[i6];
        }
    }

    /* compiled from: SpliceScheduleCommand.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f25934a;

        /* renamed from: b  reason: collision with root package name */
        public final long f25935b;

        public b(int i6, long j10) {
            this.f25934a = i6;
            this.f25935b = j10;
        }
    }

    public f(ArrayList arrayList) {
        this.f25933u = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        List<c> list = this.f25933u;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = list.get(i10);
            parcel.writeLong(cVar.f25936a);
            parcel.writeByte(cVar.f25937b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f25938c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f25939d ? (byte) 1 : (byte) 0);
            List<b> list2 = cVar.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                b bVar = list2.get(i11);
                parcel.writeInt(bVar.f25934a);
                parcel.writeLong(bVar.f25935b);
            }
            parcel.writeLong(cVar.f25940e);
            parcel.writeByte(cVar.f25941g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.f25942h);
            parcel.writeInt(cVar.f25943i);
            parcel.writeInt(cVar.f25944j);
            parcel.writeInt(cVar.f25945k);
        }
    }

    public f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i6 = 0; i6 < readInt; i6++) {
            arrayList.add(new c(parcel));
        }
        this.f25933u = Collections.unmodifiableList(arrayList);
    }

    /* compiled from: SpliceScheduleCommand.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f25936a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f25937b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f25938c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f25939d;

        /* renamed from: e  reason: collision with root package name */
        public final long f25940e;
        public final List<b> f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f25941g;

        /* renamed from: h  reason: collision with root package name */
        public final long f25942h;

        /* renamed from: i  reason: collision with root package name */
        public final int f25943i;

        /* renamed from: j  reason: collision with root package name */
        public final int f25944j;

        /* renamed from: k  reason: collision with root package name */
        public final int f25945k;

        public c(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i6, int i10, int i11) {
            this.f25936a = j10;
            this.f25937b = z10;
            this.f25938c = z11;
            this.f25939d = z12;
            this.f = Collections.unmodifiableList(arrayList);
            this.f25940e = j11;
            this.f25941g = z13;
            this.f25942h = j12;
            this.f25943i = i6;
            this.f25944j = i10;
            this.f25945k = i11;
        }

        public c(Parcel parcel) {
            this.f25936a = parcel.readLong();
            this.f25937b = parcel.readByte() == 1;
            this.f25938c = parcel.readByte() == 1;
            this.f25939d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i6 = 0; i6 < readInt; i6++) {
                arrayList.add(new b(parcel.readInt(), parcel.readLong()));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.f25940e = parcel.readLong();
            this.f25941g = parcel.readByte() == 1;
            this.f25942h = parcel.readLong();
            this.f25943i = parcel.readInt();
            this.f25944j = parcel.readInt();
            this.f25945k = parcel.readInt();
        }
    }
}
