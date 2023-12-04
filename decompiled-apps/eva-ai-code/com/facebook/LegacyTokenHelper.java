package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: LegacyTokenHelper.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/LegacyTokenHelper;", "", "context", "Landroid/content/Context;", "cacheKey", "", "(Landroid/content/Context;Ljava/lang/String;)V", "cache", "Landroid/content/SharedPreferences;", "clear", "", "deserializeKey", "key", "bundle", "Landroid/os/Bundle;", "load", "save", "serializeKey", "editor", "Landroid/content/SharedPreferences$Editor;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class LegacyTokenHelper {
    public static final String APPLICATION_ID_KEY = "com.facebook.TokenCachingStrategy.ApplicationId";
    public static final Companion Companion = new Companion(null);
    public static final String DECLINED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.DeclinedPermissions";
    public static final String DEFAULT_CACHE_KEY = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
    public static final String EXPIRATION_DATE_KEY = "com.facebook.TokenCachingStrategy.ExpirationDate";
    public static final String EXPIRED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.ExpiredPermissions";
    private static final long INVALID_BUNDLE_MILLISECONDS = Long.MIN_VALUE;
    private static final String IS_SSO_KEY = "com.facebook.TokenCachingStrategy.IsSSO";
    private static final String JSON_VALUE = "value";
    private static final String JSON_VALUE_ENUM_TYPE = "enumType";
    private static final String JSON_VALUE_TYPE = "valueType";
    public static final String LAST_REFRESH_DATE_KEY = "com.facebook.TokenCachingStrategy.LastRefreshDate";
    public static final String PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.Permissions";
    private static final String TAG;
    public static final String TOKEN_KEY = "com.facebook.TokenCachingStrategy.Token";
    public static final String TOKEN_SOURCE_KEY = "com.facebook.TokenCachingStrategy.AccessTokenSource";
    private static final String TYPE_BOOLEAN = "bool";
    private static final String TYPE_BOOLEAN_ARRAY = "bool[]";
    private static final String TYPE_BYTE = "byte";
    private static final String TYPE_BYTE_ARRAY = "byte[]";
    private static final String TYPE_CHAR = "char";
    private static final String TYPE_CHAR_ARRAY = "char[]";
    private static final String TYPE_DOUBLE = "double";
    private static final String TYPE_DOUBLE_ARRAY = "double[]";
    private static final String TYPE_ENUM = "enum";
    private static final String TYPE_FLOAT = "float";
    private static final String TYPE_FLOAT_ARRAY = "float[]";
    private static final String TYPE_INTEGER = "int";
    private static final String TYPE_INTEGER_ARRAY = "int[]";
    private static final String TYPE_LONG = "long";
    private static final String TYPE_LONG_ARRAY = "long[]";
    private static final String TYPE_SHORT = "short";
    private static final String TYPE_SHORT_ARRAY = "short[]";
    private static final String TYPE_STRING = "string";
    private static final String TYPE_STRING_LIST = "stringList";
    private final SharedPreferences cache;
    private final String cacheKey;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyTokenHelper(Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmStatic
    public static final String getApplicationId(Bundle bundle) {
        return Companion.getApplicationId(bundle);
    }

    @JvmStatic
    public static final Date getExpirationDate(Bundle bundle) {
        return Companion.getExpirationDate(bundle);
    }

    @JvmStatic
    public static final long getExpirationMilliseconds(Bundle bundle) {
        return Companion.getExpirationMilliseconds(bundle);
    }

    @JvmStatic
    public static final Date getLastRefreshDate(Bundle bundle) {
        return Companion.getLastRefreshDate(bundle);
    }

    @JvmStatic
    public static final long getLastRefreshMilliseconds(Bundle bundle) {
        return Companion.getLastRefreshMilliseconds(bundle);
    }

    @JvmStatic
    public static final Set<String> getPermissions(Bundle bundle) {
        return Companion.getPermissions(bundle);
    }

    @JvmStatic
    public static final AccessTokenSource getSource(Bundle bundle) {
        return Companion.getSource(bundle);
    }

    @JvmStatic
    public static final String getToken(Bundle bundle) {
        return Companion.getToken(bundle);
    }

    @JvmStatic
    public static final boolean hasTokenInformation(Bundle bundle) {
        return Companion.hasTokenInformation(bundle);
    }

    @JvmStatic
    public static final void putApplicationId(Bundle bundle, String str) {
        Companion.putApplicationId(bundle, str);
    }

    @JvmStatic
    public static final void putDeclinedPermissions(Bundle bundle, Collection<String> collection) {
        Companion.putDeclinedPermissions(bundle, collection);
    }

    @JvmStatic
    public static final void putExpirationDate(Bundle bundle, Date date) {
        Companion.putExpirationDate(bundle, date);
    }

    @JvmStatic
    public static final void putExpirationMilliseconds(Bundle bundle, long j) {
        Companion.putExpirationMilliseconds(bundle, j);
    }

    @JvmStatic
    public static final void putExpiredPermissions(Bundle bundle, Collection<String> collection) {
        Companion.putExpiredPermissions(bundle, collection);
    }

    @JvmStatic
    public static final void putLastRefreshDate(Bundle bundle, Date date) {
        Companion.putLastRefreshDate(bundle, date);
    }

    @JvmStatic
    public static final void putLastRefreshMilliseconds(Bundle bundle, long j) {
        Companion.putLastRefreshMilliseconds(bundle, j);
    }

    @JvmStatic
    public static final void putPermissions(Bundle bundle, Collection<String> collection) {
        Companion.putPermissions(bundle, collection);
    }

    @JvmStatic
    public static final void putSource(Bundle bundle, AccessTokenSource accessTokenSource) {
        Companion.putSource(bundle, accessTokenSource);
    }

    @JvmStatic
    public static final void putToken(Bundle bundle, String str) {
        Companion.putToken(bundle, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((r4.length() == 0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LegacyTokenHelper(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str != null) {
        }
        str = DEFAULT_CACHE_KEY;
        this.cacheKey = str;
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPreferences(this.cacheKey, Context.MODE_PRIVATE)");
        this.cache = sharedPreferences;
    }

    public /* synthetic */ LegacyTokenHelper(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str);
    }

    public final Bundle load() {
        Bundle bundle = new Bundle();
        for (String key : this.cache.getAll().keySet()) {
            try {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                deserializeKey(key, bundle);
            } catch (JSONException e) {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str = TAG;
                companion.log(loggingBehavior, 5, str, "Error reading cached value for key: '" + ((Object) key) + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }

    public final void save(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        SharedPreferences.Editor editor = this.cache.edit();
        for (String key : bundle.keySet()) {
            try {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                Intrinsics.checkNotNullExpressionValue(editor, "editor");
                serializeKey(key, bundle, editor);
            } catch (JSONException e) {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str = TAG;
                companion.log(loggingBehavior, 5, str, "Error processing value for key: '" + ((Object) key) + "' -- " + e);
                return;
            }
        }
        editor.apply();
    }

    public final void clear() {
        this.cache.edit().clear().apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void serializeKey(String str, Bundle bundle, SharedPreferences.Editor editor) throws JSONException {
        JSONArray jSONArray;
        String str2;
        Object obj = bundle.get(str);
        if (obj == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str3 = null;
        if (obj instanceof Byte) {
            jSONObject.put("value", (int) ((Number) obj).byteValue());
            str2 = TYPE_BYTE;
        } else if (obj instanceof Short) {
            jSONObject.put("value", (int) ((Number) obj).shortValue());
            str2 = TYPE_SHORT;
        } else if (obj instanceof Integer) {
            jSONObject.put("value", ((Number) obj).intValue());
            str2 = TYPE_INTEGER;
        } else if (obj instanceof Long) {
            jSONObject.put("value", ((Number) obj).longValue());
            str2 = TYPE_LONG;
        } else if (obj instanceof Float) {
            jSONObject.put("value", ((Number) obj).floatValue());
            str2 = "float";
        } else if (obj instanceof Double) {
            jSONObject.put("value", ((Number) obj).doubleValue());
            str2 = TYPE_DOUBLE;
        } else if (obj instanceof Boolean) {
            jSONObject.put("value", ((Boolean) obj).booleanValue());
            str2 = TYPE_BOOLEAN;
        } else if (obj instanceof Character) {
            jSONObject.put("value", obj.toString());
            str2 = TYPE_CHAR;
        } else if (obj instanceof String) {
            jSONObject.put("value", obj);
            str2 = "string";
        } else if (obj instanceof Enum) {
            jSONObject.put("value", obj.toString());
            jSONObject.put(JSON_VALUE_ENUM_TYPE, obj.getClass().getName());
            str2 = TYPE_ENUM;
        } else {
            jSONArray = new JSONArray();
            int i = 0;
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                while (i < length) {
                    byte b = bArr[i];
                    i++;
                    jSONArray.put((int) b);
                }
                str3 = TYPE_BYTE_ARRAY;
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length;
                while (i < length2) {
                    short s = sArr[i];
                    i++;
                    jSONArray.put((int) s);
                }
                str3 = TYPE_SHORT_ARRAY;
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length;
                while (i < length3) {
                    int i2 = iArr[i];
                    i++;
                    jSONArray.put(i2);
                }
                str3 = TYPE_INTEGER_ARRAY;
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length4 = jArr.length;
                while (i < length4) {
                    long j = jArr[i];
                    i++;
                    jSONArray.put(j);
                }
                str3 = TYPE_LONG_ARRAY;
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                int length5 = fArr.length;
                while (i < length5) {
                    float f = fArr[i];
                    i++;
                    jSONArray.put(f);
                }
                str3 = TYPE_FLOAT_ARRAY;
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length6 = dArr.length;
                while (i < length6) {
                    double d = dArr[i];
                    i++;
                    jSONArray.put(d);
                }
                str3 = TYPE_DOUBLE_ARRAY;
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length7 = zArr.length;
                while (i < length7) {
                    boolean z = zArr[i];
                    i++;
                    jSONArray.put(z);
                }
                str3 = TYPE_BOOLEAN_ARRAY;
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                int length8 = cArr.length;
                while (i < length8) {
                    char c = cArr[i];
                    i++;
                    jSONArray.put(String.valueOf(c));
                }
                str3 = TYPE_CHAR_ARRAY;
            } else if (obj instanceof List) {
                for (Object obj2 : (List) obj) {
                    if (obj2 == null) {
                        obj2 = JSONObject.NULL;
                    }
                    jSONArray.put(obj2);
                }
                str3 = TYPE_STRING_LIST;
            } else {
                jSONArray = null;
            }
            if (str3 == null) {
                jSONObject.put(JSON_VALUE_TYPE, str3);
                if (jSONArray != null) {
                    jSONObject.putOpt("value", jSONArray);
                }
                String jSONObject2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "json.toString()");
                editor.putString(str, jSONObject2);
                return;
            }
            return;
        }
        jSONArray = null;
        str3 = str2;
        if (str3 == null) {
        }
    }

    private final void deserializeKey(String str, Bundle bundle) throws JSONException {
        String str2;
        String string;
        String string2 = this.cache.getString(str, "{}");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        JSONObject jSONObject = new JSONObject(string2);
        String string3 = jSONObject.getString(JSON_VALUE_TYPE);
        if (string3 != null) {
            int i = 0;
            switch (string3.hashCode()) {
                case -1573317553:
                    if (string3.equals(TYPE_STRING_LIST)) {
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        int length = jSONArray.length();
                        ArrayList<String> arrayList = new ArrayList<>(length);
                        if (length > 0) {
                            while (true) {
                                int i2 = i + 1;
                                Object obj = jSONArray.get(i);
                                if (obj == JSONObject.NULL) {
                                    str2 = null;
                                } else if (obj == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                } else {
                                    str2 = (String) obj;
                                }
                                arrayList.add(i, str2);
                                if (i2 < length) {
                                    i = i2;
                                }
                            }
                        }
                        bundle.putStringArrayList(str, arrayList);
                        return;
                    }
                    return;
                case -1383386164:
                    if (string3.equals(TYPE_BOOLEAN_ARRAY)) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        boolean[] zArr = new boolean[length2];
                        int i3 = length2 - 1;
                        if (i3 >= 0) {
                            while (true) {
                                int i4 = i + 1;
                                zArr[i] = jSONArray2.getBoolean(i);
                                if (i4 <= i3) {
                                    i = i4;
                                }
                            }
                        }
                        bundle.putBooleanArray(str, zArr);
                        return;
                    }
                    return;
                case -1374008726:
                    if (string3.equals(TYPE_BYTE_ARRAY)) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                        int length3 = jSONArray3.length();
                        byte[] bArr = new byte[length3];
                        int i5 = length3 - 1;
                        if (i5 >= 0) {
                            while (true) {
                                int i6 = i + 1;
                                bArr[i] = (byte) jSONArray3.getInt(i);
                                if (i6 <= i5) {
                                    i = i6;
                                }
                            }
                        }
                        bundle.putByteArray(str, bArr);
                        return;
                    }
                    return;
                case -1361632968:
                    if (string3.equals(TYPE_CHAR_ARRAY)) {
                        JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                        int length4 = jSONArray4.length();
                        char[] cArr = new char[length4];
                        int i7 = length4 - 1;
                        if (i7 >= 0) {
                            int i8 = 0;
                            while (true) {
                                int i9 = i8 + 1;
                                String string4 = jSONArray4.getString(i8);
                                if (string4 != null && string4.length() == 1) {
                                    cArr[i8] = string4.charAt(0);
                                }
                                if (i9 <= i7) {
                                    i8 = i9;
                                }
                            }
                        }
                        bundle.putCharArray(str, cArr);
                        return;
                    }
                    return;
                case -1325958191:
                    if (string3.equals(TYPE_DOUBLE)) {
                        bundle.putDouble(str, jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case -1097129250:
                    if (string3.equals(TYPE_LONG_ARRAY)) {
                        JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                        int length5 = jSONArray5.length();
                        long[] jArr = new long[length5];
                        int i10 = length5 - 1;
                        if (i10 >= 0) {
                            while (true) {
                                int i11 = i + 1;
                                jArr[i] = jSONArray5.getLong(i);
                                if (i11 <= i10) {
                                    i = i11;
                                }
                            }
                        }
                        bundle.putLongArray(str, jArr);
                        return;
                    }
                    return;
                case -891985903:
                    if (string3.equals("string")) {
                        bundle.putString(str, jSONObject.getString("value"));
                        return;
                    }
                    return;
                case -766441794:
                    if (string3.equals(TYPE_FLOAT_ARRAY)) {
                        JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                        int length6 = jSONArray6.length();
                        float[] fArr = new float[length6];
                        int i12 = length6 - 1;
                        if (i12 >= 0) {
                            while (true) {
                                int i13 = i + 1;
                                fArr[i] = (float) jSONArray6.getDouble(i);
                                if (i13 <= i12) {
                                    i = i13;
                                }
                            }
                        }
                        bundle.putFloatArray(str, fArr);
                        return;
                    }
                    return;
                case 104431:
                    if (string3.equals(TYPE_INTEGER)) {
                        bundle.putInt(str, jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3029738:
                    if (string3.equals(TYPE_BOOLEAN)) {
                        bundle.putBoolean(str, jSONObject.getBoolean("value"));
                        return;
                    }
                    return;
                case 3039496:
                    if (string3.equals(TYPE_BYTE)) {
                        bundle.putByte(str, (byte) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3052374:
                    if (string3.equals(TYPE_CHAR) && (string = jSONObject.getString("value")) != null && string.length() == 1) {
                        bundle.putChar(str, string.charAt(0));
                        return;
                    }
                    return;
                case 3118337:
                    if (string3.equals(TYPE_ENUM)) {
                        try {
                            bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString(JSON_VALUE_ENUM_TYPE)), jSONObject.getString("value")));
                            return;
                        } catch (ClassNotFoundException | IllegalArgumentException unused) {
                            return;
                        }
                    }
                    return;
                case 3327612:
                    if (string3.equals(TYPE_LONG)) {
                        bundle.putLong(str, jSONObject.getLong("value"));
                        return;
                    }
                    return;
                case 97526364:
                    if (string3.equals("float")) {
                        bundle.putFloat(str, (float) jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case 100361105:
                    if (string3.equals(TYPE_INTEGER_ARRAY)) {
                        JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                        int length7 = jSONArray7.length();
                        int[] iArr = new int[length7];
                        int i14 = length7 - 1;
                        if (i14 >= 0) {
                            while (true) {
                                int i15 = i + 1;
                                iArr[i] = jSONArray7.getInt(i);
                                if (i15 <= i14) {
                                    i = i15;
                                }
                            }
                        }
                        bundle.putIntArray(str, iArr);
                        return;
                    }
                    return;
                case 109413500:
                    if (string3.equals(TYPE_SHORT)) {
                        bundle.putShort(str, (short) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 1359468275:
                    if (string3.equals(TYPE_DOUBLE_ARRAY)) {
                        JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                        int length8 = jSONArray8.length();
                        double[] dArr = new double[length8];
                        int i16 = length8 - 1;
                        if (i16 >= 0) {
                            while (true) {
                                int i17 = i + 1;
                                dArr[i] = jSONArray8.getDouble(i);
                                if (i17 <= i16) {
                                    i = i17;
                                }
                            }
                        }
                        bundle.putDoubleArray(str, dArr);
                        return;
                    }
                    return;
                case 2067161310:
                    if (string3.equals(TYPE_SHORT_ARRAY)) {
                        JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                        int length9 = jSONArray9.length();
                        short[] sArr = new short[length9];
                        int i18 = length9 - 1;
                        if (i18 >= 0) {
                            while (true) {
                                int i19 = i + 1;
                                sArr[i] = (short) jSONArray9.getInt(i);
                                if (i19 <= i18) {
                                    i = i19;
                                }
                            }
                        }
                        bundle.putShortArray(str, sArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: LegacyTokenHelper.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020)H\u0007J\u001e\u0010*\u001a\u0004\u0018\u00010+2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010-\u001a\u0004\u0018\u00010+2\u0006\u0010(\u001a\u00020)H\u0007J\u0010\u0010.\u001a\u00020\n2\u0006\u0010(\u001a\u00020)H\u0007J\u0012\u0010/\u001a\u0004\u0018\u00010+2\u0006\u0010(\u001a\u00020)H\u0007J\u0010\u00100\u001a\u00020\n2\u0006\u0010(\u001a\u00020)H\u0007J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001022\u0006\u0010(\u001a\u00020)H\u0007J\u0012\u00103\u001a\u0004\u0018\u0001042\u0006\u0010(\u001a\u00020)H\u0007J\u0012\u00105\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020)H\u0007J\u0012\u00106\u001a\u0002072\b\u0010(\u001a\u0004\u0018\u00010)H\u0007J\u001a\u00108\u001a\u0002092\u0006\u0010(\u001a\u00020)2\b\u0010:\u001a\u0004\u0018\u00010\u0004H\u0007J\"\u0010;\u001a\u0002092\u0006\u0010(\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u00042\u0006\u0010<\u001a\u00020+H\u0002J\u001e\u0010=\u001a\u0002092\u0006\u0010(\u001a\u00020)2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040>H\u0007J\u0018\u0010?\u001a\u0002092\u0006\u0010(\u001a\u00020)2\u0006\u0010:\u001a\u00020+H\u0007J\u0018\u0010@\u001a\u0002092\u0006\u0010(\u001a\u00020)2\u0006\u0010:\u001a\u00020\nH\u0007J\u001e\u0010A\u001a\u0002092\u0006\u0010(\u001a\u00020)2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040>H\u0007J\u0018\u0010B\u001a\u0002092\u0006\u0010(\u001a\u00020)2\u0006\u0010:\u001a\u00020+H\u0007J\u0018\u0010C\u001a\u0002092\u0006\u0010(\u001a\u00020)2\u0006\u0010:\u001a\u00020\nH\u0007J\u001e\u0010D\u001a\u0002092\u0006\u0010(\u001a\u00020)2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040>H\u0007J\u0018\u0010E\u001a\u0002092\u0006\u0010(\u001a\u00020)2\u0006\u0010:\u001a\u000204H\u0007J\u0018\u0010F\u001a\u0002092\u0006\u0010(\u001a\u00020)2\u0006\u0010:\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/facebook/LegacyTokenHelper$Companion;", "", "()V", "APPLICATION_ID_KEY", "", "DECLINED_PERMISSIONS_KEY", "DEFAULT_CACHE_KEY", "EXPIRATION_DATE_KEY", "EXPIRED_PERMISSIONS_KEY", "INVALID_BUNDLE_MILLISECONDS", "", "IS_SSO_KEY", "JSON_VALUE", "JSON_VALUE_ENUM_TYPE", "JSON_VALUE_TYPE", "LAST_REFRESH_DATE_KEY", "PERMISSIONS_KEY", "TAG", "TOKEN_KEY", "TOKEN_SOURCE_KEY", "TYPE_BOOLEAN", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE", "TYPE_BYTE_ARRAY", "TYPE_CHAR", "TYPE_CHAR_ARRAY", "TYPE_DOUBLE", "TYPE_DOUBLE_ARRAY", "TYPE_ENUM", "TYPE_FLOAT", "TYPE_FLOAT_ARRAY", "TYPE_INTEGER", "TYPE_INTEGER_ARRAY", "TYPE_LONG", "TYPE_LONG_ARRAY", "TYPE_SHORT", "TYPE_SHORT_ARRAY", "TYPE_STRING", "TYPE_STRING_LIST", "getApplicationId", "bundle", "Landroid/os/Bundle;", "getDate", "Ljava/util/Date;", "key", "getExpirationDate", "getExpirationMilliseconds", "getLastRefreshDate", "getLastRefreshMilliseconds", "getPermissions", "", "getSource", "Lcom/facebook/AccessTokenSource;", "getToken", "hasTokenInformation", "", "putApplicationId", "", "value", "putDate", "date", "putDeclinedPermissions", "", "putExpirationDate", "putExpirationMilliseconds", "putExpiredPermissions", "putLastRefreshDate", "putLastRefreshMilliseconds", "putPermissions", "putSource", "putToken", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final boolean hasTokenInformation(Bundle bundle) {
            String string;
            if (bundle == null || (string = bundle.getString(LegacyTokenHelper.TOKEN_KEY)) == null) {
                return false;
            }
            return ((string.length() == 0) || bundle.getLong(LegacyTokenHelper.EXPIRATION_DATE_KEY, 0L) == 0) ? false : true;
        }

        @JvmStatic
        public final String getToken(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString(LegacyTokenHelper.TOKEN_KEY);
        }

        @JvmStatic
        public final void putToken(Bundle bundle, String value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putString(LegacyTokenHelper.TOKEN_KEY, value);
        }

        @JvmStatic
        public final Date getExpirationDate(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return getDate(bundle, LegacyTokenHelper.EXPIRATION_DATE_KEY);
        }

        @JvmStatic
        public final void putExpirationDate(Bundle bundle, Date value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            putDate(bundle, LegacyTokenHelper.EXPIRATION_DATE_KEY, value);
        }

        @JvmStatic
        public final long getExpirationMilliseconds(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getLong(LegacyTokenHelper.EXPIRATION_DATE_KEY);
        }

        @JvmStatic
        public final void putExpirationMilliseconds(Bundle bundle, long j) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putLong(LegacyTokenHelper.EXPIRATION_DATE_KEY, j);
        }

        @JvmStatic
        public final Set<String> getPermissions(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(LegacyTokenHelper.PERMISSIONS_KEY);
            if (stringArrayList == null) {
                return null;
            }
            return new HashSet(stringArrayList);
        }

        @JvmStatic
        public final void putPermissions(Bundle bundle, Collection<String> value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList(LegacyTokenHelper.PERMISSIONS_KEY, new ArrayList<>(value));
        }

        @JvmStatic
        public final void putDeclinedPermissions(Bundle bundle, Collection<String> value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList(LegacyTokenHelper.DECLINED_PERMISSIONS_KEY, new ArrayList<>(value));
        }

        @JvmStatic
        public final void putExpiredPermissions(Bundle bundle, Collection<String> value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList(LegacyTokenHelper.EXPIRED_PERMISSIONS_KEY, new ArrayList<>(value));
        }

        @JvmStatic
        public final AccessTokenSource getSource(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (bundle.containsKey(LegacyTokenHelper.TOKEN_SOURCE_KEY)) {
                return (AccessTokenSource) bundle.getSerializable(LegacyTokenHelper.TOKEN_SOURCE_KEY);
            }
            return bundle.getBoolean(LegacyTokenHelper.IS_SSO_KEY) ? AccessTokenSource.FACEBOOK_APPLICATION_WEB : AccessTokenSource.WEB_VIEW;
        }

        @JvmStatic
        public final void putSource(Bundle bundle, AccessTokenSource value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putSerializable(LegacyTokenHelper.TOKEN_SOURCE_KEY, value);
        }

        @JvmStatic
        public final Date getLastRefreshDate(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return getDate(bundle, LegacyTokenHelper.LAST_REFRESH_DATE_KEY);
        }

        @JvmStatic
        public final void putLastRefreshDate(Bundle bundle, Date value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            putDate(bundle, LegacyTokenHelper.LAST_REFRESH_DATE_KEY, value);
        }

        @JvmStatic
        public final long getLastRefreshMilliseconds(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getLong(LegacyTokenHelper.LAST_REFRESH_DATE_KEY);
        }

        @JvmStatic
        public final void putLastRefreshMilliseconds(Bundle bundle, long j) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putLong(LegacyTokenHelper.LAST_REFRESH_DATE_KEY, j);
        }

        @JvmStatic
        public final String getApplicationId(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString(LegacyTokenHelper.APPLICATION_ID_KEY);
        }

        @JvmStatic
        public final void putApplicationId(Bundle bundle, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putString(LegacyTokenHelper.APPLICATION_ID_KEY, str);
        }

        private final Date getDate(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j = bundle.getLong(str, Long.MIN_VALUE);
            if (j == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j);
        }

        private final void putDate(Bundle bundle, String str, Date date) {
            bundle.putLong(str, date.getTime());
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("LegacyTokenHelper", "LegacyTokenHelper::class.java.simpleName");
        TAG = "LegacyTokenHelper";
    }
}
