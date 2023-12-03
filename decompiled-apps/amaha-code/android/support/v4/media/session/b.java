package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.appsflyer.R;
import java.util.List;
/* compiled from: IMediaSession.java */
/* loaded from: classes.dex */
public interface b extends IInterface {
    void A0();

    void B(int i6);

    void B1(int i6);

    long C();

    void C0(Uri uri, Bundle bundle);

    void E0(long j10);

    void H(android.support.v4.media.session.a aVar);

    void I0(float f);

    String J1();

    boolean L0(KeyEvent keyEvent);

    void L1(Bundle bundle, String str);

    void M();

    void N(RatingCompat ratingCompat);

    void O(Bundle bundle, String str);

    void P(Uri uri, Bundle bundle);

    void P0(RatingCompat ratingCompat, Bundle bundle);

    void R0(MediaDescriptionCompat mediaDescriptionCompat, int i6);

    void T(MediaDescriptionCompat mediaDescriptionCompat);

    boolean U();

    void U0(boolean z10);

    void V();

    void X(MediaDescriptionCompat mediaDescriptionCompat);

    PendingIntent Y();

    void a0();

    int a1();

    void b1(int i6);

    void d1();

    Bundle getExtras();

    void h0(int i6, int i10);

    void j1(Bundle bundle, String str);

    void l();

