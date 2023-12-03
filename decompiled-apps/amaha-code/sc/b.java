package sc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import com.facebook.FacebookException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.cast.w;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.p000firebaseauthapi.c7;
import com.google.android.gms.internal.p000firebaseauthapi.i6;
import com.google.android.gms.internal.p000firebaseauthapi.ka;
import com.google.android.gms.internal.p000firebaseauthapi.nc;
import com.google.android.gms.internal.p000firebaseauthapi.q7;
import com.google.android.gms.internal.p000firebaseauthapi.s7;
import com.google.android.gms.internal.p000firebaseauthapi.t7;
import com.google.android.gms.internal.p000firebaseauthapi.u7;
import com.google.android.gms.internal.p000firebaseauthapi.v7;
import com.google.android.gms.internal.p000firebaseauthapi.y6;
import com.google.android.gms.internal.p000firebaseauthapi.zzadn;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import g.x;
import gt.v0;
import gt.z0;
import h5.q;
import h5.v;
import is.u;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.internal.r;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.t1;
import kotlinx.coroutines.w1;
import kotlinx.coroutines.y;
import o8.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import su.t;
import ta.h2;
import ta.j2;
import uf.l;
import w5.k0;
import wu.a1;
import wu.b0;
import wu.d1;
import wu.f1;
import wu.n1;
import wu.w0;
import zu.n;
/* compiled from: DataCollectionDefaultChange.java */
/* loaded from: classes.dex */
public class b implements i6, k, u3.f, ta.e, h2, l {
    public static e0 N;

