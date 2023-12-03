package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final String[] A;
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: x  reason: collision with root package name */
    public static final t.b<String, Integer> f851x;

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f852y;

    /* renamed from: z  reason: collision with root package name */
    public static final String[] f853z;

    /* renamed from: u  reason: collision with root package name */
    public final Bundle f854u;

    /* renamed from: v  reason: collision with root package name */
    public MediaMetadata f855v;

    /* renamed from: w  reason: collision with root package name */
    public MediaDescriptionCompat f856w;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat[] newArray(int i6) {
            return new MediaMetadataCompat[i6];
        }
    }

    static {
        t.b<String, Integer> bVar = new t.b<>();
        f851x = bVar;
        bVar.put("android.media.metadata.TITLE", 1);
        bVar.put("android.media.metadata.ARTIST", 1);
        bVar.put("android.media.metadata.DURATION", 0);
        bVar.put("android.media.metadata.ALBUM", 1);
        bVar.put("android.media.metadata.AUTHOR", 1);
        bVar.put("android.media.metadata.WRITER", 1);
        bVar.put("android.media.metadata.COMPOSER", 1);
        bVar.put("android.media.metadata.COMPILATION", 1);
        bVar.put("android.media.metadata.DATE", 1);
        bVar.put("android.media.metadata.YEAR", 0);
        bVar.put("android.media.metadata.GENRE", 1);
        bVar.put("android.media.metadata.TRACK_NUMBER", 0);
        bVar.put("android.media.metadata.NUM_TRACKS", 0);
        bVar.put("android.media.metadata.DISC_NUMBER", 0);
        bVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        bVar.put("android.media.metadata.ART", 2);
        bVar.put("android.media.metadata.ART_URI", 1);
        bVar.put("android.media.metadata.ALBUM_ART", 2);
        bVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        bVar.put("android.media.metadata.USER_RATING", 3);
        bVar.put("android.media.metadata.RATING", 3);
        bVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        bVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        bVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        bVar.put("android.media.metadata.DISPLAY_ICON", 2);
        bVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        bVar.put("android.media.metadata.MEDIA_ID", 1);
        bVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        bVar.put("android.media.metadata.MEDIA_URI", 1);
        bVar.put("android.media.metadata.ADVERTISEMENT", 0);
        bVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f852y = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f853z = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        A = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f854u = bundle2;
        MediaSessionCompat.a(bundle2);
    }

    public static MediaMetadataCompat a(Object obj) {
        if (obj != null) {
            Parcel obtain = Parcel.obtain();
            MediaMetadata mediaMetadata = (MediaMetadata) obj;
            mediaMetadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f855v = mediaMetadata;
            return createFromParcel;
        }
        return null;
    }

    public final MediaDescriptionCompat b() {
        Bitmap bitmap;
        Uri uri;
        Uri uri2;
        Bundle bundle;
        Bitmap bitmap2;
        MediaDescriptionCompat mediaDescriptionCompat = this.f856w;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String d10 = d("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        Bundle bundle2 = this.f854u;
        CharSequence charSequence = bundle2.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (!TextUtils.isEmpty(charSequence)) {
            charSequenceArr[0] = charSequence;
            charSequenceArr[1] = bundle2.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = bundle2.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        } else {
            int i6 = 0;
            int i10 = 0;
            while (i6 < 3) {
                String[] strArr = f852y;
                if (i10 >= strArr.length) {
                    break;
                }
                int i11 = i10 + 1;
                CharSequence charSequence2 = bundle2.getCharSequence(strArr[i10]);
                if (!TextUtils.isEmpty(charSequence2)) {
                    charSequenceArr[i6] = charSequence2;
                    i6++;
                }
                i10 = i11;
            }
        }
        int i12 = 0;
        while (true) {
            String[] strArr2 = f853z;
            if (i12 < strArr2.length) {
                try {
                    bitmap2 = (Bitmap) bundle2.getParcelable(strArr2[i12]);
                } catch (Exception e10) {
                    Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e10);
                    bitmap2 = null;
                }
                if (bitmap2 != null) {
                    bitmap = bitmap2;
                    break;
                }
                i12++;
            } else {
                bitmap = null;
                break;
            }
        }
        int i13 = 0;
        while (true) {
            String[] strArr3 = A;
            if (i13 < strArr3.length) {
                String d11 = d(strArr3[i13]);
                if (!TextUtils.isEmpty(d11)) {
                    uri = Uri.parse(d11);
                    break;
                }
                i13++;
            } else {
                uri = null;
                break;
            }
        }
        String d12 = d("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty(d12)) {
            uri2 = Uri.parse(d12);
        } else {
            uri2 = null;
        }
        CharSequence charSequence3 = charSequenceArr[0];
        CharSequence charSequence4 = charSequenceArr[1];
        CharSequence charSequence5 = charSequenceArr[2];
        Bundle bundle3 = new Bundle();
        if (bundle2.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle3.putLong("android.media.extra.BT_FOLDER_TYPE", c("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (bundle2.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle3.putLong("android.media.extra.DOWNLOAD_STATUS", c("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle3.isEmpty()) {
            bundle = bundle3;
        } else {
            bundle = null;
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(d10, charSequence3, charSequence4, charSequence5, bitmap, uri, bundle, uri2);
        this.f856w = mediaDescriptionCompat2;
        return mediaDescriptionCompat2;
    }

    public final long c(String str) {
        return this.f854u.getLong(str, 0L);
    }

    public final String d(String str) {
        CharSequence charSequence = this.f854u.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeBundle(this.f854u);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f857a;

        public b() {
            this.f857a = new Bundle();
        }

        public final MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.f857a);
        }

        public final void b(String str, Bitmap bitmap) {
            t.b<String, Integer> bVar = MediaMetadataCompat.f851x;
            if (bVar.containsKey(str) && bVar.getOrDefault(str, null).intValue() != 2) {
                throw new IllegalArgumentException(defpackage.b.m("The ", str, " key cannot be used to put a Bitmap"));
            }
            this.f857a.putParcelable(str, bitmap);
        }

        public final void c(long j10, String str) {
            t.b<String, Integer> bVar = MediaMetadataCompat.f851x;
            if (bVar.containsKey(str) && bVar.getOrDefault(str, null).intValue() != 0) {
                throw new IllegalArgumentException(defpackage.b.m("The ", str, " key cannot be used to put a long"));
            }
            this.f857a.putLong(str, j10);
        }

        public final void d(String str, String str2) {
            t.b<String, Integer> bVar = MediaMetadataCompat.f851x;
            if (bVar.containsKey(str) && bVar.getOrDefault(str, null).intValue() != 1) {
                throw new IllegalArgumentException(defpackage.b.m("The ", str, " key cannot be used to put a String"));
            }
            this.f857a.putCharSequence(str, str2);
        }

        public b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f854u);
            this.f857a = bundle;
            MediaSessionCompat.a(bundle);
        }
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f854u = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