    void l1(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    List<MediaSessionCompat.QueueItem> m1();

    CharSequence n0();

    void n1();

    void next();

    PlaybackStateCompat p();

    void p1(Bundle bundle, String str);

    void pause();

    void previous();

    void q();

    void q0(Bundle bundle, String str);

    int r();

    MediaMetadataCompat r0();

    void stop();

    Bundle t0();

    void u0(android.support.v4.media.session.a aVar);

    void u1(long j10);

    ParcelableVolumeInfo v1();

    String w();

    void z0(int i6, int i10);

    /* compiled from: IMediaSession.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f928a = 0;

        /* compiled from: IMediaSession.java */
        /* renamed from: android.support.v4.media.session.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0018a implements b {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f929a;

            public C0018a(IBinder iBinder) {
                this.f929a = iBinder;
            }

            @Override // android.support.v4.media.session.b
            public final void E0(long j10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeLong(j10);
                    if (!this.f929a.transact(24, obtain, obtain2, 0)) {
                        int i6 = a.f928a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void H(android.support.v4.media.session.a aVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f929a.transact(3, obtain, obtain2, 0)) {
                        int i6 = a.f928a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final boolean L0(KeyEvent keyEvent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z10 = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f929a.transact(2, obtain, obtain2, 0)) {
                        int i6 = a.f928a;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z10 = false;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final PendingIntent Y() {
                PendingIntent pendingIntent;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f929a.transact(8, obtain, obtain2, 0)) {
                        int i6 = a.f928a;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        pendingIntent = (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2);
                    } else {
                        pendingIntent = null;
                    }
                    return pendingIntent;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f929a;
            }

            @Override // android.support.v4.media.session.b
            public final List<MediaSessionCompat.QueueItem> m1() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f929a.transact(29, obtain, obtain2, 0)) {
                        int i6 = a.f928a;
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final PlaybackStateCompat p() {
                PlaybackStateCompat playbackStateCompat;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f929a.transact(28, obtain, obtain2, 0)) {
                        int i6 = a.f928a;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(obtain2);
                    } else {
                        playbackStateCompat = null;
                    }
                    return playbackStateCompat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void pause() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f929a.transact(18, obtain, obtain2, 0)) {
                        int i6 = a.f928a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void q() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f929a.transact(13, obtain, obtain2, 0)) {
                        int i6 = a.f928a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void q0(Bundle bundle, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f929a.transact(14, obtain, obtain2, 0)) {
                        int i6 = a.f928a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final MediaMetadataCompat r0() {
                MediaMetadataCompat mediaMetadataCompat;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f929a.transact(27, obtain, obtain2, 0)) {
                        int i6 = a.f928a;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain2);
                    } else {
                        mediaMetadataCompat = null;
                    }
                    return mediaMetadataCompat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void stop() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f929a.transact(19, obtain, obtain2, 0)) {
                        int i6 = a.f928a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void u0(android.support.v4.media.session.a aVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f929a.transact(4, obtain, obtain2, 0)) {
                        int i6 = a.f928a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static b v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0018a(iBinder);
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i10) {
            Bundle bundle;
            Uri uri;
            Uri uri2;
            RatingCompat ratingCompat;
            if (i6 != 1598968902) {
                MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper = null;
                Bundle bundle2 = null;
                MediaDescriptionCompat mediaDescriptionCompat = null;
                MediaDescriptionCompat mediaDescriptionCompat2 = null;
                MediaDescriptionCompat mediaDescriptionCompat3 = null;
                Bundle bundle3 = null;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                Bundle bundle6 = null;
                RatingCompat ratingCompat2 = null;
                Bundle bundle7 = null;
                Bundle bundle8 = null;
                Bundle bundle9 = null;
                android.support.v4.media.session.a aVar = null;
                android.support.v4.media.session.a aVar2 = null;
                KeyEvent keyEvent = null;
                boolean z10 = false;
                switch (i6) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        } else {
                            bundle = null;
                        }
                        if (parcel.readInt() != 0) {
                            resultReceiverWrapper = MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel);
                        }
                        l1(readString, bundle, resultReceiverWrapper);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            keyEvent = (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel);
                        }
                        boolean L0 = L0(keyEvent);
                        parcel2.writeNoException();
                        parcel2.writeInt(L0 ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.v4.media.session.a)) {
                                aVar2 = (android.support.v4.media.session.a) queryLocalInterface;
                            } else {
                                aVar2 = new a.AbstractBinderC0016a.C0017a(readStrongBinder);
                            }
                        }
                        H(aVar2);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof android.support.v4.media.session.a)) {
                                aVar = (android.support.v4.media.session.a) queryLocalInterface2;
                            } else {
                                aVar = new a.AbstractBinderC0016a.C0017a(readStrongBinder2);
                            }
                        }
                        u0(aVar);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        boolean U = U();
                        parcel2.writeNoException();
                        parcel2.writeInt(U ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String J1 = J1();
                        parcel2.writeNoException();
                        parcel2.writeString(J1);
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String w10 = w();
                        parcel2.writeNoException();
                        parcel2.writeString(w10);
                        return true;
                    case 8:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        PendingIntent Y = Y();
                        parcel2.writeNoException();
                        if (Y != null) {
                            parcel2.writeInt(1);
                            Y.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 9:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        long C = C();
                        parcel2.writeNoException();
                        parcel2.writeLong(C);
                        return true;
                    case 10:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        ParcelableVolumeInfo v12 = v1();
                        parcel2.writeNoException();
                        if (v12 != null) {
                            parcel2.writeInt(1);
                            v12.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 11:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        int readInt = parcel.readInt();
                        int readInt2 = parcel.readInt();
                        parcel.readString();
                        h0(readInt, readInt2);
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        int readInt3 = parcel.readInt();
                        int readInt4 = parcel.readInt();
                        parcel.readString();
                        z0(readInt3, readInt4);
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        q();
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle9 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        q0(bundle9, readString2);
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString3 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle8 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        p1(bundle8, readString3);
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle7 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        C0(uri, bundle7);
                        parcel2.writeNoException();
                        return true;
                    case 17:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        u1(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 18:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        pause();
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        stop();
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        next();
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        previous();
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        A0();
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        n1();
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        E0(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 25:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            ratingCompat2 = RatingCompat.CREATOR.createFromParcel(parcel);
                        }
                        N(ratingCompat2);
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString4 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        O(bundle6, readString4);
                        parcel2.writeNoException();
                        return true;
                    case 27:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        MediaMetadataCompat r02 = r0();
                        parcel2.writeNoException();
                        if (r02 != null) {
                            parcel2.writeInt(1);
                            parcel2.writeBundle(r02.f854u);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 28:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        PlaybackStateCompat p10 = p();
                        parcel2.writeNoException();
                        if (p10 != null) {
                            parcel2.writeInt(1);
                            p10.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 29:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        List<MediaSessionCompat.QueueItem> m12 = m1();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(m12);
                        return true;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        CharSequence n02 = n0();
                        parcel2.writeNoException();
                        if (n02 != null) {
                            parcel2.writeInt(1);
                            TextUtils.writeToParcel(n02, parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        Bundle extras = getExtras();
                        parcel2.writeNoException();
                        if (extras != null) {
                            parcel2.writeInt(1);
                            extras.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 32:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        a0();
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        return true;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        l();
                        parcel2.writeNoException();
                        return true;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString5 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        j1(bundle5, readString5);
                        parcel2.writeNoException();
                        return true;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString6 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        L1(bundle4, readString6);
                        parcel2.writeNoException();
                        return true;
                    case 36:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri2 = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        P(uri2, bundle3);
                        parcel2.writeNoException();
                        return true;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        int r = r();
                        parcel2.writeNoException();
                        parcel2.writeInt(r);
                        return true;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        M();
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        return true;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        B(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        parcel.readInt();
                        V();
                        parcel2.writeNoException();
                        return true;
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            mediaDescriptionCompat3 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        }
                        X(mediaDescriptionCompat3);
                        parcel2.writeNoException();
                        return true;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            mediaDescriptionCompat2 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        }
                        R0(mediaDescriptionCompat2, parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            mediaDescriptionCompat = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        }
                        T(mediaDescriptionCompat);
                        parcel2.writeNoException();
                        return true;
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        b1(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        d1();
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        return true;
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            z10 = true;
                        }
                        U0(z10);
                        parcel2.writeNoException();
                        return true;
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        int a12 = a1();
                        parcel2.writeNoException();
                        parcel2.writeInt(a12);
                        return true;
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        B1(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        I0(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 50:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        Bundle t02 = t0();
                        parcel2.writeNoException();
                        if (t02 != null) {
                            parcel2.writeInt(1);
                            t02.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            ratingCompat = RatingCompat.CREATOR.createFromParcel(parcel);
                        } else {
                            ratingCompat = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        P0(ratingCompat, bundle2);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i6, parcel, parcel2, i10);
                }
            }
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
