package k9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class i extends w9.a {

    /* renamed from: y  reason: collision with root package name */
    public static final s1.s f23144y;

    /* renamed from: u  reason: collision with root package name */
    public final List<u9.a> f23145u;

    /* renamed from: v  reason: collision with root package name */
    public final Bundle f23146v;

    /* renamed from: w  reason: collision with root package name */
    public int f23147w;

    /* renamed from: x  reason: collision with root package name */
    public static final String[] f23143x = {Constants.SUBSCRIPTION_NONE, "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    @RecentlyNonNull
    public static final Parcelable.Creator<i> CREATOR = new k0();

    static {
        s1.s sVar = new s1.s(10);
        sVar.M(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
        sVar.M(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
        sVar.M(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
        sVar.M(1, "com.google.android.gms.cast.metadata.TITLE", "title");
        sVar.M(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
        sVar.M(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
        sVar.M(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
        sVar.M(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
        sVar.M(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
        sVar.M(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
        sVar.M(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
        sVar.M(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", "season");
        sVar.M(2, "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode");
        sVar.M(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
        sVar.M(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
        sVar.M(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
        sVar.M(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
        sVar.M(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
        sVar.M(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
        sVar.M(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
        sVar.M(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
        sVar.M(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
        sVar.M(5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime");
        sVar.M(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
        sVar.M(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
        sVar.M(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
        sVar.M(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
        sVar.M(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
        f23144y = sVar;
    }

    public i() {
        this(0);
    }

    public static boolean h0(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !h0((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (h0(this.f23146v, iVar.f23146v) && this.f23145u.equals(iVar.f23145u)) {
            return true;
        }
        return false;
    }

    @RecentlyNullable
    public final String f0(@RecentlyNonNull String str) {
        if (!TextUtils.isEmpty(str)) {
            int N = f23144y.N(str);
            if (N != 1 && N != 0) {
                String str2 = f23143x[1];
                StringBuilder sb2 = new StringBuilder(str.length() + 21 + String.valueOf(str2).length());
                sb2.append("Value for ");
                sb2.append(str);
                sb2.append(" must be a ");
                sb2.append(str2);
                throw new IllegalArgumentException(sb2.toString());
            }
            return this.f23146v.getString(str);
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    public final void g0(@RecentlyNonNull JSONObject jSONObject) {
        Bundle bundle = this.f23146v;
        bundle.clear();
        List<u9.a> list = this.f23145u;
        list.clear();
        this.f23147w = 0;
        try {
            this.f23147w = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            p9.b bVar = q9.b.f29403a;
            try {
                list.clear();
                for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                    try {
                        list.add(new u9.a(optJSONArray.getJSONObject(i6)));
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            } catch (JSONException unused3) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i10 = this.f23147w;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                        } else {
                            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                        }
                    } else {
                        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                    }
                } else {
                    Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                }
            } else {
                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
            }
        } else {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    s1.s sVar = f23144y;
                    String str = (String) ((Map) sVar.f31225w).get(next);
                    if (str != null) {
                        if (hashSet.contains(str)) {
                            try {
                                Object obj = jSONObject.get(next);
                                if (obj != null) {
                                    int N = sVar.N(str);
                                    if (N != 1) {
                                        if (N != 2) {
                                            if (N != 3) {
                                                if (N != 4) {
                                                    if (N == 5) {
                                                        bundle.putLong(str, p9.a.c(jSONObject.optLong(next)));
                                                    }
                                                } else if (obj instanceof String) {
                                                    String str2 = (String) obj;
                                                    if (q9.b.a(str2) != null) {
                                                        bundle.putString(str, str2);
                                                    }
                                                }
                                            } else {
                                                double optDouble = jSONObject.optDouble(next);
                                                if (!Double.isNaN(optDouble)) {
                                                    bundle.putDouble(str, optDouble);
                                                }
                                            }
                                        } else if (obj instanceof Integer) {
                                            bundle.putInt(str, ((Integer) obj).intValue());
                                        }
                                    } else if (obj instanceof String) {
                                        bundle.putString(str, (String) obj);
                                    }
                                }
                            } catch (JSONException unused4) {
                            }
                        }
                    } else {
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof String) {
                            bundle.putString(next, (String) obj2);
                        } else if (obj2 instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Double) {
                            bundle.putDouble(next, ((Double) obj2).doubleValue());
                        }
                    }
                }
            }
        } catch (JSONException unused5) {
        }
    }

    public final int hashCode() {
        int i6;
        int i10 = 17;
        Bundle bundle = this.f23146v;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                int i11 = i10 * 31;
                if (obj != null) {
                    i6 = obj.hashCode();
                } else {
                    i6 = 0;
                }
                i10 = i11 + i6;
            }
        }
        return this.f23145u.hashCode() + (i10 * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.A0(parcel, 2, this.f23145u);
        hc.d.p0(parcel, 3, this.f23146v);
        hc.d.s0(parcel, 4, this.f23147w);
        hc.d.C0(parcel, B0);
    }

    public i(int i6) {
        this(new ArrayList(), new Bundle(), i6);
    }

    public i(ArrayList arrayList, Bundle bundle, int i6) {
        this.f23145u = arrayList;
        this.f23146v = bundle;
        this.f23147w = i6;
    }
}
