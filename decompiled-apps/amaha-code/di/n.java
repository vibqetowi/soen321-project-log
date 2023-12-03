package di;

import android.os.Bundle;
import hh.g;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: MoEUtils.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f12900a = "0123456789ABCDEF".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f12901b = {"com.bumptech.glide.load.resource.gif.GifDrawable", "com.bumptech.glide.Glide"};

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i6 = 0; i6 < bArr.length; i6++) {
            int i10 = bArr[i6] & 255;
            int i11 = i6 * 2;
            char[] cArr2 = f12900a;
            cArr[i11] = cArr2[i10 >>> 4];
            cArr[i11 + 1] = cArr2[i10 & 15];
        }
        return new String(cArr);
    }

    public static Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        try {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof Integer) {
                    bundle2.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    bundle2.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    bundle2.putString(str, (String) obj);
                } else if (obj instanceof Byte) {
                    bundle2.putByte(str, ((Byte) obj).byteValue());
                } else if (obj instanceof Character) {
                    bundle2.putChar(str, ((Character) obj).charValue());
                } else if (obj instanceof Double) {
                    bundle2.putDouble(str, ((Double) obj).doubleValue());
                } else if (obj instanceof Float) {
                    bundle2.putFloat(str, ((Float) obj).floatValue());
                } else if (obj instanceof Long) {
                    bundle2.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Short) {
                    bundle2.putShort(str, ((Short) obj).shortValue());
                }
            }
        } catch (Exception unused) {
        }
        return bundle2;
    }

    public static String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e10) {
            xg.i iVar = new xg.i(22);
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, iVar);
            return str;
        }
    }

    public static boolean d() {
        try {
            ClassLoader classLoader = n.class.getClassLoader();
            for (String str : f12901b) {
                if (Class.forName(str, false, classLoader) == null) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            xg.i iVar = new xg.i(23);
            hh.a aVar = hh.g.f17610d;
            g.a.b(5, iVar, 2);
            return false;
        } catch (Throwable unused2) {
            xg.i iVar2 = new xg.i(24);
            hh.a aVar2 = hh.g.f17610d;
            g.a.b(5, iVar2, 2);
            return false;
        }
    }

    public static HashMap e(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            HashMap hashMap = new HashMap(jSONObject.length());
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.get(next));
                } catch (Exception e10) {
                    xg.i iVar = new xg.i(20);
                    hh.a aVar = hh.g.f17610d;
                    g.a.a(1, e10, iVar);
                }
            }
            return hashMap;
        }
        return new HashMap();
    }
}
