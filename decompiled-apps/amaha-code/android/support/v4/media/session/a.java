package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: IMediaControllerCallback.java */
/* loaded from: classes.dex */
public interface a extends IInterface {
    void A(Bundle bundle, String str);

    void M0(CharSequence charSequence);

    void M1(PlaybackStateCompat playbackStateCompat);

    void Q0();

    void Q1(ParcelableVolumeInfo parcelableVolumeInfo);

    void S0(MediaMetadataCompat mediaMetadataCompat);

    void e0(Bundle bundle);

    void g0(ArrayList arrayList);

    void h1(int i6);

    void y(int i6);

    /* compiled from: IMediaControllerCallback.java */
    /* renamed from: android.support.v4.media.session.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0016a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f926a = 0;

        /* compiled from: IMediaControllerCallback.java */
        /* renamed from: android.support.v4.media.session.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0017a implements a {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f927a;

            public C0017a(IBinder iBinder) {
                this.f927a = iBinder;
            }

            @Override // android.support.v4.media.session.a
            public final void A(Bundle bundle, String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f927a.transact(1, obtain, null, 1)) {
                        int i6 = AbstractBinderC0016a.f926a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void M1(PlaybackStateCompat playbackStateCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f927a.transact(3, obtain, null, 1)) {
                        int i6 = AbstractBinderC0016a.f926a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void Q0() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (!this.f927a.transact(2, obtain, null, 1)) {
                        int i6 = AbstractBinderC0016a.f926a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void Q1(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f927a.transact(8, obtain, null, 1)) {
                        int i6 = AbstractBinderC0016a.f926a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void S0(MediaMetadataCompat mediaMetadataCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        obtain.writeBundle(mediaMetadataCompat.f854u);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f927a.transact(4, obtain, null, 1)) {
                        int i6 = AbstractBinderC0016a.f926a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f927a;
            }

            @Override // android.support.v4.media.session.a
            public final void g0(ArrayList arrayList) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList(arrayList);
                    if (!this.f927a.transact(5, obtain, null, 1)) {
                        int i6 = AbstractBinderC0016a.f926a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void h1(int i6) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i6);
                    if (!this.f927a.transact(12, obtain, null, 1)) {
                        int i10 = AbstractBinderC0016a.f926a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void y(int i6) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i6);
                    if (!this.f927a.transact(9, obtain, null, 1)) {
                        int i10 = AbstractBinderC0016a.f926a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0016a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i10) {
            boolean z10;
            if (i6 != 1598968902) {
                Bundle bundle = null;
                ParcelableVolumeInfo parcelableVolumeInfo = null;
                Bundle bundle2 = null;
                CharSequence charSequence = null;
                MediaMetadataCompat mediaMetadataCompat = null;
                PlaybackStateCompat playbackStateCompat = null;
                switch (i6) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        ((MediaControllerCompat.a.c) this).A(bundle, readString);
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        Q0();
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                        }
                        ((MediaControllerCompat.a.c) this).M1(playbackStateCompat);
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                        }
                        S0(mediaMetadataCompat);
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        g0(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                        }
                        M0(charSequence);
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        e0(bundle2);
                        return true;
                    case 8:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            parcelableVolumeInfo = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                        }
                        Q1(parcelableVolumeInfo);
                        return true;
                    case 9:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        ((MediaControllerCompat.a.c) this).y(parcel.readInt());
                        return true;
                    case 10:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readInt();
                        return true;
                    case 11:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        MediaControllerCompat.a aVar = ((MediaControllerCompat.a.c) this).f875b.get();
                        if (aVar != null) {
                            aVar.f(11, Boolean.valueOf(z10), null);
                        }
                        return true;
                    case 12:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        ((MediaControllerCompat.a.c) this).h1(parcel.readInt());
                        return true;
                    case 13:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        MediaControllerCompat.a aVar2 = ((MediaControllerCompat.a.c) this).f875b.get();
                        if (aVar2 != null) {
                            aVar2.f(13, null, null);
                        }
                        return true;
                    default:
                        return super.onTransact(i6, parcel, parcel2, i10);
                }
            }
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
