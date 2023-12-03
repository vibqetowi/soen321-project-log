package w5;

import com.appsflyer.R;
import h5.n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: FacebookRequestErrorClassification.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final a f36468d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static i f36469e;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Set<Integer>> f36470a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, Set<Integer>> f36471b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Integer, Set<Integer>> f36472c;

    /* compiled from: FacebookRequestErrorClassification.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static i b() {
            return new i(null, is.e0.s0(new hs.f(2, null), new hs.f(4, null), new hs.f(9, null), new hs.f(17, null), new hs.f(341, null)), is.e0.s0(new hs.f(Integer.valueOf((int) R.styleable.AppCompatTheme_textAppearanceLargePopupMenu), null), new hs.f(190, null), new hs.f(412, null)), null, null, null);
        }

        public static HashMap c(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            if (length > 0) {
                int i6 = 0;
                while (true) {
                    int i10 = i6 + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i6);
                    if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                            hashSet = new HashSet();
                            int length2 = optJSONArray2.length();
                            if (length2 > 0) {
                                int i11 = 0;
                                while (true) {
                                    int i12 = i11 + 1;
                                    int optInt2 = optJSONArray2.optInt(i11);
                                    if (optInt2 != 0) {
                                        hashSet.add(Integer.valueOf(optInt2));
                                    }
                                    if (i12 >= length2) {
                                        break;
                                    }
                                    i11 = i12;
                                }
                            }
                        } else {
                            hashSet = null;
                        }
                        hashMap.put(Integer.valueOf(optInt), hashSet);
                    }
                    if (i10 >= length) {
                        break;
                    }
                    i6 = i10;
                }
            }
            return hashMap;
        }

        public final synchronized i a() {
            i iVar;
            if (i.f36469e == null) {
                i.f36469e = b();
            }
            iVar = i.f36469e;
            if (iVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return iVar;
        }
    }

    /* compiled from: FacebookRequestErrorClassification.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f36473a;

        static {
            int[] iArr = new int[n.a.valuesCustom().length];
            iArr[1] = 1;
            iArr[0] = 2;
            iArr[2] = 3;
            f36473a = iArr;
        }
    }

    public i(HashMap hashMap, HashMap hashMap2, HashMap hashMap3, String str, String str2, String str3) {
        this.f36470a = hashMap;
        this.f36471b = hashMap2;
        this.f36472c = hashMap3;
    }
}