    /* renamed from: u  reason: collision with root package name */
    public static final char[] f31420u = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: v  reason: collision with root package name */
    public static final String[] f31421v = {"_id", "batch_data"};

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ b f31422w = new b();

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f31423x = {16843173, 16843551, 16844359, R.attr.alpha, R.attr.lStar};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f31424y = {R.attr.fontProviderAuthority, R.attr.fontProviderCerts, R.attr.fontProviderFetchStrategy, R.attr.fontProviderFetchTimeout, R.attr.fontProviderPackage, R.attr.fontProviderQuery, R.attr.fontProviderSystemFontFamily};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f31425z = {16844082, 16844083, 16844095, 16844143, 16844144, R.attr.font, R.attr.fontStyle, R.attr.fontVariationSettings, R.attr.fontWeight, R.attr.ttcIndex};
    public static final int[] A = {16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051};
    public static final int[] B = {16843173, 16844052};
    public static final float[][] C = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] D = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] E = {95.047f, 100.0f, 108.883f};
    public static final float[][] F = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final int[] G = {R.attr.ccpDialog_allowSearch, R.attr.ccpDialog_background, R.attr.ccpDialog_backgroundColor, R.attr.ccpDialog_cornerRadius, R.attr.ccpDialog_fastScroller_bubbleColor, R.attr.ccpDialog_fastScroller_bubbleTextAppearance, R.attr.ccpDialog_fastScroller_handleColor, R.attr.ccpDialog_initialScrollToSelection, R.attr.ccpDialog_keyboardAutoPopup, R.attr.ccpDialog_rippleEnable, R.attr.ccpDialog_searchEditTextTint, R.attr.ccpDialog_showCloseIcon, R.attr.ccpDialog_showFastScroller, R.attr.ccpDialog_showFlag, R.attr.ccpDialog_showNameCode, R.attr.ccpDialog_showPhoneCode, R.attr.ccpDialog_showTitle, R.attr.ccpDialog_textColor, R.attr.ccp_areaCodeDetectedCountry, R.attr.ccp_arrowColor, R.attr.ccp_arrowSize, R.attr.ccp_autoDetectCountry, R.attr.ccp_autoDetectLanguage, R.attr.ccp_autoFormatNumber, R.attr.ccp_clickable, R.attr.ccp_contentColor, R.attr.ccp_countryAutoDetectionPref, R.attr.ccp_countryPreference, R.attr.ccp_customMasterCountries, R.attr.ccp_defaultLanguage, R.attr.ccp_defaultNameCode, R.attr.ccp_defaultPhoneCode, R.attr.ccp_excludedCountries, R.attr.ccp_flagBorderColor, R.attr.ccp_hintExampleNumber, R.attr.ccp_hintExampleNumberType, R.attr.ccp_internationalFormattingOnly, R.attr.ccp_padding, R.attr.ccp_rememberLastSelection, R.attr.ccp_rippleEnable, R.attr.ccp_selectionMemoryTag, R.attr.ccp_showArrow, R.attr.ccp_showFlag, R.attr.ccp_showFullName, R.attr.ccp_showNameCode, R.attr.ccp_showPhoneCode, R.attr.ccp_textGravity, R.attr.ccp_textSize, R.attr.ccp_useDummyEmojiForPreview, R.attr.ccp_useFlagEmoji};
    public static final int[] H = {R.attr.fastscroll__bubbleColor, R.attr.fastscroll__bubbleTextAppearance, R.attr.fastscroll__handleColor};
    public static final r I = new r("RESUME_TOKEN");
    public static final r J = new r("UNDEFINED");
    public static final r K = new r("REUSABLE_CLAIMED");
    public static final int[] L = {16842948};
    public static final int[] M = {R.attr.starColor};
    public static final /* synthetic */ b O = new b();
    public static final /* synthetic */ b P = new b();
    public static final int[] Q = {16842948, 16842987, 16842993, R.attr.fastScrollEnabled, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.layoutManager, R.attr.reverseLayout, R.attr.spanCount, R.attr.stackFromEnd};

    public /* synthetic */ b() {
    }

    public static void A(String str, int i6, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException(kotlin.jvm.internal.h.P(str, Integer.valueOf(i6)));
    }

    public static void B(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static void C(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void D(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void E(Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void F(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static final Set G(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        i.f(keys, "this.keys()");
        while (keys.hasNext()) {
            JSONArray jSONArray = jSONObject.getJSONArray(keys.next());
            i.f(jSONArray, "this.getJSONArray(fieldKey)");
            int[] g02 = g0(jSONArray);
            int length = g02.length;
            int i6 = 0;
            while (i6 < length) {
                int i10 = g02[i6];
                i6++;
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return u.M2(arrayList);
    }

    public static z0 I(fu.e eVar, gt.e eVar2) {
        if (eVar != null) {
            if (eVar2 != null) {
                Collection<gt.d> y10 = eVar2.y();
                if (y10.size() != 1) {
                    return null;
                }
                for (z0 z0Var : y10.iterator().next().i()) {
                    if (z0Var.getName().equals(eVar)) {
                        return z0Var;
                    }
                }
                return null;
            }
            h(20);
            throw null;
        }
        h(19);
        throw null;
    }

    public static String J(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i6 = 0; i6 < attributeCount; i6++) {
            if (xmlPullParser.getAttributeName(i6).equals(str)) {
                return xmlPullParser.getAttributeValue(i6);
            }
        }
        return null;
    }

    public static final String K(Context context) {
        try {
            Signature[] signatures = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb2 = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            i.f(signatures, "signatures");
            int length = signatures.length;
            boolean z10 = false;
            int i6 = 0;
            while (i6 < length) {
                Signature signature = signatures[i6];
                i6++;
                messageDigest.update(signature.toByteArray());
                sb2.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb2.append(":");
            }
            if (sb2.length() > 0) {
                z10 = true;
            }
            if (z10) {
                sb2.setLength(sb2.length() - 1);
            }
            String sb3 = sb2.toString();
            i.f(sb3, "sb.toString()");
            return sb3;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static final String L(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            String string = jSONObject.getString(str);
            i.f(string, "this.getString(key)");
            return string;
        }
        return "";
    }

    public static boolean M(w0 w0Var, zu.i type, w0.b supertypesPolicy) {
        boolean z10;
        w0.b bVar;
        boolean z11;
        i.g(w0Var, "<this>");
        i.g(type, "type");
        i.g(supertypesPolicy, "supertypesPolicy");
        n nVar = w0Var.f37304c;
        if ((nVar.M(type) && !nVar.D(type)) || nVar.U(type)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            w0Var.c();
            ArrayDeque<zu.i> arrayDeque = w0Var.f37307g;
            i.d(arrayDeque);
            dv.e eVar = w0Var.f37308h;
            i.d(eVar);
            arrayDeque.push(type);
            while (!arrayDeque.isEmpty()) {
                if (eVar.f13522v <= 1000) {
                    zu.i current = arrayDeque.pop();
                    i.f(current, "current");
                    if (eVar.add(current)) {
                        if (nVar.D(current)) {
                            bVar = w0.b.c.f37311a;
                        } else {
                            bVar = supertypesPolicy;
                        }
                        if (!(!i.b(bVar, w0.b.c.f37311a))) {
                            bVar = null;
                        }
                        if (bVar == null) {
                            continue;
                        } else {
                            for (zu.h hVar : nVar.V(nVar.b(current))) {
                                zu.i a10 = bVar.a(w0Var, hVar);
                                if ((nVar.M(a10) && !nVar.D(a10)) || nVar.U(a10)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    w0Var.a();
                                } else {
                                    arrayDeque.add(a10);
                                }
                            }
                            continue;
                        }
                    }
                } else {
                    throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + u.m2(eVar, null, null, null, null, 63)).toString());
                }
            }
            w0Var.a();
            return false;
        }
        return true;
    }

    public static int N(float f) {
        boolean z10;
        float f2;
        boolean z11;
        float f10;
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f11 = (f + 16.0f) / 116.0f;
        if (f > 8.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f2 = f11 * f11 * f11;
        } else {
            f2 = f / 903.2963f;
        }
        float f12 = f11 * f11 * f11;
        if (f12 > 0.008856452f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f10 = f12;
        } else {
            f10 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z11) {
            f12 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = E;
        return j0.d.b(f10 * fArr[0], f2 * fArr[1], f12 * fArr[2]);
    }

    public static boolean O(w0 w0Var, zu.i iVar, zu.l lVar) {
        n nVar = w0Var.f37304c;
        if (nVar.l0(iVar)) {
            return true;
        }
        if (nVar.D(iVar)) {
            return false;
        }
        if (w0Var.f37303b && nVar.h0(iVar)) {
            return true;
        }
        return nVar.G(nVar.b(iVar), lVar);
    }

    public static boolean P(XmlPullParser xmlPullParser, String str) {
        boolean z10;
        if (xmlPullParser.getEventType() == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean Q(Uri uri) {
        if (uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static boolean R(XmlPullParser xmlPullParser, String str) {
        boolean z10;
        if (xmlPullParser.getEventType() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static float S(int i6) {
        float pow;
        float f = i6 / 255.0f;
        if (f <= 0.04045f) {
            pow = f / 12.92f;
        } else {
            pow = (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static void T(MediaFormat mediaFormat, String str, int i6) {
        if (i6 != -1) {
            mediaFormat.setInteger(str, i6);
        }
    }

    public static final q U(h5.a aVar, Uri uri, k0 k0Var) {
        String path = uri.getPath();
        w5.e0 e0Var = w5.e0.f36453a;
        boolean A0 = gv.n.A0("file", uri.getScheme(), true);
        v vVar = v.POST;
        if (A0 && path != null) {
            q.f fVar = new q.f(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", fVar);
            return new q(aVar, "me/staging_resources", bundle, vVar, k0Var, 32);
        } else if (gv.n.A0("content", uri.getScheme(), true)) {
            q.f fVar2 = new q.f(uri);
            Bundle bundle2 = new Bundle(1);
            bundle2.putParcelable("file", fVar2);
            return new q(aVar, "me/staging_resources", bundle2, vVar, k0Var, 32);
        } else {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
    }

    public static g3.a V(l3.d dVar, a3.c cVar) {
        return new g3.a(0, k3.n.a(1.0f, cVar, tr.r.f33551j0, dVar));
    }

    public static g3.b W(l3.c cVar, a3.c cVar2, boolean z10) {
        float f;
        if (z10) {
            f = m3.g.c();
        } else {
            f = 1.0f;
        }
        return new g3.b(k3.n.a(f, cVar2, f6.b.D, cVar));
    }

    public static g3.a X(l3.d dVar, a3.c cVar) {
        return new g3.a(2, k3.n.a(1.0f, cVar, kc.f.e0, dVar));
    }

    public static g3.a Y(l3.d dVar, a3.c cVar) {
        return new g3.a(3, k3.n.a(m3.g.c(), cVar, w.f7672z, dVar));
    }

    public static LinkedHashSet Z(fu.e eVar, Collection collection, Collection collection2, gt.e eVar2, t tVar, iu.l lVar, boolean z10) {
        if (eVar != null) {
            if (collection != null) {
                if (eVar2 != null) {
                    if (tVar != null) {
                        if (lVar != null) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            lVar.h(eVar, collection, collection2, eVar2, new qt.a(tVar, linkedHashSet, z10));
                            return linkedHashSet;
                        }
                        h(17);
                        throw null;
                    }
                    h(16);
                    throw null;
                }
                h(15);
                throw null;
            }
            h(13);
            throw null;
        }
        h(12);
        throw null;
    }

    public static LinkedHashSet a0(fu.e eVar, AbstractCollection abstractCollection, Collection collection, gt.e eVar2, t tVar, iu.l lVar) {
        if (eVar != null) {
            if (eVar2 != null) {
                if (tVar != null) {
                    if (lVar != null) {
                        return Z(eVar, abstractCollection, collection, eVar2, tVar, lVar, false);
                    }
                    h(5);
                    throw null;
                }
                h(4);
                throw null;
            }
            h(3);
            throw null;
        }
        h(0);
        throw null;
    }

    public static LinkedHashSet b0(fu.e eVar, Collection collection, AbstractCollection abstractCollection, tt.e eVar2, t tVar, iu.l lVar) {
        if (eVar != null) {
            if (collection != null) {
                if (eVar2 != null) {
                    if (tVar != null) {
                        if (lVar != null) {
                            return Z(eVar, collection, abstractCollection, eVar2, tVar, lVar, true);
                        }
                        h(11);
                        throw null;
                    }
                    h(10);
                    throw null;
                }
                h(9);
                throw null;
            }
            h(7);
            throw null;
        }
        h(6);
        throw null;
    }

    public static w8.f c0(w8.f fVar, String[] strArr, Map map) {
        int i6 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (w8.f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                w8.f fVar2 = new w8.f();
                int length = strArr.length;
                while (i6 < length) {
                    fVar2.a((w8.f) map.get(strArr[i6]));
                    i6++;
                }
                return fVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            fVar.a((w8.f) map.get(strArr[0]));
            return fVar;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i6 < length2) {
                fVar.a((w8.f) map.get(strArr[i6]));
                i6++;
            }
        }
        return fVar;
    }

    public static final void d0(ls.d dVar, Object obj, ss.l lVar) {
        Object uVar;
        boolean z10;
        w1<?> w1Var;
        if (dVar instanceof kotlinx.coroutines.internal.d) {
            kotlinx.coroutines.internal.d dVar2 = (kotlinx.coroutines.internal.d) dVar;
            Throwable a10 = hs.g.a(obj);
            boolean z11 = false;
            if (a10 == null) {
                if (lVar != null) {
                    uVar = new kotlinx.coroutines.v(lVar, obj);
                } else {
                    uVar = obj;
                }
            } else {
                uVar = new kotlinx.coroutines.u(a10, false);
            }
            ls.d<T> dVar3 = dVar2.f23589y;
            dVar2.getContext();
            a0 a0Var = dVar2.f23588x;
            if (a0Var.K0()) {
                dVar2.f23590z = uVar;
                dVar2.f23637w = 1;
                a0Var.f0(dVar2.getContext(), dVar2);
                return;
            }
            r0 a11 = t1.a();
            if (a11.f23646w >= 4294967296L) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                dVar2.f23590z = uVar;
                dVar2.f23637w = 1;
                a11.M0(dVar2);
                return;
            }
            a11.N0(true);
            try {
                c1 c1Var = (c1) dVar2.getContext().e(c1.b.f23496u);
                if (c1Var != null && !c1Var.a()) {
                    CancellationException I2 = c1Var.I();
                    dVar2.b(uVar, I2);
                    dVar2.resumeWith(sp.b.j(I2));
                    z11 = true;
                }
                if (!z11) {
                    Object obj2 = dVar2.A;
                    ls.f context = dVar3.getContext();
                    Object c10 = kotlinx.coroutines.internal.t.c(context, obj2);
                    if (c10 != kotlinx.coroutines.internal.t.f23617a) {
                        w1Var = y.c(dVar3, context, c10);
                    } else {
                        w1Var = null;
                    }
                    dVar3.resumeWith(obj);
                    hs.k kVar = hs.k.f19476a;
                    if (w1Var == null || w1Var.t0()) {
                        kotlinx.coroutines.internal.t.a(context, c10);
                    }
                }
                do {
                } while (a11.P0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.resumeWith(obj);
    }

    public static void e0(MediaFormat mediaFormat, List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            mediaFormat.setByteBuffer(defpackage.b.h(15, "csd-", i6), ByteBuffer.wrap((byte[]) list.get(i6)));
        }
    }

    public static final ArrayList f0(JSONArray jSONArray) {
        String str;
        String str2;
        Long l2;
        JSONObject jSONObject;
        LinkedHashMap z02;
        JSONObject jSONObject2;
        LinkedHashMap z03;
        JSONObject jSONObject3;
        LinkedHashMap z04;
        JSONObject jSONObject4;
        LinkedHashMap z05;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Double d10;
        Integer num;
        Double d11;
        String str16;
        String str17;
        Double d12;
        Double d13;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        Long l10;
        String str23;
        String str24;
        String str25;
        v3.e eVar;
        ArrayList arrayList = new ArrayList();
        xs.e it = kotlin.jvm.internal.h.k0(0, jSONArray.length()).iterator();
        while (it.f38001w) {
            JSONObject jSONObject5 = jSONArray.getJSONObject(it.nextInt());
            i.f(jSONObject5, "this.getJSONObject(it)");
            v3.a aVar = new v3.a();
            String string = jSONObject5.getString("event_type");
            i.f(string, "this.getString(\"event_type\")");
            aVar.L = string;
            v3.d dVar = null;
            if (jSONObject5.has("user_id")) {
                str = jSONObject5.getString("user_id");
            } else {
                str = null;
            }
            aVar.f34776a = str;
            if (jSONObject5.has("device_id")) {
                str2 = jSONObject5.getString("device_id");
            } else {
                str2 = null;
            }
            aVar.f34777b = str2;
            if (jSONObject5.has("time")) {
                l2 = Long.valueOf(jSONObject5.getLong("time"));
            } else {
                l2 = null;
            }
            aVar.f34778c = l2;
            if (jSONObject5.has("event_properties")) {
                jSONObject = jSONObject5.getJSONObject("event_properties");
            } else {
                jSONObject = null;
            }
            if (jSONObject == null) {
                z02 = null;
            } else {
                z02 = is.e0.z0(hc.d.n0(jSONObject));
            }
            aVar.M = z02;
            if (jSONObject5.has("user_properties")) {
                jSONObject2 = jSONObject5.getJSONObject("user_properties");
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 == null) {
                z03 = null;
            } else {
                z03 = is.e0.z0(hc.d.n0(jSONObject2));
            }
            aVar.N = z03;
            if (jSONObject5.has("groups")) {
                jSONObject3 = jSONObject5.getJSONObject("groups");
            } else {
                jSONObject3 = null;
            }
            if (jSONObject3 == null) {
                z04 = null;
            } else {
                z04 = is.e0.z0(hc.d.n0(jSONObject3));
            }
            aVar.O = z04;
            if (jSONObject5.has("group_properties")) {
                jSONObject4 = jSONObject5.getJSONObject("group_properties");
            } else {
                jSONObject4 = null;
            }
            if (jSONObject4 == null) {
                z05 = null;
            } else {
                z05 = is.e0.z0(hc.d.n0(jSONObject4));
            }
            aVar.P = z05;
            if (jSONObject5.has("app_version")) {
                str3 = jSONObject5.getString("app_version");
            } else {
                str3 = null;
            }
            aVar.f34783i = str3;
            if (jSONObject5.has("platform")) {
                str4 = jSONObject5.getString("platform");
            } else {
                str4 = null;
            }
            aVar.f34785k = str4;
            if (jSONObject5.has("os_name")) {
                str5 = jSONObject5.getString("os_name");
            } else {
                str5 = null;
            }
            aVar.f34786l = str5;
            if (jSONObject5.has("os_version")) {
                str6 = jSONObject5.getString("os_version");
            } else {
                str6 = null;
            }
            aVar.f34787m = str6;
            if (jSONObject5.has("device_brand")) {
                str7 = jSONObject5.getString("device_brand");
            } else {
                str7 = null;
            }
            aVar.f34788n = str7;
            if (jSONObject5.has("device_manufacturer")) {
                str8 = jSONObject5.getString("device_manufacturer");
            } else {
                str8 = null;
            }
            aVar.f34789o = str8;
            if (jSONObject5.has("device_model")) {
                str9 = jSONObject5.getString("device_model");
            } else {
                str9 = null;
            }
            aVar.f34790p = str9;
            if (jSONObject5.has("carrier")) {
                str10 = jSONObject5.getString("carrier");
            } else {
                str10 = null;
            }
            aVar.f34791q = str10;
            if (jSONObject5.has("country")) {
                str11 = jSONObject5.getString("country");
            } else {
                str11 = null;
            }
            aVar.r = str11;
            if (jSONObject5.has("region")) {
                str12 = jSONObject5.getString("region");
            } else {
                str12 = null;
            }
            aVar.f34792s = str12;
            if (jSONObject5.has("city")) {
                str13 = jSONObject5.getString("city");
            } else {
                str13 = null;
            }
            aVar.f34793t = str13;
            if (jSONObject5.has("dma")) {
                str14 = jSONObject5.getString("dma");
            } else {
                str14 = null;
            }
            aVar.f34794u = str14;
            if (jSONObject5.has("language")) {
                str15 = jSONObject5.getString("language");
            } else {
                str15 = null;
            }
            aVar.A = str15;
            if (jSONObject5.has("price")) {
                d10 = Double.valueOf(jSONObject5.getDouble("price"));
            } else {
                d10 = null;
            }
            aVar.G = d10;
            if (jSONObject5.has("quantity")) {
                num = Integer.valueOf(jSONObject5.getInt("quantity"));
            } else {
                num = null;
            }
            aVar.H = num;
            if (jSONObject5.has("revenue")) {
                d11 = Double.valueOf(jSONObject5.getDouble("revenue"));
            } else {
                d11 = null;
            }
            aVar.F = d11;
            if (jSONObject5.has("productId")) {
                str16 = jSONObject5.getString("productId");
            } else {
                str16 = null;
            }
            aVar.I = str16;
            if (jSONObject5.has("revenueType")) {
                str17 = jSONObject5.getString("revenueType");
            } else {
                str17 = null;
            }
            aVar.J = str17;
            if (jSONObject5.has("location_lat")) {
                d12 = Double.valueOf(jSONObject5.getDouble("location_lat"));
            } else {
                d12 = null;
            }
            aVar.f34781g = d12;
            if (jSONObject5.has("location_lng")) {
                d13 = Double.valueOf(jSONObject5.getDouble("location_lng"));
            } else {
                d13 = null;
            }
            aVar.f34782h = d13;
            if (jSONObject5.has("ip")) {
                str18 = jSONObject5.getString("ip");
            } else {
                str18 = null;
            }
            aVar.C = str18;
            if (jSONObject5.has("idfa")) {
                str19 = jSONObject5.getString("idfa");
            } else {
                str19 = null;
            }
            aVar.f34795v = str19;
            if (jSONObject5.has("idfv")) {
                str20 = jSONObject5.getString("idfv");
            } else {
                str20 = null;
            }
            aVar.f34796w = str20;
            if (jSONObject5.has("adid")) {
                str21 = jSONObject5.getString("adid");
            } else {
                str21 = null;
            }
            aVar.f34797x = str21;
            if (jSONObject5.has("android_id")) {
                str22 = jSONObject5.getString("android_id");
            } else {
                str22 = null;
            }
            aVar.f34799z = str22;
            aVar.f34798y = jSONObject5.optString("android_app_set_id", null);
            if (jSONObject5.has("event_id")) {
                l10 = Long.valueOf(jSONObject5.getLong("event_id"));
            } else {
                l10 = null;
            }
            aVar.f34779d = l10;
            aVar.f34780e = jSONObject5.getLong("session_id");
            if (jSONObject5.has("insert_id")) {
                str23 = jSONObject5.getString("insert_id");
            } else {
                str23 = null;
            }
            aVar.f = str23;
            if (jSONObject5.has("library")) {
                str24 = jSONObject5.getString("library");
            } else {
                str24 = null;
            }
            aVar.B = str24;
            if (jSONObject5.has(SessionManager.KEY_PARTNER_ID)) {
                str25 = jSONObject5.getString(SessionManager.KEY_PARTNER_ID);
            } else {
                str25 = null;
            }
            aVar.K = str25;
            if (jSONObject5.has("plan")) {
                JSONObject jSONObject6 = jSONObject5.getJSONObject("plan");
                i.f(jSONObject6, "this.getJSONObject(\"plan\")");
                eVar = new v3.e(jSONObject6.optString("branch", null), jSONObject6.optString("source", null), jSONObject6.optString("version", null), jSONObject6.optString("versionId", null));
            } else {
                eVar = null;
            }
            aVar.D = eVar;
            if (jSONObject5.has("ingestion_metadata")) {
                JSONObject jSONObject7 = jSONObject5.getJSONObject("ingestion_metadata");
                i.f(jSONObject7, "this.getJSONObject(\"ingestion_metadata\")");
                dVar = new v3.d(jSONObject7.optString("source_name", null), jSONObject7.optString("source_version", null));
            }
            aVar.E = dVar;
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public static final int[] g0(JSONArray jSONArray) {
        int length = jSONArray.length();
        int[] iArr = new int[length];
        int i6 = length - 1;
        if (i6 >= 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                iArr[i10] = jSONArray.optInt(i10);
                if (i11 > i6) {
                    break;
                }
                i10 = i11;
            }
        }
        return iArr;
    }

    public static /* synthetic */ void h(int i6) {
        String str;
        int i10;
        if (i6 != 18) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 18) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i6 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i6) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i6 != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static String h0(String str) {
        boolean z10;
        boolean z11;
        int length = str.length();
        int i6 = 0;
        while (i6 < length) {
            char charAt = str.charAt(i6);
            if (charAt >= 'A' && charAt <= 'Z') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                char[] charArray = str.toCharArray();
                while (i6 < length) {
                    char c10 = charArray[i6];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        charArray[i6] = (char) (c10 ^ ' ');
                    }
                    i6++;
                }
                return String.valueOf(charArray);
            }
            i6++;
        }
        return str;
    }

    public static String i0(String str) {
        boolean z10;
        boolean z11;
        int length = str.length();
        int i6 = 0;
        while (i6 < length) {
            char charAt = str.charAt(i6);
            if (charAt >= 'a' && charAt <= 'z') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                char[] charArray = str.toCharArray();
                while (i6 < length) {
                    char c10 = charArray[i6];
                    if (c10 >= 'a' && c10 <= 'z') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        charArray[i6] = (char) (c10 ^ ' ');
                    }
                    i6++;
                }
                return String.valueOf(charArray);
            }
            i6++;
        }
        return str;
    }

    public static final int j(char c10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if ('0' <= c10 && c10 <= '9') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' <= c10 && c10 <= 'f') {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            c11 = 'A';
            if ('A' <= c10 && c10 <= 'F') {
                z12 = true;
            }
            if (!z12) {
                throw new IllegalArgumentException(i.n(Character.valueOf(c10), "Unexpected hex digit: "));
            }
        }
        return (c10 - c11) + 10;
    }

    public static JSONArray j0(JSONArray jSONArray) {
        int length = jSONArray.length();
        if (length > 0) {
            int i6 = 0;
            while (true) {
                int i10 = i6 + 1;
                Object obj = jSONArray.get(i6);
                if (i.b(obj.getClass(), String.class)) {
                    String str = (String) obj;
                    if (str.length() > 1024) {
                        str = str.substring(0, Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);
                        i.f(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    jSONArray.put(i6, str);
                } else if (i.b(obj.getClass(), JSONObject.class)) {
                    jSONArray.put(i6, k0((JSONObject) obj));
                } else if (i.b(obj.getClass(), JSONArray.class)) {
                    jSONArray.put(i6, j0((JSONArray) obj));
                }
                if (i10 >= length) {
                    break;
                }
                i6 = i10;
            }
        }
        return jSONArray;
    }

    public static String k(int i6, int i10, String str) {
        if (i6 < 0) {
            return kotlin.jvm.internal.h.P("%s (%s) must not be negative", str, Integer.valueOf(i6));
        }
        if (i10 >= 0) {
            return kotlin.jvm.internal.h.P("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i6), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(defpackage.b.h(26, "negative size: ", i10));
    }

    public static JSONObject k0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() <= 1024) {
            Iterator<String> keys = jSONObject.keys();
            i.f(keys, "obj.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null) {
                    String str = next;
                    try {
                        Object obj = jSONObject.get(str);
                        if (i.b(obj.getClass(), String.class)) {
                            String str2 = (String) obj;
                            if (str2.length() > 1024) {
                                str2 = str2.substring(0, Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);
                                i.f(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            jSONObject.put(str, str2);
                        } else if (i.b(obj.getClass(), JSONObject.class)) {
                            jSONObject.put(str, k0((JSONObject) obj));
                        } else if (i.b(obj.getClass(), JSONArray.class)) {
                            JSONArray jSONArray = (JSONArray) obj;
                            j0(jSONArray);
                            jSONObject.put(str, jSONArray);
                        }
                    } catch (JSONException unused) {
                        throw new IllegalArgumentException("JSON parsing error. Too long (>1024 chars) or invalid JSON");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            return jSONObject;
        }
        throw new IllegalArgumentException("Too many properties (more than 1024) in JSON");
    }

    public static ArrayList l(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static float l0() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static void m(Object obj, String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.h.P(str, obj));
    }

    public static int m0(int i6) {
        int[] iArr = {1, 2, 3};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 != 0) {
                if (i12 == i6) {
                    return i11;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }

    public static void n(String str, int i6, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.h.P(str, Integer.valueOf(i6)));
    }

    public static void n0(int i6, int i10) {
        String p02;
        if (i6 >= 0 && i6 < i10) {
            return;
        }
        if (i6 >= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException(defpackage.c.p("negative size: ", i10));
            }
            p02 = kotlin.jvm.internal.h.p0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i6), Integer.valueOf(i10));
        } else {
            p02 = kotlin.jvm.internal.h.p0("%s (%s) must not be negative", "index", Integer.valueOf(i6));
        }
        throw new IndexOutOfBoundsException(p02);
    }

    public static void o(String str, long j10, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.h.P(str, Long.valueOf(j10)));
    }

    public static int o0(int i6) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 != 0) {
                if (i12 == i6) {
                    return i11;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }

    public static void p(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static int p0(int i6) {
        return (int) (Integer.rotateLeft((int) (i6 * (-862048943)), 15) * 461845907);
    }

    public static void q(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void q0(int i6, int i10) {
        if (i6 >= 0 && i6 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException(t0(i6, i10, "index"));
    }

    public static void r(boolean z10, String str, Object obj, Object obj2) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.h.P(str, obj, obj2));
    }

    public static byte[] r0(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i6 = 0; i6 < 16; i6++) {
                byte b10 = bArr[i6];
                byte b11 = (byte) ((b10 + b10) & 254);
                bArr2[i6] = b11;
                if (i6 < 15) {
                    bArr2[i6] = (byte) (((bArr[i6 + 1] >> 7) & 1) | b11);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public static void s(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void s0(int i6, int i10, int i11) {
        String t02;
        if (i6 >= 0 && i10 >= i6 && i10 <= i11) {
            return;
        }
        if (i6 >= 0 && i6 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                t02 = kotlin.jvm.internal.h.p0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i6));
            } else {
                t02 = t0(i10, i11, "end index");
            }
        } else {
            t02 = t0(i6, i11, "start index");
        }
        throw new IndexOutOfBoundsException(t02);
    }

    public static void t(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static String t0(int i6, int i10, String str) {
        if (i6 < 0) {
            return kotlin.jvm.internal.h.p0("%s (%s) must not be negative", str, Integer.valueOf(i6));
        }
        if (i10 >= 0) {
            return kotlin.jvm.internal.h.p0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i6), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(defpackage.c.p("negative size: ", i10));
    }

    public static void u(int i6, int i10) {
        String P2;
        if (i6 >= 0 && i6 < i10) {
            return;
        }
        if (i6 >= 0) {
            if (i10 >= 0) {
                P2 = kotlin.jvm.internal.h.P("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i6), Integer.valueOf(i10));
            } else {
                throw new IllegalArgumentException(defpackage.b.h(26, "negative size: ", i10));
            }
        } else {
            P2 = kotlin.jvm.internal.h.P("%s (%s) must not be negative", "index", Integer.valueOf(i6));
        }
        throw new IndexOutOfBoundsException(P2);
    }

    public static void v(int i6, int i10) {
        if (i6 >= 0 && i6 < i10) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void w(Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void x(int i6, int i10) {
        if (i6 >= 0 && i6 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException(k(i6, i10, "index"));
    }

    public static void y(int i6, int i10, int i11) {
        String k10;
        if (i6 >= 0 && i10 >= i6 && i10 <= i11) {
            return;
        }
        if (i6 >= 0 && i6 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                k10 = kotlin.jvm.internal.h.P("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i6));
            } else {
                k10 = k(i10, i11, "end index");
            }
        } else {
            k10 = k(i6, i11, "start index");
        }
        throw new IndexOutOfBoundsException(k10);
    }

    public static void z(Object obj, String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException(kotlin.jvm.internal.h.P(str, obj));
    }

    public d1 H(v0 v0Var, wu.u typeAttr, a1 typeParameterUpperBoundEraser, b0 erasedUpperBound) {
        i.g(typeAttr, "typeAttr");
        i.g(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        i.g(erasedUpperBound, "erasedUpperBound");
        return new f1(erasedUpperBound, n1.OUT_VARIANCE);
    }

    @Override // ta.h2
    public Object a() {
        List list = j2.f32639a;
        return Long.valueOf(l8.f8459v.a().g());
    }

    @Override // o8.k
    public int c(long j10) {
        return 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i6
    public com.android.volley.toolbox.a d(c7 c7Var) {
        s7 s7Var;
        t7 t7Var;
        y6 y6Var = v7.f8204a;
        if (c7Var.f7757a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                ka z10 = ka.z(c7Var.f7759c, com.google.android.gms.internal.p000firebaseauthapi.r0.f8101b);
                if (z10.v() == 0) {
                    v.c cVar = new v.c((Object) null);
                    cVar.f34631v = Integer.valueOf(z10.B().m());
                    cVar.f34632w = Integer.valueOf(z10.A().v());
                    int A2 = z10.A().A();
                    int i6 = A2 - 2;
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 != 4) {
                                    if (i6 == 5) {
                                        s7Var = s7.f8129c;
                                    } else {
                                        throw new GeneralSecurityException("Unable to parse HashType: " + kotlin.jvm.internal.b0.v(A2));
                                    }
                                } else {
                                    s7Var = s7.f;
                                }
                            } else {
                                s7Var = s7.f8130d;
                            }
                        } else {
                            s7Var = s7.f8131e;
                        }
                    } else {
                        s7Var = s7.f8128b;
                    }
                    cVar.f34633x = s7Var;
                    int i10 = c7Var.f7761e;
                    int d10 = v.h.d(i10);
                    if (d10 != 1) {
                        if (d10 != 2) {
                            if (d10 != 3) {
                                if (d10 == 4) {
                                    t7Var = t7.f8152c;
                                } else {
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + defpackage.c.d(i10));
                                }
                            } else {
                                t7Var = t7.f8154e;
                            }
                        } else {
                            t7Var = t7.f8153d;
                        }
                    } else {
                        t7Var = t7.f8151b;
                    }
                    cVar.f34634y = t7Var;
                    u7 n10 = cVar.n();
                    q7 q7Var = new q7();
                    q7Var.f8082a = n10;
                    q7Var.f8083b = new x(20, nc.a(z10.B().K()));
                    q7Var.f8084c = c7Var.f;
                    return q7Var.a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzadn | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacParameters.parseParameters");
    }

    @Override // ta.e
    public String e(String str, String str2) {
        return null;
    }

    @Override // o8.k
    public int f(androidx.appcompat.widget.l lVar, DecoderInputBuffer decoderInputBuffer, int i6) {
        decoderInputBuffer.f30528u = 4;
        return -4;
    }

    @Override // u3.f
    public kc.f g(o3.a aVar) {
        return new kc.f();
    }

    @Override // uf.l
    public Object i() {
        return new ConcurrentSkipListMap();
    }

    @Override // o8.k
    public boolean isReady() {
        return true;
    }

    public /* synthetic */ b(int i6) {
    }

    @Override // o8.k
    public void b() {
    }
}
