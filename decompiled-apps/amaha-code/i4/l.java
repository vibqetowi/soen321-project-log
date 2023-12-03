package i4;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import i4.e;
import java.io.IOException;
/* compiled from: ParcelFileDescriptorRewinder.java */
/* loaded from: classes.dex */
public final class l implements e<ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    public final b f19828a;

    /* compiled from: ParcelFileDescriptorRewinder.java */
    /* loaded from: classes.dex */
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // i4.e.a
        public final Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // i4.e.a
        public final e<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new l(parcelFileDescriptor);
        }
    }

    /* compiled from: ParcelFileDescriptorRewinder.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ParcelFileDescriptor f19829a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f19829a = parcelFileDescriptor;
        }
    }

    public l(ParcelFileDescriptor parcelFileDescriptor) {
        this.f19828a = new b(parcelFileDescriptor);
    }

    @Override // i4.e
    /* renamed from: c */
    public final ParcelFileDescriptor a() {
        ParcelFileDescriptor parcelFileDescriptor = this.f19828a.f19829a;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e10) {
            throw new IOException(e10);
        }
    }

    @Override // i4.e
    public final void b() {
    }
}
