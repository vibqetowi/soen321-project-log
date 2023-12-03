package com.appsflyer.internal;

import android.view.ViewConfiguration;
import androidx.recyclerview.widget.k;
import com.appsflyer.R;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import com.theinnerhour.b2b.utils.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* loaded from: classes.dex */
public class AFa1vSDK {
    public static byte[] AFLogger$LogLevel = null;
    private static Object AppsFlyer2dXConversionCallback = null;
    public static byte[] onAppOpenAttributionNative = null;
    private static Object onAttributionFailureNative = null;
    public static final int onConversionDataFail = 0;
    private static int onConversionDataSuccess = 0;
    private static int onInstallConversionDataLoadedNative = 0;
    private static long onInstallConversionFailureNative = 0;
    private static int onResponseErrorNative = 1;
    public static final byte[] onResponseNative = null;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r0 != '/') goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
        if (r7 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
        r7 = r4;
        r0 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0071 -> B:21:0x008a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s10, int i6, short s11) {
        char c10;
        int i10;
        byte[] bArr;
        byte b10;
        byte[] bArr2;
        int i11;
        boolean z10;
        int i12;
        char c11;
        int i13 = onConversionDataSuccess;
        int i14 = ((i13 | R.styleable.AppCompatTheme_textAppearanceListItem) << 1) - (i13 ^ R.styleable.AppCompatTheme_textAppearanceListItem);
        onResponseErrorNative = i14 % 128;
        if (i14 % 2 == 0) {
            c10 = 'T';
        } else {
            c10 = 'J';
        }
        if (c10 != 'T') {
            char c12 = '$';
            int i15 = (36 - (~(-s10))) - 1;
            i10 = ((i6 | 41) << 1) - (i6 ^ 41);
            bArr = onResponseNative;
            b10 = ((s11 | 4) << 1) - (s11 ^ 4);
            bArr2 = new byte[i15];
            i11 = ((i15 | (-1)) << 1) - (~i15);
            if (bArr == null) {
                c12 = '/';
            }
        } else {
            int i16 = 48 << s10;
            int i17 = (i6 ^ (-7)) + ((i6 & (-7)) << 1);
            i10 = (i17 ^ 59) + ((i17 & 59) << 1);
            bArr = onResponseNative;
            b10 = (s11 & 42) + (s11 | 42);
            bArr2 = new byte[i16];
            int i18 = (i16 & 236) + (i16 | 236);
            i11 = (i18 & (-111)) + (i18 | (-111));
            if (bArr == null) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        bArr2[i12] = (byte) i10;
        int i19 = (b10 ^ 1) + ((b10 & 1) << 1);
        if (i12 != i11) {
            String str = new String(bArr2, 0);
            int i20 = onConversionDataSuccess;
            int i21 = (i20 & 39) + (i20 | 39);
            onResponseErrorNative = i21 % 128;
            if (i21 % 2 == 0) {
                c11 = 'S';
            } else {
                c11 = 5;
            }
            if (c11 == 5) {
                return str;
            }
            throw null;
        }
        i12++;
        b10 = bArr[i19];
        int i22 = -b10;
        i10 = (((i10 ^ i22) + ((i10 & i22) << 1)) - 2) - 1;
        int i23 = onResponseErrorNative;
        int i24 = ((i23 | 29) << 1) - (i23 ^ 29);
        onConversionDataSuccess = i24 % 128;
        int i25 = i24 % 2;
        b10 = i19;
        bArr2[i12] = (byte) i10;
        int i192 = (b10 ^ 1) + ((b10 & 1) << 1);
        if (i12 != i11) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(46:(2:674|675)|15|(44:670|671|(0)(0)|20|(0)|22|(0)(0)|25|(0)|27|(0)(0)|30|(0)|(0)(0)|(0)|45|46|47|48|49|50|(0)(0)|(0)|651|57|58|(0)|650|65|(0)(0)|68|(0)(0)|71|(0)(0)|74|75|(0)|645|80|81|82|(0)|642|643)|17|(0)(0)|20|(0)|22|(0)(0)|25|(0)|27|(0)(0)|30|(0)|(0)(0)|(0)|45|46|47|48|49|50|(0)(0)|(0)|651|57|58|(0)|650|65|(0)(0)|68|(0)(0)|71|(0)(0)|74|75|(0)|645|80|81|82|(0)|642|643) */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0455, code lost:
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r14[19], r14[217(0xd9, float:3.04E-43)], r13)).getMethod($$c(r14[822(0x336, float:1.152E-42)], r14[83], (short) 776), null).invoke(r10, null)).booleanValue() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
        if ((r3 == null) != false) goto L674;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x05f7, code lost:
        if (r2.nextBoolean() != false) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x17ee, code lost:
        r1 = r45[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x17f1, code lost:
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0aa9 A[Catch: all -> 0x0aab, TryCatch #84 {all -> 0x0aab, blocks: (B:348:0x0a72, B:372:0x0bf3, B:429:0x0ed2, B:437:0x0efb, B:611:0x13f1, B:614:0x1462, B:620:0x1473, B:628:0x14cf, B:632:0x14da, B:633:0x14e0, B:518:0x1060, B:544:0x1146, B:562:0x11ba, B:564:0x11c0, B:565:0x11c1, B:566:0x11c2, B:567:0x11c7, B:583:0x1283, B:585:0x1289, B:586:0x128a, B:597:0x13c4, B:575:0x1248, B:577:0x124e, B:578:0x124f, B:356:0x0aa2, B:358:0x0aa9, B:359:0x0aaa, B:517:0x1034, B:515:0x0fff, B:436:0x0edf, B:428:0x0ea6, B:612:0x1445, B:426:0x0e75), top: B:861:0x0a72 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0aaa A[Catch: all -> 0x0aab, TRY_LEAVE, TryCatch #84 {all -> 0x0aab, blocks: (B:348:0x0a72, B:372:0x0bf3, B:429:0x0ed2, B:437:0x0efb, B:611:0x13f1, B:614:0x1462, B:620:0x1473, B:628:0x14cf, B:632:0x14da, B:633:0x14e0, B:518:0x1060, B:544:0x1146, B:562:0x11ba, B:564:0x11c0, B:565:0x11c1, B:566:0x11c2, B:567:0x11c7, B:583:0x1283, B:585:0x1289, B:586:0x128a, B:597:0x13c4, B:575:0x1248, B:577:0x124e, B:578:0x124f, B:356:0x0aa2, B:358:0x0aa9, B:359:0x0aaa, B:517:0x1034, B:515:0x0fff, B:436:0x0edf, B:428:0x0ea6, B:612:0x1445, B:426:0x0e75), top: B:861:0x0a72 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x13e6  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x13e8  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x13eb  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x13ec A[Catch: all -> 0x1760, TRY_LEAVE, TryCatch #63 {all -> 0x1760, blocks: (B:636:0x14e5, B:644:0x1523, B:627:0x149c, B:530:0x107f, B:536:0x10eb, B:590:0x12ad, B:592:0x1331, B:594:0x133b, B:601:0x13dc, B:602:0x13e2, B:608:0x13ec, B:366:0x0abf), top: B:890:0x14e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:611:0x13f1 A[Catch: all -> 0x0aab, TRY_ENTER, TRY_LEAVE, TryCatch #84 {all -> 0x0aab, blocks: (B:348:0x0a72, B:372:0x0bf3, B:429:0x0ed2, B:437:0x0efb, B:611:0x13f1, B:614:0x1462, B:620:0x1473, B:628:0x14cf, B:632:0x14da, B:633:0x14e0, B:518:0x1060, B:544:0x1146, B:562:0x11ba, B:564:0x11c0, B:565:0x11c1, B:566:0x11c2, B:567:0x11c7, B:583:0x1283, B:585:0x1289, B:586:0x128a, B:597:0x13c4, B:575:0x1248, B:577:0x124e, B:578:0x124f, B:356:0x0aa2, B:358:0x0aa9, B:359:0x0aaa, B:517:0x1034, B:515:0x0fff, B:436:0x0edf, B:428:0x0ea6, B:612:0x1445, B:426:0x0e75), top: B:861:0x0a72 }] */
    /* JADX WARN: Removed duplicated region for block: B:627:0x149c A[Catch: all -> 0x1760, TRY_ENTER, TRY_LEAVE, TryCatch #63 {all -> 0x1760, blocks: (B:636:0x14e5, B:644:0x1523, B:627:0x149c, B:530:0x107f, B:536:0x10eb, B:590:0x12ad, B:592:0x1331, B:594:0x133b, B:601:0x13dc, B:602:0x13e2, B:608:0x13ec, B:366:0x0abf), top: B:890:0x14e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ab A[Catch: Exception -> 0x18d4, TRY_ENTER, TRY_LEAVE, TryCatch #75 {Exception -> 0x18d4, blocks: (B:3:0x000f, B:57:0x0146, B:76:0x0233, B:87:0x02cd, B:89:0x035c, B:98:0x039d, B:108:0x03ba, B:112:0x03c3, B:120:0x03d6, B:129:0x03f2, B:135:0x03fc, B:776:0x17dc, B:798:0x180d, B:799:0x1824, B:809:0x1878, B:811:0x189a, B:783:0x17e7, B:784:0x17ee, B:786:0x17f1, B:69:0x01ab, B:10:0x0033, B:801:0x183b, B:802:0x186d, B:77:0x024c, B:58:0x0164, B:86:0x0296, B:73:0x020c, B:71:0x01c9), top: B:840:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:771:0x17c8  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x17f8  */
    /* JADX WARN: Removed duplicated region for block: B:793:0x17fb  */
    /* JADX WARN: Removed duplicated region for block: B:809:0x1878 A[Catch: Exception -> 0x18d4, TryCatch #75 {Exception -> 0x18d4, blocks: (B:3:0x000f, B:57:0x0146, B:76:0x0233, B:87:0x02cd, B:89:0x035c, B:98:0x039d, B:108:0x03ba, B:112:0x03c3, B:120:0x03d6, B:129:0x03f2, B:135:0x03fc, B:776:0x17dc, B:798:0x180d, B:799:0x1824, B:809:0x1878, B:811:0x189a, B:783:0x17e7, B:784:0x17ee, B:786:0x17f1, B:69:0x01ab, B:10:0x0033, B:801:0x183b, B:802:0x186d, B:77:0x024c, B:58:0x0164, B:86:0x0296, B:73:0x020c, B:71:0x01c9), top: B:840:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:810:0x1882  */
    /* JADX WARN: Removed duplicated region for block: B:838:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:862:0x0400 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:888:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:890:0x14e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:892:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:916:0x13c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:925:0x1801 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:930:0x17f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:931:0x1634 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0392  */
    static {
        Object obj;
        Object invoke;
        Object invoke2;
        Object invoke3;
        boolean z10;
        int i6;
        boolean z11;
        boolean[] zArr;
        String str;
        boolean[] zArr2;
        boolean[] zArr3;
        Object[] objArr;
        int i10;
        Object obj2;
        int i11;
        boolean z12;
        byte[] bArr;
        String $$c;
        byte[] bArr2;
        boolean z13;
        Object obj3;
        boolean z14;
        Random random;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        boolean z15;
        boolean z16;
        StringBuilder sb2;
        int i12;
        int i13;
        char c10;
        Random random2;
        Object obj12;
        char c11;
        int nextInt;
        int i14;
        int i15;
        Object obj13;
        Class cls;
        InputStream inputStream;
        int i16;
        String str2;
        short s10;
        byte[] bArr3;
        Object invoke4;
        Object newInstance;
        Exception exc;
        int length;
        int i17;
        Object obj14;
        byte[] bArr4;
        Object obj15;
        Object obj16;
        Throwable th2;
        Object obj17;
        short s11;
        byte[] bArr5;
        Method declaredMethod;
        Object[] objArr2;
        short s12;
        Throwable cause;
        int i18;
        char c12;
        boolean z17;
        boolean z18;
        boolean z19;
        byte[] bArr6;
        init$0();
        onInstallConversionDataLoadedNative = 4;
        onInstallConversionFailureNative = 1778826167052559268L;
        try {
            byte[] bArr7 = onResponseNative;
            byte b10 = bArr7[83];
            String $$c2 = $$c(bArr7[41], b10, (short) ((b10 ^ 261) | (b10 & 261)));
            int i19 = 1;
            String $$c3 = onAttributionFailureNative != null ? null : $$c((byte) (-bArr7[11]), bArr7[83], (short) 932);
            try {
                obj = Class.forName($$c(bArr7[17], (byte) (-bArr7[612]), (short) 722)).getMethod($$c(bArr7[6], bArr7[83], bArr7[379]), new Class[0]).invoke(null, null);
            } catch (Exception unused) {
                obj = null;
            }
            try {
                byte[] bArr8 = onResponseNative;
                obj = Class.forName($$c(bArr8[129], (byte) (-bArr8[612]), (short) (onConversionDataFail | 420))).getMethod($$c((byte) (-bArr8[29]), bArr8[10], (short) 842), new Class[0]).invoke(null, null);
            } catch (Exception unused2) {
            }
            if (obj != null) {
                try {
                    Class<?> cls2 = obj.getClass();
                    byte[] bArr9 = onResponseNative;
                    invoke = cls2.getMethod($$c(bArr9[843], bArr9[10], (short) 232), null).invoke(obj, null);
                } catch (Exception unused3) {
                    invoke = null;
                    if ((obj == null ? 'Z' : (char) 25) == 'Z') {
                        try {
                            Class<?> cls3 = obj.getClass();
                            byte[] bArr10 = onResponseNative;
                            int i20 = onConversionDataFail;
                            invoke2 = cls3.getMethod($$c(bArr10[420], bArr10[10], (short) ((i20 & 334) | (i20 ^ 334))), null).invoke(obj, null);
                        } catch (Exception unused4) {
                            invoke2 = null;
                            if ((obj == null ? 'T' : '3') == 'T') {
                            }
                            invoke3 = null;
                            int i21 = 2;
                            if (invoke != null) {
                            }
                            if (invoke3 == null) {
                            }
                            if (invoke2 == null) {
                            }
                            int i22 = (onResponseErrorNative + 88) - 1;
                            onConversionDataSuccess = i22 % 128;
                            int i23 = i22 % 2;
                            byte[] bArr11 = onResponseNative;
                            int i24 = onConversionDataFail;
                            Object invoke5 = Class.forName($$c(bArr11[129], (byte) (-bArr11[612]), (short) ((i24 & 548) | (i24 ^ 548)))).getMethod($$c(bArr11[124], bArr11[10], (short) 458), null).invoke(null, null);
                            short s13 = (short) 862;
                            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName($$c(bArr11[19], bArr11[217], s13)), 9);
                            objArr3[0] = null;
                            objArr3[1] = invoke2;
                            objArr3[2] = invoke;
                            objArr3[3] = invoke3;
                            objArr3[4] = invoke5;
                            objArr3[5] = invoke2;
                            objArr3[6] = invoke;
                            objArr3[7] = invoke3;
                            objArr3[8] = invoke5;
                            boolean[] zArr4 = {false, true, true, true, true, true, true, true, true};
                            boolean[] zArr5 = {false, false, false, false, false, true, true, true, true};
                            boolean[] zArr6 = new boolean[9];
                            zArr6[0] = false;
                            zArr6[1] = false;
                            zArr6[2] = true;
                            zArr6[3] = true;
                            zArr6[4] = false;
                            zArr6[5] = false;
                            zArr6[6] = true;
                            zArr6[7] = true;
                            zArr6[8] = false;
                            Class<?> cls4 = Class.forName($$c(bArr11[13], (byte) (-bArr11[612]), (short) R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle));
                            i18 = cls4.getDeclaredField($$c(bArr11[384], bArr11[376], (short) 626)).getInt(cls4);
                            if (!(i18 != 29)) {
                            }
                            c12 = 0;
                            z17 = false;
                            zArr6[c12] = z17;
                            if (i18 >= 21) {
                            }
                            z18 = false;
                            zArr6[1] = z18;
                            zArr6[5] = i18 >= 21;
                            zArr6[4] = (i18 < 16 ? 'L' : 'K') != 'K';
                            if (i18 < 16) {
                            }
                            z19 = false;
                            zArr6[8] = z19;
                            z10 = false;
                            i6 = 0;
                            loop0: while (!z10) {
                            }
                        }
                        if ((obj == null ? 'T' : '3') == 'T') {
                            try {
                                Class<?> cls5 = obj.getClass();
                                byte[] bArr12 = onResponseNative;
                                invoke3 = cls5.getMethod($$c(bArr12[843], bArr12[10], (short) 246), null).invoke(obj, null);
                            } catch (Exception unused5) {
                                invoke3 = null;
                                int i212 = 2;
                                if (invoke != null) {
                                }
                                if (invoke3 == null) {
                                }
                                if (invoke2 == null) {
                                }
                                int i222 = (onResponseErrorNative + 88) - 1;
                                onConversionDataSuccess = i222 % 128;
                                int i232 = i222 % 2;
                                byte[] bArr112 = onResponseNative;
                                int i242 = onConversionDataFail;
                                Object invoke52 = Class.forName($$c(bArr112[129], (byte) (-bArr112[612]), (short) ((i242 & 548) | (i242 ^ 548)))).getMethod($$c(bArr112[124], bArr112[10], (short) 458), null).invoke(null, null);
                                short s132 = (short) 862;
                                Object[] objArr32 = (Object[]) Array.newInstance(Class.forName($$c(bArr112[19], bArr112[217], s132)), 9);
                                objArr32[0] = null;
                                objArr32[1] = invoke2;
                                objArr32[2] = invoke;
                                objArr32[3] = invoke3;
                                objArr32[4] = invoke52;
                                objArr32[5] = invoke2;
                                objArr32[6] = invoke;
                                objArr32[7] = invoke3;
                                objArr32[8] = invoke52;
                                boolean[] zArr42 = {false, true, true, true, true, true, true, true, true};
                                boolean[] zArr52 = {false, false, false, false, false, true, true, true, true};
                                boolean[] zArr62 = new boolean[9];
                                zArr62[0] = false;
                                zArr62[1] = false;
                                zArr62[2] = true;
                                zArr62[3] = true;
                                zArr62[4] = false;
                                zArr62[5] = false;
                                zArr62[6] = true;
                                zArr62[7] = true;
                                zArr62[8] = false;
                                Class<?> cls42 = Class.forName($$c(bArr112[13], (byte) (-bArr112[612]), (short) R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle));
                                i18 = cls42.getDeclaredField($$c(bArr112[384], bArr112[376], (short) 626)).getInt(cls42);
                                if (!(i18 != 29)) {
                                }
                                c12 = 0;
                                z17 = false;
                                zArr62[c12] = z17;
                                if (i18 >= 21) {
                                }
                                z18 = false;
                                zArr62[1] = z18;
                                zArr62[5] = i18 >= 21;
                                zArr62[4] = (i18 < 16 ? 'L' : 'K') != 'K';
                                if (i18 < 16) {
                                }
                                z19 = false;
                                zArr62[8] = z19;
                                z10 = false;
                                i6 = 0;
                                loop0: while (!z10) {
                                }
                            }
                            int i2122 = 2;
                            if (invoke != null) {
                                if ($$c3 != null) {
                                    StringBuilder sb3 = new StringBuilder();
                                    byte b11 = onResponseNative[4];
                                    sb3.append($$c(bArr6[843], b11, (short) (b11 | 601)));
                                    sb3.append($$c3);
                                    invoke = Class.forName($$c(bArr6[19], bArr6[217], (short) 862)).getDeclaredConstructor(String.class).newInstance(sb3.toString());
                                } else {
                                    int i25 = (onResponseErrorNative + 28) - 1;
                                    onConversionDataSuccess = i25 % 128;
                                    int i26 = i25 % 2;
                                    invoke = null;
                                }
                            }
                            if (invoke3 == null) {
                                int i27 = (onConversionDataSuccess + 26) - 1;
                                onResponseErrorNative = i27 % 128;
                                int i28 = i27 % 2;
                            } else {
                                byte[] bArr13 = onResponseNative;
                                String $$c4 = $$c(bArr13[473], bArr13[217], (short) 685);
                                int i29 = onResponseErrorNative;
                                int i30 = (i29 ^ 59) + ((i29 & 59) << 1);
                                onConversionDataSuccess = i30 % 128;
                                int i31 = i30 % 2;
                                Object invoke6 = Class.forName($$c(bArr13[390], bArr13[217], bArr13[843])).getMethod($$c(bArr13[843], bArr13[10], (short) 698), String.class).invoke(null, $$c4);
                                int i32 = onResponseErrorNative;
                                int i33 = (i32 & R.styleable.AppCompatTheme_toolbarStyle) + (i32 | R.styleable.AppCompatTheme_toolbarStyle);
                                onConversionDataSuccess = i33 % 128;
                                int i34 = i33 % 2;
                                invoke3 = Class.forName($$c(bArr13[19], bArr13[217], (short) 862)).getDeclaredConstructor(String.class).newInstance(invoke6);
                            }
                            if (invoke2 == null && invoke != null) {
                                byte[] bArr14 = onResponseNative;
                                byte b12 = bArr14[83];
                                int i35 = onConversionDataFail;
                                short s14 = (short) 862;
                                invoke2 = Class.forName($$c(bArr14[19], bArr14[217], s14)).getDeclaredConstructor(Class.forName($$c(bArr14[19], bArr14[217], s14)), String.class).newInstance(invoke, $$c((byte) (-bArr14[580]), b12, (short) ((i35 & 262) | (i35 ^ 262))));
                            }
                            int i2222 = (onResponseErrorNative + 88) - 1;
                            onConversionDataSuccess = i2222 % 128;
                            int i2322 = i2222 % 2;
                            byte[] bArr1122 = onResponseNative;
                            int i2422 = onConversionDataFail;
                            Object invoke522 = Class.forName($$c(bArr1122[129], (byte) (-bArr1122[612]), (short) ((i2422 & 548) | (i2422 ^ 548)))).getMethod($$c(bArr1122[124], bArr1122[10], (short) 458), null).invoke(null, null);
                            short s1322 = (short) 862;
                            Object[] objArr322 = (Object[]) Array.newInstance(Class.forName($$c(bArr1122[19], bArr1122[217], s1322)), 9);
                            objArr322[0] = null;
                            objArr322[1] = invoke2;
                            objArr322[2] = invoke;
                            objArr322[3] = invoke3;
                            objArr322[4] = invoke522;
                            objArr322[5] = invoke2;
                            objArr322[6] = invoke;
                            objArr322[7] = invoke3;
                            objArr322[8] = invoke522;
                            boolean[] zArr422 = {false, true, true, true, true, true, true, true, true};
                            boolean[] zArr522 = {false, false, false, false, false, true, true, true, true};
                            boolean[] zArr622 = new boolean[9];
                            zArr622[0] = false;
                            zArr622[1] = false;
                            zArr622[2] = true;
                            zArr622[3] = true;
                            zArr622[4] = false;
                            zArr622[5] = false;
                            zArr622[6] = true;
                            zArr622[7] = true;
                            zArr622[8] = false;
                            Class<?> cls422 = Class.forName($$c(bArr1122[13], (byte) (-bArr1122[612]), (short) R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle));
                            i18 = cls422.getDeclaredField($$c(bArr1122[384], bArr1122[376], (short) 626)).getInt(cls422);
                            if (!(i18 != 29) || i18 < 26) {
                                c12 = 0;
                                z17 = false;
                            } else {
                                c12 = 0;
                                z17 = true;
                            }
                            zArr622[c12] = z17;
                            if (i18 >= 21) {
                                int i36 = onConversionDataSuccess;
                                int i37 = ((i36 | R.styleable.AppCompatTheme_windowMinWidthMinor) << 1) - (i36 ^ R.styleable.AppCompatTheme_windowMinWidthMinor);
                                onResponseErrorNative = i37 % 128;
                                if (i37 % 2 != 0) {
                                    z18 = true;
                                    zArr622[1] = z18;
                                    zArr622[5] = i18 >= 21;
                                    zArr622[4] = (i18 < 16 ? 'L' : 'K') != 'K';
                                    if (i18 < 16) {
                                        int i38 = onResponseErrorNative;
                                        int i39 = (i38 ^ R.styleable.AppCompatTheme_tooltipFrameBackground) + ((i38 & R.styleable.AppCompatTheme_tooltipFrameBackground) << 1);
                                        onConversionDataSuccess = i39 % 128;
                                        if (i39 % 2 == 0) {
                                            z19 = true;
                                            zArr622[8] = z19;
                                            z10 = false;
                                            i6 = 0;
                                            loop0: for (int i40 = 9; !z10 && i6 < i40; i40 = 9) {
                                                if (zArr622[i6]) {
                                                    z11 = z10;
                                                    zArr = zArr422;
                                                    str = $$c2;
                                                    zArr2 = zArr522;
                                                    zArr3 = zArr622;
                                                    objArr = objArr322;
                                                    i10 = i6;
                                                } else {
                                                    try {
                                                        z13 = zArr422[i6];
                                                        obj3 = objArr322[i6];
                                                        z14 = zArr522[i6];
                                                        if (z13) {
                                                            if (obj3 != null) {
                                                                int i41 = onConversionDataSuccess;
                                                                int i42 = (i41 & 63) + (i41 | 63);
                                                                int i43 = i42 % 128;
                                                                onResponseErrorNative = i43;
                                                                int i44 = i42 % i2122;
                                                                int i45 = (i43 + R.styleable.AppCompatTheme_tooltipForegroundColor) - i19;
                                                                onConversionDataSuccess = i45 % 128;
                                                                int i46 = i45 % i2122;
                                                                byte[] bArr15 = onResponseNative;
                                                            }
                                                            try {
                                                                StringBuilder sb4 = new StringBuilder();
                                                                byte[] bArr16 = onResponseNative;
                                                                byte b13 = bArr16[362];
                                                                z11 = z10;
                                                                try {
                                                                    byte b14 = bArr16[822];
                                                                    int i47 = onConversionDataFail;
                                                                    zArr = zArr422;
                                                                    try {
                                                                        sb4.append($$c(b13, b14, (short) (i47 | 388)));
                                                                        sb4.append(obj3);
                                                                        byte b15 = bArr16[46];
                                                                        sb4.append($$c((byte) (bArr16[92] - 1), b15, (short) ((b15 ^ 259) | (b15 & 259))));
                                                                        String sb5 = sb4.toString();
                                                                        int i48 = onConversionDataSuccess;
                                                                        int i49 = (i48 ^ 83) + ((i48 & 83) << 1);
                                                                        onResponseErrorNative = i49 % 128;
                                                                        int i50 = i49 % 2;
                                                                        throw ((Throwable) Class.forName($$c((byte) i47, bArr16[217], (short) 783)).getDeclaredConstructor(String.class).newInstance(sb5));
                                                                        break;
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        obj2 = th;
                                                                        str = $$c2;
                                                                        zArr2 = zArr522;
                                                                        zArr3 = zArr622;
                                                                        objArr = objArr322;
                                                                        i10 = i6;
                                                                        i11 = (i10 & 1) + (i10 | 1);
                                                                        while (true) {
                                                                            if (i11 < 9) {
                                                                            }
                                                                            i11 = ((i11 & 1) << 1) + (i11 ^ 1);
                                                                        }
                                                                        if ((z12 ? (char) 26 : '@') == '@') {
                                                                        }
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    zArr = zArr422;
                                                                    obj2 = th;
                                                                    str = $$c2;
                                                                    zArr2 = zArr522;
                                                                    zArr3 = zArr622;
                                                                    objArr = objArr322;
                                                                    i10 = i6;
                                                                    i11 = (i10 & 1) + (i10 | 1);
                                                                    while (true) {
                                                                        if (i11 < 9) {
                                                                        }
                                                                        i11 = ((i11 & 1) << 1) + (i11 ^ 1);
                                                                    }
                                                                    if ((z12 ? (char) 26 : '@') == '@') {
                                                                    }
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                z11 = z10;
                                                            }
                                                        }
                                                        z11 = z10;
                                                        zArr = zArr422;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        z11 = z10;
                                                        zArr = zArr422;
                                                        str = $$c2;
                                                        zArr2 = zArr522;
                                                        zArr3 = zArr622;
                                                        objArr = objArr322;
                                                    }
                                                    if (z13) {
                                                        try {
                                                            random = new Random();
                                                            int i51 = onConversionDataSuccess;
                                                            int i52 = (i51 ^ 13) + ((i51 & 13) << 1);
                                                            onResponseErrorNative = i52 % 128;
                                                            int i53 = i52 % 2;
                                                            byte[] bArr17 = onResponseNative;
                                                            random.setSeed(((Long) Class.forName($$c(bArr17[390], bArr17[217], bArr17[843])).getMethod($$c(bArr17[412], bArr17[83], (short) 877), null).invoke(null, null)).longValue() ^ (-1617135332));
                                                            obj4 = null;
                                                            obj5 = null;
                                                            obj6 = null;
                                                            obj7 = null;
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            str = $$c2;
                                                        }
                                                        while (obj4 == null) {
                                                            if (obj5 == null) {
                                                                obj11 = obj4;
                                                                z15 = true;
                                                                z16 = false;
                                                            } else {
                                                                obj11 = obj4;
                                                                z15 = true;
                                                                z16 = true;
                                                            }
                                                            int i54 = z16 != z15 ? 6 : (obj6 == null ? (char) 23 : '\"') != '\"' ? 5 : obj7 == null ? 4 : 3;
                                                            str = $$c2;
                                                            try {
                                                                sb2 = new StringBuilder((i54 ^ 1) + ((i54 & 1) << 1));
                                                                sb2.append('.');
                                                                i12 = 0;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                zArr2 = zArr522;
                                                                objArr = objArr322;
                                                                obj2 = th;
                                                                zArr3 = zArr622;
                                                                i10 = i6;
                                                                i11 = (i10 & 1) + (i10 | 1);
                                                                while (true) {
                                                                    if (i11 < 9) {
                                                                    }
                                                                    i11 = ((i11 & 1) << 1) + (i11 ^ 1);
                                                                }
                                                                if ((z12 ? (char) 26 : '@') == '@') {
                                                                }
                                                            }
                                                            while (true) {
                                                                if (i12 < i54) {
                                                                    i13 = i54;
                                                                    zArr2 = zArr522;
                                                                    c10 = '\\';
                                                                } else {
                                                                    i13 = i54;
                                                                    zArr2 = zArr522;
                                                                    c10 = '^';
                                                                }
                                                                if (c10 == '^') {
                                                                    break;
                                                                }
                                                                int i55 = (onResponseErrorNative + 16) - 1;
                                                                int i56 = i55 % 128;
                                                                onConversionDataSuccess = i56;
                                                                int i57 = i55 % 2;
                                                                if (z14) {
                                                                    c11 = 'Z';
                                                                    objArr = objArr322;
                                                                } else {
                                                                    objArr = objArr322;
                                                                    c11 = 'S';
                                                                }
                                                                if (c11 != 'Z') {
                                                                    try {
                                                                        sb2.append((char) ((8192 - (~random.nextInt(12))) - 1));
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                        obj2 = th;
                                                                        zArr3 = zArr622;
                                                                        i10 = i6;
                                                                        i11 = (i10 & 1) + (i10 | 1);
                                                                        while (true) {
                                                                            if (i11 < 9) {
                                                                            }
                                                                            i11 = ((i11 & 1) << 1) + (i11 ^ 1);
                                                                        }
                                                                        if ((z12 ? (char) 26 : '@') == '@') {
                                                                        }
                                                                    }
                                                                } else {
                                                                    int i58 = (i56 & R.styleable.AppCompatTheme_windowMinWidthMinor) + (i56 | R.styleable.AppCompatTheme_windowMinWidthMinor);
                                                                    onResponseErrorNative = i58 % 128;
                                                                    if (i58 % 2 == 0) {
                                                                        nextInt = random.nextInt(11);
                                                                        if (random.nextBoolean()) {
                                                                            i14 = ((nextInt | 65) << 1) - (nextInt ^ 65);
                                                                        }
                                                                        i14 = nextInt + 96;
                                                                    } else {
                                                                        nextInt = random.nextInt(26);
                                                                    }
                                                                    sb2.append((char) i14);
                                                                }
                                                                i12 = (i12 + 2) - 1;
                                                                zArr522 = zArr2;
                                                                i54 = i13;
                                                                objArr322 = objArr;
                                                                th = th9;
                                                                obj2 = th;
                                                                zArr3 = zArr622;
                                                                i10 = i6;
                                                                i11 = (i10 & 1) + (i10 | 1);
                                                                while (true) {
                                                                    if (i11 < 9) {
                                                                        z12 = false;
                                                                        break;
                                                                    }
                                                                    int i59 = onConversionDataSuccess;
                                                                    int i60 = (i59 & 35) + (i59 | 35);
                                                                    onResponseErrorNative = i60 % 128;
                                                                    if (!(i60 % 2 != 0)) {
                                                                        break loop0;
                                                                    }
                                                                    z12 = true;
                                                                    if (!(!zArr3[i11])) {
                                                                        break;
                                                                    }
                                                                    i11 = ((i11 & 1) << 1) + (i11 ^ 1);
                                                                }
                                                                if ((z12 ? (char) 26 : '@') == '@') {
                                                                    int i61 = onResponseErrorNative + R.styleable.AppCompatTheme_windowMinWidthMinor;
                                                                    onConversionDataSuccess = i61 % 128;
                                                                    if (i61 % 2 != 0) {
                                                                        byte b16 = onResponseNative[30709];
                                                                        $$c = $$c(bArr2[28210], b16, (short) ((b16 ^ 20869) | (b16 & 20869)));
                                                                    } else {
                                                                        byte b17 = onResponseNative[822];
                                                                        $$c = $$c(bArr[594], b17, (short) ((b17 ^ 355) | (b17 & 355)));
                                                                    }
                                                                    throw ((Throwable) Class.forName($$c((byte) onConversionDataFail, onResponseNative[217], (short) 783)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c, obj2));
                                                                }
                                                                onAttributionFailureNative = null;
                                                                AppsFlyer2dXConversionCallback = null;
                                                            }
                                                            objArr = objArr322;
                                                            String sb6 = sb2.toString();
                                                            if (obj5 != null) {
                                                                if ((obj6 == null ? 'a' : 'B') != 'B') {
                                                                    Object[] objArr4 = {obj3, sb6};
                                                                    byte[] bArr18 = onResponseNative;
                                                                    random2 = random;
                                                                    obj6 = Class.forName($$c(bArr18[19], bArr18[217], s1322)).getDeclaredConstructor(Class.forName($$c(bArr18[19], bArr18[217], s1322)), String.class).newInstance(objArr4);
                                                                } else if (obj7 == null) {
                                                                    int i62 = onConversionDataSuccess + 73;
                                                                    onResponseErrorNative = i62 % 128;
                                                                    if (!(i62 % 2 != 0)) {
                                                                        throw null;
                                                                    }
                                                                    Object[] objArr5 = {obj3, sb6};
                                                                    byte[] bArr19 = onResponseNative;
                                                                    random2 = random;
                                                                    obj7 = Class.forName($$c(bArr19[19], bArr19[217], s1322)).getDeclaredConstructor(Class.forName($$c(bArr19[19], bArr19[217], s1322)), String.class).newInstance(objArr5);
                                                                } else {
                                                                    Object[] objArr6 = {obj3, sb6};
                                                                    byte[] bArr20 = onResponseNative;
                                                                    random2 = random;
                                                                    Object obj18 = obj5;
                                                                    Object newInstance2 = Class.forName($$c(bArr20[19], bArr20[217], s1322)).getDeclaredConstructor(Class.forName($$c(bArr20[19], bArr20[217], s1322)), String.class).newInstance(objArr6);
                                                                    try {
                                                                        byte b18 = bArr20[13];
                                                                        byte b19 = bArr20[217];
                                                                        obj12 = obj6;
                                                                        Object newInstance3 = Class.forName($$c(b18, b19, (short) ((b19 ^ 688) | (b19 & 688)))).getDeclaredConstructor(Class.forName($$c(bArr20[19], bArr20[217], s1322))).newInstance(newInstance2);
                                                                        byte b20 = bArr20[13];
                                                                        byte b21 = bArr20[217];
                                                                        Class.forName($$c(b20, b21, (short) ((b21 ^ 688) | (b21 & 688)))).getMethod($$c(bArr20[362], bArr20[83], (short) 656), null).invoke(newInstance3, null);
                                                                        obj4 = newInstance2;
                                                                        obj5 = obj18;
                                                                    } catch (Throwable th10) {
                                                                        try {
                                                                            Throwable cause2 = th10.getCause();
                                                                            if (cause2 == null) {
                                                                                throw th10;
                                                                            }
                                                                            throw cause2;
                                                                        }
                                                                    }
                                                                }
                                                                obj4 = obj11;
                                                                zArr522 = zArr2;
                                                                random = random2;
                                                                $$c2 = str;
                                                                objArr322 = objArr;
                                                            } else {
                                                                random2 = random;
                                                                obj12 = obj6;
                                                                Object[] objArr7 = {obj3, sb6};
                                                                byte[] bArr21 = onResponseNative;
                                                                obj5 = Class.forName($$c(bArr21[19], bArr21[217], s1322)).getDeclaredConstructor(Class.forName($$c(bArr21[19], bArr21[217], s1322)), String.class).newInstance(objArr7);
                                                                obj4 = obj11;
                                                            }
                                                            obj6 = obj12;
                                                            zArr522 = zArr2;
                                                            random = random2;
                                                            $$c2 = str;
                                                            objArr322 = objArr;
                                                        }
                                                        obj8 = obj4;
                                                        str = $$c2;
                                                        zArr2 = zArr522;
                                                        objArr = objArr322;
                                                        obj9 = obj5;
                                                        obj10 = obj6;
                                                    } else {
                                                        str = $$c2;
                                                        zArr2 = zArr522;
                                                        objArr = objArr322;
                                                        obj7 = null;
                                                        obj8 = null;
                                                        obj9 = null;
                                                        obj10 = null;
                                                    }
                                                    try {
                                                        byte[] bArr22 = new byte[7368];
                                                        byte[] bArr23 = onResponseNative;
                                                        Object[] objArr8 = {AFa1vSDK.class.getResourceAsStream($$c(bArr23[17], bArr23[4], (short) 660))};
                                                        byte b22 = bArr23[594];
                                                        byte b23 = bArr23[217];
                                                        Object newInstance4 = Class.forName($$c(b22, b23, (short) ((b23 ^ 444) | (b23 & 444)))).getDeclaredConstructor(Class.forName($$c((byte) onConversionDataFail, bArr23[217], (short) 970))).newInstance(objArr8);
                                                        int i63 = onConversionDataSuccess;
                                                        int i64 = (i63 & R.styleable.AppCompatTheme_switchStyle) + (i63 | R.styleable.AppCompatTheme_switchStyle);
                                                        onResponseErrorNative = i64 % 128;
                                                        int i65 = i64 % 2;
                                                        byte b24 = bArr23[594];
                                                        byte b25 = bArr23[217];
                                                        Class.forName($$c(b24, b25, (short) ((b25 ^ 444) | (b25 & 444)))).getMethod($$c(bArr23[200], (byte) (-bArr23[231]), (short) 192), byte[].class).invoke(newInstance4, bArr22);
                                                        byte b26 = bArr23[594];
                                                        byte b27 = bArr23[217];
                                                        Class.forName($$c(b26, b27, (short) ((b27 ^ 444) | (b27 & 444)))).getMethod($$c(bArr23[362], bArr23[83], (short) 656), null).invoke(newInstance4, null);
                                                        int i66 = 16;
                                                        int i67 = 7330;
                                                        String str3 = str;
                                                        Class cls6 = null;
                                                        while (true) {
                                                            int i68 = i66 + 250;
                                                            byte b28 = bArr22[((i66 | 7351) << 1) - (i66 ^ 7351)];
                                                            bArr22[i68] = (byte) ((b28 & (-125)) + (b28 | (-125)));
                                                            Object[] objArr9 = {bArr22, Integer.valueOf(i66), Integer.valueOf((bArr22.length - (~(-i66))) - 1)};
                                                            byte[] bArr24 = onResponseNative;
                                                            byte b29 = bArr24[217];
                                                            Class<?> cls7 = Class.forName($$c(bArr24[35], b29, (short) (b29 << 1)));
                                                            Class<?> cls8 = Integer.TYPE;
                                                            InputStream inputStream2 = (InputStream) cls7.getDeclaredConstructor(byte[].class, cls8, cls8).newInstance(objArr9);
                                                            Object obj19 = onAttributionFailureNative;
                                                            if (obj19 == null) {
                                                                try {
                                                                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) - 417540214;
                                                                    i15 = i67;
                                                                    try {
                                                                        obj13 = obj7;
                                                                        zArr3 = zArr622;
                                                                        try {
                                                                            i10 = i6;
                                                                            try {
                                                                                int i69 = -((Integer) Class.forName($$c(bArr24[129], (byte) (-bArr24[612]), (short) 801)).getMethod($$c(bArr24[473], bArr24[10], (short) 822), CharSequence.class, cls8).invoke(null, "", 0)).intValue();
                                                                                int i70 = (i69 ^ 1) + ((i69 & 1) << 1);
                                                                                try {
                                                                                    long j10 = onInstallConversionFailureNative;
                                                                                    int i71 = (int) j10;
                                                                                    inputStream = new AFe1cSDK(inputStream2, new int[]{((int) (j10 >>> 32)) ^ windowTouchSlop, ((~i71) & windowTouchSlop) | ((~windowTouchSlop) & i71)}, null, onInstallConversionDataLoadedNative, false, i70);
                                                                                    cls = cls6;
                                                                                } catch (Throwable th11) {
                                                                                    th = th11;
                                                                                    obj2 = th;
                                                                                    i11 = (i10 & 1) + (i10 | 1);
                                                                                    while (true) {
                                                                                        if (i11 < 9) {
                                                                                        }
                                                                                        i11 = ((i11 & 1) << 1) + (i11 ^ 1);
                                                                                    }
                                                                                    if ((z12 ? (char) 26 : '@') == '@') {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th12) {
                                                                                th = th12;
                                                                                Throwable th13 = th;
                                                                                cause = th13.getCause();
                                                                                if (cause != null) {
                                                                                    throw th13;
                                                                                }
                                                                                throw cause;
                                                                            }
                                                                        } catch (Throwable th14) {
                                                                            th = th14;
                                                                            Throwable th132 = th;
                                                                            cause = th132.getCause();
                                                                            if (cause != null) {
                                                                            }
                                                                        }
                                                                    } catch (Throwable th15) {
                                                                        th = th15;
                                                                    }
                                                                } catch (Throwable th16) {
                                                                    th = th16;
                                                                    zArr3 = zArr622;
                                                                    i10 = i6;
                                                                }
                                                            } else {
                                                                i15 = i67;
                                                                zArr3 = zArr622;
                                                                i10 = i6;
                                                                obj13 = obj7;
                                                                byte[] bArr25 = {-109, 63, 65, 9, JsonWriter.SEMI, 101, 11, 15, -63, -73, 80, -37, 71, -25, -16, -85};
                                                                int i72 = (464612550 - (~(-(ViewConfiguration.getEdgeSlop() >> 16)))) - 1;
                                                                int i73 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                Object[] objArr10 = {inputStream2, bArr25, Integer.valueOf(i72), Integer.valueOf(((i73 | 4) << 1) - (i73 ^ 4))};
                                                                Class<?> cls9 = Class.forName($$c(bArr24[41], bArr24[83], (short) k.d.DEFAULT_DRAG_ANIMATION_DURATION), true, (ClassLoader) AppsFlyer2dXConversionCallback);
                                                                byte b30 = bArr24[394];
                                                                cls = cls6;
                                                                inputStream = (InputStream) cls9.getMethod($$c(bArr24[384], (byte) (((b30 | 1) << 1) - (b30 ^ 1)), (short) 747), Class.forName($$c((byte) onConversionDataFail, bArr24[217], (short) 970)), byte[].class, cls8, cls8).invoke(obj19, objArr10);
                                                            }
                                                            Object[] objArr11 = {Long.valueOf(16)};
                                                            int i74 = onConversionDataFail;
                                                            short s15 = (short) 970;
                                                            byte b31 = (byte) 74;
                                                            ((Long) Class.forName($$c((byte) i74, bArr24[217], s15)).getMethod($$c(bArr24[89], b31, (short) (b31 | 517)), Long.TYPE).invoke(inputStream, objArr11)).longValue();
                                                            if (z13) {
                                                                Object obj20 = onAttributionFailureNative;
                                                                Object obj21 = obj20 == null ? obj9 : obj10;
                                                                Object obj22 = obj20 == null ? obj13 : obj8;
                                                                byte b32 = bArr24[13];
                                                                byte b33 = bArr24[217];
                                                                i16 = i66;
                                                                Object newInstance5 = Class.forName($$c(b32, b33, (short) ((b33 & 688) | (b33 ^ 688)))).getDeclaredConstructor(Class.forName($$c(bArr24[19], bArr24[217], s1322))).newInstance(obj21);
                                                                int i75 = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
                                                                try {
                                                                    byte[] bArr26 = new byte[Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID];
                                                                    int i76 = onConversionDataSuccess;
                                                                    int i77 = ((i76 | R.styleable.AppCompatTheme_tooltipFrameBackground) << 1) - (i76 ^ R.styleable.AppCompatTheme_tooltipFrameBackground);
                                                                    onResponseErrorNative = i77 % 128;
                                                                    int i78 = i77 % 2;
                                                                    int i79 = i15;
                                                                    while (true) {
                                                                        if (!(i79 > 0)) {
                                                                            obj17 = obj22;
                                                                            str2 = str3;
                                                                            s11 = s15;
                                                                            break;
                                                                        }
                                                                        try {
                                                                            Object[] objArr12 = {bArr26, 0, Integer.valueOf(Math.min(i75, i79))};
                                                                            byte[] bArr27 = onResponseNative;
                                                                            str2 = str3;
                                                                            Class<?> cls10 = Class.forName($$c((byte) onConversionDataFail, bArr27[217], s15));
                                                                            s11 = s15;
                                                                            obj17 = obj22;
                                                                            try {
                                                                                String $$c5 = $$c(bArr27[89], (byte) (-bArr27[231]), (short) 256);
                                                                                Class<?> cls11 = Integer.TYPE;
                                                                                int intValue = ((Integer) cls10.getMethod($$c5, byte[].class, cls11, cls11).invoke(inputStream, objArr12)).intValue();
                                                                                if (intValue == -1) {
                                                                                    break;
                                                                                }
                                                                                int i80 = onConversionDataSuccess + 95;
                                                                                onResponseErrorNative = i80 % 128;
                                                                                int i81 = i80 % 2;
                                                                                try {
                                                                                    Object[] objArr13 = {bArr26, 0, Integer.valueOf(intValue)};
                                                                                    byte b34 = bArr27[13];
                                                                                    byte[] bArr28 = bArr26;
                                                                                    byte b35 = bArr27[217];
                                                                                    Class.forName($$c(b34, b35, (short) (b35 | 688))).getMethod($$c(bArr27[362], (byte) 78, (short) 242), byte[].class, cls11, cls11).invoke(newInstance5, objArr13);
                                                                                    i79 = (i79 - (~(-intValue))) - 1;
                                                                                    str3 = str2;
                                                                                    obj22 = obj17;
                                                                                    s15 = s11;
                                                                                    bArr26 = bArr28;
                                                                                    i75 = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
                                                                                } catch (Throwable th17) {
                                                                                    try {
                                                                                        Throwable cause3 = th17.getCause();
                                                                                        if (cause3 == null) {
                                                                                            throw th17;
                                                                                        }
                                                                                        throw cause3;
                                                                                    } catch (Throwable th18) {
                                                                                        th2 = th18;
                                                                                        obj16 = obj17;
                                                                                        byte[] bArr29 = onResponseNative;
                                                                                        short s16 = (short) 617;
                                                                                        ((Boolean) Class.forName($$c(bArr29[19], bArr29[217], s1322)).getMethod($$c(bArr29[24], bArr29[64], s16), null).invoke(obj21, null)).booleanValue();
                                                                                        ((Boolean) Class.forName($$c(bArr29[19], bArr29[217], s1322)).getMethod($$c(bArr29[24], bArr29[64], s16), null).invoke(obj16, null)).booleanValue();
                                                                                        throw th2;
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th19) {
                                                                                th = th19;
                                                                                Throwable th20 = th;
                                                                                Throwable cause4 = th20.getCause();
                                                                                if (cause4 == null) {
                                                                                    throw th20;
                                                                                }
                                                                                throw cause4;
                                                                            }
                                                                        } catch (Throwable th21) {
                                                                            th = th21;
                                                                        }
                                                                    }
                                                                    bArr5 = onResponseNative;
                                                                    byte b36 = bArr5[13];
                                                                    byte b37 = bArr5[217];
                                                                    Object invoke7 = Class.forName($$c(b36, b37, (short) (b37 | 688))).getMethod($$c(bArr5[362], bArr5[10], (short) 622), null).invoke(newInstance5, null);
                                                                    byte b38 = bArr5[217];
                                                                    Class.forName($$c(bArr5[129], b38, (short) ((b38 ^ 828) | (b38 & 828)))).getMethod($$c(bArr5[89], b31, (short) 365), null).invoke(invoke7, null);
                                                                    byte b39 = bArr5[13];
                                                                    byte b40 = bArr5[217];
                                                                    Class.forName($$c(b39, b40, (short) (b40 | 688))).getMethod($$c(bArr5[362], bArr5[83], (short) 656), null).invoke(newInstance5, null);
                                                                    try {
                                                                        Class<?> cls12 = Class.forName($$c((byte) (-bArr5[29]), bArr5[64], (short) 259));
                                                                        int i82 = onConversionDataFail;
                                                                        declaredMethod = cls12.getDeclaredMethod($$c(bArr5[384], bArr5[817], (short) ((i82 & 514) | (i82 ^ 514))), String.class, String.class, Integer.TYPE);
                                                                        objArr2 = new Object[3];
                                                                        s12 = (short) 708;
                                                                        objArr2[0] = Class.forName($$c(bArr5[19], bArr5[217], s1322)).getMethod($$c(bArr5[420], bArr5[10], s12), null).invoke(obj21, null);
                                                                        try {
                                                                            obj16 = obj17;
                                                                            try {
                                                                            } catch (Throwable th22) {
                                                                                th = th22;
                                                                                Throwable th23 = th;
                                                                                Throwable cause5 = th23.getCause();
                                                                                if (cause5 == null) {
                                                                                    throw th23;
                                                                                }
                                                                                throw cause5;
                                                                            }
                                                                        } catch (Throwable th24) {
                                                                            th = th24;
                                                                        }
                                                                    } catch (Throwable th25) {
                                                                        th = th25;
                                                                        obj16 = obj17;
                                                                    }
                                                                } catch (Throwable th26) {
                                                                    th = th26;
                                                                    obj16 = obj22;
                                                                }
                                                                try {
                                                                    objArr2[1] = Class.forName($$c(bArr5[19], bArr5[217], s1322)).getMethod($$c(bArr5[420], bArr5[10], s12), null).invoke(obj16, null);
                                                                    objArr2[2] = 0;
                                                                    obj14 = declaredMethod.invoke(null, objArr2);
                                                                    short s17 = (short) 617;
                                                                    ((Boolean) Class.forName($$c(bArr5[19], bArr5[217], s1322)).getMethod($$c(bArr5[24], bArr5[64], s17), null).invoke(obj21, null)).booleanValue();
                                                                    ((Boolean) Class.forName($$c(bArr5[19], bArr5[217], s1322)).getMethod($$c(bArr5[24], bArr5[64], s17), null).invoke(obj16, null)).booleanValue();
                                                                    if ((AppsFlyer2dXConversionCallback == null ? '+' : (char) 2) != 2) {
                                                                        AppsFlyer2dXConversionCallback = Class.class.getMethod($$c(bArr5[473], bArr5[10], (short) 594), null).invoke(AFa1vSDK.class, null);
                                                                    }
                                                                    s10 = s11;
                                                                } catch (Throwable th27) {
                                                                    th = th27;
                                                                    th2 = th;
                                                                    byte[] bArr292 = onResponseNative;
                                                                    short s162 = (short) 617;
                                                                    ((Boolean) Class.forName($$c(bArr292[19], bArr292[217], s1322)).getMethod($$c(bArr292[24], bArr292[64], s162), null).invoke(obj21, null)).booleanValue();
                                                                    ((Boolean) Class.forName($$c(bArr292[19], bArr292[217], s1322)).getMethod($$c(bArr292[24], bArr292[64], s162), null).invoke(obj16, null)).booleanValue();
                                                                    throw th2;
                                                                }
                                                            } else {
                                                                i16 = i66;
                                                                str2 = str3;
                                                                ZipInputStream zipInputStream = new ZipInputStream(inputStream);
                                                                ZipEntry nextEntry = zipInputStream.getNextEntry();
                                                                int i83 = onResponseErrorNative + 1;
                                                                onConversionDataSuccess = i83 % 128;
                                                                int i84 = i83 % 2;
                                                                s10 = s15;
                                                                Object newInstance6 = Class.forName($$c(bArr24[124], bArr24[217], bArr24[2])).getDeclaredConstructor(Class.forName($$c((byte) i74, bArr24[217], s10))).newInstance(zipInputStream);
                                                                Object newInstance7 = Class.forName($$c(bArr24[113], bArr24[217], (short) (i74 | 520))).getDeclaredConstructor(null).newInstance(null);
                                                                byte[] bArr30 = new byte[Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID];
                                                                int i85 = 0;
                                                                while (true) {
                                                                    bArr3 = onResponseNative;
                                                                    int intValue2 = ((Integer) Class.forName($$c(bArr3[124], bArr3[217], bArr3[2])).getMethod($$c(bArr3[89], (byte) (-bArr3[231]), (short) 256), byte[].class).invoke(newInstance6, bArr30)).intValue();
                                                                    if (intValue2 <= 0) {
                                                                        break;
                                                                    }
                                                                    int i86 = onConversionDataSuccess;
                                                                    int i87 = ((i86 | 47) << 1) - (i86 ^ 47);
                                                                    onResponseErrorNative = i87 % 128;
                                                                    if (i87 % 2 != 0) {
                                                                        if (!(((long) i85) < nextEntry.getSize())) {
                                                                            break;
                                                                        }
                                                                        try {
                                                                            Object[] objArr14 = new Object[3];
                                                                            try {
                                                                                objArr14[2] = Integer.valueOf(intValue2);
                                                                                objArr14[1] = 0;
                                                                                objArr14[0] = bArr30;
                                                                                byte b41 = bArr3[217];
                                                                                int i88 = onConversionDataFail;
                                                                                byte[] bArr31 = bArr30;
                                                                                Class<?> cls13 = Class.forName($$c(bArr3[113], b41, (short) ((i88 ^ 520) | (i88 & 520))));
                                                                                String $$c6 = $$c(bArr3[362], (byte) 78, (short) 242);
                                                                                Class<?> cls14 = Integer.TYPE;
                                                                                cls13.getMethod($$c6, byte[].class, cls14, cls14).invoke(newInstance7, objArr14);
                                                                                i85 = ((i85 & intValue2) << 1) + (i85 ^ intValue2);
                                                                                bArr30 = bArr31;
                                                                            } catch (Throwable th28) {
                                                                                th = th28;
                                                                                Throwable th29 = th;
                                                                                Throwable cause6 = th29.getCause();
                                                                                if (cause6 == null) {
                                                                                    throw th29;
                                                                                }
                                                                                throw cause6;
                                                                            }
                                                                        } catch (Throwable th30) {
                                                                            th = th30;
                                                                        }
                                                                    } else {
                                                                        nextEntry.getSize();
                                                                        throw null;
                                                                    }
                                                                }
                                                                int i89 = onConversionDataSuccess + 7;
                                                                onResponseErrorNative = i89 % 128;
                                                                int i90 = i89 % 2;
                                                                byte b42 = bArr3[217];
                                                                int i91 = onConversionDataFail;
                                                                Class<?> cls15 = Class.forName($$c(bArr3[113], b42, (short) ((i91 & 520) | (i91 ^ 520))));
                                                                byte b43 = bArr3[394];
                                                                Object invoke8 = cls15.getMethod($$c(bArr3[843], (byte) ((b43 ^ (-1)) + ((b43 & (-1)) << 1)), (short) 914), null).invoke(newInstance7, null);
                                                                int i92 = onResponseErrorNative + 21;
                                                                onConversionDataSuccess = i92 % 128;
                                                                int i93 = i92 % 2;
                                                                try {
                                                                    Class.forName($$c(bArr3[124], bArr3[217], bArr3[2])).getMethod($$c(bArr3[362], bArr3[83], (short) 656), null).invoke(newInstance6, null);
                                                                    try {
                                                                        byte[] bArr32 = onResponseNative;
                                                                        Class.forName($$c(bArr32[113], bArr32[217], (short) (onConversionDataFail | 520))).getMethod($$c(bArr32[362], bArr32[83], (short) 656), null).invoke(newInstance7, null);
                                                                        byte[] bArr33 = onResponseNative;
                                                                        invoke4 = Class.class.getMethod($$c(bArr33[473], bArr33[10], (short) 594), null).invoke(AFa1vSDK.class, null);
                                                                        byte b44 = bArr33[64];
                                                                        int i94 = onConversionDataFail;
                                                                        Class<?> cls16 = Class.forName($$c(bArr33[46], b44, (short) ((i94 ^ 140) | (i94 & 140))));
                                                                        byte b45 = bArr33[217];
                                                                        Constructor<?> declaredConstructor = cls16.getDeclaredConstructor(Class.forName($$c((byte) i94, b45, (short) (b45 | 24))), Class.forName($$c((byte) (-bArr33[29]), bArr33[217], (short) 417)));
                                                                        Object[] objArr15 = new Object[2];
                                                                        Object[] objArr16 = {invoke8};
                                                                        byte b46 = bArr33[217];
                                                                        objArr15[0] = Class.forName($$c((byte) i94, b46, (short) (b46 | 24))).getMethod($$c(bArr33[89], (byte) 78, (short) 944), byte[].class).invoke(null, objArr16);
                                                                        objArr15[1] = invoke4;
                                                                        newInstance = declaredConstructor.newInstance(objArr15);
                                                                        try {
                                                                            Field declaredField = Class.forName($$c(bArr33[37], bArr33[64], (short) 288)).getDeclaredField($$c(bArr33[822], (byte) (bArr33[409] - 1), (short) 835));
                                                                            declaredField.setAccessible(true);
                                                                            Object obj23 = declaredField.get(invoke4);
                                                                            Class<?> cls17 = obj23.getClass();
                                                                            byte b47 = (byte) 69;
                                                                            Field declaredField2 = cls17.getDeclaredField($$c(bArr33[13], b47, (short) ((i94 & 930) | (i94 ^ 930))));
                                                                            declaredField2.setAccessible(true);
                                                                            Field declaredField3 = cls17.getDeclaredField($$c(bArr33[193], b47, (short) 632));
                                                                            declaredField3.setAccessible(true);
                                                                            Object obj24 = declaredField2.get(obj23);
                                                                            Object obj25 = declaredField3.get(obj23);
                                                                            Object obj26 = declaredField.get(newInstance);
                                                                            ArrayList arrayList = new ArrayList((List) obj24);
                                                                            Class<?> componentType = obj25.getClass().getComponentType();
                                                                            length = Array.getLength(obj25);
                                                                            Object newInstance8 = Array.newInstance(componentType, length);
                                                                            for (i17 = 0; i17 < length; i17 = (((i17 - 2) - 1) + 5) - 1) {
                                                                                try {
                                                                                    Array.set(newInstance8, i17, Array.get(obj25, i17));
                                                                                } catch (Exception e10) {
                                                                                    exc = e10;
                                                                                    StringBuilder sb7 = new StringBuilder();
                                                                                    byte[] bArr34 = onResponseNative;
                                                                                    byte b48 = bArr34[822];
                                                                                    sb7.append($$c(bArr34[362], b48, (short) ((b48 ^ 385) | (b48 & 385))));
                                                                                    sb7.append(invoke4);
                                                                                    byte b49 = bArr34[46];
                                                                                    sb7.append($$c((byte) (bArr34[92] - 1), b49, (short) (b49 | 259)));
                                                                                    throw ((Throwable) Class.forName($$c((byte) onConversionDataFail, bArr34[217], (short) 783)).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb7.toString(), exc));
                                                                                }
                                                                            }
                                                                            declaredField2.set(obj26, arrayList);
                                                                            declaredField3.set(obj26, newInstance8);
                                                                            if (!(AppsFlyer2dXConversionCallback != null)) {
                                                                                AppsFlyer2dXConversionCallback = newInstance;
                                                                            }
                                                                            obj14 = newInstance;
                                                                        } catch (Exception e11) {
                                                                            exc = e11;
                                                                        }
                                                                    } catch (Throwable th31) {
                                                                        try {
                                                                            Throwable cause7 = th31.getCause();
                                                                            if (cause7 == null) {
                                                                                throw th31;
                                                                            }
                                                                            throw cause7;
                                                                        } catch (IOException unused6) {
                                                                            byte[] bArr332 = onResponseNative;
                                                                            invoke4 = Class.class.getMethod($$c(bArr332[473], bArr332[10], (short) 594), null).invoke(AFa1vSDK.class, null);
                                                                            byte b442 = bArr332[64];
                                                                            int i942 = onConversionDataFail;
                                                                            Class<?> cls162 = Class.forName($$c(bArr332[46], b442, (short) ((i942 ^ 140) | (i942 & 140))));
                                                                            byte b452 = bArr332[217];
                                                                            Constructor<?> declaredConstructor2 = cls162.getDeclaredConstructor(Class.forName($$c((byte) i942, b452, (short) (b452 | 24))), Class.forName($$c((byte) (-bArr332[29]), bArr332[217], (short) 417)));
                                                                            Object[] objArr152 = new Object[2];
                                                                            Object[] objArr162 = {invoke8};
                                                                            byte b462 = bArr332[217];
                                                                            objArr152[0] = Class.forName($$c((byte) i942, b462, (short) (b462 | 24))).getMethod($$c(bArr332[89], (byte) 78, (short) 944), byte[].class).invoke(null, objArr162);
                                                                            objArr152[1] = invoke4;
                                                                            newInstance = declaredConstructor2.newInstance(objArr152);
                                                                            Field declaredField4 = Class.forName($$c(bArr332[37], bArr332[64], (short) 288)).getDeclaredField($$c(bArr332[822], (byte) (bArr332[409] - 1), (short) 835));
                                                                            declaredField4.setAccessible(true);
                                                                            Object obj232 = declaredField4.get(invoke4);
                                                                            Class<?> cls172 = obj232.getClass();
                                                                            byte b472 = (byte) 69;
                                                                            Field declaredField22 = cls172.getDeclaredField($$c(bArr332[13], b472, (short) ((i942 & 930) | (i942 ^ 930))));
                                                                            declaredField22.setAccessible(true);
                                                                            Field declaredField32 = cls172.getDeclaredField($$c(bArr332[193], b472, (short) 632));
                                                                            declaredField32.setAccessible(true);
                                                                            Object obj242 = declaredField22.get(obj232);
                                                                            Object obj252 = declaredField32.get(obj232);
                                                                            Object obj262 = declaredField4.get(newInstance);
                                                                            ArrayList arrayList2 = new ArrayList((List) obj242);
                                                                            Class<?> componentType2 = obj252.getClass().getComponentType();
                                                                            length = Array.getLength(obj252);
                                                                            Object newInstance82 = Array.newInstance(componentType2, length);
                                                                            while (i17 < length) {
                                                                            }
                                                                            declaredField22.set(obj262, arrayList2);
                                                                            declaredField32.set(obj262, newInstance82);
                                                                            if (!(AppsFlyer2dXConversionCallback != null)) {
                                                                            }
                                                                            obj14 = newInstance;
                                                                            if (z13) {
                                                                            }
                                                                            if (obj15 == null) {
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Throwable th32) {
                                                                    try {
                                                                        Throwable cause8 = th32.getCause();
                                                                        if (cause8 == null) {
                                                                            throw th32;
                                                                        }
                                                                        throw cause8;
                                                                    } catch (IOException unused7) {
                                                                        byte[] bArr322 = onResponseNative;
                                                                        Class.forName($$c(bArr322[113], bArr322[217], (short) (onConversionDataFail | 520))).getMethod($$c(bArr322[362], bArr322[83], (short) 656), null).invoke(newInstance7, null);
                                                                        byte[] bArr3322 = onResponseNative;
                                                                        invoke4 = Class.class.getMethod($$c(bArr3322[473], bArr3322[10], (short) 594), null).invoke(AFa1vSDK.class, null);
                                                                        byte b4422 = bArr3322[64];
                                                                        int i9422 = onConversionDataFail;
                                                                        Class<?> cls1622 = Class.forName($$c(bArr3322[46], b4422, (short) ((i9422 ^ 140) | (i9422 & 140))));
                                                                        byte b4522 = bArr3322[217];
                                                                        Constructor<?> declaredConstructor22 = cls1622.getDeclaredConstructor(Class.forName($$c((byte) i9422, b4522, (short) (b4522 | 24))), Class.forName($$c((byte) (-bArr3322[29]), bArr3322[217], (short) 417)));
                                                                        Object[] objArr1522 = new Object[2];
                                                                        Object[] objArr1622 = {invoke8};
                                                                        byte b4622 = bArr3322[217];
                                                                        objArr1522[0] = Class.forName($$c((byte) i9422, b4622, (short) (b4622 | 24))).getMethod($$c(bArr3322[89], (byte) 78, (short) 944), byte[].class).invoke(null, objArr1622);
                                                                        objArr1522[1] = invoke4;
                                                                        newInstance = declaredConstructor22.newInstance(objArr1522);
                                                                        Field declaredField42 = Class.forName($$c(bArr3322[37], bArr3322[64], (short) 288)).getDeclaredField($$c(bArr3322[822], (byte) (bArr3322[409] - 1), (short) 835));
                                                                        declaredField42.setAccessible(true);
                                                                        Object obj2322 = declaredField42.get(invoke4);
                                                                        Class<?> cls1722 = obj2322.getClass();
                                                                        byte b4722 = (byte) 69;
                                                                        Field declaredField222 = cls1722.getDeclaredField($$c(bArr3322[13], b4722, (short) ((i9422 & 930) | (i9422 ^ 930))));
                                                                        declaredField222.setAccessible(true);
                                                                        Field declaredField322 = cls1722.getDeclaredField($$c(bArr3322[193], b4722, (short) 632));
                                                                        declaredField322.setAccessible(true);
                                                                        Object obj2422 = declaredField222.get(obj2322);
                                                                        Object obj2522 = declaredField322.get(obj2322);
                                                                        Object obj2622 = declaredField42.get(newInstance);
                                                                        ArrayList arrayList22 = new ArrayList((List) obj2422);
                                                                        Class<?> componentType22 = obj2522.getClass().getComponentType();
                                                                        length = Array.getLength(obj2522);
                                                                        Object newInstance822 = Array.newInstance(componentType22, length);
                                                                        while (i17 < length) {
                                                                        }
                                                                        declaredField222.set(obj2622, arrayList22);
                                                                        declaredField322.set(obj2622, newInstance822);
                                                                        if (!(AppsFlyer2dXConversionCallback != null)) {
                                                                        }
                                                                        obj14 = newInstance;
                                                                        if (z13) {
                                                                        }
                                                                        if (obj15 == null) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (z13) {
                                                                byte[] bArr35 = onResponseNative;
                                                                Class<?> cls18 = Class.forName($$c((byte) (-bArr35[29]), bArr35[64], (short) 259));
                                                                Method declaredMethod2 = cls18.getDeclaredMethod($$c(bArr35[200], bArr35[817], (short) 924), String.class, Class.forName($$c((byte) (-bArr35[29]), bArr35[217], (short) 417)));
                                                                Object[] objArr17 = new Object[2];
                                                                objArr17[0] = str2;
                                                                objArr17[1] = Class.class.getMethod($$c(bArr35[473], bArr35[10], (short) 594), null).invoke(AFa1vSDK.class, null);
                                                                Object invoke9 = declaredMethod2.invoke(obj14, objArr17);
                                                                if ((invoke9 != null ? (char) 26 : (char) 28) != 28) {
                                                                    cls18.getDeclaredMethod($$c(bArr35[362], bArr35[83], (short) 656), new Class[0]).invoke(obj14, new Object[0]);
                                                                }
                                                                obj15 = invoke9;
                                                            } else {
                                                                try {
                                                                    obj15 = Class.forName($$c((byte) (-onResponseNative[29]), bArr4[217], (short) 417)).getDeclaredMethod($$c(bArr4[200], bArr4[817], (short) 924), String.class).invoke(obj14, str2);
                                                                } catch (InvocationTargetException e12) {
                                                                    try {
                                                                        throw ((Exception) e12.getCause());
                                                                        break loop0;
                                                                    } catch (ClassNotFoundException unused8) {
                                                                        obj15 = null;
                                                                        if (obj15 == null) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (obj15 == null) {
                                                                try {
                                                                    cls6 = obj15;
                                                                    byte[] bArr36 = onResponseNative;
                                                                    byte b50 = bArr36[83];
                                                                    str3 = $$c(bArr36[41], b50, (short) (b50 - 1));
                                                                    Constructor declaredConstructor3 = cls6.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                    declaredConstructor3.setAccessible(true);
                                                                    Object[] objArr18 = new Object[2];
                                                                    objArr18[0] = obj14;
                                                                    objArr18[1] = Boolean.valueOf((!z13 ? (char) 19 : '(') != '(');
                                                                    onAttributionFailureNative = declaredConstructor3.newInstance(objArr18);
                                                                    bArr22 = new byte[12880];
                                                                    try {
                                                                        Object[] objArr19 = {AFa1vSDK.class.getResourceAsStream($$c(bArr36[17], bArr36[4], (short) 484))};
                                                                        byte b51 = bArr36[594];
                                                                        byte b52 = bArr36[217];
                                                                        Object newInstance9 = Class.forName($$c(b51, b52, (short) ((b52 ^ 444) | (b52 & 444)))).getDeclaredConstructor(Class.forName($$c((byte) onConversionDataFail, bArr36[217], s10))).newInstance(objArr19);
                                                                        byte b53 = bArr36[594];
                                                                        byte b54 = bArr36[217];
                                                                        Class.forName($$c(b53, b54, (short) ((b54 ^ 444) | (b54 & 444)))).getMethod($$c(bArr36[200], (byte) (-bArr36[231]), (short) 192), byte[].class).invoke(newInstance9, bArr22);
                                                                        try {
                                                                            byte b55 = bArr36[594];
                                                                            byte b56 = bArr36[217];
                                                                            try {
                                                                                Class.forName($$c(b55, b56, (short) ((b56 ^ 444) | (b56 & 444)))).getMethod($$c(bArr36[362], bArr36[83], (short) 656), null).invoke(newInstance9, null);
                                                                                try {
                                                                                    i66 = Math.abs(i16);
                                                                                    int i95 = (onResponseErrorNative + 78) - 1;
                                                                                    onConversionDataSuccess = i95 % 128;
                                                                                    int i96 = i95 % 2;
                                                                                    i67 = 12840;
                                                                                    obj7 = obj13;
                                                                                    zArr622 = zArr3;
                                                                                    i6 = i10;
                                                                                } catch (Throwable th33) {
                                                                                    th = th33;
                                                                                    obj2 = th;
                                                                                    i11 = (i10 & 1) + (i10 | 1);
                                                                                    while (true) {
                                                                                        if (i11 < 9) {
                                                                                        }
                                                                                        i11 = ((i11 & 1) << 1) + (i11 ^ 1);
                                                                                    }
                                                                                    if ((z12 ? (char) 26 : '@') == '@') {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th34) {
                                                                                th = th34;
                                                                                Throwable th35 = th;
                                                                                Throwable cause9 = th35.getCause();
                                                                                if (cause9 == null) {
                                                                                    throw th35;
                                                                                }
                                                                                throw cause9;
                                                                            }
                                                                        } catch (Throwable th36) {
                                                                            th = th36;
                                                                        }
                                                                    } catch (Throwable th37) {
                                                                        th = th37;
                                                                        obj2 = th;
                                                                        i11 = (i10 & 1) + (i10 | 1);
                                                                        while (true) {
                                                                            if (i11 < 9) {
                                                                            }
                                                                            i11 = ((i11 & 1) << 1) + (i11 ^ 1);
                                                                        }
                                                                        if ((z12 ? (char) 26 : '@') == '@') {
                                                                        }
                                                                    }
                                                                } catch (Throwable th38) {
                                                                    th = th38;
                                                                    obj2 = th;
                                                                    i11 = (i10 & 1) + (i10 | 1);
                                                                    while (true) {
                                                                        if (i11 < 9) {
                                                                        }
                                                                        i11 = ((i11 & 1) << 1) + (i11 ^ 1);
                                                                    }
                                                                    if ((z12 ? (char) 26 : '@') == '@') {
                                                                    }
                                                                }
                                                            } else {
                                                                Constructor declaredConstructor4 = cls.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                declaredConstructor4.setAccessible(true);
                                                                Object[] objArr20 = new Object[2];
                                                                objArr20[0] = obj14;
                                                                objArr20[1] = Boolean.valueOf(!z13);
                                                                onAttributionFailureNative = declaredConstructor4.newInstance(objArr20);
                                                                int i97 = onConversionDataSuccess;
                                                                int i98 = ((i97 | 49) << 1) - (i97 ^ 49);
                                                                onResponseErrorNative = i98 % 128;
                                                                int i99 = i98 % 2;
                                                                z11 = true;
                                                            }
                                                        }
                                                    } catch (Throwable th39) {
                                                        th = th39;
                                                        zArr3 = zArr622;
                                                        i10 = i6;
                                                        obj2 = th;
                                                        i11 = (i10 & 1) + (i10 | 1);
                                                        while (true) {
                                                            if (i11 < 9) {
                                                            }
                                                            i11 = ((i11 & 1) << 1) + (i11 ^ 1);
                                                        }
                                                        if ((z12 ? (char) 26 : '@') == '@') {
                                                        }
                                                    }
                                                }
                                                int i100 = (i10 - 70) - 1;
                                                i6 = (i100 | 72) + (i100 & 72);
                                                z10 = z11;
                                                zArr422 = zArr;
                                                zArr522 = zArr2;
                                                $$c2 = str;
                                                objArr322 = objArr;
                                                zArr622 = zArr3;
                                                i19 = 1;
                                                i2122 = 2;
                                            }
                                            return;
                                        }
                                    }
                                    z19 = false;
                                    zArr622[8] = z19;
                                    z10 = false;
                                    i6 = 0;
                                    loop0: while (!z10) {
                                        if (zArr622[i6]) {
                                        }
                                        int i1002 = (i10 - 70) - 1;
                                        i6 = (i1002 | 72) + (i1002 & 72);
                                        z10 = z11;
                                        zArr422 = zArr;
                                        zArr522 = zArr2;
                                        $$c2 = str;
                                        objArr322 = objArr;
                                        zArr622 = zArr3;
                                        i19 = 1;
                                        i2122 = 2;
                                    }
                                }
                            }
                            z18 = false;
                            zArr622[1] = z18;
                            zArr622[5] = i18 >= 21;
                            zArr622[4] = (i18 < 16 ? 'L' : 'K') != 'K';
                            if (i18 < 16) {
                            }
                            z19 = false;
                            zArr622[8] = z19;
                            z10 = false;
                            i6 = 0;
                            loop0: while (!z10) {
                            }
                        }
                        invoke3 = null;
                        int i21222 = 2;
                        if (invoke != null) {
                        }
                        if (invoke3 == null) {
                        }
                        if (invoke2 == null) {
                            byte[] bArr142 = onResponseNative;
                            byte b122 = bArr142[83];
                            int i352 = onConversionDataFail;
                            short s142 = (short) 862;
                            invoke2 = Class.forName($$c(bArr142[19], bArr142[217], s142)).getDeclaredConstructor(Class.forName($$c(bArr142[19], bArr142[217], s142)), String.class).newInstance(invoke, $$c((byte) (-bArr142[580]), b122, (short) ((i352 & 262) | (i352 ^ 262))));
                        }
                        int i22222 = (onResponseErrorNative + 88) - 1;
                        onConversionDataSuccess = i22222 % 128;
                        int i23222 = i22222 % 2;
                        byte[] bArr11222 = onResponseNative;
                        int i24222 = onConversionDataFail;
                        Object invoke5222 = Class.forName($$c(bArr11222[129], (byte) (-bArr11222[612]), (short) ((i24222 & 548) | (i24222 ^ 548)))).getMethod($$c(bArr11222[124], bArr11222[10], (short) 458), null).invoke(null, null);
                        short s13222 = (short) 862;
                        Object[] objArr3222 = (Object[]) Array.newInstance(Class.forName($$c(bArr11222[19], bArr11222[217], s13222)), 9);
                        objArr3222[0] = null;
                        objArr3222[1] = invoke2;
                        objArr3222[2] = invoke;
                        objArr3222[3] = invoke3;
                        objArr3222[4] = invoke5222;
                        objArr3222[5] = invoke2;
                        objArr3222[6] = invoke;
                        objArr3222[7] = invoke3;
                        objArr3222[8] = invoke5222;
                        boolean[] zArr4222 = {false, true, true, true, true, true, true, true, true};
                        boolean[] zArr5222 = {false, false, false, false, false, true, true, true, true};
                        boolean[] zArr6222 = new boolean[9];
                        zArr6222[0] = false;
                        zArr6222[1] = false;
                        zArr6222[2] = true;
                        zArr6222[3] = true;
                        zArr6222[4] = false;
                        zArr6222[5] = false;
                        zArr6222[6] = true;
                        zArr6222[7] = true;
                        zArr6222[8] = false;
                        Class<?> cls4222 = Class.forName($$c(bArr11222[13], (byte) (-bArr11222[612]), (short) R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle));
                        i18 = cls4222.getDeclaredField($$c(bArr11222[384], bArr11222[376], (short) 626)).getInt(cls4222);
                        if (!(i18 != 29)) {
                        }
                        c12 = 0;
                        z17 = false;
                        zArr6222[c12] = z17;
                        if (i18 >= 21) {
                        }
                        z18 = false;
                        zArr6222[1] = z18;
                        zArr6222[5] = i18 >= 21;
                        zArr6222[4] = (i18 < 16 ? 'L' : 'K') != 'K';
                        if (i18 < 16) {
                        }
                        z19 = false;
                        zArr6222[8] = z19;
                        z10 = false;
                        i6 = 0;
                        loop0: while (!z10) {
                        }
                    }
                    invoke2 = null;
                    if ((obj == null ? 'T' : '3') == 'T') {
                    }
                    invoke3 = null;
                    int i212222 = 2;
                    if (invoke != null) {
                    }
                    if (invoke3 == null) {
                    }
                    if (invoke2 == null) {
                    }
                    int i222222 = (onResponseErrorNative + 88) - 1;
                    onConversionDataSuccess = i222222 % 128;
                    int i232222 = i222222 % 2;
                    byte[] bArr112222 = onResponseNative;
                    int i242222 = onConversionDataFail;
                    Object invoke52222 = Class.forName($$c(bArr112222[129], (byte) (-bArr112222[612]), (short) ((i242222 & 548) | (i242222 ^ 548)))).getMethod($$c(bArr112222[124], bArr112222[10], (short) 458), null).invoke(null, null);
                    short s132222 = (short) 862;
                    Object[] objArr32222 = (Object[]) Array.newInstance(Class.forName($$c(bArr112222[19], bArr112222[217], s132222)), 9);
                    objArr32222[0] = null;
                    objArr32222[1] = invoke2;
                    objArr32222[2] = invoke;
                    objArr32222[3] = invoke3;
                    objArr32222[4] = invoke52222;
                    objArr32222[5] = invoke2;
                    objArr32222[6] = invoke;
                    objArr32222[7] = invoke3;
                    objArr32222[8] = invoke52222;
                    boolean[] zArr42222 = {false, true, true, true, true, true, true, true, true};
                    boolean[] zArr52222 = {false, false, false, false, false, true, true, true, true};
                    boolean[] zArr62222 = new boolean[9];
                    zArr62222[0] = false;
                    zArr62222[1] = false;
                    zArr62222[2] = true;
                    zArr62222[3] = true;
                    zArr62222[4] = false;
                    zArr62222[5] = false;
                    zArr62222[6] = true;
                    zArr62222[7] = true;
                    zArr62222[8] = false;
                    Class<?> cls42222 = Class.forName($$c(bArr112222[13], (byte) (-bArr112222[612]), (short) R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle));
                    i18 = cls42222.getDeclaredField($$c(bArr112222[384], bArr112222[376], (short) 626)).getInt(cls42222);
                    if (!(i18 != 29)) {
                    }
                    c12 = 0;
                    z17 = false;
                    zArr62222[c12] = z17;
                    if (i18 >= 21) {
                    }
                    z18 = false;
                    zArr62222[1] = z18;
                    zArr62222[5] = i18 >= 21;
                    zArr62222[4] = (i18 < 16 ? 'L' : 'K') != 'K';
                    if (i18 < 16) {
                    }
                    z19 = false;
                    zArr62222[8] = z19;
                    z10 = false;
                    i6 = 0;
                    loop0: while (!z10) {
                    }
                }
                if ((obj == null ? 'Z' : (char) 25) == 'Z') {
                }
                invoke2 = null;
                if ((obj == null ? 'T' : '3') == 'T') {
                }
                invoke3 = null;
                int i2122222 = 2;
                if (invoke != null) {
                }
                if (invoke3 == null) {
                }
                if (invoke2 == null) {
                }
                int i2222222 = (onResponseErrorNative + 88) - 1;
                onConversionDataSuccess = i2222222 % 128;
                int i2322222 = i2222222 % 2;
                byte[] bArr1122222 = onResponseNative;
                int i2422222 = onConversionDataFail;
                Object invoke522222 = Class.forName($$c(bArr1122222[129], (byte) (-bArr1122222[612]), (short) ((i2422222 & 548) | (i2422222 ^ 548)))).getMethod($$c(bArr1122222[124], bArr1122222[10], (short) 458), null).invoke(null, null);
                short s1322222 = (short) 862;
                Object[] objArr322222 = (Object[]) Array.newInstance(Class.forName($$c(bArr1122222[19], bArr1122222[217], s1322222)), 9);
                objArr322222[0] = null;
                objArr322222[1] = invoke2;
                objArr322222[2] = invoke;
                objArr322222[3] = invoke3;
                objArr322222[4] = invoke522222;
                objArr322222[5] = invoke2;
                objArr322222[6] = invoke;
                objArr322222[7] = invoke3;
                objArr322222[8] = invoke522222;
                boolean[] zArr422222 = {false, true, true, true, true, true, true, true, true};
                boolean[] zArr522222 = {false, false, false, false, false, true, true, true, true};
                boolean[] zArr622222 = new boolean[9];
                zArr622222[0] = false;
                zArr622222[1] = false;
                zArr622222[2] = true;
                zArr622222[3] = true;
                zArr622222[4] = false;
                zArr622222[5] = false;
                zArr622222[6] = true;
                zArr622222[7] = true;
                zArr622222[8] = false;
                Class<?> cls422222 = Class.forName($$c(bArr1122222[13], (byte) (-bArr1122222[612]), (short) R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle));
                i18 = cls422222.getDeclaredField($$c(bArr1122222[384], bArr1122222[376], (short) 626)).getInt(cls422222);
                if (!(i18 != 29)) {
                }
                c12 = 0;
                z17 = false;
                zArr622222[c12] = z17;
                if (i18 >= 21) {
                }
                z18 = false;
                zArr622222[1] = z18;
                zArr622222[5] = i18 >= 21;
                zArr622222[4] = (i18 < 16 ? 'L' : 'K') != 'K';
                if (i18 < 16) {
                }
                z19 = false;
                zArr622222[8] = z19;
                z10 = false;
                i6 = 0;
                loop0: while (!z10) {
                }
            }
            invoke = null;
            if ((obj == null ? 'Z' : (char) 25) == 'Z') {
            }
            invoke2 = null;
            if ((obj == null ? 'T' : '3') == 'T') {
            }
            invoke3 = null;
            int i21222222 = 2;
            if (invoke != null) {
            }
            if (invoke3 == null) {
            }
            if (invoke2 == null) {
            }
            int i22222222 = (onResponseErrorNative + 88) - 1;
            onConversionDataSuccess = i22222222 % 128;
            int i23222222 = i22222222 % 2;
            byte[] bArr11222222 = onResponseNative;
            int i24222222 = onConversionDataFail;
            Object invoke5222222 = Class.forName($$c(bArr11222222[129], (byte) (-bArr11222222[612]), (short) ((i24222222 & 548) | (i24222222 ^ 548)))).getMethod($$c(bArr11222222[124], bArr11222222[10], (short) 458), null).invoke(null, null);
            short s13222222 = (short) 862;
            Object[] objArr3222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr11222222[19], bArr11222222[217], s13222222)), 9);
            objArr3222222[0] = null;
            objArr3222222[1] = invoke2;
            objArr3222222[2] = invoke;
            objArr3222222[3] = invoke3;
            objArr3222222[4] = invoke5222222;
            objArr3222222[5] = invoke2;
            objArr3222222[6] = invoke;
            objArr3222222[7] = invoke3;
            objArr3222222[8] = invoke5222222;
            boolean[] zArr4222222 = {false, true, true, true, true, true, true, true, true};
            boolean[] zArr5222222 = {false, false, false, false, false, true, true, true, true};
            boolean[] zArr6222222 = new boolean[9];
            zArr6222222[0] = false;
            zArr6222222[1] = false;
            zArr6222222[2] = true;
            zArr6222222[3] = true;
            zArr6222222[4] = false;
            zArr6222222[5] = false;
            zArr6222222[6] = true;
            zArr6222222[7] = true;
            zArr6222222[8] = false;
            Class<?> cls4222222 = Class.forName($$c(bArr11222222[13], (byte) (-bArr11222222[612]), (short) R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle));
            i18 = cls4222222.getDeclaredField($$c(bArr11222222[384], bArr11222222[376], (short) 626)).getInt(cls4222222);
            if (!(i18 != 29)) {
            }
            c12 = 0;
            z17 = false;
            zArr6222222[c12] = z17;
            if (i18 >= 21) {
            }
            z18 = false;
            zArr6222222[1] = z18;
            zArr6222222[5] = i18 >= 21;
            zArr6222222[4] = (i18 < 16 ? 'L' : 'K') != 'K';
            if (i18 < 16) {
            }
            z19 = false;
            zArr6222222[8] = z19;
            z10 = false;
            i6 = 0;
            loop0: while (!z10) {
            }
            if (obj != null) {
            }
            invoke = null;
            if ((obj == null ? 'Z' : (char) 25) == 'Z') {
            }
            invoke2 = null;
            if ((obj == null ? 'T' : '3') == 'T') {
            }
            invoke3 = null;
            int i212222222 = 2;
            if (invoke != null) {
            }
            if (invoke3 == null) {
            }
            if (invoke2 == null) {
            }
            int i222222222 = (onResponseErrorNative + 88) - 1;
            onConversionDataSuccess = i222222222 % 128;
            int i232222222 = i222222222 % 2;
            byte[] bArr112222222 = onResponseNative;
            int i242222222 = onConversionDataFail;
            Object invoke52222222 = Class.forName($$c(bArr112222222[129], (byte) (-bArr112222222[612]), (short) ((i242222222 & 548) | (i242222222 ^ 548)))).getMethod($$c(bArr112222222[124], bArr112222222[10], (short) 458), null).invoke(null, null);
            short s132222222 = (short) 862;
            Object[] objArr32222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr112222222[19], bArr112222222[217], s132222222)), 9);
            objArr32222222[0] = null;
            objArr32222222[1] = invoke2;
            objArr32222222[2] = invoke;
            objArr32222222[3] = invoke3;
            objArr32222222[4] = invoke52222222;
            objArr32222222[5] = invoke2;
            objArr32222222[6] = invoke;
            objArr32222222[7] = invoke3;
            objArr32222222[8] = invoke52222222;
            boolean[] zArr42222222 = {false, true, true, true, true, true, true, true, true};
            boolean[] zArr52222222 = {false, false, false, false, false, true, true, true, true};
            boolean[] zArr62222222 = new boolean[9];
            zArr62222222[0] = false;
            zArr62222222[1] = false;
            zArr62222222[2] = true;
            zArr62222222[3] = true;
            zArr62222222[4] = false;
            zArr62222222[5] = false;
            zArr62222222[6] = true;
            zArr62222222[7] = true;
            zArr62222222[8] = false;
            Class<?> cls42222222 = Class.forName($$c(bArr112222222[13], (byte) (-bArr112222222[612]), (short) R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle));
            i18 = cls42222222.getDeclaredField($$c(bArr112222222[384], bArr112222222[376], (short) 626)).getInt(cls42222222);
            if (!(i18 != 29)) {
            }
            c12 = 0;
            z17 = false;
            zArr62222222[c12] = z17;
            if (i18 >= 21) {
            }
            z18 = false;
            zArr62222222[1] = z18;
            zArr62222222[5] = i18 >= 21;
            zArr62222222[4] = (i18 < 16 ? 'L' : 'K') != 'K';
            if (i18 < 16) {
            }
            z19 = false;
            zArr62222222[8] = z19;
            z10 = false;
            i6 = 0;
            loop0: while (!z10) {
            }
        } catch (Exception e13) {
            throw new RuntimeException(e13);
        }
    }

    private AFa1vSDK() {
    }

    public static int AFInAppEventParameterName(int i6) {
        int i10 = onConversionDataSuccess;
        int i11 = (i10 ^ R.styleable.AppCompatTheme_toolbarStyle) + ((i10 & R.styleable.AppCompatTheme_toolbarStyle) << 1);
        int i12 = i11 % 128;
        onResponseErrorNative = i12;
        int i13 = i11 % 2;
        Object obj = onAttributionFailureNative;
        int i14 = (i12 ^ 13) + ((i12 & 13) << 1);
        onConversionDataSuccess = i14 % 128;
        int i15 = i14 % 2;
        int i16 = (i12 + 86) - 1;
        onConversionDataSuccess = i16 % 128;
        int i17 = i16 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i6)};
            byte[] bArr = onResponseNative;
            Class<?> cls = Class.forName($$c(bArr[41], bArr[83], (short) k.d.DEFAULT_DRAG_ANIMATION_DURATION), true, (ClassLoader) AppsFlyer2dXConversionCallback);
            byte b10 = bArr[394];
            return ((Integer) cls.getMethod($$c(bArr[24], (byte) (((b10 | 1) << 1) - (b10 ^ 1)), (short) 586), Integer.TYPE).invoke(obj, objArr)).intValue();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static int AFKeystoreWrapper(Object obj) {
        int i6 = onConversionDataSuccess + 7;
        int i10 = i6 % 128;
        onResponseErrorNative = i10;
        int i11 = i6 % 2;
        Object obj2 = onAttributionFailureNative;
        int i12 = (i10 + 72) - 1;
        onConversionDataSuccess = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i10 + 81;
        onConversionDataSuccess = i14 % 128;
        int i15 = i14 % 2;
        try {
            Object[] objArr = {obj};
            byte[] bArr = onResponseNative;
            return ((Integer) Class.forName($$c(bArr[41], bArr[83], (short) k.d.DEFAULT_DRAG_ANIMATION_DURATION), true, (ClassLoader) AppsFlyer2dXConversionCallback).getMethod($$c(bArr[390], bArr[19], (short) 368), Object.class).invoke(obj2, objArr)).intValue();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static void init$0() {
        boolean z10;
        int i6;
        int i10 = onResponseErrorNative;
        boolean z11 = true;
        int i11 = (i10 ^ R.styleable.AppCompatTheme_windowMinWidthMinor) + ((i10 & R.styleable.AppCompatTheme_windowMinWidthMinor) << 1);
        onConversionDataSuccess = i11 % 128;
        if (i11 % 2 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            byte[] bArr = new byte[993];
            System.arraycopy("!\u008dÿ~\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøâ-¸ \fö$°\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþðð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñ\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\n\u0001ú\u001bÎ\u0006ýðñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøâ-·!\fö$ýÿî+Úú\u0004ï,Øô\u0002\u0006ò\fÿî.ßûø\u0000\u001eØô\n\u0001ú\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ñ\bü\u0003ùÿûø\u0000\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüðñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøâ-·!\fö$ýÿî.Ñ\bü\u001fßûø\u0000\u001eØô÷\b\bøúØ*Îý(Ì\u000eô÷\u001dØ\u0006\b\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïH\u0012÷\u0013õ\u0012ù\u0011õ\u0012õ\u0015õ\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüðð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî,Ê\u0001\fð\u0001\nò\u0016Ü\u0002ú\u000e÷ÿ\u001eØô\nÿì\u0002úöÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Ê2\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñú\u000bú\u001dÜê\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñð\u0007ï\u0000\u0003\u00023¼ùBæÔõ\nô\u0000þþ\u0005ô÷\u0012òô\rï\u0005ÿöÿî.Ô\bëý$Ú\u000búüðÈ\u0000ê\u0010/È\u0000ê\u0010/üö\u0004î\fÿî+ÿ\föé\u0013ø÷\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þôúù\u000bÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Ë1\u0006è\u00120Â÷>·\u0004ú\tøôÿî!Û\u0000ü\bðûøÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001ú\u0012òô\r\u0013æ\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñÿð\u0014â\u0006ò\f\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þð\u0007ï\u0000\u0003\u00023·\fê\u0001C×ìê\u0001\u001cÞ\búöÿî\"æýð\u000bî0Øï\fð\fê\t\u0019àóüÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120Â÷>åÚú\u0004\u0012ú\u0010õë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú\u0002*Æ\u0002\f!Ìý\u000eåú\u000bú\u001eÔ\bëýñÿ<Êîýú\n÷ð\u0011ð\u0002\u000eî\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ".getBytes("ISO-8859-1"), 0, bArr, 0, 993);
            onResponseNative = bArr;
            i6 = 97;
        } else {
            byte[] bArr2 = new byte[993];
            System.arraycopy("!\u008dÿ~\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøâ-¸ \fö$°\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþðð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñ\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\n\u0001ú\u001bÎ\u0006ýðñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøâ-·!\fö$ýÿî+Úú\u0004ï,Øô\u0002\u0006ò\fÿî.ßûø\u0000\u001eØô\n\u0001ú\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ñ\bü\u0003ùÿûø\u0000\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüðñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøâ-·!\fö$ýÿî.Ñ\bü\u001fßûø\u0000\u001eØô÷\b\bøúØ*Îý(Ì\u000eô÷\u001dØ\u0006\b\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïH\u0012÷\u0013õ\u0012ù\u0011õ\u0012õ\u0015õ\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüðð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî,Ê\u0001\fð\u0001\nò\u0016Ü\u0002ú\u000e÷ÿ\u001eØô\nÿì\u0002úöÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Ê2\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñú\u000bú\u001dÜê\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñð\u0007ï\u0000\u0003\u00023¼ùBæÔõ\nô\u0000þþ\u0005ô÷\u0012òô\rï\u0005ÿöÿî.Ô\bëý$Ú\u000búüðÈ\u0000ê\u0010/È\u0000ê\u0010/üö\u0004î\fÿî+ÿ\föé\u0013ø÷\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þôúù\u000bÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Ë1\u0006è\u00120Â÷>·\u0004ú\tøôÿî!Û\u0000ü\bðûøÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001ú\u0012òô\r\u0013æ\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñÿð\u0014â\u0006ò\f\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þð\u0007ï\u0000\u0003\u00023·\fê\u0001C×ìê\u0001\u001cÞ\búöÿî\"æýð\u000bî0Øï\fð\fê\t\u0019àóüÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120Â÷>åÚú\u0004\u0012ú\u0010õë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú\u0002*Æ\u0002\f!Ìý\u000eåú\u000bú\u001eÔ\bëýñÿ<Êîýú\n÷ð\u0011ð\u0002\u000eî\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ".getBytes("ISO-8859-1"), 0, bArr2, 0, 993);
            onResponseNative = bArr2;
            i6 = 17;
        }
        onConversionDataFail = i6;
        int i12 = (onResponseErrorNative + 38) - 1;
        onConversionDataSuccess = i12 % 128;
        if (i12 % 2 == 0) {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        throw null;
    }

    public static Object values(int i6, char c10, int i10) {
        char c11;
        int i11 = (onConversionDataSuccess + 16) - 1;
        int i12 = i11 % 128;
        onResponseErrorNative = i12;
        int i13 = i11 % 2;
        Object obj = onAttributionFailureNative;
        int i14 = i12 + R.styleable.AppCompatTheme_textAppearanceListItemSmall;
        onConversionDataSuccess = i14 % 128;
        int i15 = i14 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i6), Character.valueOf(c10), Integer.valueOf(i10)};
            byte[] bArr = onResponseNative;
            Class<?> cls = Class.forName($$c(bArr[41], bArr[83], (short) k.d.DEFAULT_DRAG_ANIMATION_DURATION), true, (ClassLoader) AppsFlyer2dXConversionCallback);
            byte b10 = bArr[394];
            String $$c = $$c(bArr[384], (byte) (((b10 | 1) << 1) - (b10 ^ 1)), (short) 747);
            Class<?> cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, Character.TYPE, cls2).invoke(obj, objArr);
            int i16 = (onConversionDataSuccess + 78) - 1;
            onResponseErrorNative = i16 % 128;
            if (i16 % 2 == 0) {
                c11 = 29;
            } else {
                c11 = 26;
            }
            if (c11 == 26) {
                return invoke;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}
