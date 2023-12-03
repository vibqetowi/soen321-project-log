package k9;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.cast.MediaInfo;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;
import k9.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class n extends w9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<n> CREATOR;
    public long A;
    public long B;
    public double C;
    public boolean D;
    public long[] E;
    public int F;
    public int G;
    public String H;
    public JSONObject I;
    public int J;
    public boolean L;
    public c M;
    public q N;
    public h O;
    public k P;

    /* renamed from: u  reason: collision with root package name */
    public MediaInfo f23170u;

    /* renamed from: v  reason: collision with root package name */
    public long f23171v;

    /* renamed from: w  reason: collision with root package name */
    public int f23172w;

    /* renamed from: x  reason: collision with root package name */
    public double f23173x;

    /* renamed from: y  reason: collision with root package name */
    public int f23174y;

    /* renamed from: z  reason: collision with root package name */
    public int f23175z;
    public final ArrayList K = new ArrayList();
    public final SparseArray<Integer> Q = new SparseArray<>();

    static {
        v9.o.f("The log tag cannot be null or empty.", "MediaStatus");
        CREATOR = new p0();
    }

    public n(MediaInfo mediaInfo, long j10, int i6, double d10, int i10, int i11, long j11, long j12, double d11, boolean z10, long[] jArr, int i12, int i13, String str, int i14, ArrayList arrayList, boolean z11, c cVar, q qVar, h hVar, k kVar) {
        this.f23170u = mediaInfo;
        this.f23171v = j10;
        this.f23172w = i6;
        this.f23173x = d10;
        this.f23174y = i10;
        this.f23175z = i11;
        this.A = j11;
        this.B = j12;
        this.C = d11;
        this.D = z10;
        this.E = jArr;
        this.F = i12;
        this.G = i13;
        this.H = str;
        if (str != null) {
            try {
                this.I = new JSONObject(str);
            } catch (JSONException unused) {
                this.I = null;
                this.H = null;
            }
        } else {
            this.I = null;
        }
        this.J = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            g0(arrayList);
        }
        this.L = z11;
        this.M = cVar;
        this.N = qVar;
        this.O = hVar;
        this.P = kVar;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.I != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (nVar.I != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 == z11 && this.f23171v == nVar.f23171v && this.f23172w == nVar.f23172w && this.f23173x == nVar.f23173x && this.f23174y == nVar.f23174y && this.f23175z == nVar.f23175z && this.A == nVar.A && this.C == nVar.C && this.D == nVar.D && this.F == nVar.F && this.G == nVar.G && this.J == nVar.J && Arrays.equals(this.E, nVar.E) && p9.a.e(Long.valueOf(this.B), Long.valueOf(nVar.B)) && p9.a.e(this.K, nVar.K) && p9.a.e(this.f23170u, nVar.f23170u) && (((jSONObject = this.I) == null || (jSONObject2 = nVar.I) == null || aa.f.a(jSONObject, jSONObject2)) && this.L == nVar.L && p9.a.e(this.M, nVar.M) && p9.a.e(this.N, nVar.N) && p9.a.e(this.O, nVar.O) && v9.m.a(this.P, nVar.P))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a8, code lost:
        if (r19.E != null) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x022e, code lost:
        if (r5 != 3) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0231, code lost:
        if (r3 != 2) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0234, code lost:
        if (r9 == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0315, code lost:
        if (r0 == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x054f, code lost:
        if (r10.equals("AUDIOBOOK_CONTAINER") == false) goto L227;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0375 A[Catch: JSONException -> 0x0383, TryCatch #3 {JSONException -> 0x0383, blocks: (B:205:0x034b, B:207:0x0375, B:208:0x037a), top: B:406:0x034b }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0393 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0441 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x03bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f0(int i6, @RecentlyNonNull JSONObject jSONObject) {
        JSONObject jSONObject2;
        long j10;
        int i10;
        JSONArray jSONArray;
        long[] jArr;
        int optInt;
        int optInt2;
        MediaInfo mediaInfo;
        int i11;
        int i12;
        boolean z10;
        JSONObject optJSONObject;
        c cVar;
        c cVar2;
        JSONObject optJSONObject2;
        char c10;
        int i13;
        q qVar;
        q qVar2;
        h hVar;
        char c11;
        int i14;
        JSONObject jSONObject3;
        MediaInfo mediaInfo2;
        boolean z11;
        long optLong;
        boolean z12;
        boolean z13;
        l lVar;
        MediaInfo mediaInfo3;
        int intValue;
        int i15;
        double d10;
        boolean z14;
        int i16;
        int i17;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("extendedStatus");
        if (optJSONObject3 != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    arrayList.add(keys.next());
                }
                jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList.toArray(new String[0]));
                Iterator<String> keys2 = optJSONObject3.keys();
                while (keys2.hasNext()) {
                    String next = keys2.next();
                    jSONObject2.put(next, optJSONObject3.get(next));
                }
                jSONObject2.remove("extendedStatus");
            } catch (JSONException unused) {
            }
            j10 = jSONObject2.getLong("mediaSessionId");
            if (j10 == this.f23171v) {
                this.f23171v = j10;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (jSONObject2.has("playerState")) {
                String string = jSONObject2.getString("playerState");
                if (string.equals("IDLE")) {
                    i16 = 1;
                } else if (string.equals("PLAYING")) {
                    i16 = 2;
                } else if (string.equals("PAUSED")) {
                    i16 = 3;
                } else if (string.equals("BUFFERING")) {
                    i16 = 4;
                } else if (string.equals("LOADING")) {
                    i16 = 5;
                } else {
                    i16 = 0;
                }
                if (i16 != this.f23174y) {
                    this.f23174y = i16;
                    i10 |= 2;
                }
                if (i16 == 1 && jSONObject2.has("idleReason")) {
                    String string2 = jSONObject2.getString("idleReason");
                    if (string2.equals("CANCELLED")) {
                        i17 = 2;
                    } else if (string2.equals("INTERRUPTED")) {
                        i17 = 3;
                    } else if (string2.equals("FINISHED")) {
                        i17 = 1;
                    } else if (string2.equals("ERROR")) {
                        i17 = 4;
                    } else {
                        i17 = 0;
                    }
                    if (i17 != this.f23175z) {
                        this.f23175z = i17;
                        i10 |= 2;
                    }
                }
            }
            if (jSONObject2.has("playbackRate")) {
                double d11 = jSONObject2.getDouble("playbackRate");
                if (this.f23173x != d11) {
                    this.f23173x = d11;
                    i10 |= 2;
                }
            }
            if (jSONObject2.has("currentTime")) {
                long c12 = p9.a.c(jSONObject2.getDouble("currentTime"));
                if (c12 != this.A) {
                    this.A = c12;
                    i10 |= 2;
                }
                i10 |= 128;
            }
            if (jSONObject2.has("supportedMediaCommands")) {
                long j11 = jSONObject2.getLong("supportedMediaCommands");
                if (j11 != this.B) {
                    this.B = j11;
                    i10 |= 2;
                }
            }
            if (jSONObject2.has("volume") && i6 == 0) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("volume");
                d10 = jSONObject4.getDouble("level");
                if (d10 != this.C) {
                    this.C = d10;
                    i10 |= 2;
                }
                z14 = jSONObject4.getBoolean("muted");
                if (z14 != this.D) {
                    this.D = z14;
                    i10 |= 2;
                }
            }
            if (!jSONObject2.has("activeTrackIds")) {
                jSONArray = jSONObject2.getJSONArray("activeTrackIds");
            } else {
                jSONArray = null;
            }
            Pattern pattern = p9.a.f28027a;
            if (jSONArray != null) {
                jArr = null;
            } else {
                jArr = new long[jSONArray.length()];
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    jArr[i18] = jSONArray.getLong(i18);
                }
            }
            if (jArr == null) {
                long[] jArr2 = this.E;
                if (jArr2 != null && jArr2.length == jArr.length) {
                    for (int i19 = 0; i19 < jArr.length; i19++) {
                        if (this.E[i19] == jArr[i19]) {
                        }
                    }
                }
                this.E = jArr;
                i10 |= 2;
                break;
            }
            if (jSONObject2.has("customData")) {
                this.I = jSONObject2.getJSONObject("customData");
                this.H = null;
                i10 |= 2;
            }
            if (jSONObject2.has("media")) {
                JSONObject jSONObject5 = jSONObject2.getJSONObject("media");
                MediaInfo mediaInfo4 = new MediaInfo(jSONObject5);
                MediaInfo mediaInfo5 = this.f23170u;
                if (mediaInfo5 == null || !mediaInfo5.equals(mediaInfo4)) {
                    this.f23170u = mediaInfo4;
                    i10 |= 2;
                }
                if (jSONObject5.has("metadata")) {
                    i10 |= 4;
                }
            }
            if (jSONObject2.has("currentItemId") && this.f23172w != (i15 = jSONObject2.getInt("currentItemId"))) {
                this.f23172w = i15;
                i10 |= 2;
            }
            optInt = jSONObject2.optInt("preloadedItemId", 0);
            if (this.G != optInt) {
                this.G = optInt;
                i10 |= 16;
            }
            optInt2 = jSONObject2.optInt("loadingItemId", 0);
            if (this.F != optInt2) {
                this.F = optInt2;
                i10 |= 2;
            }
            mediaInfo = this.f23170u;
            if (mediaInfo != null) {
                i11 = -1;
            } else {
                i11 = mediaInfo.f7260v;
            }
            i12 = this.f23174y;
            int i20 = this.f23175z;
            int i21 = this.F;
            if (i12 == 1) {
                if (i20 != 1) {
                    if (i20 != 2) {
                    }
                    z10 = true;
                    ArrayList arrayList2 = this.K;
                    SparseArray<Integer> sparseArray = this.Q;
                    if (!z10) {
                        if (jSONObject2.has("repeatMode")) {
                            Integer a10 = q9.a.a(jSONObject2.getString("repeatMode"));
                            if (a10 == null) {
                                intValue = this.J;
                            } else {
                                intValue = a10.intValue();
                            }
                            Integer valueOf = Integer.valueOf(intValue);
                            if (this.J != valueOf.intValue()) {
                                this.J = valueOf.intValue();
                                z12 = true;
                                if (jSONObject2.has("items")) {
                                    JSONArray jSONArray2 = jSONObject2.getJSONArray("items");
                                    int length = jSONArray2.length();
                                    SparseArray sparseArray2 = new SparseArray();
                                    for (int i22 = 0; i22 < length; i22++) {
                                        sparseArray2.put(i22, Integer.valueOf(jSONArray2.getJSONObject(i22).getInt("itemId")));
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    for (int i23 = 0; i23 < length; i23++) {
                                        Integer num = (Integer) sparseArray2.get(i23);
                                        JSONObject jSONObject6 = jSONArray2.getJSONObject(i23);
                                        Integer num2 = sparseArray.get(num.intValue());
                                        if (num2 == null) {
                                            lVar = null;
                                        } else {
                                            lVar = (l) arrayList2.get(num2.intValue());
                                        }
                                        if (lVar != null) {
                                            z12 |= lVar.f0(jSONObject6);
                                            arrayList3.add(lVar);
                                            if (i23 == sparseArray.get(num.intValue()).intValue()) {
                                            }
                                        } else if (num.intValue() == this.f23172w && (mediaInfo3 = this.f23170u) != null) {
                                            l a11 = new l.a(mediaInfo3).a();
                                            a11.f0(jSONObject6);
                                            arrayList3.add(a11);
                                        } else {
                                            arrayList3.add(new l(jSONObject6));
                                        }
                                        z12 = true;
                                    }
                                    if (arrayList2.size() != length) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    z12 |= !z13;
                                    g0(arrayList3);
                                }
                            }
                        }
                        z12 = false;
                        if (jSONObject2.has("items")) {
                        }
                    } else {
                        this.f23172w = 0;
                        this.F = 0;
                        this.G = 0;
                        if (!arrayList2.isEmpty()) {
                            this.J = 0;
                            arrayList2.clear();
                            sparseArray.clear();
                            i10 |= 8;
                        }
                    }
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<c> creator = c.CREATOR;
                    if (optJSONObject != null && optJSONObject.has("currentBreakTime") && optJSONObject.has("currentBreakClipTime")) {
                        try {
                            long c13 = p9.a.c(optJSONObject.getLong("currentBreakTime"));
                            long c14 = p9.a.c(optJSONObject.getLong("currentBreakClipTime"));
                            String b10 = p9.a.b(optJSONObject, "breakId");
                            String b11 = p9.a.b(optJSONObject, "breakClipId");
                            optLong = optJSONObject.optLong("whenSkippable", -1L);
                            if (optLong != -1) {
                                optLong = p9.a.c(optLong);
                            }
                            cVar = new c(c13, c14, b10, b11, optLong);
                        } catch (JSONException e10) {
                            c.f23089z.c("Error while creating an AdBreakClipInfo from JSON", e10, new Object[0]);
                        }
                        cVar2 = this.M;
                        if ((cVar2 == null && cVar != null) || (cVar2 != null && !cVar2.equals(cVar))) {
                            if (cVar == null && (cVar.f23092w != null || cVar.f23093x != null)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.L = z11;
                            this.M = cVar;
                            i10 |= 32;
                        }
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        p9.b bVar = q.f23184x;
                        if (optJSONObject2 != null) {
                            try {
                                String string3 = optJSONObject2.getString("hdrType");
                                int hashCode = string3.hashCode();
                                if (hashCode != 3218) {
                                    if (hashCode != 103158) {
                                        if (hashCode != 113729) {
                                            if (hashCode == 99136405 && string3.equals("hdr10")) {
                                                c10 = 1;
                                                if (c10 == 0) {
                                                    if (c10 != 1) {
                                                        if (c10 != 2) {
                                                            if (c10 != 3) {
                                                                bVar.b("Unknown HDR type: %s", string3);
                                                                i13 = 0;
                                                            } else {
                                                                i13 = 1;
                                                            }
                                                        } else {
                                                            i13 = 4;
                                                        }
                                                    } else {
                                                        i13 = 2;
                                                    }
                                                } else {
                                                    i13 = 3;
                                                }
                                                qVar = new q(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i13);
                                            }
                                            c10 = 65535;
                                            if (c10 == 0) {
                                            }
                                            qVar = new q(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i13);
                                        } else {
                                            if (string3.equals("sdr")) {
                                                c10 = 3;
                                                if (c10 == 0) {
                                                }
                                                qVar = new q(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i13);
                                            }
                                            c10 = 65535;
                                            if (c10 == 0) {
                                            }
                                            qVar = new q(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i13);
                                        }
                                    } else {
                                        if (string3.equals("hdr")) {
                                            c10 = 2;
                                            if (c10 == 0) {
                                            }
                                            qVar = new q(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i13);
                                        }
                                        c10 = 65535;
                                        if (c10 == 0) {
                                        }
                                        qVar = new q(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i13);
                                    }
                                } else {
                                    if (string3.equals("dv")) {
                                        c10 = 0;
                                        if (c10 == 0) {
                                        }
                                        qVar = new q(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i13);
                                    }
                                    c10 = 65535;
                                    if (c10 == 0) {
                                    }
                                    qVar = new q(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i13);
                                }
                            } catch (JSONException e11) {
                                bVar.a("Error while creating a VideoInfo instance from JSON", e11, new Object[0]);
                            }
                            qVar2 = this.N;
                            if ((qVar2 == null && qVar != null) || (qVar2 != null && !qVar2.equals(qVar))) {
                                this.N = qVar;
                                i10 |= 64;
                            }
                            if (jSONObject2.has("breakInfo") && (mediaInfo2 = this.f23170u) != null) {
                                mediaInfo2.f0(jSONObject2.getJSONObject("breakInfo"));
                                i10 |= 2;
                            }
                            if (jSONObject2.has("queueData")) {
                                k kVar = new k(0);
                                JSONObject jSONObject7 = jSONObject2.getJSONObject("queueData");
                                kVar.f0();
                                if (jSONObject7 != null) {
                                    kVar.f23153u = p9.a.b(jSONObject7, "id");
                                    kVar.f23154v = p9.a.b(jSONObject7, "entity");
                                    String optString = jSONObject7.optString("queueType");
                                    int i24 = 7;
                                    switch (optString.hashCode()) {
                                        case -1803151310:
                                            if (optString.equals("PODCAST_SERIES")) {
                                                c11 = 4;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1758903120:
                                            if (optString.equals("RADIO_STATION")) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1632865838:
                                            if (optString.equals("PLAYLIST")) {
                                                c11 = 1;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1319760993:
                                            if (optString.equals("AUDIOBOOK")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1088524588:
                                            if (optString.equals("TV_SERIES")) {
                                                c11 = 5;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 62359119:
                                            if (optString.equals("ALBUM")) {
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 73549584:
                                            if (optString.equals("MOVIE")) {
                                                c11 = '\b';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 393100598:
                                            if (optString.equals("VIDEO_PLAYLIST")) {
                                                c11 = 6;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 902303413:
                                            if (optString.equals("LIVE_TV")) {
                                                c11 = 7;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        default:
                                            c11 = 65535;
                                            break;
                                    }
                                    switch (c11) {
                                        case 0:
                                            i14 = 1;
                                            kVar.f23155w = 1;
                                            break;
                                        case 1:
                                            i24 = 2;
                                            kVar.f23155w = i24;
                                            i14 = 1;
                                            break;
                                        case 2:
                                            i24 = 3;
                                            kVar.f23155w = i24;
                                            i14 = 1;
                                            break;
                                        case 3:
                                            i24 = 4;
                                            kVar.f23155w = i24;
                                            i14 = 1;
                                            break;
                                        case 4:
                                            i24 = 5;
                                            kVar.f23155w = i24;
                                            i14 = 1;
                                            break;
                                        case 5:
                                            i24 = 6;
                                            kVar.f23155w = i24;
                                            i14 = 1;
                                            break;
                                        case 6:
                                            kVar.f23155w = i24;
                                            i14 = 1;
                                            break;
                                        case 7:
                                            kVar.f23155w = 8;
                                            i14 = 1;
                                            break;
                                        case '\b':
                                            i24 = 9;
                                            kVar.f23155w = i24;
                                            i14 = 1;
                                            break;
                                        default:
                                            i14 = 1;
                                            break;
                                    }
                                    kVar.f23156x = p9.a.b(jSONObject7, SessionManager.KEY_NAME);
                                    if (jSONObject7.has("containerMetadata")) {
                                        jSONObject3 = jSONObject7.optJSONObject("containerMetadata");
                                    } else {
                                        jSONObject3 = null;
                                    }
                                    if (jSONObject3 != null) {
                                        j jVar = new j(0);
                                        jVar.f0();
                                        String optString2 = jSONObject3.optString("containerType", "");
                                        optString2.getClass();
                                        if (optString2.equals("GENERIC_CONTAINER")) {
                                            i14 = 0;
                                        }
                                        jVar.f23148u = i14;
                                        jVar.f23149v = p9.a.b(jSONObject3, "title");
                                        JSONArray optJSONArray = jSONObject3.optJSONArray("sections");
                                        if (optJSONArray != null) {
                                            ArrayList arrayList4 = new ArrayList();
                                            jVar.f23150w = arrayList4;
                                            for (int i25 = 0; i25 < optJSONArray.length(); i25++) {
                                                JSONObject optJSONObject4 = optJSONArray.optJSONObject(i25);
                                                if (optJSONObject4 != null) {
                                                    i iVar = new i();
                                                    iVar.g0(optJSONObject4);
                                                    arrayList4.add(iVar);
                                                }
                                            }
                                        }
                                        JSONArray optJSONArray2 = jSONObject3.optJSONArray("containerImages");
                                        if (optJSONArray2 != null) {
                                            ArrayList arrayList5 = new ArrayList();
                                            jVar.f23151x = arrayList5;
                                            p9.b bVar2 = q9.b.f29403a;
                                            try {
                                                arrayList5.clear();
                                                for (int i26 = 0; i26 < optJSONArray2.length(); i26++) {
                                                    try {
                                                        arrayList5.add(new u9.a(optJSONArray2.getJSONObject(i26)));
                                                    } catch (IllegalArgumentException unused2) {
                                                    }
                                                }
                                            } catch (JSONException unused3) {
                                            }
                                        }
                                        jVar.f23152y = jSONObject3.optDouble("containerDuration", jVar.f23152y);
                                        kVar.f23157y = new j(jVar);
                                    }
                                    Integer a12 = q9.a.a(jSONObject7.optString("repeatMode"));
                                    if (a12 != null) {
                                        kVar.f23158z = a12.intValue();
                                    }
                                    JSONArray optJSONArray3 = jSONObject7.optJSONArray("items");
                                    if (optJSONArray3 != null) {
                                        ArrayList arrayList6 = new ArrayList();
                                        kVar.A = arrayList6;
                                        for (int i27 = 0; i27 < optJSONArray3.length(); i27++) {
                                            JSONObject optJSONObject5 = optJSONArray3.optJSONObject(i27);
                                            if (optJSONObject5 != null) {
                                                try {
                                                    arrayList6.add(new l(optJSONObject5));
                                                } catch (JSONException unused4) {
                                                }
                                            }
                                        }
                                    }
                                    kVar.B = jSONObject7.optInt("startIndex", kVar.B);
                                    if (jSONObject7.has("startTime")) {
                                        kVar.C = p9.a.c(jSONObject7.optDouble("startTime", kVar.C));
                                    }
                                }
                                this.P = new k(kVar);
                            }
                            if (!jSONObject2.has("liveSeekableRange")) {
                                JSONObject optJSONObject6 = jSONObject2.optJSONObject("liveSeekableRange");
                                Parcelable.Creator<h> creator2 = h.CREATOR;
                                if (optJSONObject6 != null && optJSONObject6.has("start") && optJSONObject6.has("end")) {
                                    try {
                                        hVar = new h(p9.a.c(optJSONObject6.getDouble("start")), p9.a.c(optJSONObject6.getDouble("end")), optJSONObject6.optBoolean("isMovingWindow"), optJSONObject6.optBoolean("isLiveDone"));
                                    } catch (JSONException unused5) {
                                        String valueOf2 = String.valueOf(optJSONObject6);
                                        h.f23138y.d(r1.b0.b(new StringBuilder(valueOf2.length() + 43), "Ignoring Malformed MediaLiveSeekableRange: ", valueOf2), new Object[0]);
                                    }
                                    this.O = hVar;
                                    return i10 | 2;
                                }
                                hVar = null;
                                this.O = hVar;
                                return i10 | 2;
                            }
                            if (this.O != null) {
                                i10 |= 2;
                            }
                            this.O = null;
                            return i10;
                        }
                        qVar = null;
                        qVar2 = this.N;
                        if (qVar2 == null) {
                            this.N = qVar;
                            i10 |= 64;
                            if (jSONObject2.has("breakInfo")) {
                                mediaInfo2.f0(jSONObject2.getJSONObject("breakInfo"));
                                i10 |= 2;
                            }
                            if (jSONObject2.has("queueData")) {
                            }
                            if (!jSONObject2.has("liveSeekableRange")) {
                            }
                        }
                        this.N = qVar;
                        i10 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        if (!jSONObject2.has("liveSeekableRange")) {
                        }
                    }
                    cVar = null;
                    cVar2 = this.M;
                    if (cVar2 == null) {
                        if (cVar == null) {
                        }
                        z11 = false;
                        this.L = z11;
                        this.M = cVar;
                        i10 |= 32;
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        p9.b bVar3 = q.f23184x;
                        if (optJSONObject2 != null) {
                        }
                        qVar = null;
                        qVar2 = this.N;
                        if (qVar2 == null) {
                        }
                        this.N = qVar;
                        i10 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        if (!jSONObject2.has("liveSeekableRange")) {
                        }
                    }
                    if (cVar == null) {
                    }
                    z11 = false;
                    this.L = z11;
                    this.M = cVar;
                    i10 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    p9.b bVar32 = q.f23184x;
                    if (optJSONObject2 != null) {
                    }
                    qVar = null;
                    qVar2 = this.N;
                    if (qVar2 == null) {
                    }
                    this.N = qVar;
                    i10 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    if (!jSONObject2.has("liveSeekableRange")) {
                    }
                }
            }
            z10 = false;
            ArrayList arrayList22 = this.K;
            SparseArray<Integer> sparseArray3 = this.Q;
            if (!z10) {
            }
            optJSONObject = jSONObject2.optJSONObject("breakStatus");
            Parcelable.Creator<c> creator3 = c.CREATOR;
            if (optJSONObject != null) {
                long c132 = p9.a.c(optJSONObject.getLong("currentBreakTime"));
                long c142 = p9.a.c(optJSONObject.getLong("currentBreakClipTime"));
                String b102 = p9.a.b(optJSONObject, "breakId");
                String b112 = p9.a.b(optJSONObject, "breakClipId");
                optLong = optJSONObject.optLong("whenSkippable", -1L);
                if (optLong != -1) {
                }
                cVar = new c(c132, c142, b102, b112, optLong);
                cVar2 = this.M;
                if (cVar2 == null) {
                }
                if (cVar == null) {
                }
                z11 = false;
                this.L = z11;
                this.M = cVar;
                i10 |= 32;
                optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                p9.b bVar322 = q.f23184x;
                if (optJSONObject2 != null) {
                }
                qVar = null;
                qVar2 = this.N;
                if (qVar2 == null) {
                }
                this.N = qVar;
                i10 |= 64;
                if (jSONObject2.has("breakInfo")) {
                }
                if (jSONObject2.has("queueData")) {
                }
                if (!jSONObject2.has("liveSeekableRange")) {
                }
            }
            cVar = null;
            cVar2 = this.M;
            if (cVar2 == null) {
            }
            if (cVar == null) {
            }
            z11 = false;
            this.L = z11;
            this.M = cVar;
            i10 |= 32;
            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
            p9.b bVar3222 = q.f23184x;
            if (optJSONObject2 != null) {
            }
            qVar = null;
            qVar2 = this.N;
            if (qVar2 == null) {
            }
            this.N = qVar;
            i10 |= 64;
            if (jSONObject2.has("breakInfo")) {
            }
            if (jSONObject2.has("queueData")) {
            }
            if (!jSONObject2.has("liveSeekableRange")) {
            }
        }
        jSONObject2 = jSONObject;
        j10 = jSONObject2.getLong("mediaSessionId");
        if (j10 == this.f23171v) {
        }
        if (jSONObject2.has("playerState")) {
        }
        if (jSONObject2.has("playbackRate")) {
        }
        if (jSONObject2.has("currentTime")) {
        }
        if (jSONObject2.has("supportedMediaCommands")) {
        }
        if (jSONObject2.has("volume")) {
            JSONObject jSONObject42 = jSONObject2.getJSONObject("volume");
            d10 = jSONObject42.getDouble("level");
            if (d10 != this.C) {
            }
            z14 = jSONObject42.getBoolean("muted");
            if (z14 != this.D) {
            }
        }
        if (!jSONObject2.has("activeTrackIds")) {
        }
        Pattern pattern2 = p9.a.f28027a;
        if (jSONArray != null) {
        }
        if (jArr == null) {
        }
        if (jSONObject2.has("customData")) {
        }
        if (jSONObject2.has("media")) {
        }
        if (jSONObject2.has("currentItemId")) {
            this.f23172w = i15;
            i10 |= 2;
        }
        optInt = jSONObject2.optInt("preloadedItemId", 0);
        if (this.G != optInt) {
        }
        optInt2 = jSONObject2.optInt("loadingItemId", 0);
        if (this.F != optInt2) {
        }
        mediaInfo = this.f23170u;
        if (mediaInfo != null) {
        }
        i12 = this.f23174y;
        int i202 = this.f23175z;
        int i212 = this.F;
        if (i12 == 1) {
        }
        z10 = false;
        ArrayList arrayList222 = this.K;
        SparseArray<Integer> sparseArray32 = this.Q;
        if (!z10) {
        }
        optJSONObject = jSONObject2.optJSONObject("breakStatus");
        Parcelable.Creator<c> creator32 = c.CREATOR;
        if (optJSONObject != null) {
        }
        cVar = null;
        cVar2 = this.M;
        if (cVar2 == null) {
        }
        if (cVar == null) {
        }
        z11 = false;
        this.L = z11;
        this.M = cVar;
        i10 |= 32;
        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
        p9.b bVar32222 = q.f23184x;
        if (optJSONObject2 != null) {
        }
        qVar = null;
        qVar2 = this.N;
        if (qVar2 == null) {
        }
        this.N = qVar;
        i10 |= 64;
        if (jSONObject2.has("breakInfo")) {
        }
        if (jSONObject2.has("queueData")) {
        }
        if (!jSONObject2.has("liveSeekableRange")) {
        }
    }

    public final void g0(ArrayList arrayList) {
        ArrayList arrayList2 = this.K;
        arrayList2.clear();
        SparseArray<Integer> sparseArray = this.Q;
        sparseArray.clear();
        if (arrayList != null) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                l lVar = (l) arrayList.get(i6);
                arrayList2.add(lVar);
                sparseArray.put(lVar.f23160v, Integer.valueOf(i6));
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23170u, Long.valueOf(this.f23171v), Integer.valueOf(this.f23172w), Double.valueOf(this.f23173x), Integer.valueOf(this.f23174y), Integer.valueOf(this.f23175z), Long.valueOf(this.A), Long.valueOf(this.B), Double.valueOf(this.C), Boolean.valueOf(this.D), Integer.valueOf(Arrays.hashCode(this.E)), Integer.valueOf(this.F), Integer.valueOf(this.G), String.valueOf(this.I), Integer.valueOf(this.J), this.K, Boolean.valueOf(this.L), this.M, this.N, this.O, this.P});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        String jSONObject;
        JSONObject jSONObject2 = this.I;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.H = jSONObject;
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.w0(parcel, 2, this.f23170u, i6);
        hc.d.u0(parcel, 3, this.f23171v);
        hc.d.s0(parcel, 4, this.f23172w);
        hc.d.q0(parcel, 5, this.f23173x);
        hc.d.s0(parcel, 6, this.f23174y);
        hc.d.s0(parcel, 7, this.f23175z);
        hc.d.u0(parcel, 8, this.A);
        hc.d.u0(parcel, 9, this.B);
        hc.d.q0(parcel, 10, this.C);
        hc.d.o0(parcel, 11, this.D);
        long[] jArr = this.E;
        if (jArr != null) {
            int B02 = hc.d.B0(parcel, 12);
            parcel.writeLongArray(jArr);
            hc.d.C0(parcel, B02);
        }
        hc.d.s0(parcel, 13, this.F);
        hc.d.s0(parcel, 14, this.G);
        hc.d.x0(parcel, 15, this.H);
        hc.d.s0(parcel, 16, this.J);
        hc.d.A0(parcel, 17, this.K);
        hc.d.o0(parcel, 18, this.L);
        hc.d.w0(parcel, 19, this.M, i6);
        hc.d.w0(parcel, 20, this.N, i6);
        hc.d.w0(parcel, 21, this.O, i6);
        hc.d.w0(parcel, 22, this.P, i6);
        hc.d.C0(parcel, B0);
    }
}
