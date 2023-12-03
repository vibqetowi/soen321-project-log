package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public final CharSequence A;
    public final long B;
    public final ArrayList C;
    public final long D;
    public final Bundle E;
    public PlaybackState F;

    /* renamed from: u  reason: collision with root package name */
    public final int f915u;

    /* renamed from: v  reason: collision with root package name */
    public final long f916v;

    /* renamed from: w  reason: collision with root package name */
    public final long f917w;

    /* renamed from: x  reason: collision with root package name */
    public final float f918x;

    /* renamed from: y  reason: collision with root package name */
    public final long f919y;

    /* renamed from: z  reason: collision with root package name */
    public final int f920z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i6) {
            return new PlaybackStateCompat[i6];
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        public static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        public static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        public static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        public static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i6) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i6);
        }

        public static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        public static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        public static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        public static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        public static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        public static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        public static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        public static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        public static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        public static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        public static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        public static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        public static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        public static void s(PlaybackState.Builder builder, long j10) {
            builder.setActions(j10);
        }

        public static void t(PlaybackState.Builder builder, long j10) {
            builder.setActiveQueueItemId(j10);
        }

        public static void u(PlaybackState.Builder builder, long j10) {
            builder.setBufferedPosition(j10);
        }

        public static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        public static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void x(PlaybackState.Builder builder, int i6, long j10, float f, long j11) {
            builder.setState(i6, j10, f, j11);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static Bundle a(PlaybackState playbackState) {
            Bundle extras;
            extras = playbackState.getExtras();
            return extras;
        }

        public static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    public PlaybackStateCompat(int i6, long j10, long j11, float f, long j12, int i10, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.f915u = i6;
        this.f916v = j10;
        this.f917w = j11;
        this.f918x = f;
        this.f919y = j12;
        this.f920z = i10;
        this.A = charSequence;
        this.B = j13;
        this.C = new ArrayList(arrayList);
        this.D = j14;
        this.E = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        CustomAction customAction;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j10 = b.j(playbackState);
        if (j10 != null) {
            ArrayList arrayList2 = new ArrayList(j10.size());
            for (PlaybackState.CustomAction customAction2 : j10) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle l2 = b.l(customAction3);
                    MediaSessionCompat.a(l2);
                    customAction = new CustomAction(b.f(customAction3), b.o(customAction3), b.m(customAction3), l2);
                    customAction.f925y = customAction3;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = c.a(playbackState);
            MediaSessionCompat.a(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), bundle);
        playbackStateCompat.F = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f915u + ", position=" + this.f916v + ", buffered position=" + this.f917w + ", speed=" + this.f918x + ", updated=" + this.B + ", actions=" + this.f919y + ", error code=" + this.f920z + ", error message=" + this.A + ", custom actions=" + this.C + ", active item id=" + this.D + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f915u);
        parcel.writeLong(this.f916v);
        parcel.writeFloat(this.f918x);
        parcel.writeLong(this.B);
        parcel.writeLong(this.f917w);
        parcel.writeLong(this.f919y);
        TextUtils.writeToParcel(this.A, parcel, i6);
        parcel.writeTypedList(this.C);
        parcel.writeLong(this.D);
        parcel.writeBundle(this.E);
        parcel.writeInt(this.f920z);
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: u  reason: collision with root package name */
        public final String f921u;

        /* renamed from: v  reason: collision with root package name */
        public final CharSequence f922v;

        /* renamed from: w  reason: collision with root package name */
        public final int f923w;

        /* renamed from: x  reason: collision with root package name */
        public final Bundle f924x;

        /* renamed from: y  reason: collision with root package name */
        public PlaybackState.CustomAction f925y;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i6) {
                return new CustomAction[i6];
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i6, Bundle bundle) {
            this.f921u = str;
            this.f922v = charSequence;
            this.f923w = i6;
            this.f924x = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f922v) + ", mIcon=" + this.f923w + ", mExtras=" + this.f924x;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeString(this.f921u);
            TextUtils.writeToParcel(this.f922v, parcel, i6);
            parcel.writeInt(this.f923w);
            parcel.writeBundle(this.f924x);
        }

        public CustomAction(Parcel parcel) {
            this.f921u = parcel.readString();
            this.f922v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f923w = parcel.readInt();
            this.f924x = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f915u = parcel.readInt();
        this.f916v = parcel.readLong();
        this.f918x = parcel.readFloat();
        this.B = parcel.readLong();
        this.f917w = parcel.readLong();
        this.f919y = parcel.readLong();
        this.A = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.C = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.D = parcel.readLong();
        this.E = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f920z = parcel.readInt();
    }
}
