package ds;

import android.content.res.AssetManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: MetadataManager.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f13275b = Logger.getLogger(b.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final gd.d f13276a;

    public b(gd.d dVar) {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet(62);
        hashSet.add(7);
        hashSet.add(27);
        hashSet.add(30);
        hashSet.add(31);
        hashSet.add(34);
        hashSet.add(36);
        hashSet.add(39);
        hashSet.add(43);
        hashSet.add(44);
        hashSet.add(49);
        hashSet.add(52);
        hashSet.add(54);
        hashSet.add(55);
        hashSet.add(58);
        hashSet.add(61);
        hashSet.add(62);
        hashSet.add(63);
        hashSet.add(64);
        hashSet.add(66);
        hashSet.add(81);
        hashSet.add(84);
        hashSet.add(90);
        hashSet.add(91);
        hashSet.add(94);
        hashSet.add(95);
        hashSet.add(255);
        hashSet.add(350);
        hashSet.add(351);
        hashSet.add(352);
        hashSet.add(358);
        hashSet.add(359);
        hashSet.add(372);
        hashSet.add(373);
        hashSet.add(380);
        hashSet.add(381);
        hashSet.add(385);
        hashSet.add(505);
        hashSet.add(506);
        hashSet.add(595);
        hashSet.add(675);
        hashSet.add(676);
        hashSet.add(679);
        hashSet.add(855);
        hashSet.add(856);
        hashSet.add(971);
        hashSet.add(972);
        hashSet.add(995);
        HashSet hashSet2 = new HashSet(320);
        hashSet2.add("AC");
        hashSet2.add("AD");
        hashSet2.add("AE");
        defpackage.c.C(hashSet2, "AF", "AG", "AI", "AL");
        defpackage.c.C(hashSet2, "AM", "AO", "AR", "AS");
        defpackage.c.C(hashSet2, "AT", "AU", "AW", "AX");
        defpackage.c.C(hashSet2, "AZ", "BA", "BB", "BD");
        defpackage.c.C(hashSet2, "BE", "BF", "BG", "BH");
        defpackage.c.C(hashSet2, "BI", "BJ", "BL", "BM");
        defpackage.c.C(hashSet2, "BN", "BO", "BQ", "BR");
        defpackage.c.C(hashSet2, "BS", "BT", "BW", "BY");
        defpackage.c.C(hashSet2, "BZ", "CA", "CC", "CD");
        defpackage.c.C(hashSet2, "CF", "CG", "CH", "CI");
        defpackage.c.C(hashSet2, "CK", "CL", "CM", "CN");
        defpackage.c.C(hashSet2, "CO", "CR", "CU", "CV");
        defpackage.c.C(hashSet2, "CW", "CX", "CY", "CZ");
        defpackage.c.C(hashSet2, "DE", "DJ", "DK", "DM");
        defpackage.c.C(hashSet2, "DO", "DZ", "EC", "EE");
        defpackage.c.C(hashSet2, "EG", "EH", "ER", "ES");
        defpackage.c.C(hashSet2, "ET", "FI", "FJ", "FK");
        defpackage.c.C(hashSet2, "FM", "FO", "FR", "GA");
        defpackage.c.C(hashSet2, "GB", "GD", "GE", "GF");
        defpackage.c.C(hashSet2, "GG", "GH", "GI", "GL");
        defpackage.c.C(hashSet2, "GM", "GN", "GP", "GR");
        defpackage.c.C(hashSet2, "GT", "GU", "GW", "GY");
        defpackage.c.C(hashSet2, "HK", "HN", "HR", "HT");
        defpackage.c.C(hashSet2, "HU", "ID", "IE", "IL");
        defpackage.c.C(hashSet2, "IM", "IN", "IQ", "IR");
        defpackage.c.C(hashSet2, "IS", "IT", "JE", "JM");
        defpackage.c.C(hashSet2, "JO", "JP", "KE", "KG");
        defpackage.c.C(hashSet2, "KH", "KI", "KM", "KN");
        defpackage.c.C(hashSet2, "KP", "KR", "KW", "KY");
        defpackage.c.C(hashSet2, "KZ", "LA", "LB", "LC");
        defpackage.c.C(hashSet2, "LI", "LK", "LR", "LS");
        defpackage.c.C(hashSet2, "LT", "LU", "LV", "LY");
        defpackage.c.C(hashSet2, "MA", "MC", "MD", "ME");
        defpackage.c.C(hashSet2, "MF", "MG", "MH", "MK");
        defpackage.c.C(hashSet2, "ML", "MM", "MN", "MO");
        defpackage.c.C(hashSet2, "MP", "MQ", "MR", "MS");
        defpackage.c.C(hashSet2, "MT", "MU", "MV", "MW");
        defpackage.c.C(hashSet2, "MX", "MY", "MZ", "NA");
        defpackage.c.C(hashSet2, "NC", "NE", "NF", "NG");
        defpackage.c.C(hashSet2, "NI", "NL", "NO", "NP");
        defpackage.c.C(hashSet2, "NR", "NU", "NZ", "OM");
        defpackage.c.C(hashSet2, "PA", "PE", "PF", "PG");
        defpackage.c.C(hashSet2, "PH", "PK", "PL", "PM");
        defpackage.c.C(hashSet2, "PR", "PS", "PT", "PW");
        defpackage.c.C(hashSet2, "PY", "QA", "RE", "RO");
        defpackage.c.C(hashSet2, "RS", "RU", "RW", "SA");
        defpackage.c.C(hashSet2, "SB", "SC", "SD", "SE");
        defpackage.c.C(hashSet2, "SG", "SH", "SI", "SJ");
        defpackage.c.C(hashSet2, "SK", "SL", "SM", "SN");
        defpackage.c.C(hashSet2, "SO", "SR", "ST", "SV");
        defpackage.c.C(hashSet2, "SX", "SY", "SZ", "TC");
        defpackage.c.C(hashSet2, "TD", "TG", "TH", "TJ");
        defpackage.c.C(hashSet2, "TL", "TM", "TN", "TO");
        defpackage.c.C(hashSet2, "TR", "TT", "TV", "TW");
        defpackage.c.C(hashSet2, "TZ", "UA", "UG", "US");
        defpackage.c.C(hashSet2, "UY", "UZ", "VA", "VC");
        defpackage.c.C(hashSet2, "VE", "VG", "VI", "VN");
        defpackage.c.C(hashSet2, "VU", "WF", "WS", "XK");
        defpackage.c.C(hashSet2, "YE", "YT", "ZA", "ZM");
        hashSet2.add("ZW");
        this.f13276a = dVar;
    }

    public final <T> e a(T t3, ConcurrentHashMap<T, e> concurrentHashMap, String str) {
        InputStream inputStream;
        ObjectInputStream objectInputStream;
        Logger logger = f13275b;
        e eVar = concurrentHashMap.get(t3);
        if (eVar != null) {
            return eVar;
        }
        String str2 = str + "_" + t3;
        gd.d dVar = this.f13276a;
        dVar.getClass();
        ObjectInputStream objectInputStream2 = null;
        try {
            inputStream = ((AssetManager) dVar.f16400v).open(str2.substring(1));
        } catch (IOException unused) {
            inputStream = null;
        }
        if (inputStream != null) {
            try {
                try {
                    objectInputStream = new ObjectInputStream(inputStream);
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    try {
                        int readInt = objectInputStream.readInt();
                        for (int i6 = 0; i6 < readInt; i6++) {
                            e eVar2 = new e();
                            eVar2.readExternal(objectInputStream);
                            arrayList.add(eVar2);
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e10) {
                            logger.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e10);
                        }
                        if (arrayList.size() != 0) {
                            if (arrayList.size() > 1) {
                                logger.log(Level.WARNING, "more than one metadata in file ".concat(str2));
                            }
                            e eVar3 = (e) arrayList.get(0);
                            e putIfAbsent = concurrentHashMap.putIfAbsent(t3, eVar3);
                            if (putIfAbsent != null) {
                                return putIfAbsent;
                            }
                            return eVar3;
                        }
                        throw new IllegalStateException("empty metadata: ".concat(str2));
                    } catch (IOException e11) {
                        throw new RuntimeException("cannot load/parse metadata", e11);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objectInputStream2 = objectInputStream;
                    try {
                        if (objectInputStream2 != null) {
                            objectInputStream2.close();
                        } else {
                            inputStream.close();
                        }
                    } catch (IOException e12) {
                        logger.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e12);
                    }
                    throw th;
                }
            } catch (IOException e13) {
                throw new RuntimeException("cannot load/parse metadata", e13);
            }
        }
        throw new IllegalStateException("missing metadata: ".concat(str2));
    }
}
