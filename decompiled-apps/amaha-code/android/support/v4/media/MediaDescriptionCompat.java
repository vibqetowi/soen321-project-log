package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    public final Bundle A;
    public final Uri B;
    public MediaDescription C;

    /* renamed from: u  reason: collision with root package name */
    public final String f845u;

    /* renamed from: v  reason: collision with root package name */
    public final CharSequence f846v;

    /* renamed from: w  reason: collision with root package name */
    public final CharSequence f847w;

    /* renamed from: x  reason: collision with root package name */
    public final CharSequence f848x;

    /* renamed from: y  reason: collision with root package name */
    public final Bitmap f849y;

    /* renamed from: z  reason: collision with root package name */
    public final Uri f850z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i6) {
            return new MediaDescriptionCompat[i6];
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        public static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        public static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        public static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        public static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        public static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        public static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        public static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        public static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        public static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        public static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static Uri a(MediaDescription mediaDescription) {
            Uri mediaUri;
            mediaUri = mediaDescription.getMediaUri();
            return mediaUri;
        }

        public static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public MediaDescriptionCompat() {
        throw null;
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f845u = str;
        this.f846v = charSequence;
        this.f847w = charSequence2;
        this.f848x = charSequence3;
        this.f849y = bitmap;
        this.f850z = uri;
        this.A = bundle;
        this.B = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat a(Object obj) {
        Uri uri;
        Bundle bundle;
        Uri uri2 = null;
        if (obj == null) {
            return null;
        }
        int i6 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription = (MediaDescription) obj;
        String g5 = b.g(mediaDescription);
        CharSequence i10 = b.i(mediaDescription);
        CharSequence h10 = b.h(mediaDescription);
        CharSequence c10 = b.c(mediaDescription);
        Bitmap e10 = b.e(mediaDescription);
        Uri f = b.f(mediaDescription);
        Bundle d10 = b.d(mediaDescription);
        if (d10 != null) {
            d10 = MediaSessionCompat.l(d10);
        }
        if (d10 != null) {
            uri = (Uri) d10.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri != null) {
            if (d10.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && d10.size() == 2) {
                bundle = null;
                if (uri == null) {
                    if (i6 >= 23) {
                        uri2 = c.a(mediaDescription);
                    }
                    uri = uri2;
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(g5, i10, h10, c10, e10, f, bundle, uri);
                mediaDescriptionCompat.C = mediaDescription;
                return mediaDescriptionCompat;
            }
            d10.remove("android.support.v4.media.description.MEDIA_URI");
            d10.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        }
        bundle = d10;
        if (uri == null) {
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(g5, i10, h10, c10, e10, f, bundle, uri);
        mediaDescriptionCompat2.C = mediaDescription;
        return mediaDescriptionCompat2;
    }

    public final MediaDescription b() {
        Bundle bundle;
        MediaDescription mediaDescription = this.C;
        if (mediaDescription == null) {
            int i6 = Build.VERSION.SDK_INT;
            MediaDescription.Builder b10 = b.b();
            b.n(b10, this.f845u);
            b.p(b10, this.f846v);
            b.o(b10, this.f847w);
            b.j(b10, this.f848x);
            b.l(b10, this.f849y);
            b.m(b10, this.f850z);
            Uri uri = this.B;
            Bundle bundle2 = this.A;
            if (i6 < 23 && uri != null) {
                if (bundle2 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(bundle2);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
                b.k(b10, bundle);
            } else {
                b.k(b10, bundle2);
            }
            if (i6 >= 23) {
                c.b(b10, uri);
            }
            MediaDescription a10 = b.a(b10);
            this.C = a10;
            return a10;
        }
        return mediaDescription;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f846v) + ", " + ((Object) this.f847w) + ", " + ((Object) this.f848x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        b().writeToParcel(parcel, i6);
    }
}
