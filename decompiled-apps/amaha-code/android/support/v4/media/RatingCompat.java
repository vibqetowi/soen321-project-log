package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final int f858u;

    /* renamed from: v  reason: collision with root package name */
    public final float f859v;

    /* renamed from: w  reason: collision with root package name */
    public Object f860w;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i6) {
            return new RatingCompat[i6];
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static float a(Rating rating) {
            return rating.getPercentRating();
        }

        public static int b(Rating rating) {
            return rating.getRatingStyle();
        }

        public static float c(Rating rating) {
            return rating.getStarRating();
        }

        public static boolean d(Rating rating) {
            return rating.hasHeart();
        }

        public static boolean e(Rating rating) {
            return rating.isRated();
        }

        public static boolean f(Rating rating) {
            return rating.isThumbUp();
        }

        public static Rating g(boolean z10) {
            return Rating.newHeartRating(z10);
        }

        public static Rating h(float f) {
            return Rating.newPercentageRating(f);
        }

        public static Rating i(int i6, float f) {
            return Rating.newStarRating(i6, f);
        }

        public static Rating j(boolean z10) {
            return Rating.newThumbRating(z10);
        }

        public static Rating k(int i6) {
            return Rating.newUnratedRating(i6);
        }
    }

    public RatingCompat(float f, int i6) {
        this.f858u = i6;
        this.f859v = f;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat;
        float f;
        RatingCompat ratingCompat2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int b10 = b.b(rating);
            if (b.e(rating)) {
                float f2 = 1.0f;
                switch (b10) {
                    case 1:
                        if (!b.d(rating)) {
                            f2 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(f2, 1);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 2:
                        if (!b.f(rating)) {
                            f2 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(f2, 2);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float c10 = b.c(rating);
                        if (b10 != 3) {
                            if (b10 != 4) {
                                if (b10 != 5) {
                                    Log.e("Rating", "Invalid rating style (" + b10 + ") for a star rating");
                                    break;
                                } else {
                                    f = 5.0f;
                                }
                            } else {
                                f = 4.0f;
                            }
                        } else {
                            f = 3.0f;
                        }
                        if (c10 >= 0.0f && c10 <= f) {
                            ratingCompat2 = new RatingCompat(c10, b10);
                            break;
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                            break;
                        }
                        break;
                    case 6:
                        float a10 = b.a(rating);
                        if (a10 >= 0.0f && a10 <= 100.0f) {
                            ratingCompat2 = new RatingCompat(a10, 6);
                            break;
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                            break;
                        }
                    default:
                        return null;
                }
            } else {
                switch (b10) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat2 = new RatingCompat(-1.0f, b10);
                        break;
                }
            }
            ratingCompat2.f860w = obj;
        }
        return ratingCompat2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f858u;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f858u);
        sb2.append(" rating=");
        float f = this.f859v;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f858u);
        parcel.writeFloat(this.f859v);
    }
}
