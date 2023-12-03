package n8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: SpliceInsertCommand.java */
/* loaded from: classes.dex */
public final class d extends n8.b {
    public static final Parcelable.Creator<d> CREATOR = new a();
    public final long A;
    public final List<b> B;
    public final boolean C;
    public final long D;
    public final int E;
    public final int F;
    public final int G;

    /* renamed from: u  reason: collision with root package name */
    public final long f25924u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f25925v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f25926w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f25927x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f25928y;

    /* renamed from: z  reason: collision with root package name */
    public final long f25929z;

    /* compiled from: SpliceInsertCommand.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i6) {
            return new d[i6];
        }
    }

    /* compiled from: SpliceInsertCommand.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f25930a;

        /* renamed from: b  reason: collision with root package name */
        public final long f25931b;

        /* renamed from: c  reason: collision with root package name */
        public final long f25932c;

        public b(int i6, long j10, long j11) {
            this.f25930a = i6;
            this.f25931b = j10;
            this.f25932c = j11;
        }
    }

    public d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i6, int i10, int i11) {
        this.f25924u = j10;
        this.f25925v = z10;
        this.f25926w = z11;
        this.f25927x = z12;
        this.f25928y = z13;
        this.f25929z = j11;
        this.A = j12;
        this.B = Collections.unmodifiableList(list);
        this.C = z14;
        this.D = j13;
        this.E = i6;
        this.F = i10;
        this.G = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.f25924u);
        parcel.writeByte(this.f25925v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25926w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25927x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25928y ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f25929z);
        parcel.writeLong(this.A);
        List<b> list = this.B;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = list.get(i10);
            parcel.writeInt(bVar.f25930a);
            parcel.writeLong(bVar.f25931b);
            parcel.writeLong(bVar.f25932c);
        }
        parcel.writeByte(this.C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
    }

    public d(Parcel parcel) {
        this.f25924u = parcel.readLong();
        this.f25925v = parcel.readByte() == 1;
        this.f25926w = parcel.readByte() == 1;
        this.f25927x = parcel.readByte() == 1;
        this.f25928y = parcel.readByte() == 1;
        this.f25929z = parcel.readLong();
        this.A = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i6 = 0; i6 < readInt; i6++) {
            arrayList.add(new b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.B = Collections.unmodifiableList(arrayList);
        this.C = parcel.readByte() == 1;
        this.D = parcel.readLong();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
    }
}
