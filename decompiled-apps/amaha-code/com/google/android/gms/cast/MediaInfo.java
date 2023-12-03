package com.google.android.gms.cast;

import aa.f;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.k;
import com.google.android.gms.internal.cast.m;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import hc.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import k9.b;
import k9.i;
import k9.i0;
import k9.o;
import k9.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w9.a;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public class MediaInfo extends a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MediaInfo> CREATOR = new i0();
    public final o A;
    public String B;
    public List<b> C;
    public List<k9.a> D;
    public final String E;
    public final p F;
    public final long G;
    public final String H;
    public final String I;
    public final String J;
    public final String K;
    public final JSONObject L;

    /* renamed from: u  reason: collision with root package name */
    public final String f7259u;

    /* renamed from: v  reason: collision with root package name */
    public final int f7260v;

    /* renamed from: w  reason: collision with root package name */
    public final String f7261w;

    /* renamed from: x  reason: collision with root package name */
    public final i f7262x;

    /* renamed from: y  reason: collision with root package name */
    public final long f7263y;

    /* renamed from: z  reason: collision with root package name */
    public final List<MediaTrack> f7264z;

    public MediaInfo(String str, int i6, String str2, i iVar, long j10, ArrayList arrayList, o oVar, String str3, ArrayList arrayList2, ArrayList arrayList3, String str4, p pVar, long j11, String str5, String str6, String str7, String str8) {
        this.f7259u = str;
        this.f7260v = i6;
        this.f7261w = str2;
        this.f7262x = iVar;
        this.f7263y = j10;
        this.f7264z = arrayList;
        this.A = oVar;
        this.B = str3;
        if (str3 != null) {
            try {
                this.L = new JSONObject(str3);
            } catch (JSONException unused) {
                this.L = null;
                this.B = null;
            }
        } else {
            this.L = null;
        }
        this.C = arrayList2;
        this.D = arrayList3;
        this.E = str4;
        this.F = pVar;
        this.G = j11;
        this.H = str5;
        this.I = str6;
        this.J = str7;
        this.K = str8;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.L;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = mediaInfo.L;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || f.a(jSONObject, jSONObject2)) && p9.a.e(this.f7259u, mediaInfo.f7259u) && this.f7260v == mediaInfo.f7260v && p9.a.e(this.f7261w, mediaInfo.f7261w) && p9.a.e(this.f7262x, mediaInfo.f7262x) && this.f7263y == mediaInfo.f7263y && p9.a.e(this.f7264z, mediaInfo.f7264z) && p9.a.e(this.A, mediaInfo.A) && p9.a.e(this.C, mediaInfo.C) && p9.a.e(this.D, mediaInfo.D) && p9.a.e(this.E, mediaInfo.E) && p9.a.e(this.F, mediaInfo.F) && this.G == mediaInfo.G && p9.a.e(this.H, mediaInfo.H) && p9.a.e(this.I, mediaInfo.I) && p9.a.e(this.J, mediaInfo.J) && p9.a.e(this.K, mediaInfo.K)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[LOOP:0: B:5:0x0022->B:27:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198 A[LOOP:2: B:33:0x00d0->B:65:0x0198, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0(JSONObject jSONObject) {
        k9.a aVar;
        String string;
        long c10;
        String b10;
        String b11;
        String str;
        String b12;
        JSONObject optJSONObject;
        String b13;
        String b14;
        long j10;
        long j11;
        String b15;
        p pVar;
        String str2;
        b bVar;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i6 = 0;
            while (true) {
                if (i6 >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i6);
                if (jSONObject2 != null && jSONObject2.has("id") && jSONObject2.has(Constants.DAYMODEL_POSITION)) {
                    try {
                        String string2 = jSONObject2.getString("id");
                        long c11 = p9.a.c(jSONObject2.getLong(Constants.DAYMODEL_POSITION));
                        boolean optBoolean = jSONObject2.optBoolean("isWatched");
                        long c12 = p9.a.c(jSONObject2.optLong("duration"));
                        JSONArray optJSONArray = jSONObject2.optJSONArray("breakClipIds");
                        String[] strArr = new String[0];
                        if (optJSONArray != null) {
                            strArr = new String[optJSONArray.length()];
                            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                                strArr[i10] = optJSONArray.getString(i10);
                            }
                        }
                        bVar = new b(c11, string2, c12, optBoolean, strArr, jSONObject2.optBoolean("isEmbedded"), jSONObject2.optBoolean("expanded"));
                    } catch (JSONException e10) {
                        Log.d("AdBreakInfo", String.format(Locale.ROOT, "Error while creating an AdBreakInfo from JSON: %s", e10.getMessage()));
                    }
                    if (bVar == null) {
                        arrayList.add(bVar);
                        i6++;
                    } else {
                        arrayList.clear();
                        break;
                    }
                }
                bVar = null;
                if (bVar == null) {
                }
            }
            this.C = new ArrayList(arrayList);
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            int i11 = 0;
            while (true) {
                if (i11 >= jSONArray2.length()) {
                    break;
                }
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                if (jSONObject3 != null && jSONObject3.has("id")) {
                    try {
                        string = jSONObject3.getString("id");
                        c10 = p9.a.c(jSONObject3.optLong("duration"));
                        b10 = p9.a.b(jSONObject3, "clickThroughUrl");
                        b11 = p9.a.b(jSONObject3, "contentUrl");
                        String b16 = p9.a.b(jSONObject3, "mimeType");
                        if (b16 == null) {
                            b16 = p9.a.b(jSONObject3, SessionManager.KEY_CONTENTTYPE);
                        }
                        str = b16;
                        b12 = p9.a.b(jSONObject3, "title");
                        optJSONObject = jSONObject3.optJSONObject("customData");
                        b13 = p9.a.b(jSONObject3, "contentId");
                        b14 = p9.a.b(jSONObject3, "posterUrl");
                        if (jSONObject3.has("whenSkippable")) {
                            j10 = p9.a.c(((Integer) jSONObject3.get("whenSkippable")).intValue());
                        } else {
                            j10 = -1;
                        }
                        j11 = j10;
                        b15 = p9.a.b(jSONObject3, "hlsSegmentFormat");
                        JSONObject optJSONObject2 = jSONObject3.optJSONObject("vastAdsRequest");
                        if (optJSONObject2 == null) {
                            pVar = null;
                        } else {
                            pVar = new p(p9.a.b(optJSONObject2, "adTagUrl"), p9.a.b(optJSONObject2, "adsResponse"));
                        }
                    } catch (JSONException e11) {
                        Log.d("AdBreakClipInfo", String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", e11.getMessage()));
                    }
                    if (optJSONObject != null && optJSONObject.length() != 0) {
                        str2 = optJSONObject.toString();
                        aVar = new k9.a(string, b12, c10, b11, str, b10, str2, b13, b14, j11, b15, pVar);
                        if (aVar != null) {
                            arrayList2.add(aVar);
                            i11++;
                        } else {
                            arrayList2.clear();
                            break;
                        }
                    }
                    str2 = null;
                    aVar = new k9.a(string, b12, c10, b11, str, b10, str2, b13, b14, j11, b15, pVar);
                    if (aVar != null) {
                    }
                }
                aVar = null;
                if (aVar != null) {
                }
            }
            this.D = new ArrayList(arrayList2);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7259u, Integer.valueOf(this.f7260v), this.f7261w, this.f7262x, Long.valueOf(this.f7263y), String.valueOf(this.L), this.f7264z, this.A, this.C, this.D, this.E, this.F, Long.valueOf(this.G), this.H, this.J, this.K});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        String jSONObject;
        List unmodifiableList;
        List list = null;
        JSONObject jSONObject2 = this.L;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.B = jSONObject;
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 2, this.f7259u);
        d.s0(parcel, 3, this.f7260v);
        d.x0(parcel, 4, this.f7261w);
        d.w0(parcel, 5, this.f7262x, i6);
        d.u0(parcel, 6, this.f7263y);
        d.A0(parcel, 7, this.f7264z);
        d.w0(parcel, 8, this.A, i6);
        d.x0(parcel, 9, this.B);
        List<b> list2 = this.C;
        if (list2 == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        d.A0(parcel, 10, unmodifiableList);
        List<k9.a> list3 = this.D;
        if (list3 != null) {
            list = Collections.unmodifiableList(list3);
        }
        d.A0(parcel, 11, list);
        d.x0(parcel, 12, this.E);
        d.w0(parcel, 13, this.F, i6);
        d.u0(parcel, 14, this.G);
        d.x0(parcel, 15, this.H);
        d.x0(parcel, 16, this.I);
        d.x0(parcel, 17, this.J);
        d.x0(parcel, 18, this.K);
        d.C0(parcel, B0);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaInfo(JSONObject jSONObject) {
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        MediaInfo mediaInfo;
        p pVar;
        int i6;
        int i10;
        int i11;
        com.google.android.gms.internal.cast.p pVar2;
        com.google.android.gms.internal.cast.p pVar3;
        String optString = jSONObject.optString("streamType", "NONE");
        if ("NONE".equals(optString)) {
            mediaInfo = this;
            mediaInfo.f7260v = 0;
        } else {
            mediaInfo = this;
            if ("BUFFERED".equals(optString)) {
                mediaInfo.f7260v = 1;
            } else if ("LIVE".equals(optString)) {
                mediaInfo.f7260v = 2;
            } else {
                mediaInfo.f7260v = -1;
            }
        }
        mediaInfo.f7261w = p9.a.b(jSONObject, SessionManager.KEY_CONTENTTYPE);
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            i iVar = new i(jSONObject2.getInt("metadataType"));
            mediaInfo.f7262x = iVar;
            iVar.g0(jSONObject2);
        }
        mediaInfo.f7263y = -1L;
        if (jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double optDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble)) {
                mediaInfo.f7263y = p9.a.c(optDouble);
            }
        }
        int i12 = 4;
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i13 = 0;
            while (i13 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i13);
                long j10 = jSONObject3.getLong("trackId");
                String optString2 = jSONObject3.optString("type");
                if ("TEXT".equals(optString2)) {
                    i10 = 1;
                } else if ("AUDIO".equals(optString2)) {
                    i10 = 2;
                } else {
                    i10 = "VIDEO".equals(optString2) ? 3 : 0;
                }
                String b10 = p9.a.b(jSONObject3, "trackContentId");
                String b11 = p9.a.b(jSONObject3, "trackContentType");
                String b12 = p9.a.b(jSONObject3, SessionManager.KEY_NAME);
                String b13 = p9.a.b(jSONObject3, "language");
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i11 = 1;
                    } else if ("CAPTIONS".equals(string)) {
                        i11 = 2;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i11 = 3;
                    } else if ("CHAPTERS".equals(string)) {
                        i11 = 4;
                    } else {
                        i11 = "METADATA".equals(string) ? 5 : -1;
                    }
                } else {
                    i11 = 0;
                }
                if (jSONObject3.has("roles")) {
                    k kVar = m.f7588v;
                    Object[] objArr = new Object[i12];
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < jSONArray2.length()) {
                        String optString3 = jSONArray2.optString(i14);
                        optString3.getClass();
                        int i16 = i15 + 1;
                        int length = objArr.length;
                        if (length < i16) {
                            int i17 = length + (length >> 1) + 1;
                            if (i17 < i16) {
                                int highestOneBit = Integer.highestOneBit(i16 - 1);
                                i17 = highestOneBit + highestOneBit;
                            }
                            objArr = Arrays.copyOf(objArr, i17 < 0 ? SubsamplingScaleImageView.TILE_SIZE_AUTO : i17);
                        }
                        objArr[i15] = optString3;
                        i14++;
                        i15 = i16;
                    }
                    if (i15 == 0) {
                        pVar3 = com.google.android.gms.internal.cast.p.f7614y;
                    } else {
                        pVar3 = new com.google.android.gms.internal.cast.p(i15, objArr);
                    }
                    pVar2 = pVar3;
                } else {
                    pVar2 = null;
                }
                arrayList.add(new MediaTrack(j10, i10, b10, b11, b12, b13, i11, pVar2, jSONObject3.optJSONObject("customData")));
                i13++;
                i12 = 4;
            }
            mediaInfo.f7264z = new ArrayList(arrayList);
        } else {
            mediaInfo.f7264z = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            o oVar = new o();
            oVar.f23176u = (float) jSONObject4.optDouble("fontScale", 1.0d);
            oVar.f23177v = o.f0(jSONObject4.optString("foregroundColor"));
            oVar.f23178w = o.f0(jSONObject4.optString("backgroundColor"));
            if (jSONObject4.has("edgeType")) {
                String string2 = jSONObject4.getString("edgeType");
                if ("NONE".equals(string2)) {
                    oVar.f23179x = 0;
                } else if ("OUTLINE".equals(string2)) {
                    oVar.f23179x = 1;
                } else if ("DROP_SHADOW".equals(string2)) {
                    oVar.f23179x = 2;
                } else if ("RAISED".equals(string2)) {
                    oVar.f23179x = 3;
                } else if ("DEPRESSED".equals(string2)) {
                    oVar.f23179x = 4;
                }
            }
            oVar.f23180y = o.f0(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string3 = jSONObject4.getString("windowType");
                if ("NONE".equals(string3)) {
                    oVar.f23181z = 0;
                } else if ("NORMAL".equals(string3)) {
                    oVar.f23181z = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    i6 = 2;
                    oVar.f23181z = 2;
                    oVar.A = o.f0(jSONObject4.optString("windowColor"));
                    if (oVar.f23181z == i6) {
                        oVar.B = jSONObject4.optInt("windowRoundedCornerRadius", 0);
                    }
                    oVar.C = p9.a.b(jSONObject4, "fontFamily");
                    if (jSONObject4.has("fontGenericFamily")) {
                        String string4 = jSONObject4.getString("fontGenericFamily");
                        if ("SANS_SERIF".equals(string4)) {
                            oVar.D = 0;
                        } else if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                            oVar.D = 1;
                        } else if ("SERIF".equals(string4)) {
                            oVar.D = 2;
                        } else if ("MONOSPACED_SERIF".equals(string4)) {
                            oVar.D = 3;
                        } else if ("CASUAL".equals(string4)) {
                            oVar.D = 4;
                        } else if ("CURSIVE".equals(string4)) {
                            oVar.D = 5;
                        } else if ("SMALL_CAPITALS".equals(string4)) {
                            oVar.D = 6;
                        }
                    }
                    if (jSONObject4.has("fontStyle")) {
                        String string5 = jSONObject4.getString("fontStyle");
                        if ("NORMAL".equals(string5)) {
                            oVar.E = 0;
                        } else if ("BOLD".equals(string5)) {
                            oVar.E = 1;
                        } else if ("ITALIC".equals(string5)) {
                            oVar.E = 2;
                        } else if ("BOLD_ITALIC".equals(string5)) {
                            oVar.E = 3;
                        }
                    }
                    oVar.G = jSONObject4.optJSONObject("customData");
                    mediaInfo.A = oVar;
                    pVar = null;
                }
            }
            i6 = 2;
            oVar.A = o.f0(jSONObject4.optString("windowColor"));
            if (oVar.f23181z == i6) {
            }
            oVar.C = p9.a.b(jSONObject4, "fontFamily");
            if (jSONObject4.has("fontGenericFamily")) {
            }
            if (jSONObject4.has("fontStyle")) {
            }
            oVar.G = jSONObject4.optJSONObject("customData");
            mediaInfo.A = oVar;
            pVar = null;
        } else {
            pVar = null;
            mediaInfo.A = null;
        }
        f0(jSONObject);
        mediaInfo.L = jSONObject.optJSONObject("customData");
        mediaInfo.E = p9.a.b(jSONObject, "entity");
        mediaInfo.H = p9.a.b(jSONObject, "atvEntity");
        JSONObject optJSONObject = jSONObject.optJSONObject("vmapAdsRequest");
        mediaInfo.F = optJSONObject == null ? pVar : new p(p9.a.b(optJSONObject, "adTagUrl"), p9.a.b(optJSONObject, "adsResponse"));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= 0.0d) {
                mediaInfo.G = p9.a.c(optDouble2);
            }
        }
        if (jSONObject.has("contentUrl")) {
            mediaInfo.I = jSONObject.optString("contentUrl");
        }
        mediaInfo.J = p9.a.b(jSONObject, "hlsSegmentFormat");
        mediaInfo.K = p9.a.b(jSONObject, "hlsVideoSegmentFormat");
    }
}
